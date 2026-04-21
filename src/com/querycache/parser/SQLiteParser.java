// Generated from SQLite.g4 by ANTLR 4.13.2
package com.querycache.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_CREATE=50, K_CROSS=51, K_CURRENT_DATE=52, K_CURRENT_TIME=53, K_CURRENT_TIMESTAMP=54, 
		K_DATABASE=55, K_DEFAULT=56, K_DEFERRABLE=57, K_DEFERRED=58, K_DELETE=59, 
		K_DESC=60, K_DETACH=61, K_DISTINCT=62, K_DROP=63, K_EACH=64, K_ELSE=65, 
		K_END=66, K_ESCAPE=67, K_EXCEPT=68, K_EXCLUSIVE=69, K_EXISTS=70, K_EXPLAIN=71, 
		K_FAIL=72, K_FOR=73, K_FOREIGN=74, K_FROM=75, K_FULL=76, K_GLOB=77, K_GROUP=78, 
		K_HAVING=79, K_IF=80, K_IGNORE=81, K_IMMEDIATE=82, K_IN=83, K_INDEX=84, 
		K_INDEXED=85, K_INITIALLY=86, K_INNER=87, K_INSERT=88, K_INSTEAD=89, K_INTERSECT=90, 
		K_INTO=91, K_IS=92, K_ISNULL=93, K_JOIN=94, K_KEY=95, K_LEFT=96, K_LIKE=97, 
		K_LIMIT=98, K_MATCH=99, K_NATURAL=100, K_NO=101, K_NOT=102, K_NOTNULL=103, 
		K_NULL=104, K_OF=105, K_OFFSET=106, K_ON=107, K_OR=108, K_ORDER=109, K_OUTER=110, 
		K_PLAN=111, K_PRAGMA=112, K_PRIMARY=113, K_QUERY=114, K_RAISE=115, K_RECURSIVE=116, 
		K_REFERENCES=117, K_REGEXP=118, K_REINDEX=119, K_RELEASE=120, K_RENAME=121, 
		K_REPLACE=122, K_RESTRICT=123, K_RIGHT=124, K_ROLLBACK=125, K_ROW=126, 
		K_SAVEPOINT=127, K_SELECT=128, K_SET=129, K_TABLE=130, K_TEMP=131, K_TEMPORARY=132, 
		K_THEN=133, K_TO=134, K_TRANSACTION=135, K_TRIGGER=136, K_UNION=137, K_UNIQUE=138, 
		K_UPDATE=139, K_USING=140, K_VACUUM=141, K_VALUES=142, K_VIEW=143, K_VIRTUAL=144, 
		K_WHEN=145, K_WHERE=146, K_WITH=147, K_WITHOUT=148, IDENTIFIER=149, NUMERIC_LITERAL=150, 
		BIND_PARAMETER=151, STRING_LITERAL=152, BLOB_LITERAL=153, SINGLE_LINE_COMMENT=154, 
		MULTILINE_COMMENT=155, SPACES=156, UNEXPECTED_CHAR=157;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_index_stmt = 10, RULE_create_table_stmt = 11, RULE_create_trigger_stmt = 12, 
		RULE_create_view_stmt = 13, RULE_create_virtual_table_stmt = 14, RULE_delete_stmt = 15, 
		RULE_delete_stmt_limited = 16, RULE_detach_stmt = 17, RULE_drop_index_stmt = 18, 
		RULE_drop_table_stmt = 19, RULE_drop_trigger_stmt = 20, RULE_drop_view_stmt = 21, 
		RULE_factored_select_stmt = 22, RULE_insert_stmt = 23, RULE_pragma_stmt = 24, 
		RULE_reindex_stmt = 25, RULE_release_stmt = 26, RULE_rollback_stmt = 27, 
		RULE_savepoint_stmt = 28, RULE_simple_select_stmt = 29, RULE_select_stmt = 30, 
		RULE_select_or_values = 31, RULE_update_stmt = 32, RULE_update_stmt_limited = 33, 
		RULE_vacuum_stmt = 34, RULE_column_def = 35, RULE_type_name = 36, RULE_column_constraint = 37, 
		RULE_conflict_clause = 38, RULE_expr = 39, RULE_foreign_key_clause = 40, 
		RULE_raise_function = 41, RULE_indexed_column = 42, RULE_table_constraint = 43, 
		RULE_with_clause = 44, RULE_qualified_table_name = 45, RULE_ordering_term = 46, 
		RULE_pragma_value = 47, RULE_common_table_expression = 48, RULE_result_column = 49, 
		RULE_table_or_subquery = 50, RULE_join_clause = 51, RULE_join_operator = 52, 
		RULE_join_constraint = 53, RULE_select_core = 54, RULE_compound_operator = 55, 
		RULE_signed_number = 56, RULE_literal_value = 57, RULE_unary_operator = 58, 
		RULE_error_message = 59, RULE_module_argument = 60, RULE_column_alias = 61, 
		RULE_keyword = 62, RULE_name = 63, RULE_function_name = 64, RULE_database_name = 65, 
		RULE_schema_name = 66, RULE_table_function_name = 67, RULE_table_name = 68, 
		RULE_table_or_index_name = 69, RULE_new_table_name = 70, RULE_column_name = 71, 
		RULE_collation_name = 72, RULE_foreign_table = 73, RULE_index_name = 74, 
		RULE_trigger_name = 75, RULE_view_name = 76, RULE_module_name = 77, RULE_pragma_name = 78, 
		RULE_savepoint_name = 79, RULE_table_alias = 80, RULE_transaction_name = 81, 
		RULE_any_name = 82;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
			"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
			"create_table_stmt", "create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
			"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
			"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "factored_select_stmt", 
			"insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", 
			"savepoint_stmt", "simple_select_stmt", "select_stmt", "select_or_values", 
			"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", "type_name", 
			"column_constraint", "conflict_clause", "expr", "foreign_key_clause", 
			"raise_function", "indexed_column", "table_constraint", "with_clause", 
			"qualified_table_name", "ordering_term", "pragma_value", "common_table_expression", 
			"result_column", "table_or_subquery", "join_clause", "join_operator", 
			"join_constraint", "select_core", "compound_operator", "signed_number", 
			"literal_value", "unary_operator", "error_message", "module_argument", 
			"column_alias", "keyword", "name", "function_name", "database_name", 
			"schema_name", "table_function_name", "table_name", "table_or_index_name", 
			"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
			"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
			"table_alias", "transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
			"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
			"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
			"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
			"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
			"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
			"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
			"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", 
			"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
			"K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", 
			"K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", 
			"K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
			"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
			"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
			"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
			"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", 
			"K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", 
			"K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", 
			"K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", 
			"K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", 
			"BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6339801325483589630L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 7593139340495028257L) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & 262413L) != 0)) {
				{
				setState(168);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(166);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(167);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLiteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(178);
				match(SCOL);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			sql_stmt();
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(185);
						match(SCOL);
						}
						}
						setState(188); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(190);
					sql_stmt();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(SCOL);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(202);
				match(K_EXPLAIN);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(203);
					match(K_QUERY);
					setState(204);
					match(K_PLAN);
					}
				}

				}
			}

			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(209);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(210);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(211);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(212);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(213);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(214);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(215);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(216);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(217);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(218);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(219);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(220);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(221);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(222);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(223);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(224);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(225);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(226);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(227);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(228);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(229);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(230);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(231);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(232);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(233);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(234);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(235);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(236);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(237);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(238);
				vacuum_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(K_ALTER);
			setState(242);
			match(K_TABLE);
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(243);
				database_name();
				setState(244);
				match(DOT);
				}
				break;
			}
			setState(248);
			table_name();
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(249);
				match(K_RENAME);
				setState(250);
				match(K_TO);
				setState(251);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(252);
				match(K_ADD);
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(253);
					match(K_COLUMN);
					}
					break;
				}
				setState(256);
				column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(K_ANALYZE);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(260);
				database_name();
				}
				break;
			case 2:
				{
				setState(261);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(262);
				database_name();
				setState(263);
				match(DOT);
				setState(264);
				table_or_index_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(K_ATTACH);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(269);
				match(K_DATABASE);
				}
				break;
			}
			setState(272);
			expr(0);
			setState(273);
			match(K_AS);
			setState(274);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(K_BEGIN);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16779265L) != 0)) {
				{
				setState(277);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16779265L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(280);
				match(K_TRANSACTION);
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(281);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(287);
				match(K_TRANSACTION);
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(288);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SQLiteParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SQLiteParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SQLiteParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SQLiteParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SQLiteParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SQLiteParser.K_EXCEPT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SQLiteParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SQLiteParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(293);
				with_clause();
				}
			}

			setState(296);
			select_core();
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(297);
					match(K_UNION);
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(298);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(301);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(302);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(305);
				select_core();
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(310);
				match(K_ORDER);
				setState(311);
				match(K_BY);
				setState(312);
				ordering_term();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(313);
					match(COMMA);
					setState(314);
					ordering_term();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(322);
				match(K_LIMIT);
				setState(323);
				expr(0);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(324);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(325);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(K_CREATE);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(331);
				match(K_UNIQUE);
				}
			}

			setState(334);
			match(K_INDEX);
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(335);
				match(K_IF);
				setState(336);
				match(K_NOT);
				setState(337);
				match(K_EXISTS);
				}
				break;
			}
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(340);
				database_name();
				setState(341);
				match(DOT);
				}
				break;
			}
			setState(345);
			index_name();
			setState(346);
			match(K_ON);
			setState(347);
			table_name();
			setState(348);
			match(OPEN_PAR);
			setState(349);
			indexed_column();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(350);
				match(COMMA);
				setState(351);
				indexed_column();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(CLOSE_PAR);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(358);
				match(K_WHERE);
				setState(359);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(K_CREATE);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(366);
			match(K_TABLE);
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(367);
				match(K_IF);
				setState(368);
				match(K_NOT);
				setState(369);
				match(K_EXISTS);
				}
				break;
			}
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(372);
				database_name();
				setState(373);
				match(DOT);
				}
				break;
			}
			setState(377);
			table_name();
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(378);
				match(OPEN_PAR);
				setState(379);
				column_def();
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(380);
						match(COMMA);
						setState(381);
						column_def();
						}
						} 
					}
					setState(386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(387);
					match(COMMA);
					setState(388);
					table_constraint();
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
				match(CLOSE_PAR);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(395);
					match(K_WITHOUT);
					setState(396);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(399);
				match(K_AS);
				setState(400);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SQLiteParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SQLiteParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(K_CREATE);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(407);
			match(K_TRIGGER);
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(408);
				match(K_IF);
				setState(409);
				match(K_NOT);
				setState(410);
				match(K_EXISTS);
				}
				break;
			}
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(413);
				database_name();
				setState(414);
				match(DOT);
				}
				break;
			}
			setState(418);
			trigger_name();
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(419);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(420);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(421);
				match(K_INSTEAD);
				setState(422);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(425);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(426);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(427);
				match(K_UPDATE);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(428);
					match(K_OF);
					setState(429);
					column_name();
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(430);
						match(COMMA);
						setState(431);
						column_name();
						}
						}
						setState(436);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(441);
			match(K_ON);
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(442);
				database_name();
				setState(443);
				match(DOT);
				}
				break;
			}
			setState(447);
			table_name();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(448);
				match(K_FOR);
				setState(449);
				match(K_EACH);
				setState(450);
				match(K_ROW);
				}
			}

			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(453);
				match(K_WHEN);
				setState(454);
				expr(0);
				}
			}

			setState(457);
			match(K_BEGIN);
			setState(466); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(458);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(459);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(460);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(461);
					select_stmt();
					}
					break;
				}
				setState(464);
				match(SCOL);
				}
				}
				setState(468); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 596728067318087681L) != 0) );
			setState(470);
			match(K_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(K_CREATE);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(473);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(476);
			match(K_VIEW);
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(477);
				match(K_IF);
				setState(478);
				match(K_NOT);
				setState(479);
				match(K_EXISTS);
				}
				break;
			}
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(482);
				database_name();
				setState(483);
				match(DOT);
				}
				break;
			}
			setState(487);
			view_name();
			setState(488);
			match(K_AS);
			setState(489);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(K_CREATE);
			setState(492);
			match(K_VIRTUAL);
			setState(493);
			match(K_TABLE);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(494);
				match(K_IF);
				setState(495);
				match(K_NOT);
				setState(496);
				match(K_EXISTS);
				}
				break;
			}
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(499);
				database_name();
				setState(500);
				match(DOT);
				}
				break;
			}
			setState(504);
			table_name();
			setState(505);
			match(K_USING);
			setState(506);
			module_name();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(507);
				match(OPEN_PAR);
				setState(508);
				module_argument();
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(509);
					match(COMMA);
					setState(510);
					module_argument();
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(516);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(520);
				with_clause();
				}
			}

			setState(523);
			match(K_DELETE);
			setState(524);
			match(K_FROM);
			setState(525);
			qualified_table_name();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(526);
				match(K_WHERE);
				setState(527);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(530);
				with_clause();
				}
			}

			setState(533);
			match(K_DELETE);
			setState(534);
			match(K_FROM);
			setState(535);
			qualified_table_name();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(536);
				match(K_WHERE);
				setState(537);
				expr(0);
				}
			}

			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(540);
					match(K_ORDER);
					setState(541);
					match(K_BY);
					setState(542);
					ordering_term();
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(543);
						match(COMMA);
						setState(544);
						ordering_term();
						}
						}
						setState(549);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(552);
				match(K_LIMIT);
				setState(553);
				expr(0);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(554);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(555);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(K_DETACH);
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(561);
				match(K_DATABASE);
				}
				break;
			}
			setState(564);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(K_DROP);
			setState(567);
			match(K_INDEX);
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(568);
				match(K_IF);
				setState(569);
				match(K_EXISTS);
				}
				break;
			}
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(572);
				database_name();
				setState(573);
				match(DOT);
				}
				break;
			}
			setState(577);
			index_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(K_DROP);
			setState(580);
			match(K_TABLE);
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(581);
				match(K_IF);
				setState(582);
				match(K_EXISTS);
				}
				break;
			}
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(585);
				database_name();
				setState(586);
				match(DOT);
				}
				break;
			}
			setState(590);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(K_DROP);
			setState(593);
			match(K_TRIGGER);
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(594);
				match(K_IF);
				setState(595);
				match(K_EXISTS);
				}
				break;
			}
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(598);
				database_name();
				setState(599);
				match(DOT);
				}
				break;
			}
			setState(603);
			trigger_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(K_DROP);
			setState(606);
			match(K_VIEW);
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(607);
				match(K_IF);
				setState(608);
				match(K_EXISTS);
				}
				break;
			}
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(611);
				database_name();
				setState(612);
				match(DOT);
				}
				break;
			}
			setState(616);
			view_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(618);
				with_clause();
				}
			}

			setState(621);
			select_core();
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(622);
				compound_operator();
				setState(623);
				select_core();
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(630);
				match(K_ORDER);
				setState(631);
				match(K_BY);
				setState(632);
				ordering_term();
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(633);
					match(COMMA);
					setState(634);
					ordering_term();
					}
					}
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(642);
				match(K_LIMIT);
				setState(643);
				expr(0);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(644);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(645);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(650);
				with_clause();
				}
			}

			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(653);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(654);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(655);
				match(K_INSERT);
				setState(656);
				match(K_OR);
				setState(657);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(658);
				match(K_INSERT);
				setState(659);
				match(K_OR);
				setState(660);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(661);
				match(K_INSERT);
				setState(662);
				match(K_OR);
				setState(663);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(664);
				match(K_INSERT);
				setState(665);
				match(K_OR);
				setState(666);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(667);
				match(K_INSERT);
				setState(668);
				match(K_OR);
				setState(669);
				match(K_IGNORE);
				}
				break;
			}
			setState(672);
			match(K_INTO);
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(673);
				database_name();
				setState(674);
				match(DOT);
				}
				break;
			}
			setState(678);
			table_name();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(679);
				match(OPEN_PAR);
				setState(680);
				column_name();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(681);
					match(COMMA);
					setState(682);
					column_name();
					}
					}
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(688);
				match(CLOSE_PAR);
				}
			}

			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(692);
				match(K_VALUES);
				setState(693);
				match(OPEN_PAR);
				setState(694);
				expr(0);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(695);
					match(COMMA);
					setState(696);
					expr(0);
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(702);
				match(CLOSE_PAR);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(703);
					match(COMMA);
					setState(704);
					match(OPEN_PAR);
					setState(705);
					expr(0);
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(706);
						match(COMMA);
						setState(707);
						expr(0);
						}
						}
						setState(712);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(713);
					match(CLOSE_PAR);
					}
					}
					setState(719);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(720);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(721);
				match(K_DEFAULT);
				setState(722);
				match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(K_PRAGMA);
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(726);
				database_name();
				setState(727);
				match(DOT);
				}
				break;
			}
			setState(731);
			pragma_name();
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(732);
				match(ASSIGN);
				setState(733);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(734);
				match(OPEN_PAR);
				setState(735);
				pragma_value();
				setState(736);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(K_REINDEX);
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(741);
				collation_name();
				}
				break;
			case 2:
				{
				setState(745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(742);
					database_name();
					setState(743);
					match(DOT);
					}
					break;
				}
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(747);
					table_name();
					}
					break;
				case 2:
					{
					setState(748);
					index_name();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(K_RELEASE);
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(754);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(757);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(K_ROLLBACK);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(760);
				match(K_TRANSACTION);
				setState(762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(761);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(766);
				match(K_TO);
				setState(768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(767);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(770);
				savepoint_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(K_SAVEPOINT);
			setState(774);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(776);
				with_clause();
				}
			}

			setState(779);
			select_core();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(780);
				match(K_ORDER);
				setState(781);
				match(K_BY);
				setState(782);
				ordering_term();
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(783);
					match(COMMA);
					setState(784);
					ordering_term();
					}
					}
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(792);
				match(K_LIMIT);
				setState(793);
				expr(0);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(794);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(795);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(800);
				with_clause();
				}
			}

			setState(803);
			select_or_values();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(804);
				compound_operator();
				setState(805);
				select_or_values();
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(812);
				match(K_ORDER);
				setState(813);
				match(K_BY);
				setState(814);
				ordering_term();
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(815);
					match(COMMA);
					setState(816);
					ordering_term();
					}
					}
					setState(821);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(824);
				match(K_LIMIT);
				setState(825);
				expr(0);
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(826);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(827);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select_or_values);
		int _la;
		try {
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				match(K_SELECT);
				setState(834);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(833);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(836);
				result_column();
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(837);
					match(COMMA);
					setState(838);
					result_column();
					}
					}
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(844);
					match(K_FROM);
					setState(854);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						setState(845);
						table_or_subquery();
						setState(850);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(846);
							match(COMMA);
							setState(847);
							table_or_subquery();
							}
							}
							setState(852);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(853);
						join_clause();
						}
						break;
					}
					}
				}

				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(858);
					match(K_WHERE);
					setState(859);
					expr(0);
					}
				}

				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(862);
					match(K_GROUP);
					setState(863);
					match(K_BY);
					setState(864);
					expr(0);
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(865);
						match(COMMA);
						setState(866);
						expr(0);
						}
						}
						setState(871);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(872);
						match(K_HAVING);
						setState(873);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(878);
				match(K_VALUES);
				setState(879);
				match(OPEN_PAR);
				setState(880);
				expr(0);
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(881);
					match(COMMA);
					setState(882);
					expr(0);
					}
					}
					setState(887);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(888);
				match(CLOSE_PAR);
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(889);
					match(COMMA);
					setState(890);
					match(OPEN_PAR);
					setState(891);
					expr(0);
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(892);
						match(COMMA);
						setState(893);
						expr(0);
						}
						}
						setState(898);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(899);
					match(CLOSE_PAR);
					}
					}
					setState(905);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(908);
				with_clause();
				}
			}

			setState(911);
			match(K_UPDATE);
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(912);
				match(K_OR);
				setState(913);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(914);
				match(K_OR);
				setState(915);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(916);
				match(K_OR);
				setState(917);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(918);
				match(K_OR);
				setState(919);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(920);
				match(K_OR);
				setState(921);
				match(K_IGNORE);
				}
				break;
			}
			setState(924);
			qualified_table_name();
			setState(925);
			match(K_SET);
			setState(926);
			column_name();
			setState(927);
			match(ASSIGN);
			setState(928);
			expr(0);
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(929);
				match(COMMA);
				setState(930);
				column_name();
				setState(931);
				match(ASSIGN);
				setState(932);
				expr(0);
				}
				}
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(939);
				match(K_WHERE);
				setState(940);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(943);
				with_clause();
				}
			}

			setState(946);
			match(K_UPDATE);
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(947);
				match(K_OR);
				setState(948);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(949);
				match(K_OR);
				setState(950);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(951);
				match(K_OR);
				setState(952);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(953);
				match(K_OR);
				setState(954);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(955);
				match(K_OR);
				setState(956);
				match(K_IGNORE);
				}
				break;
			}
			setState(959);
			qualified_table_name();
			setState(960);
			match(K_SET);
			setState(961);
			column_name();
			setState(962);
			match(ASSIGN);
			setState(963);
			expr(0);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(964);
				match(COMMA);
				setState(965);
				column_name();
				setState(966);
				match(ASSIGN);
				setState(967);
				expr(0);
				}
				}
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(974);
				match(K_WHERE);
				setState(975);
				expr(0);
				}
			}

			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(978);
					match(K_ORDER);
					setState(979);
					match(K_BY);
					setState(980);
					ordering_term();
					setState(985);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(981);
						match(COMMA);
						setState(982);
						ordering_term();
						}
						}
						setState(987);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(990);
				match(K_LIMIT);
				setState(991);
				expr(0);
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(992);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(993);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(K_VACUUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			column_name();
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1001);
				type_name();
				}
				break;
			}
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72673320549482496L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 68719511557L) != 0)) {
				{
				{
				setState(1004);
				column_constraint();
				}
				}
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1011); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(1010);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1013); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1015);
				match(OPEN_PAR);
				setState(1016);
				signed_number();
				setState(1017);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1019);
				match(OPEN_PAR);
				setState(1020);
				signed_number();
				setState(1021);
				match(COMMA);
				setState(1022);
				signed_number();
				setState(1023);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1027);
				match(K_CONSTRAINT);
				setState(1028);
				name();
				}
			}

			setState(1064);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1031);
				match(K_PRIMARY);
				setState(1032);
				match(K_KEY);
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1033);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1036);
				conflict_clause();
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1037);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1040);
					match(K_NOT);
					}
				}

				setState(1043);
				match(K_NULL);
				setState(1044);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1045);
				match(K_UNIQUE);
				setState(1046);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1047);
				match(K_CHECK);
				setState(1048);
				match(OPEN_PAR);
				setState(1049);
				expr(0);
				setState(1050);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1052);
				match(K_DEFAULT);
				setState(1059);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1053);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1054);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1055);
					match(OPEN_PAR);
					setState(1056);
					expr(0);
					setState(1057);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1061);
				match(K_COLLATE);
				setState(1062);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1063);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1066);
				match(K_ON);
				setState(1067);
				match(K_CONFLICT);
				setState(1068);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 10133099161584129L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLiteParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLiteParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SQLiteParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLiteParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLiteParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLiteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLiteParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLiteParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLiteParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLiteParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLiteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLiteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLiteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLiteParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLiteParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLiteParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLiteParser.NOT_EQ2, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1072);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1073);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1077);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
					case 1:
						{
						setState(1074);
						database_name();
						setState(1075);
						match(DOT);
						}
						break;
					}
					setState(1079);
					table_name();
					setState(1080);
					match(DOT);
					}
					break;
				}
				setState(1084);
				column_name();
				}
				break;
			case 4:
				{
				setState(1085);
				unary_operator();
				setState(1086);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1088);
				function_name();
				setState(1089);
				match(OPEN_PAR);
				setState(1102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1091);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						setState(1090);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1093);
					expr(0);
					setState(1098);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1094);
						match(COMMA);
						setState(1095);
						expr(0);
						}
						}
						setState(1100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1101);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1104);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1106);
				match(OPEN_PAR);
				setState(1107);
				expr(0);
				setState(1108);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1110);
				match(K_CAST);
				setState(1111);
				match(OPEN_PAR);
				setState(1112);
				expr(0);
				setState(1113);
				match(K_AS);
				setState(1114);
				type_name();
				setState(1115);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1117);
						match(K_NOT);
						}
					}

					setState(1120);
					match(K_EXISTS);
					}
				}

				setState(1123);
				match(OPEN_PAR);
				setState(1124);
				select_stmt();
				setState(1125);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1127);
				match(K_CASE);
				setState(1129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1128);
					expr(0);
					}
					break;
				}
				setState(1136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1131);
					match(K_WHEN);
					setState(1132);
					expr(0);
					setState(1133);
					match(K_THEN);
					setState(1134);
					expr(0);
					}
					}
					setState(1138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1140);
					match(K_ELSE);
					setState(1141);
					expr(0);
					}
				}

				setState(1144);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1146);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1149);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1150);
						match(PIPE2);
						setState(1151);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1152);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1153);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12416L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1154);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1155);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1156);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1157);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1158);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1159);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1160);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1161);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1162);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1163);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1164);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1165);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360192L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1166);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1167);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1168);
						match(K_AND);
						setState(1169);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1170);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1171);
						match(K_OR);
						setState(1172);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1173);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1174);
						match(K_IS);
						setState(1176);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
						case 1:
							{
							setState(1175);
							match(K_NOT);
							}
							break;
						}
						setState(1178);
						expr(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1181);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1180);
							match(K_NOT);
							}
						}

						setState(1183);
						match(K_BETWEEN);
						setState(1184);
						expr(0);
						setState(1185);
						match(K_AND);
						setState(1186);
						expr(5);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1188);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1190);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1189);
							match(K_NOT);
							}
						}

						setState(1192);
						match(K_IN);
						setState(1212);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
						case 1:
							{
							setState(1193);
							match(OPEN_PAR);
							setState(1203);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
							case 1:
								{
								setState(1194);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1195);
								expr(0);
								setState(1200);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1196);
									match(COMMA);
									setState(1197);
									expr(0);
									}
									}
									setState(1202);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1205);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1209);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
							case 1:
								{
								setState(1206);
								database_name();
								setState(1207);
								match(DOT);
								}
								break;
							}
							setState(1211);
							table_name();
							}
							break;
						}
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1214);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1215);
						match(K_COLLATE);
						setState(1216);
						collation_name();
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1217);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1219);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1218);
							match(K_NOT);
							}
						}

						setState(1221);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 2199028498433L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1222);
						expr(0);
						setState(1225);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
						case 1:
							{
							setState(1223);
							match(K_ESCAPE);
							setState(1224);
							expr(0);
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1227);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1232);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1228);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1229);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1230);
							match(K_NOT);
							setState(1231);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLiteParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLiteParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLiteParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLiteParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLiteParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLiteParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLiteParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLiteParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLiteParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLiteParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLiteParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLiteParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLiteParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLiteParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLiteParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLiteParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLiteParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLiteParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLiteParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLiteParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLiteParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLiteParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(K_REFERENCES);
			setState(1240);
			foreign_table();
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1241);
				match(OPEN_PAR);
				setState(1242);
				column_name();
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1243);
					match(COMMA);
					setState(1244);
					column_name();
					}
					}
					setState(1249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1250);
				match(CLOSE_PAR);
				}
			}

			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1254);
					match(K_ON);
					setState(1255);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
					case 1:
						{
						setState(1256);
						match(K_SET);
						setState(1257);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1258);
						match(K_SET);
						setState(1259);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1260);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1261);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1262);
						match(K_NO);
						setState(1263);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1266);
					match(K_MATCH);
					setState(1267);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1275);
					match(K_NOT);
					}
				}

				setState(1278);
				match(K_DEFERRABLE);
				setState(1283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1279);
					match(K_INITIALLY);
					setState(1280);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1281);
					match(K_INITIALLY);
					setState(1282);
					match(K_IMMEDIATE);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			match(K_RAISE);
			setState(1288);
			match(OPEN_PAR);
			setState(1293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1289);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1290);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1291);
				match(COMMA);
				setState(1292);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1295);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			column_name();
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1298);
				match(K_COLLATE);
				setState(1299);
				collation_name();
				}
			}

			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1302);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1305);
				match(K_CONSTRAINT);
				setState(1306);
				name();
				}
			}

			setState(1345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1312);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1309);
					match(K_PRIMARY);
					setState(1310);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1311);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1314);
				match(OPEN_PAR);
				setState(1315);
				indexed_column();
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1316);
					match(COMMA);
					setState(1317);
					indexed_column();
					}
					}
					setState(1322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1323);
				match(CLOSE_PAR);
				setState(1324);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1326);
				match(K_CHECK);
				setState(1327);
				match(OPEN_PAR);
				setState(1328);
				expr(0);
				setState(1329);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1331);
				match(K_FOREIGN);
				setState(1332);
				match(K_KEY);
				setState(1333);
				match(OPEN_PAR);
				setState(1334);
				column_name();
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1335);
					match(COMMA);
					setState(1336);
					column_name();
					}
					}
					setState(1341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1342);
				match(CLOSE_PAR);
				setState(1343);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(K_WITH);
			setState(1349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1348);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1351);
			common_table_expression();
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1352);
				match(COMMA);
				setState(1353);
				common_table_expression();
				}
				}
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1359);
				database_name();
				setState(1360);
				match(DOT);
				}
				break;
			}
			setState(1364);
			table_name();
			setState(1370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1365);
				match(K_INDEXED);
				setState(1366);
				match(K_BY);
				setState(1367);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1368);
				match(K_NOT);
				setState(1369);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			expr(0);
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1373);
				match(K_COLLATE);
				setState(1374);
				collation_name();
				}
			}

			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1377);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pragma_value);
		try {
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1380);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1381);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1382);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			table_name();
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1386);
				match(OPEN_PAR);
				setState(1387);
				column_name();
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1388);
					match(COMMA);
					setState(1389);
					column_name();
					}
					}
					setState(1394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1395);
				match(CLOSE_PAR);
				}
			}

			setState(1399);
			match(K_AS);
			setState(1400);
			match(OPEN_PAR);
			setState(1401);
			select_stmt();
			setState(1402);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_result_column);
		int _la;
		try {
			setState(1416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1404);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1405);
				table_name();
				setState(1406);
				match(DOT);
				setState(1407);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1409);
				expr(0);
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1410);
						match(K_AS);
						}
					}

					setState(1413);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Table_function_nameContext table_function_name() {
			return getRuleContext(Table_function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_table_or_subquery);
		int _la;
		try {
			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1418);
					schema_name();
					setState(1419);
					match(DOT);
					}
					break;
				}
				setState(1423);
				table_name();
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1424);
						match(K_AS);
						}
					}

					setState(1427);
					table_alias();
					}
				}

				setState(1435);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1430);
					match(K_INDEXED);
					setState(1431);
					match(K_BY);
					setState(1432);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1433);
					match(K_NOT);
					setState(1434);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_CROSS:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXCEPT:
				case K_EXPLAIN:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UNION:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1437);
					schema_name();
					setState(1438);
					match(DOT);
					}
					break;
				}
				setState(1442);
				table_function_name();
				setState(1443);
				match(OPEN_PAR);
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -33552632L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 67108863L) != 0)) {
					{
					setState(1444);
					expr(0);
					setState(1449);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1445);
						match(COMMA);
						setState(1446);
						expr(0);
						}
						}
						setState(1451);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1454);
				match(CLOSE_PAR);
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1455);
						match(K_AS);
						}
					}

					setState(1458);
					table_alias();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1461);
				match(OPEN_PAR);
				setState(1471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1462);
					table_or_subquery();
					setState(1467);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1463);
						match(COMMA);
						setState(1464);
						table_or_subquery();
						}
						}
						setState(1469);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1470);
					join_clause();
					}
					break;
				}
				setState(1473);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1475);
				match(OPEN_PAR);
				setState(1476);
				select_stmt();
				setState(1477);
				match(CLOSE_PAR);
				setState(1482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1479);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1478);
						match(K_AS);
						}
					}

					setState(1481);
					table_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			table_or_subquery();
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 8833L) != 0)) {
				{
				{
				setState(1487);
				join_operator();
				setState(1488);
				table_or_subquery();
				setState(1489);
				join_constraint();
				}
				}
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_join_operator);
		int _la;
		try {
			setState(1509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1497);
					match(K_NATURAL);
					}
				}

				setState(1506);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1500);
					match(K_LEFT);
					setState(1502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1501);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1504);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1505);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1508);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1511);
				match(K_ON);
				setState(1512);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1513);
				match(K_USING);
				setState(1514);
				match(OPEN_PAR);
				setState(1515);
				column_name();
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1516);
					match(COMMA);
					setState(1517);
					column_name();
					}
					}
					setState(1522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1523);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_CROSS:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXCEPT:
			case K_EXPLAIN:
			case K_GROUP:
			case K_INNER:
			case K_INSERT:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UNION:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_select_core);
		int _la;
		try {
			setState(1601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1527);
				match(K_SELECT);
				setState(1529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1528);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1531);
				result_column();
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1532);
					match(COMMA);
					setState(1533);
					result_column();
					}
					}
					setState(1538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1539);
					match(K_FROM);
					setState(1549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						setState(1540);
						table_or_subquery();
						setState(1545);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1541);
							match(COMMA);
							setState(1542);
							table_or_subquery();
							}
							}
							setState(1547);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1548);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1553);
					match(K_WHERE);
					setState(1554);
					expr(0);
					}
				}

				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1557);
					match(K_GROUP);
					setState(1558);
					match(K_BY);
					setState(1559);
					expr(0);
					setState(1564);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1560);
						match(COMMA);
						setState(1561);
						expr(0);
						}
						}
						setState(1566);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1569);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1567);
						match(K_HAVING);
						setState(1568);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
				match(K_VALUES);
				setState(1574);
				match(OPEN_PAR);
				setState(1575);
				expr(0);
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1576);
					match(COMMA);
					setState(1577);
					expr(0);
					}
					}
					setState(1582);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1583);
				match(CLOSE_PAR);
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1584);
					match(COMMA);
					setState(1585);
					match(OPEN_PAR);
					setState(1586);
					expr(0);
					setState(1591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1587);
						match(COMMA);
						setState(1588);
						expr(0);
						}
						}
						setState(1593);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1594);
					match(CLOSE_PAR);
					}
					}
					setState(1600);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_compound_operator);
		try {
			setState(1608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1603);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1604);
				match(K_UNION);
				setState(1605);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1606);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1607);
				match(K_EXCEPT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1610);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1613);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 914793674309633L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLiteParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_module_argument);
		try {
			setState(1623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1621);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1622);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLiteParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLiteParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLiteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLiteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLiteParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLiteParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLiteParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & -1L) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 1152921504606846975L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_function_nameContext table_function_name() throws RecognitionException {
		Table_function_nameContext _localctx = new Table_function_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_table_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_table_alias);
		try {
			setState(1669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1665);
				match(OPEN_PAR);
				setState(1666);
				table_alias();
				setState(1667);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_any_name);
		try {
			setState(1680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1675);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1676);
				match(OPEN_PAR);
				setState(1677);
				any_name();
				setState(1678);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u009d\u0693\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u00a9\b\u0000\n\u0000\f\u0000\u00ac\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002\u00b4\b\u0002"+
		"\n\u0002\f\u0002\u00b7\t\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u00bb"+
		"\b\u0002\u000b\u0002\f\u0002\u00bc\u0001\u0002\u0005\u0002\u00c0\b\u0002"+
		"\n\u0002\f\u0002\u00c3\t\u0002\u0001\u0002\u0005\u0002\u00c6\b\u0002\n"+
		"\u0002\f\u0002\u00c9\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00ce\b\u0003\u0003\u0003\u00d0\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00f0\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00f7\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00ff\b\u0004\u0001\u0004\u0003\u0004\u0102\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u010b\b\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u010f\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0117\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u011b\b\u0007\u0003\u0007\u011d\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u0122\b\b\u0003\b\u0124\b\b\u0001\t\u0003\t\u0127\b\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u012c\b\t\u0001\t\u0001\t\u0003\t\u0130\b\t\u0001"+
		"\t\u0004\t\u0133\b\t\u000b\t\f\t\u0134\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u013c\b\t\n\t\f\t\u013f\t\t\u0003\t\u0141\b\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u0147\b\t\u0003\t\u0149\b\t\u0001\n\u0001"+
		"\n\u0003\n\u014d\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0153\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u0158\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0161\b\n\n\n\f\n\u0164\t\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u0169\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u016d\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0173\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0178\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u017f\b\u000b\n\u000b\f\u000b\u0182\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0186\b\u000b\n\u000b\f\u000b\u0189\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u018e\b\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0192\b\u000b\u0001\f\u0001\f\u0003\f\u0196\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u019c\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u01a1"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u01a8\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u01b1\b\f\n\f"+
		"\f\f\u01b4\t\f\u0003\f\u01b6\b\f\u0003\f\u01b8\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u01be\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u01c4"+
		"\b\f\u0001\f\u0001\f\u0003\f\u01c8\b\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u01cf\b\f\u0001\f\u0001\f\u0004\f\u01d3\b\f\u000b\f\f"+
		"\f\u01d4\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u01db\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u01e1\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u01e6"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01f2\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u01f7\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0200\b\u000e\n\u000e\f\u000e\u0203\t\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0207\b\u000e\u0001\u000f\u0003\u000f\u020a\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0211\b\u000f"+
		"\u0001\u0010\u0003\u0010\u0214\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u021b\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0222\b\u0010\n\u0010"+
		"\f\u0010\u0225\t\u0010\u0003\u0010\u0227\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u022d\b\u0010\u0003\u0010\u022f\b"+
		"\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0233\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u023b"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0240\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0248\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u024d\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0255\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u025a\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0262\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0267\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0003\u0016\u026c\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0272\b\u0016\n\u0016\f\u0016\u0275\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u027c\b\u0016\n"+
		"\u0016\f\u0016\u027f\t\u0016\u0003\u0016\u0281\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0287\b\u0016\u0003\u0016\u0289"+
		"\b\u0016\u0001\u0017\u0003\u0017\u028c\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u029f\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u02a5\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u02ac\b\u0017"+
		"\n\u0017\f\u0017\u02af\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u02b3"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u02ba\b\u0017\n\u0017\f\u0017\u02bd\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u02c5\b\u0017"+
		"\n\u0017\f\u0017\u02c8\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u02cc"+
		"\b\u0017\n\u0017\f\u0017\u02cf\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u02d4\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u02da\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02e3\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u02ea\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u02ee\b\u0019\u0003\u0019\u02f0\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u02f4\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u02fb\b\u001b\u0003"+
		"\u001b\u02fd\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0301\b\u001b"+
		"\u0001\u001b\u0003\u001b\u0304\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0003\u001d\u030a\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0312\b\u001d\n\u001d"+
		"\f\u001d\u0315\t\u001d\u0003\u001d\u0317\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u031d\b\u001d\u0003\u001d\u031f\b"+
		"\u001d\u0001\u001e\u0003\u001e\u0322\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u0328\b\u001e\n\u001e\f\u001e\u032b\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0332\b\u001e\n\u001e\f\u001e\u0335\t\u001e\u0003\u001e\u0337\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u033d\b\u001e"+
		"\u0003\u001e\u033f\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0343\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0348\b\u001f\n"+
		"\u001f\f\u001f\u034b\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u0351\b\u001f\n\u001f\f\u001f\u0354\t\u001f\u0001\u001f"+
		"\u0003\u001f\u0357\b\u001f\u0003\u001f\u0359\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u035d\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u0364\b\u001f\n\u001f\f\u001f\u0367\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u036b\b\u001f\u0003\u001f\u036d\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0374\b\u001f\n\u001f\f\u001f\u0377\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u037f\b\u001f"+
		"\n\u001f\f\u001f\u0382\t\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0386"+
		"\b\u001f\n\u001f\f\u001f\u0389\t\u001f\u0003\u001f\u038b\b\u001f\u0001"+
		" \u0003 \u038e\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u039b\b \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u03a7\b \n \f \u03aa\t \u0001"+
		" \u0001 \u0003 \u03ae\b \u0001!\u0003!\u03b1\b!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u03be\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u03ca\b!\n!\f!\u03cd\t!\u0001!\u0001!\u0003!\u03d1\b!\u0001!\u0001!"+
		"\u0001!\u0001!\u0001!\u0005!\u03d8\b!\n!\f!\u03db\t!\u0003!\u03dd\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u03e3\b!\u0003!\u03e5\b!\u0001\"\u0001\""+
		"\u0001#\u0001#\u0003#\u03eb\b#\u0001#\u0005#\u03ee\b#\n#\f#\u03f1\t#\u0001"+
		"$\u0004$\u03f4\b$\u000b$\f$\u03f5\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u0402\b$\u0001%\u0001%\u0003%\u0406"+
		"\b%\u0001%\u0001%\u0001%\u0003%\u040b\b%\u0001%\u0001%\u0003%\u040f\b"+
		"%\u0001%\u0003%\u0412\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u0424\b%\u0001%\u0001%\u0001%\u0003%\u0429\b%\u0001&\u0001&\u0001&\u0003"+
		"&\u042e\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0436"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u043b\b\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0444\b\'\u0001\'\u0001\'\u0001"+
		"\'\u0005\'\u0449\b\'\n\'\f\'\u044c\t\'\u0001\'\u0003\'\u044f\b\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u045f\b\'\u0001\'\u0003\'\u0462"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u046a\b\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0004\'\u0471\b\'\u000b\'\f\'"+
		"\u0472\u0001\'\u0001\'\u0003\'\u0477\b\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u047c\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0499\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u049e\b\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u04a7"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u04af\b\'"+
		"\n\'\f\'\u04b2\t\'\u0003\'\u04b4\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u04ba\b\'\u0001\'\u0003\'\u04bd\b\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0003\'\u04c4\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u04ca"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u04d1\b\'\u0005\'"+
		"\u04d3\b\'\n\'\f\'\u04d6\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u04de\b(\n(\f(\u04e1\t(\u0001(\u0001(\u0003(\u04e5\b(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u04f1\b(\u0001(\u0001(\u0003(\u04f5\b(\u0005(\u04f7\b(\n(\f(\u04fa\t"+
		"(\u0001(\u0003(\u04fd\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0504"+
		"\b(\u0003(\u0506\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u050e"+
		"\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0003*\u0515\b*\u0001*\u0003*\u0518"+
		"\b*\u0001+\u0001+\u0003+\u051c\b+\u0001+\u0001+\u0001+\u0003+\u0521\b"+
		"+\u0001+\u0001+\u0001+\u0001+\u0005+\u0527\b+\n+\f+\u052a\t+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0005+\u053a\b+\n+\f+\u053d\t+\u0001+\u0001+\u0001+\u0003"+
		"+\u0542\b+\u0001,\u0001,\u0003,\u0546\b,\u0001,\u0001,\u0001,\u0005,\u054b"+
		"\b,\n,\f,\u054e\t,\u0001-\u0001-\u0001-\u0003-\u0553\b-\u0001-\u0001-"+
		"\u0001-\u0001-\u0001-\u0001-\u0003-\u055b\b-\u0001.\u0001.\u0001.\u0003"+
		".\u0560\b.\u0001.\u0003.\u0563\b.\u0001/\u0001/\u0001/\u0003/\u0568\b"+
		"/\u00010\u00010\u00010\u00010\u00010\u00050\u056f\b0\n0\f0\u0572\t0\u0001"+
		"0\u00010\u00030\u0576\b0\u00010\u00010\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00031\u0584\b1\u00011\u00031\u0587"+
		"\b1\u00031\u0589\b1\u00012\u00012\u00012\u00032\u058e\b2\u00012\u0001"+
		"2\u00032\u0592\b2\u00012\u00032\u0595\b2\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u059c\b2\u00012\u00012\u00012\u00032\u05a1\b2\u00012\u00012\u0001"+
		"2\u00012\u00012\u00052\u05a8\b2\n2\f2\u05ab\t2\u00032\u05ad\b2\u00012"+
		"\u00012\u00032\u05b1\b2\u00012\u00032\u05b4\b2\u00012\u00012\u00012\u0001"+
		"2\u00052\u05ba\b2\n2\f2\u05bd\t2\u00012\u00032\u05c0\b2\u00012\u00012"+
		"\u00012\u00012\u00012\u00012\u00032\u05c8\b2\u00012\u00032\u05cb\b2\u0003"+
		"2\u05cd\b2\u00013\u00013\u00013\u00013\u00013\u00053\u05d4\b3\n3\f3\u05d7"+
		"\t3\u00014\u00014\u00034\u05db\b4\u00014\u00014\u00034\u05df\b4\u0001"+
		"4\u00014\u00034\u05e3\b4\u00014\u00034\u05e6\b4\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00055\u05ef\b5\n5\f5\u05f2\t5\u00015\u00015\u0003"+
		"5\u05f6\b5\u00016\u00016\u00036\u05fa\b6\u00016\u00016\u00016\u00056\u05ff"+
		"\b6\n6\f6\u0602\t6\u00016\u00016\u00016\u00016\u00056\u0608\b6\n6\f6\u060b"+
		"\t6\u00016\u00036\u060e\b6\u00036\u0610\b6\u00016\u00016\u00036\u0614"+
		"\b6\u00016\u00016\u00016\u00016\u00016\u00056\u061b\b6\n6\f6\u061e\t6"+
		"\u00016\u00016\u00036\u0622\b6\u00036\u0624\b6\u00016\u00016\u00016\u0001"+
		"6\u00016\u00056\u062b\b6\n6\f6\u062e\t6\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00056\u0636\b6\n6\f6\u0639\t6\u00016\u00016\u00056\u063d\b6"+
		"\n6\f6\u0640\t6\u00036\u0642\b6\u00017\u00017\u00017\u00017\u00017\u0003"+
		"7\u0649\b7\u00018\u00038\u064c\b8\u00018\u00018\u00019\u00019\u0001:\u0001"+
		":\u0001;\u0001;\u0001<\u0001<\u0003<\u0658\b<\u0001=\u0001=\u0001>\u0001"+
		">\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001C\u0001"+
		"C\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001H\u0001"+
		"H\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001M\u0001"+
		"M\u0001N\u0001N\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0003P\u0686\bP\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001"+
		"R\u0001R\u0003R\u0691\bR\u0001R\u0002\u0180\u03f5\u0001NS\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u0000\u0013\u0003\u0000::EERR\u0002\u0000//BB\u0002"+
		"\u0000\u0005\u0005jj\u0001\u0000\u0083\u0084\u0002\u0000\u001d\u001d>"+
		">\u0002\u0000\"\"<<\u0005\u0000\u0019\u0019HHQQzz}}\u0002\u0000\u0007"+
		"\u0007\f\r\u0001\u0000\b\t\u0001\u0000\u000e\u0011\u0001\u0000\u0012\u0015"+
		"\u0002\u0000\u0006\u0006\u0016\u0018\u0004\u0000MMaaccvv\u0002\u0000;"+
		";\u008b\u008b\u0003\u0000\u0019\u0019HH}}\u0004\u000046hh\u0096\u0096"+
		"\u0098\u0099\u0002\u0000\b\nff\u0002\u0000\u0095\u0095\u0098\u0098\u0001"+
		"\u0000\u0019\u0094\u0791\u0000\u00aa\u0001\u0000\u0000\u0000\u0002\u00af"+
		"\u0001\u0000\u0000\u0000\u0004\u00b5\u0001\u0000\u0000\u0000\u0006\u00cf"+
		"\u0001\u0000\u0000\u0000\b\u00f1\u0001\u0000\u0000\u0000\n\u0103\u0001"+
		"\u0000\u0000\u0000\f\u010c\u0001\u0000\u0000\u0000\u000e\u0114\u0001\u0000"+
		"\u0000\u0000\u0010\u011e\u0001\u0000\u0000\u0000\u0012\u0126\u0001\u0000"+
		"\u0000\u0000\u0014\u014a\u0001\u0000\u0000\u0000\u0016\u016a\u0001\u0000"+
		"\u0000\u0000\u0018\u0193\u0001\u0000\u0000\u0000\u001a\u01d8\u0001\u0000"+
		"\u0000\u0000\u001c\u01eb\u0001\u0000\u0000\u0000\u001e\u0209\u0001\u0000"+
		"\u0000\u0000 \u0213\u0001\u0000\u0000\u0000\"\u0230\u0001\u0000\u0000"+
		"\u0000$\u0236\u0001\u0000\u0000\u0000&\u0243\u0001\u0000\u0000\u0000("+
		"\u0250\u0001\u0000\u0000\u0000*\u025d\u0001\u0000\u0000\u0000,\u026b\u0001"+
		"\u0000\u0000\u0000.\u028b\u0001\u0000\u0000\u00000\u02d5\u0001\u0000\u0000"+
		"\u00002\u02e4\u0001\u0000\u0000\u00004\u02f1\u0001\u0000\u0000\u00006"+
		"\u02f7\u0001\u0000\u0000\u00008\u0305\u0001\u0000\u0000\u0000:\u0309\u0001"+
		"\u0000\u0000\u0000<\u0321\u0001\u0000\u0000\u0000>\u038a\u0001\u0000\u0000"+
		"\u0000@\u038d\u0001\u0000\u0000\u0000B\u03b0\u0001\u0000\u0000\u0000D"+
		"\u03e6\u0001\u0000\u0000\u0000F\u03e8\u0001\u0000\u0000\u0000H\u03f3\u0001"+
		"\u0000\u0000\u0000J\u0405\u0001\u0000\u0000\u0000L\u042d\u0001\u0000\u0000"+
		"\u0000N\u047b\u0001\u0000\u0000\u0000P\u04d7\u0001\u0000\u0000\u0000R"+
		"\u0507\u0001\u0000\u0000\u0000T\u0511\u0001\u0000\u0000\u0000V\u051b\u0001"+
		"\u0000\u0000\u0000X\u0543\u0001\u0000\u0000\u0000Z\u0552\u0001\u0000\u0000"+
		"\u0000\\\u055c\u0001\u0000\u0000\u0000^\u0567\u0001\u0000\u0000\u0000"+
		"`\u0569\u0001\u0000\u0000\u0000b\u0588\u0001\u0000\u0000\u0000d\u05cc"+
		"\u0001\u0000\u0000\u0000f\u05ce\u0001\u0000\u0000\u0000h\u05e5\u0001\u0000"+
		"\u0000\u0000j\u05f5\u0001\u0000\u0000\u0000l\u0641\u0001\u0000\u0000\u0000"+
		"n\u0648\u0001\u0000\u0000\u0000p\u064b\u0001\u0000\u0000\u0000r\u064f"+
		"\u0001\u0000\u0000\u0000t\u0651\u0001\u0000\u0000\u0000v\u0653\u0001\u0000"+
		"\u0000\u0000x\u0657\u0001\u0000\u0000\u0000z\u0659\u0001\u0000\u0000\u0000"+
		"|\u065b\u0001\u0000\u0000\u0000~\u065d\u0001\u0000\u0000\u0000\u0080\u065f"+
		"\u0001\u0000\u0000\u0000\u0082\u0661\u0001\u0000\u0000\u0000\u0084\u0663"+
		"\u0001\u0000\u0000\u0000\u0086\u0665\u0001\u0000\u0000\u0000\u0088\u0667"+
		"\u0001\u0000\u0000\u0000\u008a\u0669\u0001\u0000\u0000\u0000\u008c\u066b"+
		"\u0001\u0000\u0000\u0000\u008e\u066d\u0001\u0000\u0000\u0000\u0090\u066f"+
		"\u0001\u0000\u0000\u0000\u0092\u0671\u0001\u0000\u0000\u0000\u0094\u0673"+
		"\u0001\u0000\u0000\u0000\u0096\u0675\u0001\u0000\u0000\u0000\u0098\u0677"+
		"\u0001\u0000\u0000\u0000\u009a\u0679\u0001\u0000\u0000\u0000\u009c\u067b"+
		"\u0001\u0000\u0000\u0000\u009e\u067d\u0001\u0000\u0000\u0000\u00a0\u0685"+
		"\u0001\u0000\u0000\u0000\u00a2\u0687\u0001\u0000\u0000\u0000\u00a4\u0690"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a9\u0003\u0004\u0002\u0000\u00a7\u00a9"+
		"\u0003\u0002\u0001\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0000\u0000\u0001\u00ae\u0001\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u009d\u0000\u0000\u00b0\u00b1\u0006\u0001\uffff\uffff\u0000\u00b1"+
		"\u0003\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005\u0001\u0000\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8"+
		"\u00c1\u0003\u0006\u0003\u0000\u00b9\u00bb\u0005\u0001\u0000\u0000\u00ba"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0003\u0006\u0003\u0000\u00bf"+
		"\u00ba\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c6\u0005\u0001\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u0005\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd\u0005G\u0000\u0000\u00cb\u00cc"+
		"\u0005r\u0000\u0000\u00cc\u00ce\u0005o\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000"+
		"\u0000\u0000\u00cf\u00ca\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ef\u0001\u0000\u0000\u0000\u00d1\u00f0\u0003\b\u0004"+
		"\u0000\u00d2\u00f0\u0003\n\u0005\u0000\u00d3\u00f0\u0003\f\u0006\u0000"+
		"\u00d4\u00f0\u0003\u000e\u0007\u0000\u00d5\u00f0\u0003\u0010\b\u0000\u00d6"+
		"\u00f0\u0003\u0012\t\u0000\u00d7\u00f0\u0003\u0014\n\u0000\u00d8\u00f0"+
		"\u0003\u0016\u000b\u0000\u00d9\u00f0\u0003\u0018\f\u0000\u00da\u00f0\u0003"+
		"\u001a\r\u0000\u00db\u00f0\u0003\u001c\u000e\u0000\u00dc\u00f0\u0003\u001e"+
		"\u000f\u0000\u00dd\u00f0\u0003 \u0010\u0000\u00de\u00f0\u0003\"\u0011"+
		"\u0000\u00df\u00f0\u0003$\u0012\u0000\u00e0\u00f0\u0003&\u0013\u0000\u00e1"+
		"\u00f0\u0003(\u0014\u0000\u00e2\u00f0\u0003*\u0015\u0000\u00e3\u00f0\u0003"+
		",\u0016\u0000\u00e4\u00f0\u0003.\u0017\u0000\u00e5\u00f0\u00030\u0018"+
		"\u0000\u00e6\u00f0\u00032\u0019\u0000\u00e7\u00f0\u00034\u001a\u0000\u00e8"+
		"\u00f0\u00036\u001b\u0000\u00e9\u00f0\u00038\u001c\u0000\u00ea\u00f0\u0003"+
		":\u001d\u0000\u00eb\u00f0\u0003<\u001e\u0000\u00ec\u00f0\u0003@ \u0000"+
		"\u00ed\u00f0\u0003B!\u0000\u00ee\u00f0\u0003D\"\u0000\u00ef\u00d1\u0001"+
		"\u0000\u0000\u0000\u00ef\u00d2\u0001\u0000\u0000\u0000\u00ef\u00d3\u0001"+
		"\u0000\u0000\u0000\u00ef\u00d4\u0001\u0000\u0000\u0000\u00ef\u00d5\u0001"+
		"\u0000\u0000\u0000\u00ef\u00d6\u0001\u0000\u0000\u0000\u00ef\u00d7\u0001"+
		"\u0000\u0000\u0000\u00ef\u00d8\u0001\u0000\u0000\u0000\u00ef\u00d9\u0001"+
		"\u0000\u0000\u0000\u00ef\u00da\u0001\u0000\u0000\u0000\u00ef\u00db\u0001"+
		"\u0000\u0000\u0000\u00ef\u00dc\u0001\u0000\u0000\u0000\u00ef\u00dd\u0001"+
		"\u0000\u0000\u0000\u00ef\u00de\u0001\u0000\u0000\u0000\u00ef\u00df\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e0\u0001\u0000\u0000\u0000\u00ef\u00e1\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e2\u0001\u0000\u0000\u0000\u00ef\u00e3\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e4\u0001\u0000\u0000\u0000\u00ef\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e6\u0001\u0000\u0000\u0000\u00ef\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e8\u0001\u0000\u0000\u0000\u00ef\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000\u00ef\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u0007\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\u001e\u0000\u0000\u00f2\u00f6\u0005"+
		"\u0082\u0000\u0000\u00f3\u00f4\u0003\u0082A\u0000\u00f4\u00f5\u0005\u0002"+
		"\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u0101\u0003\u0088D\u0000\u00f9\u00fa\u0005y\u0000\u0000"+
		"\u00fa\u00fb\u0005\u0086\u0000\u0000\u00fb\u0102\u0003\u008cF\u0000\u00fc"+
		"\u00fe\u0005\u001b\u0000\u0000\u00fd\u00ff\u0005.\u0000\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0102\u0003F#\u0000\u0101\u00f9\u0001\u0000"+
		"\u0000\u0000\u0101\u00fc\u0001\u0000\u0000\u0000\u0102\t\u0001\u0000\u0000"+
		"\u0000\u0103\u010a\u0005\u001f\u0000\u0000\u0104\u010b\u0003\u0082A\u0000"+
		"\u0105\u010b\u0003\u008aE\u0000\u0106\u0107\u0003\u0082A\u0000\u0107\u0108"+
		"\u0005\u0002\u0000\u0000\u0108\u0109\u0003\u008aE\u0000\u0109\u010b\u0001"+
		"\u0000\u0000\u0000\u010a\u0104\u0001\u0000\u0000\u0000\u010a\u0105\u0001"+
		"\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u000b\u0001\u0000\u0000\u0000\u010c\u010e\u0005"+
		"#\u0000\u0000\u010d\u010f\u00057\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0003N\'\u0000\u0111\u0112\u0005!\u0000\u0000\u0112"+
		"\u0113\u0003\u0082A\u0000\u0113\r\u0001\u0000\u0000\u0000\u0114\u0116"+
		"\u0005&\u0000\u0000\u0115\u0117\u0007\u0000\u0000\u0000\u0116\u0115\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011c\u0001"+
		"\u0000\u0000\u0000\u0118\u011a\u0005\u0087\u0000\u0000\u0119\u011b\u0003"+
		"\u00a2Q\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0118\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u000f\u0001\u0000"+
		"\u0000\u0000\u011e\u0123\u0007\u0001\u0000\u0000\u011f\u0121\u0005\u0087"+
		"\u0000\u0000\u0120\u0122\u0003\u00a2Q\u0000\u0121\u0120\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000"+
		"\u0000\u0123\u011f\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0011\u0001\u0000\u0000\u0000\u0125\u0127\u0003X,\u0000\u0126"+
		"\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u0132\u0003l6\u0000\u0129\u012b\u0005"+
		"\u0089\u0000\u0000\u012a\u012c\u0005\u001d\u0000\u0000\u012b\u012a\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u0130\u0001"+
		"\u0000\u0000\u0000\u012d\u0130\u0005Z\u0000\u0000\u012e\u0130\u0005D\u0000"+
		"\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0133\u0003l6\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0001\u0000\u0000\u0000\u0135\u0140\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005m\u0000\u0000\u0137\u0138\u0005(\u0000\u0000\u0138\u013d\u0003"+
		"\\.\u0000\u0139\u013a\u0005\u0005\u0000\u0000\u013a\u013c\u0003\\.\u0000"+
		"\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000"+
		"\u0140\u0136\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u0148\u0001\u0000\u0000\u0000\u0142\u0143\u0005b\u0000\u0000\u0143"+
		"\u0146\u0003N\'\u0000\u0144\u0145\u0007\u0002\u0000\u0000\u0145\u0147"+
		"\u0003N\'\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0142\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u0013\u0001"+
		"\u0000\u0000\u0000\u014a\u014c\u00052\u0000\u0000\u014b\u014d\u0005\u008a"+
		"\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0152\u0005T\u0000"+
		"\u0000\u014f\u0150\u0005P\u0000\u0000\u0150\u0151\u0005f\u0000\u0000\u0151"+
		"\u0153\u0005F\u0000\u0000\u0152\u014f\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0001\u0000\u0000\u0000\u0153\u0157\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0003\u0082A\u0000\u0155\u0156\u0005\u0002\u0000\u0000\u0156\u0158\u0001"+
		"\u0000\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0003"+
		"\u0094J\u0000\u015a\u015b\u0005k\u0000\u0000\u015b\u015c\u0003\u0088D"+
		"\u0000\u015c\u015d\u0005\u0003\u0000\u0000\u015d\u0162\u0003T*\u0000\u015e"+
		"\u015f\u0005\u0005\u0000\u0000\u015f\u0161\u0003T*\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001"+
		"\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0168\u0005"+
		"\u0004\u0000\u0000\u0166\u0167\u0005\u0092\u0000\u0000\u0167\u0169\u0003"+
		"N\'\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000"+
		"\u0000\u0000\u0169\u0015\u0001\u0000\u0000\u0000\u016a\u016c\u00052\u0000"+
		"\u0000\u016b\u016d\u0007\u0003\u0000\u0000\u016c\u016b\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u0172\u0005\u0082\u0000\u0000\u016f\u0170\u0005P\u0000\u0000"+
		"\u0170\u0171\u0005f\u0000\u0000\u0171\u0173\u0005F\u0000\u0000\u0172\u016f"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0177"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0003\u0082A\u0000\u0175\u0176\u0005"+
		"\u0002\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0174\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0001"+
		"\u0000\u0000\u0000\u0179\u0191\u0003\u0088D\u0000\u017a\u017b\u0005\u0003"+
		"\u0000\u0000\u017b\u0180\u0003F#\u0000\u017c\u017d\u0005\u0005\u0000\u0000"+
		"\u017d\u017f\u0003F#\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0182"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0180\u017e"+
		"\u0001\u0000\u0000\u0000\u0181\u0187\u0001\u0000\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u0005\u0000\u0000\u0184\u0186"+
		"\u0003V+\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u018a\u018d\u0005\u0004\u0000\u0000\u018b\u018c\u0005\u0094"+
		"\u0000\u0000\u018c\u018e\u0005\u0095\u0000\u0000\u018d\u018b\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0192\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\u0005!\u0000\u0000\u0190\u0192\u0003<\u001e\u0000"+
		"\u0191\u017a\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000"+
		"\u0192\u0017\u0001\u0000\u0000\u0000\u0193\u0195\u00052\u0000\u0000\u0194"+
		"\u0196\u0007\u0003\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197"+
		"\u019b\u0005\u0088\u0000\u0000\u0198\u0199\u0005P\u0000\u0000\u0199\u019a"+
		"\u0005f\u0000\u0000\u019a\u019c\u0005F\u0000\u0000\u019b\u0198\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u01a0\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0003\u0082A\u0000\u019e\u019f\u0005\u0002\u0000"+
		"\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u019d\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a7\u0003\u0096K\u0000\u01a3\u01a8\u0005%\u0000\u0000\u01a4"+
		"\u01a8\u0005\u001c\u0000\u0000\u01a5\u01a6\u0005Y\u0000\u0000\u01a6\u01a8"+
		"\u0005i\u0000\u0000\u01a7\u01a3\u0001\u0000\u0000\u0000\u01a7\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a8\u01b7\u0001\u0000\u0000\u0000\u01a9\u01b8\u0005"+
		";\u0000\u0000\u01aa\u01b8\u0005X\u0000\u0000\u01ab\u01b5\u0005\u008b\u0000"+
		"\u0000\u01ac\u01ad\u0005i\u0000\u0000\u01ad\u01b2\u0003\u008eG\u0000\u01ae"+
		"\u01af\u0005\u0005\u0000\u0000\u01af\u01b1\u0003\u008eG\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01ac"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b7\u01a9\u0001\u0000\u0000\u0000\u01b7\u01aa"+
		"\u0001\u0000\u0000\u0000\u01b7\u01ab\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bd\u0005k\u0000\u0000\u01ba\u01bb\u0003"+
		"\u0082A\u0000\u01bb\u01bc\u0005\u0002\u0000\u0000\u01bc\u01be\u0001\u0000"+
		"\u0000\u0000\u01bd\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c3\u0003\u0088"+
		"D\u0000\u01c0\u01c1\u0005I\u0000\u0000\u01c1\u01c2\u0005@\u0000\u0000"+
		"\u01c2\u01c4\u0005~\u0000\u0000\u01c3\u01c0\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0005\u0091\u0000\u0000\u01c6\u01c8\u0003N\'\u0000\u01c7\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c9\u01d2\u0005&\u0000\u0000\u01ca\u01cf\u0003"+
		"@ \u0000\u01cb\u01cf\u0003.\u0017\u0000\u01cc\u01cf\u0003\u001e\u000f"+
		"\u0000\u01cd\u01cf\u0003<\u001e\u0000\u01ce\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d1\u0005\u0001\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d2\u01ce\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005B\u0000\u0000\u01d7"+
		"\u0019\u0001\u0000\u0000\u0000\u01d8\u01da\u00052\u0000\u0000\u01d9\u01db"+
		"\u0007\u0003\u0000\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01e0"+
		"\u0005\u008f\u0000\u0000\u01dd\u01de\u0005P\u0000\u0000\u01de\u01df\u0005"+
		"f\u0000\u0000\u01df\u01e1\u0005F\u0000\u0000\u01e0\u01dd\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e3\u0003\u0082A\u0000\u01e3\u01e4\u0005\u0002\u0000\u0000"+
		"\u01e4\u01e6\u0001\u0000\u0000\u0000\u01e5\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0003\u0098L\u0000\u01e8\u01e9\u0005!\u0000\u0000\u01e9\u01ea"+
		"\u0003<\u001e\u0000\u01ea\u001b\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005"+
		"2\u0000\u0000\u01ec\u01ed\u0005\u0090\u0000\u0000\u01ed\u01f1\u0005\u0082"+
		"\u0000\u0000\u01ee\u01ef\u0005P\u0000\u0000\u01ef\u01f0\u0005f\u0000\u0000"+
		"\u01f0\u01f2\u0005F\u0000\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f6\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0003\u0082A\u0000\u01f4\u01f5\u0005\u0002\u0000\u0000\u01f5\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0003\u0088D\u0000\u01f9\u01fa\u0005\u008c\u0000\u0000\u01fa\u0206\u0003"+
		"\u009aM\u0000\u01fb\u01fc\u0005\u0003\u0000\u0000\u01fc\u0201\u0003x<"+
		"\u0000\u01fd\u01fe\u0005\u0005\u0000\u0000\u01fe\u0200\u0003x<\u0000\u01ff"+
		"\u01fd\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201"+
		"\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u0204\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u0005\u0004\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206"+
		"\u01fb\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207"+
		"\u001d\u0001\u0000\u0000\u0000\u0208\u020a\u0003X,\u0000\u0209\u0208\u0001"+
		"\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0005;\u0000\u0000\u020c\u020d\u0005K\u0000"+
		"\u0000\u020d\u0210\u0003Z-\u0000\u020e\u020f\u0005\u0092\u0000\u0000\u020f"+
		"\u0211\u0003N\'\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0001\u0000\u0000\u0000\u0211\u001f\u0001\u0000\u0000\u0000\u0212\u0214"+
		"\u0003X,\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0005;\u0000"+
		"\u0000\u0216\u0217\u0005K\u0000\u0000\u0217\u021a\u0003Z-\u0000\u0218"+
		"\u0219\u0005\u0092\u0000\u0000\u0219\u021b\u0003N\'\u0000\u021a\u0218"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u022e"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0005m\u0000\u0000\u021d\u021e\u0005"+
		"(\u0000\u0000\u021e\u0223\u0003\\.\u0000\u021f\u0220\u0005\u0005\u0000"+
		"\u0000\u0220\u0222\u0003\\.\u0000\u0221\u021f\u0001\u0000\u0000\u0000"+
		"\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u021c\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0005b\u0000\u0000\u0229\u022c\u0003N\'\u0000\u022a\u022b"+
		"\u0007\u0002\u0000\u0000\u022b\u022d\u0003N\'\u0000\u022c\u022a\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022f\u0001"+
		"\u0000\u0000\u0000\u022e\u0226\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f!\u0001\u0000\u0000\u0000\u0230\u0232\u0005=\u0000"+
		"\u0000\u0231\u0233\u00057\u0000\u0000\u0232\u0231\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000"+
		"\u0234\u0235\u0003\u0082A\u0000\u0235#\u0001\u0000\u0000\u0000\u0236\u0237"+
		"\u0005?\u0000\u0000\u0237\u023a\u0005T\u0000\u0000\u0238\u0239\u0005P"+
		"\u0000\u0000\u0239\u023b\u0005F\u0000\u0000\u023a\u0238\u0001\u0000\u0000"+
		"\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023f\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0003\u0082A\u0000\u023d\u023e\u0005\u0002\u0000\u0000"+
		"\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u023c\u0001\u0000\u0000\u0000"+
		"\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000"+
		"\u0241\u0242\u0003\u0094J\u0000\u0242%\u0001\u0000\u0000\u0000\u0243\u0244"+
		"\u0005?\u0000\u0000\u0244\u0247\u0005\u0082\u0000\u0000\u0245\u0246\u0005"+
		"P\u0000\u0000\u0246\u0248\u0005F\u0000\u0000\u0247\u0245\u0001\u0000\u0000"+
		"\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024c\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0003\u0082A\u0000\u024a\u024b\u0005\u0002\u0000\u0000"+
		"\u024b\u024d\u0001\u0000\u0000\u0000\u024c\u0249\u0001\u0000\u0000\u0000"+
		"\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000"+
		"\u024e\u024f\u0003\u0088D\u0000\u024f\'\u0001\u0000\u0000\u0000\u0250"+
		"\u0251\u0005?\u0000\u0000\u0251\u0254\u0005\u0088\u0000\u0000\u0252\u0253"+
		"\u0005P\u0000\u0000\u0253\u0255\u0005F\u0000\u0000\u0254\u0252\u0001\u0000"+
		"\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0259\u0001\u0000"+
		"\u0000\u0000\u0256\u0257\u0003\u0082A\u0000\u0257\u0258\u0005\u0002\u0000"+
		"\u0000\u0258\u025a\u0001\u0000\u0000\u0000\u0259\u0256\u0001\u0000\u0000"+
		"\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000"+
		"\u0000\u025b\u025c\u0003\u0096K\u0000\u025c)\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0005?\u0000\u0000\u025e\u0261\u0005\u008f\u0000\u0000\u025f\u0260"+
		"\u0005P\u0000\u0000\u0260\u0262\u0005F\u0000\u0000\u0261\u025f\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0266\u0001\u0000"+
		"\u0000\u0000\u0263\u0264\u0003\u0082A\u0000\u0264\u0265\u0005\u0002\u0000"+
		"\u0000\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u0263\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\u0003\u0098L\u0000\u0269+\u0001\u0000\u0000\u0000\u026a"+
		"\u026c\u0003X,\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c\u0001"+
		"\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u0273\u0003"+
		"l6\u0000\u026e\u026f\u0003n7\u0000\u026f\u0270\u0003l6\u0000\u0270\u0272"+
		"\u0001\u0000\u0000\u0000\u0271\u026e\u0001\u0000\u0000\u0000\u0272\u0275"+
		"\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0001\u0000\u0000\u0000\u0274\u0280\u0001\u0000\u0000\u0000\u0275\u0273"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0005m\u0000\u0000\u0277\u0278\u0005"+
		"(\u0000\u0000\u0278\u027d\u0003\\.\u0000\u0279\u027a\u0005\u0005\u0000"+
		"\u0000\u027a\u027c\u0003\\.\u0000\u027b\u0279\u0001\u0000\u0000\u0000"+
		"\u027c\u027f\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u0281\u0001\u0000\u0000\u0000"+
		"\u027f\u027d\u0001\u0000\u0000\u0000\u0280\u0276\u0001\u0000\u0000\u0000"+
		"\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0288\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0005b\u0000\u0000\u0283\u0286\u0003N\'\u0000\u0284\u0285"+
		"\u0007\u0002\u0000\u0000\u0285\u0287\u0003N\'\u0000\u0286\u0284\u0001"+
		"\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0289\u0001"+
		"\u0000\u0000\u0000\u0288\u0282\u0001\u0000\u0000\u0000\u0288\u0289\u0001"+
		"\u0000\u0000\u0000\u0289-\u0001\u0000\u0000\u0000\u028a\u028c\u0003X,"+
		"\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000"+
		"\u0000\u028c\u029e\u0001\u0000\u0000\u0000\u028d\u029f\u0005X\u0000\u0000"+
		"\u028e\u029f\u0005z\u0000\u0000\u028f\u0290\u0005X\u0000\u0000\u0290\u0291"+
		"\u0005l\u0000\u0000\u0291\u029f\u0005z\u0000\u0000\u0292\u0293\u0005X"+
		"\u0000\u0000\u0293\u0294\u0005l\u0000\u0000\u0294\u029f\u0005}\u0000\u0000"+
		"\u0295\u0296\u0005X\u0000\u0000\u0296\u0297\u0005l\u0000\u0000\u0297\u029f"+
		"\u0005\u0019\u0000\u0000\u0298\u0299\u0005X\u0000\u0000\u0299\u029a\u0005"+
		"l\u0000\u0000\u029a\u029f\u0005H\u0000\u0000\u029b\u029c\u0005X\u0000"+
		"\u0000\u029c\u029d\u0005l\u0000\u0000\u029d\u029f\u0005Q\u0000\u0000\u029e"+
		"\u028d\u0001\u0000\u0000\u0000\u029e\u028e\u0001\u0000\u0000\u0000\u029e"+
		"\u028f\u0001\u0000\u0000\u0000\u029e\u0292\u0001\u0000\u0000\u0000\u029e"+
		"\u0295\u0001\u0000\u0000\u0000\u029e\u0298\u0001\u0000\u0000\u0000\u029e"+
		"\u029b\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a4\u0005[\u0000\u0000\u02a1\u02a2\u0003\u0082A\u0000\u02a2\u02a3\u0005"+
		"\u0002\u0000\u0000\u02a3\u02a5\u0001\u0000\u0000\u0000\u02a4\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a6\u02b2\u0003\u0088D\u0000\u02a7\u02a8\u0005\u0003"+
		"\u0000\u0000\u02a8\u02ad\u0003\u008eG\u0000\u02a9\u02aa\u0005\u0005\u0000"+
		"\u0000\u02aa\u02ac\u0003\u008eG\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000"+
		"\u02ac\u02af\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000"+
		"\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000"+
		"\u02af\u02ad\u0001\u0000\u0000\u0000\u02b0\u02b1\u0005\u0004\u0000\u0000"+
		"\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02a7\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02d3\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0005\u008e\u0000\u0000\u02b5\u02b6\u0005\u0003\u0000\u0000"+
		"\u02b6\u02bb\u0003N\'\u0000\u02b7\u02b8\u0005\u0005\u0000\u0000\u02b8"+
		"\u02ba\u0003N\'\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02ba\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bc\u02be\u0001\u0000\u0000\u0000\u02bd\u02bb"+
		"\u0001\u0000\u0000\u0000\u02be\u02cd\u0005\u0004\u0000\u0000\u02bf\u02c0"+
		"\u0005\u0005\u0000\u0000\u02c0\u02c1\u0005\u0003\u0000\u0000\u02c1\u02c6"+
		"\u0003N\'\u0000\u02c2\u02c3\u0005\u0005\u0000\u0000\u02c3\u02c5\u0003"+
		"N\'\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5\u02c8\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c9\u0001\u0000\u0000\u0000\u02c8\u02c6\u0001\u0000"+
		"\u0000\u0000\u02c9\u02ca\u0005\u0004\u0000\u0000\u02ca\u02cc\u0001\u0000"+
		"\u0000\u0000\u02cb\u02bf\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001\u0000"+
		"\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000"+
		"\u0000\u0000\u02ce\u02d4\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000"+
		"\u0000\u0000\u02d0\u02d4\u0003<\u001e\u0000\u02d1\u02d2\u00058\u0000\u0000"+
		"\u02d2\u02d4\u0005\u008e\u0000\u0000\u02d3\u02b4\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d4/\u0001\u0000\u0000\u0000\u02d5\u02d9\u0005p\u0000\u0000\u02d6\u02d7"+
		"\u0003\u0082A\u0000\u02d7\u02d8\u0005\u0002\u0000\u0000\u02d8\u02da\u0001"+
		"\u0000\u0000\u0000\u02d9\u02d6\u0001\u0000\u0000\u0000\u02d9\u02da\u0001"+
		"\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02e2\u0003"+
		"\u009cN\u0000\u02dc\u02dd\u0005\u0006\u0000\u0000\u02dd\u02e3\u0003^/"+
		"\u0000\u02de\u02df\u0005\u0003\u0000\u0000\u02df\u02e0\u0003^/\u0000\u02e0"+
		"\u02e1\u0005\u0004\u0000\u0000\u02e1\u02e3\u0001\u0000\u0000\u0000\u02e2"+
		"\u02dc\u0001\u0000\u0000\u0000\u02e2\u02de\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e31\u0001\u0000\u0000\u0000\u02e4\u02ef"+
		"\u0005w\u0000\u0000\u02e5\u02f0\u0003\u0090H\u0000\u02e6\u02e7\u0003\u0082"+
		"A\u0000\u02e7\u02e8\u0005\u0002\u0000\u0000\u02e8\u02ea\u0001\u0000\u0000"+
		"\u0000\u02e9\u02e6\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ea\u02ed\u0001\u0000\u0000\u0000\u02eb\u02ee\u0003\u0088D\u0000"+
		"\u02ec\u02ee\u0003\u0094J\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ec\u0001\u0000\u0000\u0000\u02ee\u02f0\u0001\u0000\u0000\u0000\u02ef"+
		"\u02e5\u0001\u0000\u0000\u0000\u02ef\u02e9\u0001\u0000\u0000\u0000\u02ef"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f03\u0001\u0000\u0000\u0000\u02f1\u02f3"+
		"\u0005x\u0000\u0000\u02f2\u02f4\u0005\u007f\u0000\u0000\u02f3\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f6\u0003\u009eO\u0000\u02f65\u0001\u0000\u0000"+
		"\u0000\u02f7\u02fc\u0005}\u0000\u0000\u02f8\u02fa\u0005\u0087\u0000\u0000"+
		"\u02f9\u02fb\u0003\u00a2Q\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fd\u0001\u0000\u0000\u0000\u02fc"+
		"\u02f8\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd"+
		"\u0303\u0001\u0000\u0000\u0000\u02fe\u0300\u0005\u0086\u0000\u0000\u02ff"+
		"\u0301\u0005\u007f\u0000\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0300"+
		"\u0301\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302"+
		"\u0304\u0003\u009eO\u0000\u0303\u02fe\u0001\u0000\u0000\u0000\u0303\u0304"+
		"\u0001\u0000\u0000\u0000\u03047\u0001\u0000\u0000\u0000\u0305\u0306\u0005"+
		"\u007f\u0000\u0000\u0306\u0307\u0003\u009eO\u0000\u03079\u0001\u0000\u0000"+
		"\u0000\u0308\u030a\u0003X,\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u0309"+
		"\u030a\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b"+
		"\u0316\u0003l6\u0000\u030c\u030d\u0005m\u0000\u0000\u030d\u030e\u0005"+
		"(\u0000\u0000\u030e\u0313\u0003\\.\u0000\u030f\u0310\u0005\u0005\u0000"+
		"\u0000\u0310\u0312\u0003\\.\u0000\u0311\u030f\u0001\u0000\u0000\u0000"+
		"\u0312\u0315\u0001\u0000\u0000\u0000\u0313\u0311\u0001\u0000\u0000\u0000"+
		"\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0317\u0001\u0000\u0000\u0000"+
		"\u0315\u0313\u0001\u0000\u0000\u0000\u0316\u030c\u0001\u0000\u0000\u0000"+
		"\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u031e\u0001\u0000\u0000\u0000"+
		"\u0318\u0319\u0005b\u0000\u0000\u0319\u031c\u0003N\'\u0000\u031a\u031b"+
		"\u0007\u0002\u0000\u0000\u031b\u031d\u0003N\'\u0000\u031c\u031a\u0001"+
		"\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031f\u0001"+
		"\u0000\u0000\u0000\u031e\u0318\u0001\u0000\u0000\u0000\u031e\u031f\u0001"+
		"\u0000\u0000\u0000\u031f;\u0001\u0000\u0000\u0000\u0320\u0322\u0003X,"+
		"\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000"+
		"\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323\u0329\u0003>\u001f\u0000"+
		"\u0324\u0325\u0003n7\u0000\u0325\u0326\u0003>\u001f\u0000\u0326\u0328"+
		"\u0001\u0000\u0000\u0000\u0327\u0324\u0001\u0000\u0000\u0000\u0328\u032b"+
		"\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a"+
		"\u0001\u0000\u0000\u0000\u032a\u0336\u0001\u0000\u0000\u0000\u032b\u0329"+
		"\u0001\u0000\u0000\u0000\u032c\u032d\u0005m\u0000\u0000\u032d\u032e\u0005"+
		"(\u0000\u0000\u032e\u0333\u0003\\.\u0000\u032f\u0330\u0005\u0005\u0000"+
		"\u0000\u0330\u0332\u0003\\.\u0000\u0331\u032f\u0001\u0000\u0000\u0000"+
		"\u0332\u0335\u0001\u0000\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000"+
		"\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000"+
		"\u0335\u0333\u0001\u0000\u0000\u0000\u0336\u032c\u0001\u0000\u0000\u0000"+
		"\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u033e\u0001\u0000\u0000\u0000"+
		"\u0338\u0339\u0005b\u0000\u0000\u0339\u033c\u0003N\'\u0000\u033a\u033b"+
		"\u0007\u0002\u0000\u0000\u033b\u033d\u0003N\'\u0000\u033c\u033a\u0001"+
		"\u0000\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u033f\u0001"+
		"\u0000\u0000\u0000\u033e\u0338\u0001\u0000\u0000\u0000\u033e\u033f\u0001"+
		"\u0000\u0000\u0000\u033f=\u0001\u0000\u0000\u0000\u0340\u0342\u0005\u0080"+
		"\u0000\u0000\u0341\u0343\u0007\u0004\u0000\u0000\u0342\u0341\u0001\u0000"+
		"\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000"+
		"\u0000\u0000\u0344\u0349\u0003b1\u0000\u0345\u0346\u0005\u0005\u0000\u0000"+
		"\u0346\u0348\u0003b1\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u034b"+
		"\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u034a"+
		"\u0001\u0000\u0000\u0000\u034a\u0358\u0001\u0000\u0000\u0000\u034b\u0349"+
		"\u0001\u0000\u0000\u0000\u034c\u0356\u0005K\u0000\u0000\u034d\u0352\u0003"+
		"d2\u0000\u034e\u034f\u0005\u0005\u0000\u0000\u034f\u0351\u0003d2\u0000"+
		"\u0350\u034e\u0001\u0000\u0000\u0000\u0351\u0354\u0001\u0000\u0000\u0000"+
		"\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000"+
		"\u0353\u0357\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000"+
		"\u0355\u0357\u0003f3\u0000\u0356\u034d\u0001\u0000\u0000\u0000\u0356\u0355"+
		"\u0001\u0000\u0000\u0000\u0357\u0359\u0001\u0000\u0000\u0000\u0358\u034c"+
		"\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u035c"+
		"\u0001\u0000\u0000\u0000\u035a\u035b\u0005\u0092\u0000\u0000\u035b\u035d"+
		"\u0003N\'\u0000\u035c\u035a\u0001\u0000\u0000\u0000\u035c\u035d\u0001"+
		"\u0000\u0000\u0000\u035d\u036c\u0001\u0000\u0000\u0000\u035e\u035f\u0005"+
		"N\u0000\u0000\u035f\u0360\u0005(\u0000\u0000\u0360\u0365\u0003N\'\u0000"+
		"\u0361\u0362\u0005\u0005\u0000\u0000\u0362\u0364\u0003N\'\u0000\u0363"+
		"\u0361\u0001\u0000\u0000\u0000\u0364\u0367\u0001\u0000\u0000\u0000\u0365"+
		"\u0363\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366"+
		"\u036a\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0368"+
		"\u0369\u0005O\u0000\u0000\u0369\u036b\u0003N\'\u0000\u036a\u0368\u0001"+
		"\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u036d\u0001"+
		"\u0000\u0000\u0000\u036c\u035e\u0001\u0000\u0000\u0000\u036c\u036d\u0001"+
		"\u0000\u0000\u0000\u036d\u038b\u0001\u0000\u0000\u0000\u036e\u036f\u0005"+
		"\u008e\u0000\u0000\u036f\u0370\u0005\u0003\u0000\u0000\u0370\u0375\u0003"+
		"N\'\u0000\u0371\u0372\u0005\u0005\u0000\u0000\u0372\u0374\u0003N\'\u0000"+
		"\u0373\u0371\u0001\u0000\u0000\u0000\u0374\u0377\u0001\u0000\u0000\u0000"+
		"\u0375\u0373\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000"+
		"\u0376\u0378\u0001\u0000\u0000\u0000\u0377\u0375\u0001\u0000\u0000\u0000"+
		"\u0378\u0387\u0005\u0004\u0000\u0000\u0379\u037a\u0005\u0005\u0000\u0000"+
		"\u037a\u037b\u0005\u0003\u0000\u0000\u037b\u0380\u0003N\'\u0000\u037c"+
		"\u037d\u0005\u0005\u0000\u0000\u037d\u037f\u0003N\'\u0000\u037e\u037c"+
		"\u0001\u0000\u0000\u0000\u037f\u0382\u0001\u0000\u0000\u0000\u0380\u037e"+
		"\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u0383"+
		"\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0383\u0384"+
		"\u0005\u0004\u0000\u0000\u0384\u0386\u0001\u0000\u0000\u0000\u0385\u0379"+
		"\u0001\u0000\u0000\u0000\u0386\u0389\u0001\u0000\u0000\u0000\u0387\u0385"+
		"\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u038b"+
		"\u0001\u0000\u0000\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u038a\u0340"+
		"\u0001\u0000\u0000\u0000\u038a\u036e\u0001\u0000\u0000\u0000\u038b?\u0001"+
		"\u0000\u0000\u0000\u038c\u038e\u0003X,\u0000\u038d\u038c\u0001\u0000\u0000"+
		"\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000"+
		"\u0000\u038f\u039a\u0005\u008b\u0000\u0000\u0390\u0391\u0005l\u0000\u0000"+
		"\u0391\u039b\u0005}\u0000\u0000\u0392\u0393\u0005l\u0000\u0000\u0393\u039b"+
		"\u0005\u0019\u0000\u0000\u0394\u0395\u0005l\u0000\u0000\u0395\u039b\u0005"+
		"z\u0000\u0000\u0396\u0397\u0005l\u0000\u0000\u0397\u039b\u0005H\u0000"+
		"\u0000\u0398\u0399\u0005l\u0000\u0000\u0399\u039b\u0005Q\u0000\u0000\u039a"+
		"\u0390\u0001\u0000\u0000\u0000\u039a\u0392\u0001\u0000\u0000\u0000\u039a"+
		"\u0394\u0001\u0000\u0000\u0000\u039a\u0396\u0001\u0000\u0000\u0000\u039a"+
		"\u0398\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b"+
		"\u039c\u0001\u0000\u0000\u0000\u039c\u039d\u0003Z-\u0000\u039d\u039e\u0005"+
		"\u0081\u0000\u0000\u039e\u039f\u0003\u008eG\u0000\u039f\u03a0\u0005\u0006"+
		"\u0000\u0000\u03a0\u03a8\u0003N\'\u0000\u03a1\u03a2\u0005\u0005\u0000"+
		"\u0000\u03a2\u03a3\u0003\u008eG\u0000\u03a3\u03a4\u0005\u0006\u0000\u0000"+
		"\u03a4\u03a5\u0003N\'\u0000\u03a5\u03a7\u0001\u0000\u0000\u0000\u03a6"+
		"\u03a1\u0001\u0000\u0000\u0000\u03a7\u03aa\u0001\u0000\u0000\u0000\u03a8"+
		"\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9"+
		"\u03ad\u0001\u0000\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03ab"+
		"\u03ac\u0005\u0092\u0000\u0000\u03ac\u03ae\u0003N\'\u0000\u03ad\u03ab"+
		"\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03aeA\u0001"+
		"\u0000\u0000\u0000\u03af\u03b1\u0003X,\u0000\u03b0\u03af\u0001\u0000\u0000"+
		"\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000"+
		"\u0000\u03b2\u03bd\u0005\u008b\u0000\u0000\u03b3\u03b4\u0005l\u0000\u0000"+
		"\u03b4\u03be\u0005}\u0000\u0000\u03b5\u03b6\u0005l\u0000\u0000\u03b6\u03be"+
		"\u0005\u0019\u0000\u0000\u03b7\u03b8\u0005l\u0000\u0000\u03b8\u03be\u0005"+
		"z\u0000\u0000\u03b9\u03ba\u0005l\u0000\u0000\u03ba\u03be\u0005H\u0000"+
		"\u0000\u03bb\u03bc\u0005l\u0000\u0000\u03bc\u03be\u0005Q\u0000\u0000\u03bd"+
		"\u03b3\u0001\u0000\u0000\u0000\u03bd\u03b5\u0001\u0000\u0000\u0000\u03bd"+
		"\u03b7\u0001\u0000\u0000\u0000\u03bd\u03b9\u0001\u0000\u0000\u0000\u03bd"+
		"\u03bb\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be"+
		"\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c0\u0003Z-\u0000\u03c0\u03c1\u0005"+
		"\u0081\u0000\u0000\u03c1\u03c2\u0003\u008eG\u0000\u03c2\u03c3\u0005\u0006"+
		"\u0000\u0000\u03c3\u03cb\u0003N\'\u0000\u03c4\u03c5\u0005\u0005\u0000"+
		"\u0000\u03c5\u03c6\u0003\u008eG\u0000\u03c6\u03c7\u0005\u0006\u0000\u0000"+
		"\u03c7\u03c8\u0003N\'\u0000\u03c8\u03ca\u0001\u0000\u0000\u0000\u03c9"+
		"\u03c4\u0001\u0000\u0000\u0000\u03ca\u03cd\u0001\u0000\u0000\u0000\u03cb"+
		"\u03c9\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc"+
		"\u03d0\u0001\u0000\u0000\u0000\u03cd\u03cb\u0001\u0000\u0000\u0000\u03ce"+
		"\u03cf\u0005\u0092\u0000\u0000\u03cf\u03d1\u0003N\'\u0000\u03d0\u03ce"+
		"\u0001\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000\u03d1\u03e4"+
		"\u0001\u0000\u0000\u0000\u03d2\u03d3\u0005m\u0000\u0000\u03d3\u03d4\u0005"+
		"(\u0000\u0000\u03d4\u03d9\u0003\\.\u0000\u03d5\u03d6\u0005\u0005\u0000"+
		"\u0000\u03d6\u03d8\u0003\\.\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d8\u03db\u0001\u0000\u0000\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000"+
		"\u03d9\u03da\u0001\u0000\u0000\u0000\u03da\u03dd\u0001\u0000\u0000\u0000"+
		"\u03db\u03d9\u0001\u0000\u0000\u0000\u03dc\u03d2\u0001\u0000\u0000\u0000"+
		"\u03dc\u03dd\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000"+
		"\u03de\u03df\u0005b\u0000\u0000\u03df\u03e2\u0003N\'\u0000\u03e0\u03e1"+
		"\u0007\u0002\u0000\u0000\u03e1\u03e3\u0003N\'\u0000\u03e2\u03e0\u0001"+
		"\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e5\u0001"+
		"\u0000\u0000\u0000\u03e4\u03dc\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001"+
		"\u0000\u0000\u0000\u03e5C\u0001\u0000\u0000\u0000\u03e6\u03e7\u0005\u008d"+
		"\u0000\u0000\u03e7E\u0001\u0000\u0000\u0000\u03e8\u03ea\u0003\u008eG\u0000"+
		"\u03e9\u03eb\u0003H$\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03ea\u03eb"+
		"\u0001\u0000\u0000\u0000\u03eb\u03ef\u0001\u0000\u0000\u0000\u03ec\u03ee"+
		"\u0003J%\u0000\u03ed\u03ec\u0001\u0000\u0000\u0000\u03ee\u03f1\u0001\u0000"+
		"\u0000\u0000\u03ef\u03ed\u0001\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000"+
		"\u0000\u0000\u03f0G\u0001\u0000\u0000\u0000\u03f1\u03ef\u0001\u0000\u0000"+
		"\u0000\u03f2\u03f4\u0003~?\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f4"+
		"\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f5"+
		"\u03f3\u0001\u0000\u0000\u0000\u03f6\u0401\u0001\u0000\u0000\u0000\u03f7"+
		"\u03f8\u0005\u0003\u0000\u0000\u03f8\u03f9\u0003p8\u0000\u03f9\u03fa\u0005"+
		"\u0004\u0000\u0000\u03fa\u0402\u0001\u0000\u0000\u0000\u03fb\u03fc\u0005"+
		"\u0003\u0000\u0000\u03fc\u03fd\u0003p8\u0000\u03fd\u03fe\u0005\u0005\u0000"+
		"\u0000\u03fe\u03ff\u0003p8\u0000\u03ff\u0400\u0005\u0004\u0000\u0000\u0400"+
		"\u0402\u0001\u0000\u0000\u0000\u0401\u03f7\u0001\u0000\u0000\u0000\u0401"+
		"\u03fb\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402"+
		"I\u0001\u0000\u0000\u0000\u0403\u0404\u00051\u0000\u0000\u0404\u0406\u0003"+
		"~?\u0000\u0405\u0403\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000"+
		"\u0000\u0406\u0428\u0001\u0000\u0000\u0000\u0407\u0408\u0005q\u0000\u0000"+
		"\u0408\u040a\u0005_\u0000\u0000\u0409\u040b\u0007\u0005\u0000\u0000\u040a"+
		"\u0409\u0001\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b"+
		"\u040c\u0001\u0000\u0000\u0000\u040c\u040e\u0003L&\u0000\u040d\u040f\u0005"+
		"$\u0000\u0000\u040e\u040d\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000"+
		"\u0000\u0000\u040f\u0429\u0001\u0000\u0000\u0000\u0410\u0412\u0005f\u0000"+
		"\u0000\u0411\u0410\u0001\u0000\u0000\u0000\u0411\u0412\u0001\u0000\u0000"+
		"\u0000\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u0414\u0005h\u0000\u0000"+
		"\u0414\u0429\u0003L&\u0000\u0415\u0416\u0005\u008a\u0000\u0000\u0416\u0429"+
		"\u0003L&\u0000\u0417\u0418\u0005,\u0000\u0000\u0418\u0419\u0005\u0003"+
		"\u0000\u0000\u0419\u041a\u0003N\'\u0000\u041a\u041b\u0005\u0004\u0000"+
		"\u0000\u041b\u0429\u0001\u0000\u0000\u0000\u041c\u0423\u00058\u0000\u0000"+
		"\u041d\u0424\u0003p8\u0000\u041e\u0424\u0003r9\u0000\u041f\u0420\u0005"+
		"\u0003\u0000\u0000\u0420\u0421\u0003N\'\u0000\u0421\u0422\u0005\u0004"+
		"\u0000\u0000\u0422\u0424\u0001\u0000\u0000\u0000\u0423\u041d\u0001\u0000"+
		"\u0000\u0000\u0423\u041e\u0001\u0000\u0000\u0000\u0423\u041f\u0001\u0000"+
		"\u0000\u0000\u0424\u0429\u0001\u0000\u0000\u0000\u0425\u0426\u0005-\u0000"+
		"\u0000\u0426\u0429\u0003\u0090H\u0000\u0427\u0429\u0003P(\u0000\u0428"+
		"\u0407\u0001\u0000\u0000\u0000\u0428\u0411\u0001\u0000\u0000\u0000\u0428"+
		"\u0415\u0001\u0000\u0000\u0000\u0428\u0417\u0001\u0000\u0000\u0000\u0428"+
		"\u041c\u0001\u0000\u0000\u0000\u0428\u0425\u0001\u0000\u0000\u0000\u0428"+
		"\u0427\u0001\u0000\u0000\u0000\u0429K\u0001\u0000\u0000\u0000\u042a\u042b"+
		"\u0005k\u0000\u0000\u042b\u042c\u00050\u0000\u0000\u042c\u042e\u0007\u0006"+
		"\u0000\u0000\u042d\u042a\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000"+
		"\u0000\u0000\u042eM\u0001\u0000\u0000\u0000\u042f\u0430\u0006\'\uffff"+
		"\uffff\u0000\u0430\u047c\u0003r9\u0000\u0431\u047c\u0005\u0097\u0000\u0000"+
		"\u0432\u0433\u0003\u0082A\u0000\u0433\u0434\u0005\u0002\u0000\u0000\u0434"+
		"\u0436\u0001\u0000\u0000\u0000\u0435\u0432\u0001\u0000\u0000\u0000\u0435"+
		"\u0436\u0001\u0000\u0000\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437"+
		"\u0438\u0003\u0088D\u0000\u0438\u0439\u0005\u0002\u0000\u0000\u0439\u043b"+
		"\u0001\u0000\u0000\u0000\u043a\u0435\u0001\u0000\u0000\u0000\u043a\u043b"+
		"\u0001\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u047c"+
		"\u0003\u008eG\u0000\u043d\u043e\u0003t:\u0000\u043e\u043f\u0003N\'\u0015"+
		"\u043f\u047c\u0001\u0000\u0000\u0000\u0440\u0441\u0003\u0080@\u0000\u0441"+
		"\u044e\u0005\u0003\u0000\u0000\u0442\u0444\u0005>\u0000\u0000\u0443\u0442"+
		"\u0001\u0000\u0000\u0000\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u0445"+
		"\u0001\u0000\u0000\u0000\u0445\u044a\u0003N\'\u0000\u0446\u0447\u0005"+
		"\u0005\u0000\u0000\u0447\u0449\u0003N\'\u0000\u0448\u0446\u0001\u0000"+
		"\u0000\u0000\u0449\u044c\u0001\u0000\u0000\u0000\u044a\u0448\u0001\u0000"+
		"\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u044f\u0001\u0000"+
		"\u0000\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044d\u044f\u0005\u0007"+
		"\u0000\u0000\u044e\u0443\u0001\u0000\u0000\u0000\u044e\u044d\u0001\u0000"+
		"\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000\u044f\u0450\u0001\u0000"+
		"\u0000\u0000\u0450\u0451\u0005\u0004\u0000\u0000\u0451\u047c\u0001\u0000"+
		"\u0000\u0000\u0452\u0453\u0005\u0003\u0000\u0000\u0453\u0454\u0003N\'"+
		"\u0000\u0454\u0455\u0005\u0004\u0000\u0000\u0455\u047c\u0001\u0000\u0000"+
		"\u0000\u0456\u0457\u0005+\u0000\u0000\u0457\u0458\u0005\u0003\u0000\u0000"+
		"\u0458\u0459\u0003N\'\u0000\u0459\u045a\u0005!\u0000\u0000\u045a\u045b"+
		"\u0003H$\u0000\u045b\u045c\u0005\u0004\u0000\u0000\u045c\u047c\u0001\u0000"+
		"\u0000\u0000\u045d\u045f\u0005f\u0000\u0000\u045e\u045d\u0001\u0000\u0000"+
		"\u0000\u045e\u045f\u0001\u0000\u0000\u0000\u045f\u0460\u0001\u0000\u0000"+
		"\u0000\u0460\u0462\u0005F\u0000\u0000\u0461\u045e\u0001\u0000\u0000\u0000"+
		"\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0463\u0001\u0000\u0000\u0000"+
		"\u0463\u0464\u0005\u0003\u0000\u0000\u0464\u0465\u0003<\u001e\u0000\u0465"+
		"\u0466\u0005\u0004\u0000\u0000\u0466\u047c\u0001\u0000\u0000\u0000\u0467"+
		"\u0469\u0005*\u0000\u0000\u0468\u046a\u0003N\'\u0000\u0469\u0468\u0001"+
		"\u0000\u0000\u0000\u0469\u046a\u0001\u0000\u0000\u0000\u046a\u0470\u0001"+
		"\u0000\u0000\u0000\u046b\u046c\u0005\u0091\u0000\u0000\u046c\u046d\u0003"+
		"N\'\u0000\u046d\u046e\u0005\u0085\u0000\u0000\u046e\u046f\u0003N\'\u0000"+
		"\u046f\u0471\u0001\u0000\u0000\u0000\u0470\u046b\u0001\u0000\u0000\u0000"+
		"\u0471\u0472\u0001\u0000\u0000\u0000\u0472\u0470\u0001\u0000\u0000\u0000"+
		"\u0472\u0473\u0001\u0000\u0000\u0000\u0473\u0476\u0001\u0000\u0000\u0000"+
		"\u0474\u0475\u0005A\u0000\u0000\u0475\u0477\u0003N\'\u0000\u0476\u0474"+
		"\u0001\u0000\u0000\u0000\u0476\u0477\u0001\u0000\u0000\u0000\u0477\u0478"+
		"\u0001\u0000\u0000\u0000\u0478\u0479\u0005B\u0000\u0000\u0479\u047c\u0001"+
		"\u0000\u0000\u0000\u047a\u047c\u0003R)\u0000\u047b\u042f\u0001\u0000\u0000"+
		"\u0000\u047b\u0431\u0001\u0000\u0000\u0000\u047b\u043a\u0001\u0000\u0000"+
		"\u0000\u047b\u043d\u0001\u0000\u0000\u0000\u047b\u0440\u0001\u0000\u0000"+
		"\u0000\u047b\u0452\u0001\u0000\u0000\u0000\u047b\u0456\u0001\u0000\u0000"+
		"\u0000\u047b\u0461\u0001\u0000\u0000\u0000\u047b\u0467\u0001\u0000\u0000"+
		"\u0000\u047b\u047a\u0001\u0000\u0000\u0000\u047c\u04d4\u0001\u0000\u0000"+
		"\u0000\u047d\u047e\n\u0014\u0000\u0000\u047e\u047f\u0005\u000b\u0000\u0000"+
		"\u047f\u04d3\u0003N\'\u0015\u0480\u0481\n\u0013\u0000\u0000\u0481\u0482"+
		"\u0007\u0007\u0000\u0000\u0482\u04d3\u0003N\'\u0014\u0483\u0484\n\u0012"+
		"\u0000\u0000\u0484\u0485\u0007\b\u0000\u0000\u0485\u04d3\u0003N\'\u0013"+
		"\u0486\u0487\n\u0011\u0000\u0000\u0487\u0488\u0007\t\u0000\u0000\u0488"+
		"\u04d3\u0003N\'\u0012\u0489\u048a\n\u0010\u0000\u0000\u048a\u048b\u0007"+
		"\n\u0000\u0000\u048b\u04d3\u0003N\'\u0011\u048c\u048d\n\u000f\u0000\u0000"+
		"\u048d\u048e\u0007\u000b\u0000\u0000\u048e\u04d3\u0003N\'\u0010\u048f"+
		"\u0490\n\r\u0000\u0000\u0490\u0491\u0005 \u0000\u0000\u0491\u04d3\u0003"+
		"N\'\u000e\u0492\u0493\n\f\u0000\u0000\u0493\u0494\u0005l\u0000\u0000\u0494"+
		"\u04d3\u0003N\'\r\u0495\u0496\n\u0005\u0000\u0000\u0496\u0498\u0005\\"+
		"\u0000\u0000\u0497\u0499\u0005f\u0000\u0000\u0498\u0497\u0001\u0000\u0000"+
		"\u0000\u0498\u0499\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000"+
		"\u0000\u049a\u04d3\u0003N\'\u0006\u049b\u049d\n\u0004\u0000\u0000\u049c"+
		"\u049e\u0005f\u0000\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049d\u049e"+
		"\u0001\u0000\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049f\u04a0"+
		"\u0005\'\u0000\u0000\u04a0\u04a1\u0003N\'\u0000\u04a1\u04a2\u0005 \u0000"+
		"\u0000\u04a2\u04a3\u0003N\'\u0005\u04a3\u04d3\u0001\u0000\u0000\u0000"+
		"\u04a4\u04a6\n\u000e\u0000\u0000\u04a5\u04a7\u0005f\u0000\u0000\u04a6"+
		"\u04a5\u0001\u0000\u0000\u0000\u04a6\u04a7\u0001\u0000\u0000\u0000\u04a7"+
		"\u04a8\u0001\u0000\u0000\u0000\u04a8\u04bc\u0005S\u0000\u0000\u04a9\u04b3"+
		"\u0005\u0003\u0000\u0000\u04aa\u04b4\u0003<\u001e\u0000\u04ab\u04b0\u0003"+
		"N\'\u0000\u04ac\u04ad\u0005\u0005\u0000\u0000\u04ad\u04af\u0003N\'\u0000"+
		"\u04ae\u04ac\u0001\u0000\u0000\u0000\u04af\u04b2\u0001\u0000\u0000\u0000"+
		"\u04b0\u04ae\u0001\u0000\u0000\u0000\u04b0\u04b1\u0001\u0000\u0000\u0000"+
		"\u04b1\u04b4\u0001\u0000\u0000\u0000\u04b2\u04b0\u0001\u0000\u0000\u0000"+
		"\u04b3\u04aa\u0001\u0000\u0000\u0000\u04b3\u04ab\u0001\u0000\u0000\u0000"+
		"\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b5\u04bd\u0005\u0004\u0000\u0000\u04b6\u04b7\u0003\u0082A\u0000\u04b7"+
		"\u04b8\u0005\u0002\u0000\u0000\u04b8\u04ba\u0001\u0000\u0000\u0000\u04b9"+
		"\u04b6\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000\u0000\u04ba"+
		"\u04bb\u0001\u0000\u0000\u0000\u04bb\u04bd\u0003\u0088D\u0000\u04bc\u04a9"+
		"\u0001\u0000\u0000\u0000\u04bc\u04b9\u0001\u0000\u0000\u0000\u04bd\u04d3"+
		"\u0001\u0000\u0000\u0000\u04be\u04bf\n\b\u0000\u0000\u04bf\u04c0\u0005"+
		"-\u0000\u0000\u04c0\u04d3\u0003\u0090H\u0000\u04c1\u04c3\n\u0007\u0000"+
		"\u0000\u04c2\u04c4\u0005f\u0000\u0000\u04c3\u04c2\u0001\u0000\u0000\u0000"+
		"\u04c3\u04c4\u0001\u0000\u0000\u0000\u04c4\u04c5\u0001\u0000\u0000\u0000"+
		"\u04c5\u04c6\u0007\f\u0000\u0000\u04c6\u04c9\u0003N\'\u0000\u04c7\u04c8"+
		"\u0005C\u0000\u0000\u04c8\u04ca\u0003N\'\u0000\u04c9\u04c7\u0001\u0000"+
		"\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000\u04ca\u04d3\u0001\u0000"+
		"\u0000\u0000\u04cb\u04d0\n\u0006\u0000\u0000\u04cc\u04d1\u0005]\u0000"+
		"\u0000\u04cd\u04d1\u0005g\u0000\u0000\u04ce\u04cf\u0005f\u0000\u0000\u04cf"+
		"\u04d1\u0005h\u0000\u0000\u04d0\u04cc\u0001\u0000\u0000\u0000\u04d0\u04cd"+
		"\u0001\u0000\u0000\u0000\u04d0\u04ce\u0001\u0000\u0000\u0000\u04d1\u04d3"+
		"\u0001\u0000\u0000\u0000\u04d2\u047d\u0001\u0000\u0000\u0000\u04d2\u0480"+
		"\u0001\u0000\u0000\u0000\u04d2\u0483\u0001\u0000\u0000\u0000\u04d2\u0486"+
		"\u0001\u0000\u0000\u0000\u04d2\u0489\u0001\u0000\u0000\u0000\u04d2\u048c"+
		"\u0001\u0000\u0000\u0000\u04d2\u048f\u0001\u0000\u0000\u0000\u04d2\u0492"+
		"\u0001\u0000\u0000\u0000\u04d2\u0495\u0001\u0000\u0000\u0000\u04d2\u049b"+
		"\u0001\u0000\u0000\u0000\u04d2\u04a4\u0001\u0000\u0000\u0000\u04d2\u04be"+
		"\u0001\u0000\u0000\u0000\u04d2\u04c1\u0001\u0000\u0000\u0000\u04d2\u04cb"+
		"\u0001\u0000\u0000\u0000\u04d3\u04d6\u0001\u0000\u0000\u0000\u04d4\u04d2"+
		"\u0001\u0000\u0000\u0000\u04d4\u04d5\u0001\u0000\u0000\u0000\u04d5O\u0001"+
		"\u0000\u0000\u0000\u04d6\u04d4\u0001\u0000\u0000\u0000\u04d7\u04d8\u0005"+
		"u\u0000\u0000\u04d8\u04e4\u0003\u0092I\u0000\u04d9\u04da\u0005\u0003\u0000"+
		"\u0000\u04da\u04df\u0003\u008eG\u0000\u04db\u04dc\u0005\u0005\u0000\u0000"+
		"\u04dc\u04de\u0003\u008eG\u0000\u04dd\u04db\u0001\u0000\u0000\u0000\u04de"+
		"\u04e1\u0001\u0000\u0000\u0000\u04df\u04dd\u0001\u0000\u0000\u0000\u04df"+
		"\u04e0\u0001\u0000\u0000\u0000\u04e0\u04e2\u0001\u0000\u0000\u0000\u04e1"+
		"\u04df\u0001\u0000\u0000\u0000\u04e2\u04e3\u0005\u0004\u0000\u0000\u04e3"+
		"\u04e5\u0001\u0000\u0000\u0000\u04e4\u04d9\u0001\u0000\u0000\u0000\u04e4"+
		"\u04e5\u0001\u0000\u0000\u0000\u04e5\u04f8\u0001\u0000\u0000\u0000\u04e6"+
		"\u04e7\u0005k\u0000\u0000\u04e7\u04f0\u0007\r\u0000\u0000\u04e8\u04e9"+
		"\u0005\u0081\u0000\u0000\u04e9\u04f1\u0005h\u0000\u0000\u04ea\u04eb\u0005"+
		"\u0081\u0000\u0000\u04eb\u04f1\u00058\u0000\u0000\u04ec\u04f1\u0005)\u0000"+
		"\u0000\u04ed\u04f1\u0005{\u0000\u0000\u04ee\u04ef\u0005e\u0000\u0000\u04ef"+
		"\u04f1\u0005\u001a\u0000\u0000\u04f0\u04e8\u0001\u0000\u0000\u0000\u04f0"+
		"\u04ea\u0001\u0000\u0000\u0000\u04f0\u04ec\u0001\u0000\u0000\u0000\u04f0"+
		"\u04ed\u0001\u0000\u0000\u0000\u04f0\u04ee\u0001\u0000\u0000\u0000\u04f1"+
		"\u04f5\u0001\u0000\u0000\u0000\u04f2\u04f3\u0005c\u0000\u0000\u04f3\u04f5"+
		"\u0003~?\u0000\u04f4\u04e6\u0001\u0000\u0000\u0000\u04f4\u04f2\u0001\u0000"+
		"\u0000\u0000\u04f5\u04f7\u0001\u0000\u0000\u0000\u04f6\u04f4\u0001\u0000"+
		"\u0000\u0000\u04f7\u04fa\u0001\u0000\u0000\u0000\u04f8\u04f6\u0001\u0000"+
		"\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9\u0505\u0001\u0000"+
		"\u0000\u0000\u04fa\u04f8\u0001\u0000\u0000\u0000\u04fb\u04fd\u0005f\u0000"+
		"\u0000\u04fc\u04fb\u0001\u0000\u0000\u0000\u04fc\u04fd\u0001\u0000\u0000"+
		"\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u0503\u00059\u0000\u0000"+
		"\u04ff\u0500\u0005V\u0000\u0000\u0500\u0504\u0005:\u0000\u0000\u0501\u0502"+
		"\u0005V\u0000\u0000\u0502\u0504\u0005R\u0000\u0000\u0503\u04ff\u0001\u0000"+
		"\u0000\u0000\u0503\u0501\u0001\u0000\u0000\u0000\u0503\u0504\u0001\u0000"+
		"\u0000\u0000\u0504\u0506\u0001\u0000\u0000\u0000\u0505\u04fc\u0001\u0000"+
		"\u0000\u0000\u0505\u0506\u0001\u0000\u0000\u0000\u0506Q\u0001\u0000\u0000"+
		"\u0000\u0507\u0508\u0005s\u0000\u0000\u0508\u050d\u0005\u0003\u0000\u0000"+
		"\u0509\u050e\u0005Q\u0000\u0000\u050a\u050b\u0007\u000e\u0000\u0000\u050b"+
		"\u050c\u0005\u0005\u0000\u0000\u050c\u050e\u0003v;\u0000\u050d\u0509\u0001"+
		"\u0000\u0000\u0000\u050d\u050a\u0001\u0000\u0000\u0000\u050e\u050f\u0001"+
		"\u0000\u0000\u0000\u050f\u0510\u0005\u0004\u0000\u0000\u0510S\u0001\u0000"+
		"\u0000\u0000\u0511\u0514\u0003\u008eG\u0000\u0512\u0513\u0005-\u0000\u0000"+
		"\u0513\u0515\u0003\u0090H\u0000\u0514\u0512\u0001\u0000\u0000\u0000\u0514"+
		"\u0515\u0001\u0000\u0000\u0000\u0515\u0517\u0001\u0000\u0000\u0000\u0516"+
		"\u0518\u0007\u0005\u0000\u0000\u0517\u0516\u0001\u0000\u0000\u0000\u0517"+
		"\u0518\u0001\u0000\u0000\u0000\u0518U\u0001\u0000\u0000\u0000\u0519\u051a"+
		"\u00051\u0000\u0000\u051a\u051c\u0003~?\u0000\u051b\u0519\u0001\u0000"+
		"\u0000\u0000\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u0541\u0001\u0000"+
		"\u0000\u0000\u051d\u051e\u0005q\u0000\u0000\u051e\u0521\u0005_\u0000\u0000"+
		"\u051f\u0521\u0005\u008a\u0000\u0000\u0520\u051d\u0001\u0000\u0000\u0000"+
		"\u0520\u051f\u0001\u0000\u0000\u0000\u0521\u0522\u0001\u0000\u0000\u0000"+
		"\u0522\u0523\u0005\u0003\u0000\u0000\u0523\u0528\u0003T*\u0000\u0524\u0525"+
		"\u0005\u0005\u0000\u0000\u0525\u0527\u0003T*\u0000\u0526\u0524\u0001\u0000"+
		"\u0000\u0000\u0527\u052a\u0001\u0000\u0000\u0000\u0528\u0526\u0001\u0000"+
		"\u0000\u0000\u0528\u0529\u0001\u0000\u0000\u0000\u0529\u052b\u0001\u0000"+
		"\u0000\u0000\u052a\u0528\u0001\u0000\u0000\u0000\u052b\u052c\u0005\u0004"+
		"\u0000\u0000\u052c\u052d\u0003L&\u0000\u052d\u0542\u0001\u0000\u0000\u0000"+
		"\u052e\u052f\u0005,\u0000\u0000\u052f\u0530\u0005\u0003\u0000\u0000\u0530"+
		"\u0531\u0003N\'\u0000\u0531\u0532\u0005\u0004\u0000\u0000\u0532\u0542"+
		"\u0001\u0000\u0000\u0000\u0533\u0534\u0005J\u0000\u0000\u0534\u0535\u0005"+
		"_\u0000\u0000\u0535\u0536\u0005\u0003\u0000\u0000\u0536\u053b\u0003\u008e"+
		"G\u0000\u0537\u0538\u0005\u0005\u0000\u0000\u0538\u053a\u0003\u008eG\u0000"+
		"\u0539\u0537\u0001\u0000\u0000\u0000\u053a\u053d\u0001\u0000\u0000\u0000"+
		"\u053b\u0539\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000\u0000"+
		"\u053c\u053e\u0001\u0000\u0000\u0000\u053d\u053b\u0001\u0000\u0000\u0000"+
		"\u053e\u053f\u0005\u0004\u0000\u0000\u053f\u0540\u0003P(\u0000\u0540\u0542"+
		"\u0001\u0000\u0000\u0000\u0541\u0520\u0001\u0000\u0000\u0000\u0541\u052e"+
		"\u0001\u0000\u0000\u0000\u0541\u0533\u0001\u0000\u0000\u0000\u0542W\u0001"+
		"\u0000\u0000\u0000\u0543\u0545\u0005\u0093\u0000\u0000\u0544\u0546\u0005"+
		"t\u0000\u0000\u0545\u0544\u0001\u0000\u0000\u0000\u0545\u0546\u0001\u0000"+
		"\u0000\u0000\u0546\u0547\u0001\u0000\u0000\u0000\u0547\u054c\u0003`0\u0000"+
		"\u0548\u0549\u0005\u0005\u0000\u0000\u0549\u054b\u0003`0\u0000\u054a\u0548"+
		"\u0001\u0000\u0000\u0000\u054b\u054e\u0001\u0000\u0000\u0000\u054c\u054a"+
		"\u0001\u0000\u0000\u0000\u054c\u054d\u0001\u0000\u0000\u0000\u054dY\u0001"+
		"\u0000\u0000\u0000\u054e\u054c\u0001\u0000\u0000\u0000\u054f\u0550\u0003"+
		"\u0082A\u0000\u0550\u0551\u0005\u0002\u0000\u0000\u0551\u0553\u0001\u0000"+
		"\u0000\u0000\u0552\u054f\u0001\u0000\u0000\u0000\u0552\u0553\u0001\u0000"+
		"\u0000\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u055a\u0003\u0088"+
		"D\u0000\u0555\u0556\u0005U\u0000\u0000\u0556\u0557\u0005(\u0000\u0000"+
		"\u0557\u055b\u0003\u0094J\u0000\u0558\u0559\u0005f\u0000\u0000\u0559\u055b"+
		"\u0005U\u0000\u0000\u055a\u0555\u0001\u0000\u0000\u0000\u055a\u0558\u0001"+
		"\u0000\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000\u055b[\u0001\u0000"+
		"\u0000\u0000\u055c\u055f\u0003N\'\u0000\u055d\u055e\u0005-\u0000\u0000"+
		"\u055e\u0560\u0003\u0090H\u0000\u055f\u055d\u0001\u0000\u0000\u0000\u055f"+
		"\u0560\u0001\u0000\u0000\u0000\u0560\u0562\u0001\u0000\u0000\u0000\u0561"+
		"\u0563\u0007\u0005\u0000\u0000\u0562\u0561\u0001\u0000\u0000\u0000\u0562"+
		"\u0563\u0001\u0000\u0000\u0000\u0563]\u0001\u0000\u0000\u0000\u0564\u0568"+
		"\u0003p8\u0000\u0565\u0568\u0003~?\u0000\u0566\u0568\u0005\u0098\u0000"+
		"\u0000\u0567\u0564\u0001\u0000\u0000\u0000\u0567\u0565\u0001\u0000\u0000"+
		"\u0000\u0567\u0566\u0001\u0000\u0000\u0000\u0568_\u0001\u0000\u0000\u0000"+
		"\u0569\u0575\u0003\u0088D\u0000\u056a\u056b\u0005\u0003\u0000\u0000\u056b"+
		"\u0570\u0003\u008eG\u0000\u056c\u056d\u0005\u0005\u0000\u0000\u056d\u056f"+
		"\u0003\u008eG\u0000\u056e\u056c\u0001\u0000\u0000\u0000\u056f\u0572\u0001"+
		"\u0000\u0000\u0000\u0570\u056e\u0001\u0000\u0000\u0000\u0570\u0571\u0001"+
		"\u0000\u0000\u0000\u0571\u0573\u0001\u0000\u0000\u0000\u0572\u0570\u0001"+
		"\u0000\u0000\u0000\u0573\u0574\u0005\u0004\u0000\u0000\u0574\u0576\u0001"+
		"\u0000\u0000\u0000\u0575\u056a\u0001\u0000\u0000\u0000\u0575\u0576\u0001"+
		"\u0000\u0000\u0000\u0576\u0577\u0001\u0000\u0000\u0000\u0577\u0578\u0005"+
		"!\u0000\u0000\u0578\u0579\u0005\u0003\u0000\u0000\u0579\u057a\u0003<\u001e"+
		"\u0000\u057a\u057b\u0005\u0004\u0000\u0000\u057ba\u0001\u0000\u0000\u0000"+
		"\u057c\u0589\u0005\u0007\u0000\u0000\u057d\u057e\u0003\u0088D\u0000\u057e"+
		"\u057f\u0005\u0002\u0000\u0000\u057f\u0580\u0005\u0007\u0000\u0000\u0580"+
		"\u0589\u0001\u0000\u0000\u0000\u0581\u0586\u0003N\'\u0000\u0582\u0584"+
		"\u0005!\u0000\u0000\u0583\u0582\u0001\u0000\u0000\u0000\u0583\u0584\u0001"+
		"\u0000\u0000\u0000\u0584\u0585\u0001\u0000\u0000\u0000\u0585\u0587\u0003"+
		"z=\u0000\u0586\u0583\u0001\u0000\u0000\u0000\u0586\u0587\u0001\u0000\u0000"+
		"\u0000\u0587\u0589\u0001\u0000\u0000\u0000\u0588\u057c\u0001\u0000\u0000"+
		"\u0000\u0588\u057d\u0001\u0000\u0000\u0000\u0588\u0581\u0001\u0000\u0000"+
		"\u0000\u0589c\u0001\u0000\u0000\u0000\u058a\u058b\u0003\u0084B\u0000\u058b"+
		"\u058c\u0005\u0002\u0000\u0000\u058c\u058e\u0001\u0000\u0000\u0000\u058d"+
		"\u058a\u0001\u0000\u0000\u0000\u058d\u058e\u0001\u0000\u0000\u0000\u058e"+
		"\u058f\u0001\u0000\u0000\u0000\u058f\u0594\u0003\u0088D\u0000\u0590\u0592"+
		"\u0005!\u0000\u0000\u0591\u0590\u0001\u0000\u0000\u0000\u0591\u0592\u0001"+
		"\u0000\u0000\u0000\u0592\u0593\u0001\u0000\u0000\u0000\u0593\u0595\u0003"+
		"\u00a0P\u0000\u0594\u0591\u0001\u0000\u0000\u0000\u0594\u0595\u0001\u0000"+
		"\u0000\u0000\u0595\u059b\u0001\u0000\u0000\u0000\u0596\u0597\u0005U\u0000"+
		"\u0000\u0597\u0598\u0005(\u0000\u0000\u0598\u059c\u0003\u0094J\u0000\u0599"+
		"\u059a\u0005f\u0000\u0000\u059a\u059c\u0005U\u0000\u0000\u059b\u0596\u0001"+
		"\u0000\u0000\u0000\u059b\u0599\u0001\u0000\u0000\u0000\u059b\u059c\u0001"+
		"\u0000\u0000\u0000\u059c\u05cd\u0001\u0000\u0000\u0000\u059d\u059e\u0003"+
		"\u0084B\u0000\u059e\u059f\u0005\u0002\u0000\u0000\u059f\u05a1\u0001\u0000"+
		"\u0000\u0000\u05a0\u059d\u0001\u0000\u0000\u0000\u05a0\u05a1\u0001\u0000"+
		"\u0000\u0000\u05a1\u05a2\u0001\u0000\u0000\u0000\u05a2\u05a3\u0003\u0086"+
		"C\u0000\u05a3\u05ac\u0005\u0003\u0000\u0000\u05a4\u05a9\u0003N\'\u0000"+
		"\u05a5\u05a6\u0005\u0005\u0000\u0000\u05a6\u05a8\u0003N\'\u0000\u05a7"+
		"\u05a5\u0001\u0000\u0000\u0000\u05a8\u05ab\u0001\u0000\u0000\u0000\u05a9"+
		"\u05a7\u0001\u0000\u0000\u0000\u05a9\u05aa\u0001\u0000\u0000\u0000\u05aa"+
		"\u05ad\u0001\u0000\u0000\u0000\u05ab\u05a9\u0001\u0000\u0000\u0000\u05ac"+
		"\u05a4\u0001\u0000\u0000\u0000\u05ac\u05ad\u0001\u0000\u0000\u0000\u05ad"+
		"\u05ae\u0001\u0000\u0000\u0000\u05ae\u05b3\u0005\u0004\u0000\u0000\u05af"+
		"\u05b1\u0005!\u0000\u0000\u05b0\u05af\u0001\u0000\u0000\u0000\u05b0\u05b1"+
		"\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000\u0000\u0000\u05b2\u05b4"+
		"\u0003\u00a0P\u0000\u05b3\u05b0\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001"+
		"\u0000\u0000\u0000\u05b4\u05cd\u0001\u0000\u0000\u0000\u05b5\u05bf\u0005"+
		"\u0003\u0000\u0000\u05b6\u05bb\u0003d2\u0000\u05b7\u05b8\u0005\u0005\u0000"+
		"\u0000\u05b8\u05ba\u0003d2\u0000\u05b9\u05b7\u0001\u0000\u0000\u0000\u05ba"+
		"\u05bd\u0001\u0000\u0000\u0000\u05bb\u05b9\u0001\u0000\u0000\u0000\u05bb"+
		"\u05bc\u0001\u0000\u0000\u0000\u05bc\u05c0\u0001\u0000\u0000\u0000\u05bd"+
		"\u05bb\u0001\u0000\u0000\u0000\u05be\u05c0\u0003f3\u0000\u05bf\u05b6\u0001"+
		"\u0000\u0000\u0000\u05bf\u05be\u0001\u0000\u0000\u0000\u05c0\u05c1\u0001"+
		"\u0000\u0000\u0000\u05c1\u05c2\u0005\u0004\u0000\u0000\u05c2\u05cd\u0001"+
		"\u0000\u0000\u0000\u05c3\u05c4\u0005\u0003\u0000\u0000\u05c4\u05c5\u0003"+
		"<\u001e\u0000\u05c5\u05ca\u0005\u0004\u0000\u0000\u05c6\u05c8\u0005!\u0000"+
		"\u0000\u05c7\u05c6\u0001\u0000\u0000\u0000\u05c7\u05c8\u0001\u0000\u0000"+
		"\u0000\u05c8\u05c9\u0001\u0000\u0000\u0000\u05c9\u05cb\u0003\u00a0P\u0000"+
		"\u05ca\u05c7\u0001\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000\u0000\u0000"+
		"\u05cb\u05cd\u0001\u0000\u0000\u0000\u05cc\u058d\u0001\u0000\u0000\u0000"+
		"\u05cc\u05a0\u0001\u0000\u0000\u0000\u05cc\u05b5\u0001\u0000\u0000\u0000"+
		"\u05cc\u05c3\u0001\u0000\u0000\u0000\u05cde\u0001\u0000\u0000\u0000\u05ce"+
		"\u05d5\u0003d2\u0000\u05cf\u05d0\u0003h4\u0000\u05d0\u05d1\u0003d2\u0000"+
		"\u05d1\u05d2\u0003j5\u0000\u05d2\u05d4\u0001\u0000\u0000\u0000\u05d3\u05cf"+
		"\u0001\u0000\u0000\u0000\u05d4\u05d7\u0001\u0000\u0000\u0000\u05d5\u05d3"+
		"\u0001\u0000\u0000\u0000\u05d5\u05d6\u0001\u0000\u0000\u0000\u05d6g\u0001"+
		"\u0000\u0000\u0000\u05d7\u05d5\u0001\u0000\u0000\u0000\u05d8\u05e6\u0005"+
		"\u0005\u0000\u0000\u05d9\u05db\u0005d\u0000\u0000\u05da\u05d9\u0001\u0000"+
		"\u0000\u0000\u05da\u05db\u0001\u0000\u0000\u0000\u05db\u05e2\u0001\u0000"+
		"\u0000\u0000\u05dc\u05de\u0005`\u0000\u0000\u05dd\u05df\u0005n\u0000\u0000"+
		"\u05de\u05dd\u0001\u0000\u0000\u0000\u05de\u05df\u0001\u0000\u0000\u0000"+
		"\u05df\u05e3\u0001\u0000\u0000\u0000\u05e0\u05e3\u0005W\u0000\u0000\u05e1"+
		"\u05e3\u00053\u0000\u0000\u05e2\u05dc\u0001\u0000\u0000\u0000\u05e2\u05e0"+
		"\u0001\u0000\u0000\u0000\u05e2\u05e1\u0001\u0000\u0000\u0000\u05e2\u05e3"+
		"\u0001\u0000\u0000\u0000\u05e3\u05e4\u0001\u0000\u0000\u0000\u05e4\u05e6"+
		"\u0005^\u0000\u0000\u05e5\u05d8\u0001\u0000\u0000\u0000\u05e5\u05da\u0001"+
		"\u0000\u0000\u0000\u05e6i\u0001\u0000\u0000\u0000\u05e7\u05e8\u0005k\u0000"+
		"\u0000\u05e8\u05f6\u0003N\'\u0000\u05e9\u05ea\u0005\u008c\u0000\u0000"+
		"\u05ea\u05eb\u0005\u0003\u0000\u0000\u05eb\u05f0\u0003\u008eG\u0000\u05ec"+
		"\u05ed\u0005\u0005\u0000\u0000\u05ed\u05ef\u0003\u008eG\u0000\u05ee\u05ec"+
		"\u0001\u0000\u0000\u0000\u05ef\u05f2\u0001\u0000\u0000\u0000\u05f0\u05ee"+
		"\u0001\u0000\u0000\u0000\u05f0\u05f1\u0001\u0000\u0000\u0000\u05f1\u05f3"+
		"\u0001\u0000\u0000\u0000\u05f2\u05f0\u0001\u0000\u0000\u0000\u05f3\u05f4"+
		"\u0005\u0004\u0000\u0000\u05f4\u05f6\u0001\u0000\u0000\u0000\u05f5\u05e7"+
		"\u0001\u0000\u0000\u0000\u05f5\u05e9\u0001\u0000\u0000\u0000\u05f5\u05f6"+
		"\u0001\u0000\u0000\u0000\u05f6k\u0001\u0000\u0000\u0000\u05f7\u05f9\u0005"+
		"\u0080\u0000\u0000\u05f8\u05fa\u0007\u0004\u0000\u0000\u05f9\u05f8\u0001"+
		"\u0000\u0000\u0000\u05f9\u05fa\u0001\u0000\u0000\u0000\u05fa\u05fb\u0001"+
		"\u0000\u0000\u0000\u05fb\u0600\u0003b1\u0000\u05fc\u05fd\u0005\u0005\u0000"+
		"\u0000\u05fd\u05ff\u0003b1\u0000\u05fe\u05fc\u0001\u0000\u0000\u0000\u05ff"+
		"\u0602\u0001\u0000\u0000\u0000\u0600\u05fe\u0001\u0000\u0000\u0000\u0600"+
		"\u0601\u0001\u0000\u0000\u0000\u0601\u060f\u0001\u0000\u0000\u0000\u0602"+
		"\u0600\u0001\u0000\u0000\u0000\u0603\u060d\u0005K\u0000\u0000\u0604\u0609"+
		"\u0003d2\u0000\u0605\u0606\u0005\u0005\u0000\u0000\u0606\u0608\u0003d"+
		"2\u0000\u0607\u0605\u0001\u0000\u0000\u0000\u0608\u060b\u0001\u0000\u0000"+
		"\u0000\u0609\u0607\u0001\u0000\u0000\u0000\u0609\u060a\u0001\u0000\u0000"+
		"\u0000\u060a\u060e\u0001\u0000\u0000\u0000\u060b\u0609\u0001\u0000\u0000"+
		"\u0000\u060c\u060e\u0003f3\u0000\u060d\u0604\u0001\u0000\u0000\u0000\u060d"+
		"\u060c\u0001\u0000\u0000\u0000\u060e\u0610\u0001\u0000\u0000\u0000\u060f"+
		"\u0603\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000\u0000\u0000\u0610"+
		"\u0613\u0001\u0000\u0000\u0000\u0611\u0612\u0005\u0092\u0000\u0000\u0612"+
		"\u0614\u0003N\'\u0000\u0613\u0611\u0001\u0000\u0000\u0000\u0613\u0614"+
		"\u0001\u0000\u0000\u0000\u0614\u0623\u0001\u0000\u0000\u0000\u0615\u0616"+
		"\u0005N\u0000\u0000\u0616\u0617\u0005(\u0000\u0000\u0617\u061c\u0003N"+
		"\'\u0000\u0618\u0619\u0005\u0005\u0000\u0000\u0619\u061b\u0003N\'\u0000"+
		"\u061a\u0618\u0001\u0000\u0000\u0000\u061b\u061e\u0001\u0000\u0000\u0000"+
		"\u061c\u061a\u0001\u0000\u0000\u0000\u061c\u061d\u0001\u0000\u0000\u0000"+
		"\u061d\u0621\u0001\u0000\u0000\u0000\u061e\u061c\u0001\u0000\u0000\u0000"+
		"\u061f\u0620\u0005O\u0000\u0000\u0620\u0622\u0003N\'\u0000\u0621\u061f"+
		"\u0001\u0000\u0000\u0000\u0621\u0622\u0001\u0000\u0000\u0000\u0622\u0624"+
		"\u0001\u0000\u0000\u0000\u0623\u0615\u0001\u0000\u0000\u0000\u0623\u0624"+
		"\u0001\u0000\u0000\u0000\u0624\u0642\u0001\u0000\u0000\u0000\u0625\u0626"+
		"\u0005\u008e\u0000\u0000\u0626\u0627\u0005\u0003\u0000\u0000\u0627\u062c"+
		"\u0003N\'\u0000\u0628\u0629\u0005\u0005\u0000\u0000\u0629\u062b\u0003"+
		"N\'\u0000\u062a\u0628\u0001\u0000\u0000\u0000\u062b\u062e\u0001\u0000"+
		"\u0000\u0000\u062c\u062a\u0001\u0000\u0000\u0000\u062c\u062d\u0001\u0000"+
		"\u0000\u0000\u062d\u062f\u0001\u0000\u0000\u0000\u062e\u062c\u0001\u0000"+
		"\u0000\u0000\u062f\u063e\u0005\u0004\u0000\u0000\u0630\u0631\u0005\u0005"+
		"\u0000\u0000\u0631\u0632\u0005\u0003\u0000\u0000\u0632\u0637\u0003N\'"+
		"\u0000\u0633\u0634\u0005\u0005\u0000\u0000\u0634\u0636\u0003N\'\u0000"+
		"\u0635\u0633\u0001\u0000\u0000\u0000\u0636\u0639\u0001\u0000\u0000\u0000"+
		"\u0637\u0635\u0001\u0000\u0000\u0000\u0637\u0638\u0001\u0000\u0000\u0000"+
		"\u0638\u063a\u0001\u0000\u0000\u0000\u0639\u0637\u0001\u0000\u0000\u0000"+
		"\u063a\u063b\u0005\u0004\u0000\u0000\u063b\u063d\u0001\u0000\u0000\u0000"+
		"\u063c\u0630\u0001\u0000\u0000\u0000\u063d\u0640\u0001\u0000\u0000\u0000"+
		"\u063e\u063c\u0001\u0000\u0000\u0000\u063e\u063f\u0001\u0000\u0000\u0000"+
		"\u063f\u0642\u0001\u0000\u0000\u0000\u0640\u063e\u0001\u0000\u0000\u0000"+
		"\u0641\u05f7\u0001\u0000\u0000\u0000\u0641\u0625\u0001\u0000\u0000\u0000"+
		"\u0642m\u0001\u0000\u0000\u0000\u0643\u0649\u0005\u0089\u0000\u0000\u0644"+
		"\u0645\u0005\u0089\u0000\u0000\u0645\u0649\u0005\u001d\u0000\u0000\u0646"+
		"\u0649\u0005Z\u0000\u0000\u0647\u0649\u0005D\u0000\u0000\u0648\u0643\u0001"+
		"\u0000\u0000\u0000\u0648\u0644\u0001\u0000\u0000\u0000\u0648\u0646\u0001"+
		"\u0000\u0000\u0000\u0648\u0647\u0001\u0000\u0000\u0000\u0649o\u0001\u0000"+
		"\u0000\u0000\u064a\u064c\u0007\b\u0000\u0000\u064b\u064a\u0001\u0000\u0000"+
		"\u0000\u064b\u064c\u0001\u0000\u0000\u0000\u064c\u064d\u0001\u0000\u0000"+
		"\u0000\u064d\u064e\u0005\u0096\u0000\u0000\u064eq\u0001\u0000\u0000\u0000"+
		"\u064f\u0650\u0007\u000f\u0000\u0000\u0650s\u0001\u0000\u0000\u0000\u0651"+
		"\u0652\u0007\u0010\u0000\u0000\u0652u\u0001\u0000\u0000\u0000\u0653\u0654"+
		"\u0005\u0098\u0000\u0000\u0654w\u0001\u0000\u0000\u0000\u0655\u0658\u0003"+
		"N\'\u0000\u0656\u0658\u0003F#\u0000\u0657\u0655\u0001\u0000\u0000\u0000"+
		"\u0657\u0656\u0001\u0000\u0000\u0000\u0658y\u0001\u0000\u0000\u0000\u0659"+
		"\u065a\u0007\u0011\u0000\u0000\u065a{\u0001\u0000\u0000\u0000\u065b\u065c"+
		"\u0007\u0012\u0000\u0000\u065c}\u0001\u0000\u0000\u0000\u065d\u065e\u0003"+
		"\u00a4R\u0000\u065e\u007f\u0001\u0000\u0000\u0000\u065f\u0660\u0003\u00a4"+
		"R\u0000\u0660\u0081\u0001\u0000\u0000\u0000\u0661\u0662\u0003\u00a4R\u0000"+
		"\u0662\u0083\u0001\u0000\u0000\u0000\u0663\u0664\u0003\u00a4R\u0000\u0664"+
		"\u0085\u0001\u0000\u0000\u0000\u0665\u0666\u0003\u00a4R\u0000\u0666\u0087"+
		"\u0001\u0000\u0000\u0000\u0667\u0668\u0003\u00a4R\u0000\u0668\u0089\u0001"+
		"\u0000\u0000\u0000\u0669\u066a\u0003\u00a4R\u0000\u066a\u008b\u0001\u0000"+
		"\u0000\u0000\u066b\u066c\u0003\u00a4R\u0000\u066c\u008d\u0001\u0000\u0000"+
		"\u0000\u066d\u066e\u0003\u00a4R\u0000\u066e\u008f\u0001\u0000\u0000\u0000"+
		"\u066f\u0670\u0003\u00a4R\u0000\u0670\u0091\u0001\u0000\u0000\u0000\u0671"+
		"\u0672\u0003\u00a4R\u0000\u0672\u0093\u0001\u0000\u0000\u0000\u0673\u0674"+
		"\u0003\u00a4R\u0000\u0674\u0095\u0001\u0000\u0000\u0000\u0675\u0676\u0003"+
		"\u00a4R\u0000\u0676\u0097\u0001\u0000\u0000\u0000\u0677\u0678\u0003\u00a4"+
		"R\u0000\u0678\u0099\u0001\u0000\u0000\u0000\u0679\u067a\u0003\u00a4R\u0000"+
		"\u067a\u009b\u0001\u0000\u0000\u0000\u067b\u067c\u0003\u00a4R\u0000\u067c"+
		"\u009d\u0001\u0000\u0000\u0000\u067d\u067e\u0003\u00a4R\u0000\u067e\u009f"+
		"\u0001\u0000\u0000\u0000\u067f\u0686\u0005\u0095\u0000\u0000\u0680\u0686"+
		"\u0005\u0098\u0000\u0000\u0681\u0682\u0005\u0003\u0000\u0000\u0682\u0683"+
		"\u0003\u00a0P\u0000\u0683\u0684\u0005\u0004\u0000\u0000\u0684\u0686\u0001"+
		"\u0000\u0000\u0000\u0685\u067f\u0001\u0000\u0000\u0000\u0685\u0680\u0001"+
		"\u0000\u0000\u0000\u0685\u0681\u0001\u0000\u0000\u0000\u0686\u00a1\u0001"+
		"\u0000\u0000\u0000\u0687\u0688\u0003\u00a4R\u0000\u0688\u00a3\u0001\u0000"+
		"\u0000\u0000\u0689\u0691\u0005\u0095\u0000\u0000\u068a\u0691\u0003|>\u0000"+
		"\u068b\u0691\u0005\u0098\u0000\u0000\u068c\u068d\u0005\u0003\u0000\u0000"+
		"\u068d\u068e\u0003\u00a4R\u0000\u068e\u068f\u0005\u0004\u0000\u0000\u068f"+
		"\u0691\u0001\u0000\u0000\u0000\u0690\u0689\u0001\u0000\u0000\u0000\u0690"+
		"\u068a\u0001\u0000\u0000\u0000\u0690\u068b\u0001\u0000\u0000\u0000\u0690"+
		"\u068c\u0001\u0000\u0000\u0000\u0691\u00a5\u0001\u0000\u0000\u0000\u00ed"+
		"\u00a8\u00aa\u00b5\u00bc\u00c1\u00c7\u00cd\u00cf\u00ef\u00f6\u00fe\u0101"+
		"\u010a\u010e\u0116\u011a\u011c\u0121\u0123\u0126\u012b\u012f\u0134\u013d"+
		"\u0140\u0146\u0148\u014c\u0152\u0157\u0162\u0168\u016c\u0172\u0177\u0180"+
		"\u0187\u018d\u0191\u0195\u019b\u01a0\u01a7\u01b2\u01b5\u01b7\u01bd\u01c3"+
		"\u01c7\u01ce\u01d4\u01da\u01e0\u01e5\u01f1\u01f6\u0201\u0206\u0209\u0210"+
		"\u0213\u021a\u0223\u0226\u022c\u022e\u0232\u023a\u023f\u0247\u024c\u0254"+
		"\u0259\u0261\u0266\u026b\u0273\u027d\u0280\u0286\u0288\u028b\u029e\u02a4"+
		"\u02ad\u02b2\u02bb\u02c6\u02cd\u02d3\u02d9\u02e2\u02e9\u02ed\u02ef\u02f3"+
		"\u02fa\u02fc\u0300\u0303\u0309\u0313\u0316\u031c\u031e\u0321\u0329\u0333"+
		"\u0336\u033c\u033e\u0342\u0349\u0352\u0356\u0358\u035c\u0365\u036a\u036c"+
		"\u0375\u0380\u0387\u038a\u038d\u039a\u03a8\u03ad\u03b0\u03bd\u03cb\u03d0"+
		"\u03d9\u03dc\u03e2\u03e4\u03ea\u03ef\u03f5\u0401\u0405\u040a\u040e\u0411"+
		"\u0423\u0428\u042d\u0435\u043a\u0443\u044a\u044e\u045e\u0461\u0469\u0472"+
		"\u0476\u047b\u0498\u049d\u04a6\u04b0\u04b3\u04b9\u04bc\u04c3\u04c9\u04d0"+
		"\u04d2\u04d4\u04df\u04e4\u04f0\u04f4\u04f8\u04fc\u0503\u0505\u050d\u0514"+
		"\u0517\u051b\u0520\u0528\u053b\u0541\u0545\u054c\u0552\u055a\u055f\u0562"+
		"\u0567\u0570\u0575\u0583\u0586\u0588\u058d\u0591\u0594\u059b\u05a0\u05a9"+
		"\u05ac\u05b0\u05b3\u05bb\u05bf\u05c7\u05ca\u05cc\u05d5\u05da\u05de\u05e2"+
		"\u05e5\u05f0\u05f5\u05f9\u0600\u0609\u060d\u060f\u0613\u061c\u0621\u0623"+
		"\u062c\u0637\u063e\u0641\u0648\u064b\u0657\u0685\u0690";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}