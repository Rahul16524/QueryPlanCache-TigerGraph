package com.querycache.parser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * SQLiteParserService - Wrapper for ANTLR lexer, parser, and visitor
 * 
 * This service demonstrates:
 * 1. LEXER - Tokenizes SQL query into tokens
 * 2. PARSER - Builds Abstract Syntax Tree (AST)
 * 3. VISITOR - Walks the tree and transforms it (replaces literals with '?')
 */
public class SQLiteParserService {
    
    // Set to true to see lexer/parser output (for educational purposes)
    private static boolean DEBUG = false;
    private static int queryCount = 0;
    
    /**
     * Normalize query using ANTLR Lexer + Parser + Visitor
     * 
     * Flow:
     * 1. LEXER: "SELECT * FROM users WHERE id = 101" → tokens
     * 2. PARSER: Tokens → Parse Tree (AST)
     * 3. VISITOR: Traverse tree, replace literals with '?'
     * 
     * @param query Original SQL query
     * @return Normalized query with literals replaced by '?'
     */
        public String normalizeQuery(String query) {
            try {
                queryCount++;  // ← ADD THIS LINE (2)
                boolean shouldPrint = DEBUG && (queryCount == 1);  // ← ADD THIS LINE (3)
                
                // ===== STEP 1: LEXER (Tokenization) =====
                SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(query));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                
                // CHANGE: replace DEBUG with shouldPrint
                if (shouldPrint) {
                    System.out.println("\n🔤 [LEXER OUTPUT] Tokens:");
                    tokens.fill();
                    for (Token token : tokens.getTokens()) {
                        String type = lexer.getVocabulary().getSymbolicName(token.getType());
                        // Skip SPACES for cleaner output
                        if (type != null && !type.equals("SPACES") && !type.equals("UNEXPECTED_CHAR")) {
                            String text = token.getText().replace("\n", "\\n");
                            if (text.length() > 30) text = text.substring(0, 27) + "...";
                            System.out.printf("   %-20s : '%s'%n", type, text);
                        }
                    }
                }
                
                // ===== STEP 2: PARSER (Build AST) =====
                SQLiteParser parser = new SQLiteParser(tokens);
                parser.removeErrorListeners();
                
                // Add error listener to catch syntax errors
                ParserErrorListener errorListener = new ParserErrorListener();
                parser.addErrorListener(errorListener);
                
                ParseTree tree = parser.parse();
                
                // CHANGE: replace DEBUG with shouldPrint
                if (shouldPrint) {
                    System.out.println("\n🌲 [PARSER OUTPUT] Parse Tree:");
                    System.out.println(tree.toStringTree(parser));
                }
                
                // ===== STEP 3: VISITOR (Walk & Transform) =====
                QueryVisitor visitor = new QueryVisitor();
                String normalized = visitor.visit(tree);
                
                // CHANGE: replace DEBUG with shouldPrint
                if (shouldPrint) {
                    System.out.println("\n✨ [VISITOR OUTPUT] Normalized Query:");
                    System.out.println("   Original:    " + query);
                    System.out.println("   Normalized:  " + normalized);
                    System.out.println("─".repeat(80));
                }
                
                if (normalized == null || normalized.isEmpty()) {
                    return fallbackNormalize(query);
                }
                
                return normalized;
                
            } catch (Exception e) {
                System.err.println("⚠️ Parser error, using fallback: " + e.getMessage());
                return fallbackNormalize(query);
            }
        }
    
    /**
     * Validate if a query has correct SQL syntax
     * Uses the parser to check syntax without normalization
     */
    public boolean validateQuery(String query) {
        try {
            SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(query));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SQLiteParser parser = new SQLiteParser(tokens);
            parser.removeErrorListeners();
            
            ParserErrorListener errorListener = new ParserErrorListener();
            parser.addErrorListener(errorListener);
            
            parser.parse();
            return !errorListener.hasError();
            
        } catch (Exception e) {
            return false;
        }
    }
    
    /**
     * Get detailed token information (for educational purposes)
     */
    public String getTokenInfo(String query) {
        StringBuilder sb = new StringBuilder();
        try {
            SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(query));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();
            
            sb.append("┌──────┬─────────────────────┬─────────────────────┬───────────┐\n");
            sb.append("│ Type │ Token Type          │ Text                │ Position  │\n");
            sb.append("├──────┼─────────────────────┼─────────────────────┼───────────┤\n");
            
            for (Token token : tokens.getTokens()) {
                String typeName = lexer.getVocabulary().getSymbolicName(token.getType());
                if (typeName == null) typeName = "UNKNOWN";
                if (typeName.equals("SPACES")) continue;
                
                String text = token.getText().replace("\n", "\\n");
                if (text.length() > 19) text = text.substring(0, 16) + "...";
                
                sb.append(String.format("│ %4d │ %-19s │ %-19s │ %3d:%-3d │\n",
                    token.getType(),
                    typeName.length() > 19 ? typeName.substring(0, 16) + "..." : typeName,
                    text,
                    token.getLine(),
                    token.getCharPositionInLine()));
            }
            sb.append("└──────┴─────────────────────┴─────────────────────┴───────────┘\n");
            
            return sb.toString();
        } catch (Exception e) {
            return "Error getting token info: " + e.getMessage();
        }
    }
    
    /**
     * Enable/disable debug output
     */
    public void setDebug(boolean debug) {
        DEBUG = debug;
    }
    
    /**
     * Fallback normalization (simple regex) - used only if parser fails
     */
    private String fallbackNormalize(String query) {
        return query
            .replaceAll("\\b\\d+\\b", "?")
            .replaceAll("'[^']*'", "?")
            .replaceAll("\"[^\"]*\"", "?")
            .replaceAll("\\?\\d*", "?")
            .replaceAll("[:@$][a-zA-Z_][a-zA-Z0-9_]*", "?")
            .replaceAll("\\s+", " ")
            .trim()
            .toLowerCase();
    }
    
    /**
     * Error listener to capture parse errors
     */
    private static class ParserErrorListener extends BaseErrorListener {
        private boolean hasError = false;
        private String errorMessage = null;
        
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg,
                                RecognitionException e) {
            hasError = true;
            errorMessage = String.format("Line %d:%d - %s", line, charPositionInLine, msg);
        }
        
        public boolean hasError() { return hasError; }
        public String getErrorMessage() { return errorMessage; }
    }
}