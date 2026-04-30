package com.querycache.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class QueryVisitor extends SQLiteBaseVisitor<String> {
    
    private static final Pattern WHITESPACE = Pattern.compile("\\s+");
    
    @Override
    public String visitParse(SQLiteParser.ParseContext ctx) {
        String result = visitChildren(ctx);
        if (result != null) {
            result = WHITESPACE.matcher(result).replaceAll(" ").trim();
            result = result.toLowerCase();
        }
        return result;
    }
    
    @Override
    public String visitSelect_stmt(SQLiteParser.Select_stmtContext ctx) {
        return visitChildren(ctx);
    }
    
    @Override
    public String visitSelect_core(SQLiteParser.Select_coreContext ctx) {
        StringBuilder result = new StringBuilder();
        
        result.append("select ");
        
        if (ctx.K_DISTINCT() != null) {
            result.append("distinct ");
        } else if (ctx.K_ALL() != null) {
            result.append("all ");
        }
        
        // ===== SORT SELECT COLUMNS =====
        List<String> columnList = new ArrayList<>();
        for (int i = 0; i < ctx.result_column().size(); i++) {
            columnList.add(visit(ctx.result_column(i)));
        }
        Collections.sort(columnList);
        for (int i = 0; i < columnList.size(); i++) {
            if (i > 0) result.append(", ");
            result.append(columnList.get(i));
        }
        
        // Handle FROM clause
        if (ctx.K_FROM() != null) {
            result.append(" from ");
            if (ctx.table_or_subquery() != null && ctx.table_or_subquery().size() > 0) {
                for (int i = 0; i < ctx.table_or_subquery().size(); i++) {
                    if (i > 0) result.append(", ");
                    result.append(visit(ctx.table_or_subquery(i)));
                }
            } else if (ctx.join_clause() != null) {
                result.append(visit(ctx.join_clause()));
            }
        }
        
        // Handle WHERE clause
        if (ctx.K_WHERE() != null && ctx.expr() != null && ctx.expr().size() > 0) {
            result.append(" where ");
            
            // Get the raw WHERE expression
            String whereClause = visit(ctx.expr(0));
            
            // CRITICAL FIX: Sort ALL AND conditions in the entire WHERE clause
            whereClause = sortAllAndConditions(whereClause);
            
            result.append(whereClause);
        }
        
        // Handle GROUP BY
        if (ctx.K_GROUP() != null) {
            result.append(" group by ");
            int exprCount = ctx.expr().size();
            int havingIndex = -1;
            
            if (ctx.K_HAVING() != null) {
                havingIndex = exprCount - 1;
                exprCount = exprCount - 1;
            }
            
            List<String> groupByList = new ArrayList<>();
            for (int i = 0; i < exprCount; i++) {
                groupByList.add(visit(ctx.expr(i)));
            }
            Collections.sort(groupByList);
            for (int i = 0; i < groupByList.size(); i++) {
                if (i > 0) result.append(", ");
                result.append(groupByList.get(i));
            }
            
            if (havingIndex >= 0) {
                result.append(" having ");
                result.append(visit(ctx.expr(havingIndex)));
            }
        }
        
        return result.toString();
    }
    
    /**
     * CRITICAL FIX: Sort all AND-connected conditions in a WHERE clause
     * This handles nested AND conditions recursively
     */
    private String sortAllAndConditions(String expr) {
        if (expr == null || expr.isEmpty()) {
            return expr;
        }
        
        // Check if this is an AND expression
        if (expr.contains(" and ")) {
            // Split by " and " (but be careful with parentheses)
            String[] parts = expr.split("\\s+and\\s+");
            
            // Recursively sort each part (for nested ANDs)
            List<String> sortedParts = new ArrayList<>();
            for (String part : parts) {
                // Recursively process nested AND conditions
                String processed = sortAllAndConditions(part.trim());
                sortedParts.add(processed);
            }
            
            // Sort alphabetically
            Collections.sort(sortedParts);
            
            // Join back with " and "
            return String.join(" and ", sortedParts);
        }
        
        // Not an AND expression, return as-is
        return expr;
    }
    
    @Override
    public String visitFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx) {
        return visitChildren(ctx);
    }
    
    @Override
    public String visitResult_column(SQLiteParser.Result_columnContext ctx) {
        if (ctx.STAR() != null) {
            return "*";
        }
        if (ctx.table_name() != null && ctx.STAR() != null) {
            return visit(ctx.table_name()) + ".*";
        }
        if (ctx.expr() != null) {
            String exprResult = visit(ctx.expr());
            if (ctx.column_alias() != null) {
                return exprResult + " as " + visit(ctx.column_alias());
            }
            return exprResult;
        }
        return visitChildren(ctx);
    }
    
    @Override
    public String visitTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx) {
        if (ctx.table_name() != null) {
            String tableName = visit(ctx.table_name());
            if (ctx.table_alias() != null) {
                return tableName + " as " + visit(ctx.table_alias());
            }
            return tableName;
        }
        if (ctx.select_stmt() != null) {
            return "(" + visit(ctx.select_stmt()) + ")";
        }
        return visitChildren(ctx);
    }
    
    @Override
    public String visitJoin_clause(SQLiteParser.Join_clauseContext ctx) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ctx.table_or_subquery().size(); i++) {
            if (i > 0) {
                if (ctx.join_operator(i - 1) != null) {
                    result.append(" ").append(visit(ctx.join_operator(i - 1)));
                }
            }
            result.append(visit(ctx.table_or_subquery(i)));
            if (i < ctx.join_constraint().size() && ctx.join_constraint(i) != null) {
                result.append(" ").append(visit(ctx.join_constraint(i)));
            }
        }
        return result.toString();
    }
    
    @Override
    public String visitJoin_operator(SQLiteParser.Join_operatorContext ctx) {
        if (ctx.COMMA() != null) {
            return ",";
        }
        StringBuilder result = new StringBuilder();
        if (ctx.K_NATURAL() != null) {
            result.append("natural ");
        }
        if (ctx.K_LEFT() != null) {
            result.append("left ");
            if (ctx.K_OUTER() != null) {
                result.append("outer ");
            }
        } else if (ctx.K_INNER() != null) {
            result.append("inner ");
        } else if (ctx.K_CROSS() != null) {
            result.append("cross ");
        }
        result.append("join");
        return result.toString();
    }
    
    @Override
    public String visitJoin_constraint(SQLiteParser.Join_constraintContext ctx) {
        if (ctx.K_ON() != null && ctx.expr() != null) {
            return "on " + visit(ctx.expr());
        }
        if (ctx.K_USING() != null) {
            StringBuilder result = new StringBuilder("using (");
            List<String> columnNames = new ArrayList<>();
            for (int i = 0; i < ctx.column_name().size(); i++) {
                columnNames.add(visit(ctx.column_name(i)));
            }
            Collections.sort(columnNames);
            for (int i = 0; i < columnNames.size(); i++) {
                if (i > 0) result.append(", ");
                result.append(columnNames.get(i));
            }
            result.append(")");
            return result.toString();
        }
        return "";
    }
    
    @Override
    public String visitTable_name(SQLiteParser.Table_nameContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitColumn_name(SQLiteParser.Column_nameContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitExpr(SQLiteParser.ExprContext ctx) {
        // Handle literal values
        if (ctx.literal_value() != null) {
            return "?";
        }
        
        // Handle bind parameters
        if (ctx.BIND_PARAMETER() != null) {
            return "?";
        }
        
        // Handle column names
        if (ctx.column_name() != null) {
            return ctx.column_name().getText();
        }
        
        // Handle unary operators
        if (ctx.unary_operator() != null) {
            return ctx.unary_operator().getText() + " " + visit(ctx.expr(0));
        }
        
        // Handle binary operators
        if (ctx.getChildCount() == 3) {
            ParseTree leftChild = ctx.getChild(0);
            ParseTree rightChild = ctx.getChild(2);
            
            String left = (leftChild instanceof SQLiteParser.ExprContext) ? 
                         visit((SQLiteParser.ExprContext) leftChild) : leftChild.getText();
            String operator = ctx.getChild(1).getText();
            String right = (rightChild instanceof SQLiteParser.ExprContext) ? 
                          visit((SQLiteParser.ExprContext) rightChild) : rightChild.getText();
            
            // For AND operator, we DON'T sort here - we'll sort at the WHERE clause level
            if (operator.equalsIgnoreCase("and")) {
                // Just return as-is, sorting happens in sortAllAndConditions
                return left + " and " + right;
            }
            
            return left + " " + operator + " " + right;
        }
        
        // Handle OR
        if (ctx.K_OR() != null) {
            return visit(ctx.expr(0)) + " or " + visit(ctx.expr(1));
        }
        
        // Handle IN operator
        if (ctx.K_IN() != null) {
            StringBuilder result = new StringBuilder();
            result.append(visit(ctx.expr(0)));
            if (ctx.K_NOT() != null) {
                result.append(" not");
            }
            result.append(" in (");
            if (ctx.select_stmt() != null) {
                result.append(visit(ctx.select_stmt()));
            } else if (ctx.expr().size() > 1) {
                List<String> inList = new ArrayList<>();
                for (int i = 1; i < ctx.expr().size(); i++) {
                    inList.add(visit(ctx.expr(i)));
                }
                Collections.sort(inList);
                for (int i = 0; i < inList.size(); i++) {
                    if (i > 0) result.append(", ");
                    result.append(inList.get(i));
                }
            }
            result.append(")");
            return result.toString();
        }
        
        // Handle BETWEEN
        if (ctx.K_BETWEEN() != null) {
            StringBuilder result = new StringBuilder();
            result.append(visit(ctx.expr(0)));
            if (ctx.K_NOT() != null) {
                result.append(" not");
            }
            result.append(" between ");
            result.append(visit(ctx.expr(1)));
            result.append(" and ");
            result.append(visit(ctx.expr(2)));
            return result.toString();
        }
        
        // Handle LIKE, GLOB, REGEXP, MATCH
        if (ctx.K_LIKE() != null || ctx.K_GLOB() != null || 
            ctx.K_REGEXP() != null || ctx.K_MATCH() != null) {
            StringBuilder result = new StringBuilder();
            result.append(visit(ctx.expr(0)));
            if (ctx.K_NOT() != null) {
                result.append(" not");
            }
            result.append(" ");
            result.append(ctx.getChild(1).getText());
            result.append(" ");
            result.append(visit(ctx.expr(1)));
            if (ctx.K_ESCAPE() != null && ctx.expr().size() > 2) {
                result.append(" escape ");
                result.append(visit(ctx.expr(2)));
            }
            return result.toString();
        }
        
        // Handle IS NULL / IS NOT NULL
        if (ctx.K_ISNULL() != null) {
            return visit(ctx.expr(0)) + " is null";
        }
        if (ctx.K_NOTNULL() != null) {
            return visit(ctx.expr(0)) + " not null";
        }
        if (ctx.K_NOT() != null && ctx.K_NULL() != null) {
            return visit(ctx.expr(0)) + " not null";
        }
        
        // Handle IS / IS NOT
        if (ctx.K_IS() != null) {
            if (ctx.K_NOT() != null) {
                return visit(ctx.expr(0)) + " is not " + visit(ctx.expr(1));
            }
            return visit(ctx.expr(0)) + " is " + visit(ctx.expr(1));
        }
        
        // Handle parentheses
        if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) {
            return "(" + visit(ctx.expr(0)) + ")";
        }
        
        // Default: process children
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof TerminalNode) {
                String text = child.getText();
                if (!text.trim().isEmpty() && !text.equals(" ")) {
                    if (result.length() > 0 && !isOperator(text)) {
                        result.append(" ");
                    }
                    result.append(text);
                }
            } else if (child instanceof SQLiteParser.ExprContext) {
                String childResult = visit((SQLiteParser.ExprContext) child);
                if (childResult != null && !childResult.isEmpty()) {
                    if (result.length() > 0 && !isOperator(childResult)) {
                        result.append(" ");
                    }
                    result.append(childResult);
                }
            }
        }
        
        return result.toString();
    }
    
    @Override
    public String visitLiteral_value(SQLiteParser.Literal_valueContext ctx) {
        return "?";
    }
    
    @Override
    public String visitColumn_alias(SQLiteParser.Column_aliasContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public String visitTable_alias(SQLiteParser.Table_aliasContext ctx) {
        return ctx.getText();
    }
    
    private boolean isOperator(String str) {
        return str.equals("=") || str.equals("==") || str.equals(">") || 
               str.equals("<") || str.equals(">=") || str.equals("<=") || 
               str.equals("!=") || str.equals("<>") || str.equals("+") ||
               str.equals("-") || str.equals("*") || str.equals("/") ||
               str.equals("%") || str.equals("||") || str.equals("<<") ||
               str.equals(">>") || str.equals("&") || str.equals("|") ||
               str.equals("and") || str.equals("or") || str.equals("not");
    }
    
    @Override
    protected String defaultResult() {
        return "";
    }
    
    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        if (aggregate.isEmpty()) return nextResult;
        if (nextResult.isEmpty()) return aggregate;
        return aggregate + " " + nextResult;
    }
}