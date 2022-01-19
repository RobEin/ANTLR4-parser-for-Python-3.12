// Generated from c:\Users\rober\Documents\GitHub\ANTLR4-Python-grammar-by-PEG\PythonParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonParser extends PythonParserBase {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, FALSE=3, AWAIT=4, ELSE=5, IMPORT=6, PASS=7, NONE=8, 
		BREAK=9, EXCEPT=10, IN=11, RAISE=12, TRUE=13, CLASS=14, FINALLY=15, IS=16, 
		RETURN=17, AND=18, CONTINUE=19, FOR=20, LAMBDA=21, TRY=22, AS=23, DEF=24, 
		FROM=25, NONLOCAL=26, WHILE=27, ASSERT=28, DEL=29, GLOBAL=30, NOT=31, 
		WITH=32, ASYNC=33, ELIF=34, IF=35, OR=36, YIELD=37, OPEN_PAREN=38, OPEN_BRACK=39, 
		OPEN_BRACE=40, CLOSE_PAREN=41, CLOSE_BRACK=42, CLOSE_BRACE=43, DOT=44, 
		COLON=45, COMMA=46, SEMI=47, PLUS=48, MINUS=49, STAR=50, SLASH=51, VBAR=52, 
		AMPER=53, LESS=54, GREATER=55, EQUAL=56, PERCENT=57, EQEQUAL=58, NOTEQUAL=59, 
		LESSEQUAL=60, GREATEREQUAL=61, TILDE=62, CIRCUMFLEX=63, LEFTSHIFT=64, 
		RIGHTSHIFT=65, DOUBLESTAR=66, PLUSEQUAL=67, MINEQUAL=68, STAREQUAL=69, 
		SLASHEQUAL=70, PERCENTEQUAL=71, AMPEREQUAL=72, VBAREQUAL=73, CIRCUMFLEXEQUAL=74, 
		LEFTSHIFTEQUAL=75, RIGHTSHIFTEQUAL=76, DOUBLESTAREQUAL=77, DOUBLESLASH=78, 
		DOUBLESLASHEQUAL=79, AT=80, ATEQUAL=81, RARROW=82, ELLIPSIS=83, COLONEQUAL=84, 
		NAME=85, NUMBER=86, STRING=87, TYPE_COMMENT=88, NEWLINE=89, WS=90, LINE_JOINING=91, 
		COMMENT=92;
	public static final int
		RULE_file = 0, RULE_interactive = 1, RULE_eval = 2, RULE_func_type = 3, 
		RULE_fstring = 4, RULE_type_expressions = 5, RULE_statements = 6, RULE_statement = 7, 
		RULE_statement_newline = 8, RULE_simple_stmts = 9, RULE_simple_stmt = 10, 
		RULE_compound_stmt = 11, RULE_assignment = 12, RULE_augassign = 13, RULE_global_stmt = 14, 
		RULE_nonlocal_stmt = 15, RULE_yield_stmt = 16, RULE_assert_stmt = 17, 
		RULE_del_stmt = 18, RULE_import_stmt = 19, RULE_import_name = 20, RULE_import_from = 21, 
		RULE_import_from_targets = 22, RULE_import_from_as_names = 23, RULE_import_from_as_name = 24, 
		RULE_dotted_as_names = 25, RULE_dotted_as_name = 26, RULE_dotted_name = 27, 
		RULE_if_stmt = 28, RULE_elif_stmt = 29, RULE_else_block = 30, RULE_while_stmt = 31, 
		RULE_for_stmt = 32, RULE_with_stmt = 33, RULE_with_item = 34, RULE_try_stmt = 35, 
		RULE_except_block = 36, RULE_finally_block = 37, RULE_match_stmt = 38, 
		RULE_subject_expr = 39, RULE_case_block = 40, RULE_guard = 41, RULE_patterns = 42, 
		RULE_pattern = 43, RULE_as_pattern = 44, RULE_or_pattern = 45, RULE_closed_pattern = 46, 
		RULE_literal_pattern = 47, RULE_literal_expr = 48, RULE_complex_number = 49, 
		RULE_signed_number = 50, RULE_signed_real_number = 51, RULE_real_number = 52, 
		RULE_imaginary_number = 53, RULE_capture_pattern = 54, RULE_pattern_capture_target = 55, 
		RULE_wildcard_pattern = 56, RULE_value_pattern = 57, RULE_attr = 58, RULE_name_or_attr = 59, 
		RULE_group_pattern = 60, RULE_sequence_pattern = 61, RULE_open_sequence_pattern = 62, 
		RULE_maybe_sequence_pattern = 63, RULE_maybe_star_pattern = 64, RULE_star_pattern = 65, 
		RULE_mapping_pattern = 66, RULE_items_pattern = 67, RULE_key_value_pattern = 68, 
		RULE_double_star_pattern = 69, RULE_class_pattern = 70, RULE_positional_patterns = 71, 
		RULE_keyword_patterns = 72, RULE_keyword_pattern = 73, RULE_return_stmt = 74, 
		RULE_raise_stmt = 75, RULE_function_def = 76, RULE_function_def_raw = 77, 
		RULE_func_type_comment = 78, RULE_params = 79, RULE_parameters = 80, RULE_slash_no_default = 81, 
		RULE_slash_with_default = 82, RULE_star_etc = 83, RULE_kwds = 84, RULE_param_no_default = 85, 
		RULE_param_with_default = 86, RULE_param_maybe_default = 87, RULE_param = 88, 
		RULE_annotation = 89, RULE_default_assignment = 90, RULE_decorators = 91, 
		RULE_class_def = 92, RULE_class_def_raw = 93, RULE_block = 94, RULE_star_expressions = 95, 
		RULE_star_expression = 96, RULE_star_named_expressions = 97, RULE_star_named_expression = 98, 
		RULE_assignment_expression = 99, RULE_named_expression = 100, RULE_annotated_rhs = 101, 
		RULE_expressions = 102, RULE_expression = 103, RULE_lambdef = 104, RULE_lambda_params = 105, 
		RULE_lambda_parameters = 106, RULE_lambda_slash_no_default = 107, RULE_lambda_slash_with_default = 108, 
		RULE_lambda_star_etc = 109, RULE_lambda_kwds = 110, RULE_lambda_param_no_default = 111, 
		RULE_lambda_param_with_default = 112, RULE_lambda_param_maybe_default = 113, 
		RULE_lambda_param = 114, RULE_disjunction = 115, RULE_conjunction = 116, 
		RULE_inversion = 117, RULE_comparison = 118, RULE_compare_op_bitwise_or_pair = 119, 
		RULE_eq_bitwise_or = 120, RULE_noteq_bitwise_or = 121, RULE_lte_bitwise_or = 122, 
		RULE_lt_bitwise_or = 123, RULE_gte_bitwise_or = 124, RULE_gt_bitwise_or = 125, 
		RULE_notin_bitwise_or = 126, RULE_in_bitwise_or = 127, RULE_isnot_bitwise_or = 128, 
		RULE_is_bitwise_or = 129, RULE_bitwise_or = 130, RULE_bitwise_xor = 131, 
		RULE_bitwise_and = 132, RULE_shift_expr = 133, RULE_sum = 134, RULE_term = 135, 
		RULE_factor = 136, RULE_power = 137, RULE_await_primary = 138, RULE_primary = 139, 
		RULE_slices = 140, RULE_slice = 141, RULE_atom = 142, RULE_strings = 143, 
		RULE_list = 144, RULE_listcomp = 145, RULE_tuple = 146, RULE_group = 147, 
		RULE_genexp = 148, RULE_set = 149, RULE_setcomp = 150, RULE_dict = 151, 
		RULE_dictcomp = 152, RULE_double_starred_kvpairs = 153, RULE_double_starred_kvpair = 154, 
		RULE_kvpair = 155, RULE_for_if_clauses = 156, RULE_for_if_clause = 157, 
		RULE_yield_expr = 158, RULE_arguments = 159, RULE_args = 160, RULE_kwargs = 161, 
		RULE_starred_expression = 162, RULE_kwarg_or_starred = 163, RULE_kwarg_or_double_starred = 164, 
		RULE_star_targets = 165, RULE_star_targets_list_seq = 166, RULE_star_targets_tuple_seq = 167, 
		RULE_star_target = 168, RULE_target_with_star_atom = 169, RULE_star_atom = 170, 
		RULE_single_target = 171, RULE_single_subscript_attribute_target = 172, 
		RULE_del_targets = 173, RULE_del_target = 174, RULE_del_t_atom = 175, 
		RULE_t_primary = 176, RULE_match_skw = 177, RULE_case_skw = 178, RULE_underscore_skw = 179, 
		RULE_name_except_underscore = 180;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "interactive", "eval", "func_type", "fstring", "type_expressions", 
			"statements", "statement", "statement_newline", "simple_stmts", "simple_stmt", 
			"compound_stmt", "assignment", "augassign", "global_stmt", "nonlocal_stmt", 
			"yield_stmt", "assert_stmt", "del_stmt", "import_stmt", "import_name", 
			"import_from", "import_from_targets", "import_from_as_names", "import_from_as_name", 
			"dotted_as_names", "dotted_as_name", "dotted_name", "if_stmt", "elif_stmt", 
			"else_block", "while_stmt", "for_stmt", "with_stmt", "with_item", "try_stmt", 
			"except_block", "finally_block", "match_stmt", "subject_expr", "case_block", 
			"guard", "patterns", "pattern", "as_pattern", "or_pattern", "closed_pattern", 
			"literal_pattern", "literal_expr", "complex_number", "signed_number", 
			"signed_real_number", "real_number", "imaginary_number", "capture_pattern", 
			"pattern_capture_target", "wildcard_pattern", "value_pattern", "attr", 
			"name_or_attr", "group_pattern", "sequence_pattern", "open_sequence_pattern", 
			"maybe_sequence_pattern", "maybe_star_pattern", "star_pattern", "mapping_pattern", 
			"items_pattern", "key_value_pattern", "double_star_pattern", "class_pattern", 
			"positional_patterns", "keyword_patterns", "keyword_pattern", "return_stmt", 
			"raise_stmt", "function_def", "function_def_raw", "func_type_comment", 
			"params", "parameters", "slash_no_default", "slash_with_default", "star_etc", 
			"kwds", "param_no_default", "param_with_default", "param_maybe_default", 
			"param", "annotation", "default_assignment", "decorators", "class_def", 
			"class_def_raw", "block", "star_expressions", "star_expression", "star_named_expressions", 
			"star_named_expression", "assignment_expression", "named_expression", 
			"annotated_rhs", "expressions", "expression", "lambdef", "lambda_params", 
			"lambda_parameters", "lambda_slash_no_default", "lambda_slash_with_default", 
			"lambda_star_etc", "lambda_kwds", "lambda_param_no_default", "lambda_param_with_default", 
			"lambda_param_maybe_default", "lambda_param", "disjunction", "conjunction", 
			"inversion", "comparison", "compare_op_bitwise_or_pair", "eq_bitwise_or", 
			"noteq_bitwise_or", "lte_bitwise_or", "lt_bitwise_or", "gte_bitwise_or", 
			"gt_bitwise_or", "notin_bitwise_or", "in_bitwise_or", "isnot_bitwise_or", 
			"is_bitwise_or", "bitwise_or", "bitwise_xor", "bitwise_and", "shift_expr", 
			"sum", "term", "factor", "power", "await_primary", "primary", "slices", 
			"slice", "atom", "strings", "list", "listcomp", "tuple", "group", "genexp", 
			"set", "setcomp", "dict", "dictcomp", "double_starred_kvpairs", "double_starred_kvpair", 
			"kvpair", "for_if_clauses", "for_if_clause", "yield_expr", "arguments", 
			"args", "kwargs", "starred_expression", "kwarg_or_starred", "kwarg_or_double_starred", 
			"star_targets", "star_targets_list_seq", "star_targets_tuple_seq", "star_target", 
			"target_with_star_atom", "star_atom", "single_target", "single_subscript_attribute_target", 
			"del_targets", "del_target", "del_t_atom", "t_primary", "match_skw", 
			"case_skw", "underscore_skw", "name_except_underscore"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'False'", "'await'", "'else'", "'import'", "'pass'", 
			"'None'", "'break'", "'except'", "'in'", "'raise'", "'True'", "'class'", 
			"'finally'", "'is'", "'return'", "'and'", "'continue'", "'for'", "'lambda'", 
			"'try'", "'as'", "'def'", "'from'", "'nonlocal'", "'while'", "'assert'", 
			"'del'", "'global'", "'not'", "'with'", "'async'", "'elif'", "'if'", 
			"'or'", "'yield'", "'('", "'['", "'{'", "')'", "']'", "'}'", "'.'", "':'", 
			"','", "';'", "'+'", "'-'", "'*'", "'/'", "'|'", "'&'", "'<'", "'>'", 
			"'='", "'%'", "'=='", "'!='", "'<='", "'>='", "'~'", "'^'", "'<<'", "'>>'", 
			"'**'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", 
			"'<<='", "'>>='", "'**='", "'//'", "'//='", "'@'", "'@='", "'->'", "'...'", 
			"':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "FALSE", "AWAIT", "ELSE", "IMPORT", "PASS", 
			"NONE", "BREAK", "EXCEPT", "IN", "RAISE", "TRUE", "CLASS", "FINALLY", 
			"IS", "RETURN", "AND", "CONTINUE", "FOR", "LAMBDA", "TRY", "AS", "DEF", 
			"FROM", "NONLOCAL", "WHILE", "ASSERT", "DEL", "GLOBAL", "NOT", "WITH", 
			"ASYNC", "ELIF", "IF", "OR", "YIELD", "OPEN_PAREN", "OPEN_BRACK", "OPEN_BRACE", 
			"CLOSE_PAREN", "CLOSE_BRACK", "CLOSE_BRACE", "DOT", "COLON", "COMMA", 
			"SEMI", "PLUS", "MINUS", "STAR", "SLASH", "VBAR", "AMPER", "LESS", "GREATER", 
			"EQUAL", "PERCENT", "EQEQUAL", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", 
			"TILDE", "CIRCUMFLEX", "LEFTSHIFT", "RIGHTSHIFT", "DOUBLESTAR", "PLUSEQUAL", 
			"MINEQUAL", "STAREQUAL", "SLASHEQUAL", "PERCENTEQUAL", "AMPEREQUAL", 
			"VBAREQUAL", "CIRCUMFLEXEQUAL", "LEFTSHIFTEQUAL", "RIGHTSHIFTEQUAL", 
			"DOUBLESTAREQUAL", "DOUBLESLASH", "DOUBLESLASHEQUAL", "AT", "ATEQUAL", 
			"RARROW", "ELLIPSIS", "COLONEQUAL", "NAME", "NUMBER", "STRING", "TYPE_COMMENT", 
			"NEWLINE", "WS", "LINE_JOINING", "COMMENT"
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
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(362);
				statements();
				}
				break;
			}
			setState(365);
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

	public static class InteractiveContext extends ParserRuleContext {
		public Statement_newlineContext statement_newline() {
			return getRuleContext(Statement_newlineContext.class,0);
		}
		public InteractiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interactive; }
	}

	public final InteractiveContext interactive() throws RecognitionException {
		InteractiveContext _localctx = new InteractiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_interactive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			statement_newline();
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

	public static class EvalContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			expressions();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(370);
				match(NEWLINE);
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
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

	public static class Func_typeContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public TerminalNode RARROW() { return getToken(PythonParser.RARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public Type_expressionsContext type_expressions() {
			return getRuleContext(Type_expressionsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public Func_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_type; }
	}

	public final Func_typeContext func_type() throws RecognitionException {
		Func_typeContext _localctx = new Func_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(OPEN_PAREN);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << TILDE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (DOUBLESTAR - 66)) | (1L << (ELLIPSIS - 66)) | (1L << (NAME - 66)) | (1L << (NUMBER - 66)) | (1L << (STRING - 66)))) != 0)) {
				{
				setState(379);
				type_expressions();
				}
			}

			setState(382);
			match(CLOSE_PAREN);
			setState(383);
			match(RARROW);
			setState(384);
			expression();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(385);
				match(NEWLINE);
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
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

	public static class FstringContext extends ParserRuleContext {
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public FstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring; }
	}

	public final FstringContext fstring() throws RecognitionException {
		FstringContext _localctx = new FstringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			star_expressions();
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

	public static class Type_expressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public Type_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_expressions; }
	}

	public final Type_expressionsContext type_expressions() throws RecognitionException {
		Type_expressionsContext _localctx = new Type_expressionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_expressions);
		int _la;
		try {
			int _alt;
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				expression();
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(396);
						match(COMMA);
						setState(397);
						expression();
						}
						} 
					}
					setState(402);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(403);
				match(COMMA);
				setState(404);
				match(STAR);
				setState(405);
				expression();
				setState(406);
				match(COMMA);
				setState(407);
				match(DOUBLESTAR);
				setState(408);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				expression();
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(411);
						match(COMMA);
						setState(412);
						expression();
						}
						} 
					}
					setState(417);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(418);
				match(COMMA);
				setState(419);
				match(STAR);
				setState(420);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				expression();
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(423);
						match(COMMA);
						setState(424);
						expression();
						}
						} 
					}
					setState(429);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(430);
				match(COMMA);
				setState(431);
				match(DOUBLESTAR);
				setState(432);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				match(STAR);
				setState(435);
				expression();
				setState(436);
				match(COMMA);
				setState(437);
				match(DOUBLESTAR);
				setState(438);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				match(STAR);
				setState(441);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(442);
				match(DOUBLESTAR);
				setState(443);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(444);
				expression();
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(445);
					match(COMMA);
					setState(446);
					expression();
					}
					}
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(454);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(457); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StatementContext extends ParserRuleContext {
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				simple_stmts();
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

	public static class Statement_newlineContext extends ParserRuleContext {
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public Statement_newlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_newline; }
	}

	public final Statement_newlineContext statement_newline() throws RecognitionException {
		Statement_newlineContext _localctx = new Statement_newlineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement_newline);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				compound_stmt();
				setState(464);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				simple_stmts();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				match(EOF);
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

	public static class Simple_stmtsContext extends ParserRuleContext {
		public List<Simple_stmtContext> simple_stmt() {
			return getRuleContexts(Simple_stmtContext.class);
		}
		public Simple_stmtContext simple_stmt(int i) {
			return getRuleContext(Simple_stmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PythonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PythonParser.SEMI, i);
		}
		public Simple_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmts; }
	}

	public final Simple_stmtsContext simple_stmts() throws RecognitionException {
		Simple_stmtsContext _localctx = new Simple_stmtsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simple_stmts);
		int _la;
		try {
			int _alt;
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				simple_stmt();
				setState(472);
				if (!(isnot_(SEMI))) throw new FailedPredicateException(this, "isnot_(SEMI)");
				setState(473);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				simple_stmt();
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(476);
						match(SEMI);
						setState(477);
						simple_stmt();
						}
						} 
					}
					setState(482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(483);
					match(SEMI);
					}
				}

				setState(486);
				match(NEWLINE);
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public Del_stmtContext del_stmt() {
			return getRuleContext(Del_stmtContext.class,0);
		}
		public Yield_stmtContext yield_stmt() {
			return getRuleContext(Yield_stmtContext.class,0);
		}
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(PythonParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(PythonParser.CONTINUE, 0); }
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public Nonlocal_stmtContext nonlocal_stmt() {
			return getRuleContext(Nonlocal_stmtContext.class,0);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simple_stmt);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				star_expressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				return_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				import_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				raise_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(495);
				match(PASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(496);
				del_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(497);
				yield_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(498);
				assert_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(499);
				match(BREAK);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(500);
				match(CONTINUE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(501);
				global_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(502);
				nonlocal_stmt();
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public With_stmtContext with_stmt() {
			return getRuleContext(With_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Try_stmtContext try_stmt() {
			return getRuleContext(Try_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Match_stmtContext match_stmt() {
			return getRuleContext(Match_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound_stmt);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				function_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				class_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
				with_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(509);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(510);
				try_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(511);
				while_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(512);
				match_stmt();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> EQUAL() { return getTokens(PythonParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(PythonParser.EQUAL, i);
		}
		public Annotated_rhsContext annotated_rhs() {
			return getRuleContext(Annotated_rhsContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Single_subscript_attribute_targetContext single_subscript_attribute_target() {
			return getRuleContext(Single_subscript_attribute_targetContext.class,0);
		}
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public List<Star_targetsContext> star_targets() {
			return getRuleContexts(Star_targetsContext.class);
		}
		public Star_targetsContext star_targets(int i) {
			return getRuleContext(Star_targetsContext.class,i);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			int _alt;
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(NAME);
				setState(516);
				match(COLON);
				setState(517);
				expression();
				setState(520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(518);
					match(EQUAL);
					setState(519);
					annotated_rhs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(522);
					match(OPEN_PAREN);
					setState(523);
					single_target();
					setState(524);
					match(CLOSE_PAREN);
					}
					break;
				case 2:
					{
					setState(526);
					single_subscript_attribute_target();
					}
					break;
				}
				setState(529);
				match(COLON);
				setState(530);
				expression();
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(531);
					match(EQUAL);
					setState(532);
					annotated_rhs();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(538); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(535);
						star_targets();
						setState(536);
						match(EQUAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(540); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(544);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(542);
					yield_expr();
					}
					break;
				case FALSE:
				case AWAIT:
				case NONE:
				case TRUE:
				case LAMBDA:
				case NOT:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case OPEN_BRACE:
				case PLUS:
				case MINUS:
				case STAR:
				case TILDE:
				case ELLIPSIS:
				case NAME:
				case NUMBER:
				case STRING:
					{
					setState(543);
					star_expressions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(546);
				if (!(isnot_(EQUAL))) throw new FailedPredicateException(this, "isnot_(EQUAL)");
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(547);
					match(TYPE_COMMENT);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				single_target();
				setState(551);
				augassign();
				setState(554);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(552);
					yield_expr();
					}
					break;
				case FALSE:
				case AWAIT:
				case NONE:
				case TRUE:
				case LAMBDA:
				case NOT:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case OPEN_BRACE:
				case PLUS:
				case MINUS:
				case STAR:
				case TILDE:
				case ELLIPSIS:
				case NAME:
				case NUMBER:
				case STRING:
					{
					setState(553);
					star_expressions();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class AugassignContext extends ParserRuleContext {
		public TerminalNode PLUSEQUAL() { return getToken(PythonParser.PLUSEQUAL, 0); }
		public TerminalNode MINEQUAL() { return getToken(PythonParser.MINEQUAL, 0); }
		public TerminalNode STAREQUAL() { return getToken(PythonParser.STAREQUAL, 0); }
		public TerminalNode ATEQUAL() { return getToken(PythonParser.ATEQUAL, 0); }
		public TerminalNode SLASHEQUAL() { return getToken(PythonParser.SLASHEQUAL, 0); }
		public TerminalNode PERCENTEQUAL() { return getToken(PythonParser.PERCENTEQUAL, 0); }
		public TerminalNode AMPEREQUAL() { return getToken(PythonParser.AMPEREQUAL, 0); }
		public TerminalNode VBAREQUAL() { return getToken(PythonParser.VBAREQUAL, 0); }
		public TerminalNode CIRCUMFLEXEQUAL() { return getToken(PythonParser.CIRCUMFLEXEQUAL, 0); }
		public TerminalNode LEFTSHIFTEQUAL() { return getToken(PythonParser.LEFTSHIFTEQUAL, 0); }
		public TerminalNode RIGHTSHIFTEQUAL() { return getToken(PythonParser.RIGHTSHIFTEQUAL, 0); }
		public TerminalNode DOUBLESTAREQUAL() { return getToken(PythonParser.DOUBLESTAREQUAL, 0); }
		public TerminalNode DOUBLESLASHEQUAL() { return getToken(PythonParser.DOUBLESLASHEQUAL, 0); }
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSEQUAL - 67)) | (1L << (MINEQUAL - 67)) | (1L << (STAREQUAL - 67)) | (1L << (SLASHEQUAL - 67)) | (1L << (PERCENTEQUAL - 67)) | (1L << (AMPEREQUAL - 67)) | (1L << (VBAREQUAL - 67)) | (1L << (CIRCUMFLEXEQUAL - 67)) | (1L << (LEFTSHIFTEQUAL - 67)) | (1L << (RIGHTSHIFTEQUAL - 67)) | (1L << (DOUBLESTAREQUAL - 67)) | (1L << (DOUBLESLASHEQUAL - 67)) | (1L << (ATEQUAL - 67)))) != 0)) ) {
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

	public static class Global_stmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(PythonParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_global_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(GLOBAL);
			setState(561);
			match(NAME);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(562);
					match(COMMA);
					setState(563);
					match(NAME);
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class Nonlocal_stmtContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(PythonParser.NONLOCAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Nonlocal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_stmt; }
	}

	public final Nonlocal_stmtContext nonlocal_stmt() throws RecognitionException {
		Nonlocal_stmtContext _localctx = new Nonlocal_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nonlocal_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(NONLOCAL);
			setState(570);
			match(NAME);
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(571);
					match(COMMA);
					setState(572);
					match(NAME);
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class Yield_stmtContext extends ParserRuleContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Yield_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_stmt; }
	}

	public final Yield_stmtContext yield_stmt() throws RecognitionException {
		Yield_stmtContext _localctx = new Yield_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_yield_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			yield_expr();
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

	public static class Assert_stmtContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(PythonParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Assert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_stmt; }
	}

	public final Assert_stmtContext assert_stmt() throws RecognitionException {
		Assert_stmtContext _localctx = new Assert_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(ASSERT);
			setState(581);
			expression();
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(582);
				match(COMMA);
				setState(583);
				expression();
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

	public static class Del_stmtContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(PythonParser.DEL, 0); }
		public Del_targetsContext del_targets() {
			return getRuleContext(Del_targetsContext.class,0);
		}
		public Del_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_stmt; }
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(DEL);
			setState(587);
			del_targets();
			setState(588);
			if (!(is_(SEMI, NEWLINE))) throw new FailedPredicateException(this, "is_(SEMI, NEWLINE)");
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

	public static class Import_stmtContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_import_stmt);
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				import_from();
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

	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public Dotted_as_namesContext dotted_as_names() {
			return getRuleContext(Dotted_as_namesContext.class,0);
		}
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(IMPORT);
			setState(595);
			dotted_as_names();
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

	public static class Import_fromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public Import_from_targetsContext import_from_targets() {
			return getRuleContext(Import_from_targetsContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(PythonParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(PythonParser.ELLIPSIS, i);
		}
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_import_from);
		int _la;
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(FROM);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==ELLIPSIS) {
					{
					{
					setState(598);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ELLIPSIS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(604);
				dotted_name(0);
				setState(605);
				match(IMPORT);
				setState(606);
				import_from_targets();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(FROM);
				setState(610); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(609);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ELLIPSIS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(612); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT || _la==ELLIPSIS );
				setState(614);
				match(IMPORT);
				setState(615);
				import_from_targets();
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

	public static class Import_from_targetsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public Import_from_as_namesContext import_from_as_names() {
			return getRuleContext(Import_from_as_namesContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Import_from_targetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from_targets; }
	}

	public final Import_from_targetsContext import_from_targets() throws RecognitionException {
		Import_from_targetsContext _localctx = new Import_from_targetsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_import_from_targets);
		int _la;
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(OPEN_PAREN);
				setState(619);
				import_from_as_names();
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(620);
					match(COMMA);
					}
				}

				setState(623);
				match(CLOSE_PAREN);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				import_from_as_names();
				setState(626);
				if (!(isnot_(COMMA))) throw new FailedPredicateException(this, "isnot_(COMMA)");
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(628);
				match(STAR);
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

	public static class Import_from_as_namesContext extends ParserRuleContext {
		public List<Import_from_as_nameContext> import_from_as_name() {
			return getRuleContexts(Import_from_as_nameContext.class);
		}
		public Import_from_as_nameContext import_from_as_name(int i) {
			return getRuleContext(Import_from_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Import_from_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from_as_names; }
	}

	public final Import_from_as_namesContext import_from_as_names() throws RecognitionException {
		Import_from_as_namesContext _localctx = new Import_from_as_namesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_import_from_as_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			import_from_as_name();
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(632);
					match(COMMA);
					setState(633);
					import_from_as_name();
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class Import_from_as_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public Import_from_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from_as_name; }
	}

	public final Import_from_as_nameContext import_from_as_name() throws RecognitionException {
		Import_from_as_nameContext _localctx = new Import_from_as_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_import_from_as_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(NAME);
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(640);
				match(AS);
				setState(641);
				match(NAME);
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

	public static class Dotted_as_namesContext extends ParserRuleContext {
		public List<Dotted_as_nameContext> dotted_as_name() {
			return getRuleContexts(Dotted_as_nameContext.class);
		}
		public Dotted_as_nameContext dotted_as_name(int i) {
			return getRuleContext(Dotted_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Dotted_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_names; }
	}

	public final Dotted_as_namesContext dotted_as_names() throws RecognitionException {
		Dotted_as_namesContext _localctx = new Dotted_as_namesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dotted_as_names);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			dotted_as_name();
			setState(649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(645);
					match(COMMA);
					setState(646);
					dotted_as_name();
					}
					} 
				}
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dotted_as_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			dotted_name(0);
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(653);
				match(AS);
				setState(654);
				match(NAME);
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

	public static class Dotted_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		return dotted_name(0);
	}

	private Dotted_nameContext dotted_name(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, _parentState);
		Dotted_nameContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_dotted_name, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(658);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dotted_nameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dotted_name);
					setState(660);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(661);
					match(DOT);
					setState(662);
					match(NAME);
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elif_stmtContext elif_stmt() {
			return getRuleContext(Elif_stmtContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_stmt);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(IF);
				setState(669);
				named_expression();
				setState(670);
				match(COLON);
				setState(671);
				block();
				setState(672);
				elif_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(IF);
				setState(675);
				named_expression();
				setState(676);
				match(COLON);
				setState(677);
				block();
				setState(679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(678);
					else_block();
					}
					break;
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

	public static class Elif_stmtContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(PythonParser.ELIF, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elif_stmtContext elif_stmt() {
			return getRuleContext(Elif_stmtContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public Elif_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_stmt; }
	}

	public final Elif_stmtContext elif_stmt() throws RecognitionException {
		Elif_stmtContext _localctx = new Elif_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elif_stmt);
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				match(ELIF);
				setState(684);
				named_expression();
				setState(685);
				match(COLON);
				setState(686);
				block();
				setState(687);
				elif_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				match(ELIF);
				setState(690);
				named_expression();
				setState(691);
				match(COLON);
				setState(692);
				block();
				setState(694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(693);
					else_block();
					}
					break;
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(ELSE);
			setState(699);
			match(COLON);
			setState(700);
			block();
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(WHILE);
			setState(703);
			named_expression();
			setState(704);
			match(COLON);
			setState(705);
			block();
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(706);
				else_block();
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public Star_targetsContext star_targets() {
			return getRuleContext(Star_targetsContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_for_stmt);
		int _la;
		try {
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				match(FOR);
				setState(710);
				star_targets();
				setState(711);
				match(IN);
				setState(712);
				star_expressions();
				setState(713);
				match(COLON);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(714);
					match(TYPE_COMMENT);
					}
				}

				setState(717);
				block();
				setState(719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(718);
					else_block();
					}
					break;
				}
				}
				break;
			case ASYNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(ASYNC);
				setState(722);
				match(FOR);
				setState(723);
				star_targets();
				setState(724);
				match(IN);
				setState(725);
				star_expressions();
				setState(726);
				match(COLON);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(727);
					match(TYPE_COMMENT);
					}
				}

				setState(730);
				block();
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(731);
					else_block();
					}
					break;
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

	public static class With_stmtContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PythonParser.WITH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public List<With_itemContext> with_item() {
			return getRuleContexts(With_itemContext.class);
		}
		public With_itemContext with_item(int i) {
			return getRuleContext(With_itemContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public With_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_stmt; }
	}

	public final With_stmtContext with_stmt() throws RecognitionException {
		With_stmtContext _localctx = new With_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_with_stmt);
		int _la;
		try {
			int _alt;
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(WITH);
				setState(737);
				match(OPEN_PAREN);
				setState(738);
				with_item();
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(739);
						match(COMMA);
						setState(740);
						with_item();
						}
						} 
					}
					setState(745);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(746);
					match(COMMA);
					}
				}

				setState(749);
				match(CLOSE_PAREN);
				setState(750);
				match(COLON);
				setState(751);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(WITH);
				setState(754);
				with_item();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(755);
					match(COMMA);
					setState(756);
					with_item();
					}
					}
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(762);
				match(COLON);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(763);
					match(TYPE_COMMENT);
					}
				}

				setState(766);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				match(ASYNC);
				setState(769);
				match(WITH);
				setState(770);
				match(OPEN_PAREN);
				setState(771);
				with_item();
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(772);
						match(COMMA);
						setState(773);
						with_item();
						}
						} 
					}
					setState(778);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(779);
					match(COMMA);
					}
				}

				setState(782);
				match(CLOSE_PAREN);
				setState(783);
				match(COLON);
				setState(784);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(786);
				match(ASYNC);
				setState(787);
				match(WITH);
				setState(788);
				with_item();
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(789);
					match(COMMA);
					setState(790);
					with_item();
					}
					}
					setState(795);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(796);
				match(COLON);
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(797);
					match(TYPE_COMMENT);
					}
				}

				setState(800);
				block();
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

	public static class With_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public Star_targetContext star_target() {
			return getRuleContext(Star_targetContext.class,0);
		}
		public With_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_item; }
	}

	public final With_itemContext with_item() throws RecognitionException {
		With_itemContext _localctx = new With_itemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_with_item);
		try {
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				expression();
				setState(805);
				match(AS);
				setState(806);
				star_target();
				setState(807);
				if (!(is_(COMMA, CLOSE_PAREN, COLON))) throw new FailedPredicateException(this, "is_(COMMA, CLOSE_PAREN, COLON)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				expression();
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

	public static class Try_stmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_blockContext finally_block() {
			return getRuleContext(Finally_blockContext.class,0);
		}
		public List<Except_blockContext> except_block() {
			return getRuleContexts(Except_blockContext.class);
		}
		public Except_blockContext except_block(int i) {
			return getRuleContext(Except_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public Try_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_stmt; }
	}

	public final Try_stmtContext try_stmt() throws RecognitionException {
		Try_stmtContext _localctx = new Try_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_try_stmt);
		try {
			int _alt;
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(TRY);
				setState(813);
				match(COLON);
				setState(814);
				block();
				setState(815);
				finally_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(TRY);
				setState(818);
				match(COLON);
				setState(819);
				block();
				setState(821); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(820);
						except_block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(823); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(825);
					else_block();
					}
					break;
				}
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(828);
					finally_block();
					}
					break;
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

	public static class Except_blockContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(PythonParser.EXCEPT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Except_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_block; }
	}

	public final Except_blockContext except_block() throws RecognitionException {
		Except_blockContext _localctx = new Except_blockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_except_block);
		int _la;
		try {
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				match(EXCEPT);
				setState(834);
				expression();
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(835);
					match(AS);
					setState(836);
					match(NAME);
					}
				}

				setState(839);
				match(COLON);
				setState(840);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(EXCEPT);
				setState(843);
				match(COLON);
				setState(844);
				block();
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

	public static class Finally_blockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(PythonParser.FINALLY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_block; }
	}

	public final Finally_blockContext finally_block() throws RecognitionException {
		Finally_blockContext _localctx = new Finally_blockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_finally_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(FINALLY);
			setState(848);
			match(COLON);
			setState(849);
			block();
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

	public static class Match_stmtContext extends ParserRuleContext {
		public Match_skwContext match_skw() {
			return getRuleContext(Match_skwContext.class,0);
		}
		public Subject_exprContext subject_expr() {
			return getRuleContext(Subject_exprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public Match_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_stmt; }
	}

	public final Match_stmtContext match_stmt() throws RecognitionException {
		Match_stmtContext _localctx = new Match_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_match_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match_skw();
			setState(852);
			subject_expr();
			setState(853);
			match(COLON);
			setState(854);
			match(NEWLINE);
			setState(855);
			match(INDENT);
			setState(857); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(856);
					case_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(859); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(861);
			match(DEDENT);
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

	public static class Subject_exprContext extends ParserRuleContext {
		public Star_named_expressionContext star_named_expression() {
			return getRuleContext(Star_named_expressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Star_named_expressionsContext star_named_expressions() {
			return getRuleContext(Star_named_expressionsContext.class,0);
		}
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public Subject_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject_expr; }
	}

	public final Subject_exprContext subject_expr() throws RecognitionException {
		Subject_exprContext _localctx = new Subject_exprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_subject_expr);
		int _la;
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				star_named_expression();
				setState(864);
				match(COMMA);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << TILDE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ELLIPSIS - 83)) | (1L << (NAME - 83)) | (1L << (NUMBER - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(865);
					star_named_expressions();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				named_expression();
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

	public static class Case_blockContext extends ParserRuleContext {
		public Case_skwContext case_skw() {
			return getRuleContext(Case_skwContext.class,0);
		}
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_case_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			case_skw();
			setState(872);
			patterns();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(873);
				guard();
				}
			}

			setState(876);
			match(COLON);
			setState(877);
			block();
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

	public static class GuardContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(IF);
			setState(880);
			named_expression();
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

	public static class PatternsContext extends ParserRuleContext {
		public Open_sequence_patternContext open_sequence_pattern() {
			return getRuleContext(Open_sequence_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patterns; }
	}

	public final PatternsContext patterns() throws RecognitionException {
		PatternsContext _localctx = new PatternsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_patterns);
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				open_sequence_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				pattern();
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

	public static class PatternContext extends ParserRuleContext {
		public As_patternContext as_pattern() {
			return getRuleContext(As_patternContext.class,0);
		}
		public Or_patternContext or_pattern() {
			return getRuleContext(Or_patternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pattern);
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				as_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				or_pattern();
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

	public static class As_patternContext extends ParserRuleContext {
		public Or_patternContext or_pattern() {
			return getRuleContext(Or_patternContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public As_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_pattern; }
	}

	public final As_patternContext as_pattern() throws RecognitionException {
		As_patternContext _localctx = new As_patternContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_as_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			or_pattern();
			setState(891);
			match(AS);
			setState(892);
			pattern_capture_target();
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

	public static class Or_patternContext extends ParserRuleContext {
		public List<Closed_patternContext> closed_pattern() {
			return getRuleContexts(Closed_patternContext.class);
		}
		public Closed_patternContext closed_pattern(int i) {
			return getRuleContext(Closed_patternContext.class,i);
		}
		public List<TerminalNode> VBAR() { return getTokens(PythonParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(PythonParser.VBAR, i);
		}
		public Or_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_pattern; }
	}

	public final Or_patternContext or_pattern() throws RecognitionException {
		Or_patternContext _localctx = new Or_patternContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_or_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			closed_pattern();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VBAR) {
				{
				{
				setState(895);
				match(VBAR);
				setState(896);
				closed_pattern();
				}
				}
				setState(901);
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

	public static class Closed_patternContext extends ParserRuleContext {
		public Literal_patternContext literal_pattern() {
			return getRuleContext(Literal_patternContext.class,0);
		}
		public Capture_patternContext capture_pattern() {
			return getRuleContext(Capture_patternContext.class,0);
		}
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Value_patternContext value_pattern() {
			return getRuleContext(Value_patternContext.class,0);
		}
		public Group_patternContext group_pattern() {
			return getRuleContext(Group_patternContext.class,0);
		}
		public Sequence_patternContext sequence_pattern() {
			return getRuleContext(Sequence_patternContext.class,0);
		}
		public Mapping_patternContext mapping_pattern() {
			return getRuleContext(Mapping_patternContext.class,0);
		}
		public Class_patternContext class_pattern() {
			return getRuleContext(Class_patternContext.class,0);
		}
		public Closed_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closed_pattern; }
	}

	public final Closed_patternContext closed_pattern() throws RecognitionException {
		Closed_patternContext _localctx = new Closed_patternContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_closed_pattern);
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				literal_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				capture_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				wildcard_pattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(905);
				value_pattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(906);
				group_pattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(907);
				sequence_pattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(908);
				mapping_pattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(909);
				class_pattern();
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

	public static class Literal_patternContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Complex_numberContext complex_number() {
			return getRuleContext(Complex_numberContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public Literal_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_pattern; }
	}

	public final Literal_patternContext literal_pattern() throws RecognitionException {
		Literal_patternContext _localctx = new Literal_patternContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal_pattern);
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				signed_number();
				setState(913);
				if (!(isnot_(PLUS, MINUS))) throw new FailedPredicateException(this, "isnot_(PLUS, MINUS)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				complex_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				strings();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(917);
				match(NONE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(918);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(919);
				match(FALSE);
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

	public static class Literal_exprContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Complex_numberContext complex_number() {
			return getRuleContext(Complex_numberContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public Literal_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expr; }
	}

	public final Literal_exprContext literal_expr() throws RecognitionException {
		Literal_exprContext _localctx = new Literal_exprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal_expr);
		try {
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				signed_number();
				setState(923);
				if (!(isnot_(PLUS, MINUS))) throw new FailedPredicateException(this, "isnot_(PLUS, MINUS)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				complex_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				strings();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(927);
				match(NONE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(928);
				match(TRUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(929);
				match(FALSE);
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

	public static class Complex_numberContext extends ParserRuleContext {
		public Signed_real_numberContext signed_real_number() {
			return getRuleContext(Signed_real_numberContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public Imaginary_numberContext imaginary_number() {
			return getRuleContext(Imaginary_numberContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public Complex_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_number; }
	}

	public final Complex_numberContext complex_number() throws RecognitionException {
		Complex_numberContext _localctx = new Complex_numberContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_complex_number);
		try {
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				signed_real_number();
				setState(933);
				match(PLUS);
				setState(934);
				imaginary_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				signed_real_number();
				setState(937);
				match(MINUS);
				setState(938);
				imaginary_number();
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_signed_number);
		try {
			setState(945);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				match(NUMBER);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				match(MINUS);
				setState(944);
				match(NUMBER);
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

	public static class Signed_real_numberContext extends ParserRuleContext {
		public Real_numberContext real_number() {
			return getRuleContext(Real_numberContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public Signed_real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_real_number; }
	}

	public final Signed_real_numberContext signed_real_number() throws RecognitionException {
		Signed_real_numberContext _localctx = new Signed_real_numberContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_signed_real_number);
		try {
			setState(950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				real_number();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				match(MINUS);
				setState(949);
				real_number();
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

	public static class Real_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public Real_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_number; }
	}

	public final Real_numberContext real_number() throws RecognitionException {
		Real_numberContext _localctx = new Real_numberContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_real_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(NUMBER);
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

	public static class Imaginary_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public Imaginary_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imaginary_number; }
	}

	public final Imaginary_numberContext imaginary_number() throws RecognitionException {
		Imaginary_numberContext _localctx = new Imaginary_numberContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_imaginary_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(NUMBER);
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

	public static class Capture_patternContext extends ParserRuleContext {
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public Capture_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_pattern; }
	}

	public final Capture_patternContext capture_pattern() throws RecognitionException {
		Capture_patternContext _localctx = new Capture_patternContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_capture_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			pattern_capture_target();
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

	public static class Pattern_capture_targetContext extends ParserRuleContext {
		public Name_except_underscoreContext name_except_underscore() {
			return getRuleContext(Name_except_underscoreContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Pattern_capture_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_capture_target; }
	}

	public final Pattern_capture_targetContext pattern_capture_target() throws RecognitionException {
		Pattern_capture_targetContext _localctx = new Pattern_capture_targetContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_pattern_capture_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			name_except_underscore();
			setState(959);
			match(NAME);
			setState(960);
			if (!(isnot_(DOT, OPEN_PAREN, EQUAL))) throw new FailedPredicateException(this, "isnot_(DOT, OPEN_PAREN, EQUAL)");
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

	public static class Wildcard_patternContext extends ParserRuleContext {
		public Underscore_skwContext underscore_skw() {
			return getRuleContext(Underscore_skwContext.class,0);
		}
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			underscore_skw();
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

	public static class Value_patternContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public Value_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_pattern; }
	}

	public final Value_patternContext value_pattern() throws RecognitionException {
		Value_patternContext _localctx = new Value_patternContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_value_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			attr();
			setState(965);
			if (!(isnot_(DOT, OPEN_PAREN, EQUAL))) throw new FailedPredicateException(this, "isnot_(DOT, OPEN_PAREN, EQUAL)");
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

	public static class AttrContext extends ParserRuleContext {
		public Name_or_attrContext name_or_attr() {
			return getRuleContext(Name_or_attrContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			name_or_attr(0);
			setState(968);
			match(DOT);
			setState(969);
			match(NAME);
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

	public static class Name_or_attrContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Name_or_attrContext name_or_attr() {
			return getRuleContext(Name_or_attrContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public Name_or_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_or_attr; }
	}

	public final Name_or_attrContext name_or_attr() throws RecognitionException {
		return name_or_attr(0);
	}

	private Name_or_attrContext name_or_attr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Name_or_attrContext _localctx = new Name_or_attrContext(_ctx, _parentState);
		Name_or_attrContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_name_or_attr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(972);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(979);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Name_or_attrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_name_or_attr);
					setState(974);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(975);
					match(DOT);
					setState(976);
					match(NAME);
					}
					} 
				}
				setState(981);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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

	public static class Group_patternContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Group_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_pattern; }
	}

	public final Group_patternContext group_pattern() throws RecognitionException {
		Group_patternContext _localctx = new Group_patternContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_group_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(OPEN_PAREN);
			setState(983);
			pattern();
			setState(984);
			match(CLOSE_PAREN);
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

	public static class Sequence_patternContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public Maybe_sequence_patternContext maybe_sequence_pattern() {
			return getRuleContext(Maybe_sequence_patternContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Open_sequence_patternContext open_sequence_pattern() {
			return getRuleContext(Open_sequence_patternContext.class,0);
		}
		public Sequence_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_pattern; }
	}

	public final Sequence_patternContext sequence_pattern() throws RecognitionException {
		Sequence_patternContext _localctx = new Sequence_patternContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sequence_pattern);
		try {
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				match(OPEN_BRACK);
				setState(988);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(987);
					maybe_sequence_pattern();
					}
					break;
				}
				setState(990);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				match(OPEN_PAREN);
				setState(993);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(992);
					open_sequence_pattern();
					}
					break;
				}
				setState(995);
				match(CLOSE_PAREN);
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

	public static class Open_sequence_patternContext extends ParserRuleContext {
		public Maybe_star_patternContext maybe_star_pattern() {
			return getRuleContext(Maybe_star_patternContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Maybe_sequence_patternContext maybe_sequence_pattern() {
			return getRuleContext(Maybe_sequence_patternContext.class,0);
		}
		public Open_sequence_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_sequence_pattern; }
	}

	public final Open_sequence_patternContext open_sequence_pattern() throws RecognitionException {
		Open_sequence_patternContext _localctx = new Open_sequence_patternContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_open_sequence_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			maybe_star_pattern();
			setState(999);
			match(COMMA);
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(1000);
				maybe_sequence_pattern();
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

	public static class Maybe_sequence_patternContext extends ParserRuleContext {
		public List<Maybe_star_patternContext> maybe_star_pattern() {
			return getRuleContexts(Maybe_star_patternContext.class);
		}
		public Maybe_star_patternContext maybe_star_pattern(int i) {
			return getRuleContext(Maybe_star_patternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Maybe_sequence_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_sequence_pattern; }
	}

	public final Maybe_sequence_patternContext maybe_sequence_pattern() throws RecognitionException {
		Maybe_sequence_patternContext _localctx = new Maybe_sequence_patternContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_maybe_sequence_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			maybe_star_pattern();
			setState(1008);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1004);
					match(COMMA);
					setState(1005);
					maybe_star_pattern();
					}
					} 
				}
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1011);
				match(COMMA);
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

	public static class Maybe_star_patternContext extends ParserRuleContext {
		public Star_patternContext star_pattern() {
			return getRuleContext(Star_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Maybe_star_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_star_pattern; }
	}

	public final Maybe_star_patternContext maybe_star_pattern() throws RecognitionException {
		Maybe_star_patternContext _localctx = new Maybe_star_patternContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_maybe_star_pattern);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				star_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1015);
				pattern();
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

	public static class Star_patternContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Star_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_pattern; }
	}

	public final Star_patternContext star_pattern() throws RecognitionException {
		Star_patternContext _localctx = new Star_patternContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_star_pattern);
		try {
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				match(STAR);
				setState(1019);
				pattern_capture_target();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				match(STAR);
				setState(1021);
				wildcard_pattern();
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

	public static class Mapping_patternContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(PythonParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PythonParser.CLOSE_BRACE, 0); }
		public Double_star_patternContext double_star_pattern() {
			return getRuleContext(Double_star_patternContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Items_patternContext items_pattern() {
			return getRuleContext(Items_patternContext.class,0);
		}
		public Mapping_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping_pattern; }
	}

	public final Mapping_patternContext mapping_pattern() throws RecognitionException {
		Mapping_patternContext _localctx = new Mapping_patternContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_mapping_pattern);
		int _la;
		try {
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				match(OPEN_BRACE);
				setState(1025);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				match(OPEN_BRACE);
				setState(1027);
				double_star_pattern();
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1028);
					match(COMMA);
					}
				}

				setState(1031);
				match(CLOSE_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1033);
				match(OPEN_BRACE);
				setState(1034);
				items_pattern();
				setState(1035);
				match(COMMA);
				setState(1036);
				double_star_pattern();
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1037);
					match(COMMA);
					}
				}

				setState(1040);
				match(CLOSE_BRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1042);
				match(OPEN_BRACE);
				setState(1043);
				items_pattern();
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1044);
					match(COMMA);
					}
				}

				setState(1047);
				match(CLOSE_BRACE);
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

	public static class Items_patternContext extends ParserRuleContext {
		public List<Key_value_patternContext> key_value_pattern() {
			return getRuleContexts(Key_value_patternContext.class);
		}
		public Key_value_patternContext key_value_pattern(int i) {
			return getRuleContext(Key_value_patternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Items_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items_pattern; }
	}

	public final Items_patternContext items_pattern() throws RecognitionException {
		Items_patternContext _localctx = new Items_patternContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_items_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			key_value_pattern();
			setState(1056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1052);
					match(COMMA);
					setState(1053);
					key_value_pattern();
					}
					} 
				}
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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

	public static class Key_value_patternContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Literal_exprContext literal_expr() {
			return getRuleContext(Literal_exprContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public Key_value_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value_pattern; }
	}

	public final Key_value_patternContext key_value_pattern() throws RecognitionException {
		Key_value_patternContext _localctx = new Key_value_patternContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_key_value_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case NONE:
			case TRUE:
			case MINUS:
			case NUMBER:
			case STRING:
				{
				setState(1059);
				literal_expr();
				}
				break;
			case NAME:
				{
				setState(1060);
				attr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1063);
			match(COLON);
			setState(1064);
			pattern();
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

	public static class Double_star_patternContext extends ParserRuleContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public Pattern_capture_targetContext pattern_capture_target() {
			return getRuleContext(Pattern_capture_targetContext.class,0);
		}
		public Double_star_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_star_pattern; }
	}

	public final Double_star_patternContext double_star_pattern() throws RecognitionException {
		Double_star_patternContext _localctx = new Double_star_patternContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_double_star_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(DOUBLESTAR);
			setState(1067);
			pattern_capture_target();
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

	public static class Class_patternContext extends ParserRuleContext {
		public Name_or_attrContext name_or_attr() {
			return getRuleContext(Name_or_attrContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Positional_patternsContext positional_patterns() {
			return getRuleContext(Positional_patternsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Keyword_patternsContext keyword_patterns() {
			return getRuleContext(Keyword_patternsContext.class,0);
		}
		public Class_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_pattern; }
	}

	public final Class_patternContext class_pattern() throws RecognitionException {
		Class_patternContext _localctx = new Class_patternContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_class_pattern);
		int _la;
		try {
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
				name_or_attr(0);
				setState(1070);
				match(OPEN_PAREN);
				setState(1071);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				name_or_attr(0);
				setState(1074);
				match(OPEN_PAREN);
				setState(1075);
				positional_patterns();
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1076);
					match(COMMA);
					}
				}

				setState(1079);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1081);
				name_or_attr(0);
				setState(1082);
				match(OPEN_PAREN);
				setState(1083);
				keyword_patterns();
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1084);
					match(COMMA);
					}
				}

				setState(1087);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1089);
				name_or_attr(0);
				setState(1090);
				match(OPEN_PAREN);
				setState(1091);
				positional_patterns();
				setState(1092);
				match(COMMA);
				setState(1093);
				keyword_patterns();
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1094);
					match(COMMA);
					}
				}

				setState(1097);
				match(CLOSE_PAREN);
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

	public static class Positional_patternsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Positional_patternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positional_patterns; }
	}

	public final Positional_patternsContext positional_patterns() throws RecognitionException {
		Positional_patternsContext _localctx = new Positional_patternsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_positional_patterns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			pattern();
			setState(1106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1102);
					match(COMMA);
					setState(1103);
					pattern();
					}
					} 
				}
				setState(1108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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

	public static class Keyword_patternsContext extends ParserRuleContext {
		public List<Keyword_patternContext> keyword_pattern() {
			return getRuleContexts(Keyword_patternContext.class);
		}
		public Keyword_patternContext keyword_pattern(int i) {
			return getRuleContext(Keyword_patternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Keyword_patternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_patterns; }
	}

	public final Keyword_patternsContext keyword_patterns() throws RecognitionException {
		Keyword_patternsContext _localctx = new Keyword_patternsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_keyword_patterns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			keyword_pattern();
			setState(1114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1110);
					match(COMMA);
					setState(1111);
					keyword_pattern();
					}
					} 
				}
				setState(1116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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

	public static class Keyword_patternContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Keyword_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_pattern; }
	}

	public final Keyword_patternContext keyword_pattern() throws RecognitionException {
		Keyword_patternContext _localctx = new Keyword_patternContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_keyword_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(NAME);
			setState(1118);
			match(EQUAL);
			setState(1119);
			pattern();
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			match(RETURN);
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1122);
				star_expressions();
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

	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(PythonParser.RAISE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_raise_stmt);
		try {
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				match(RAISE);
				setState(1126);
				expression();
				setState(1129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1127);
					match(FROM);
					setState(1128);
					expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				match(RAISE);
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

	public static class Function_defContext extends ParserRuleContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public Function_def_rawContext function_def_raw() {
			return getRuleContext(Function_def_rawContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_function_def);
		try {
			setState(1138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				decorators();
				setState(1135);
				function_def_raw();
				}
				break;
			case DEF:
			case ASYNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				function_def_raw();
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

	public static class Function_def_rawContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(PythonParser.RARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Func_type_commentContext func_type_comment() {
			return getRuleContext(Func_type_commentContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public Function_def_rawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def_raw; }
	}

	public final Function_def_rawContext function_def_raw() throws RecognitionException {
		Function_def_rawContext _localctx = new Function_def_rawContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_function_def_raw);
		int _la;
		try {
			setState(1173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				match(DEF);
				setState(1141);
				match(NAME);
				setState(1142);
				match(OPEN_PAREN);
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (STAR - 50)) | (1L << (DOUBLESTAR - 50)) | (1L << (NAME - 50)))) != 0)) {
					{
					setState(1143);
					params();
					}
				}

				setState(1146);
				match(CLOSE_PAREN);
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(1147);
					match(RARROW);
					setState(1148);
					expression();
					}
				}

				setState(1151);
				match(COLON);
				setState(1153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1152);
					func_type_comment();
					}
					break;
				}
				setState(1155);
				block();
				}
				break;
			case ASYNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				match(ASYNC);
				setState(1157);
				match(DEF);
				setState(1158);
				match(NAME);
				setState(1159);
				match(OPEN_PAREN);
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (STAR - 50)) | (1L << (DOUBLESTAR - 50)) | (1L << (NAME - 50)))) != 0)) {
					{
					setState(1160);
					params();
					}
				}

				setState(1163);
				match(CLOSE_PAREN);
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(1164);
					match(RARROW);
					setState(1165);
					expression();
					}
				}

				setState(1168);
				match(COLON);
				setState(1170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1169);
					func_type_comment();
					}
					break;
				}
				setState(1172);
				block();
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

	public static class Func_type_commentContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Func_type_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_type_comment; }
	}

	public final Func_type_commentContext func_type_comment() throws RecognitionException {
		Func_type_commentContext _localctx = new Func_type_commentContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_func_type_comment);
		try {
			setState(1179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				match(NEWLINE);
				setState(1176);
				match(TYPE_COMMENT);
				setState(1177);
				if (!(are_(NEWLINE, INDENT))) throw new FailedPredicateException(this, "are_(NEWLINE, INDENT)");
				}
				break;
			case TYPE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				match(TYPE_COMMENT);
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

	public static class ParamsContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			parameters();
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

	public static class ParametersContext extends ParserRuleContext {
		public Slash_no_defaultContext slash_no_default() {
			return getRuleContext(Slash_no_defaultContext.class,0);
		}
		public List<Param_no_defaultContext> param_no_default() {
			return getRuleContexts(Param_no_defaultContext.class);
		}
		public Param_no_defaultContext param_no_default(int i) {
			return getRuleContext(Param_no_defaultContext.class,i);
		}
		public List<Param_with_defaultContext> param_with_default() {
			return getRuleContexts(Param_with_defaultContext.class);
		}
		public Param_with_defaultContext param_with_default(int i) {
			return getRuleContext(Param_with_defaultContext.class,i);
		}
		public Star_etcContext star_etc() {
			return getRuleContext(Star_etcContext.class,0);
		}
		public Slash_with_defaultContext slash_with_default() {
			return getRuleContext(Slash_with_defaultContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_parameters);
		int _la;
		try {
			int _alt;
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				slash_no_default();
				setState(1187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1184);
						param_no_default();
						}
						} 
					}
					setState(1189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1190);
					param_with_default();
					}
					}
					setState(1195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1196);
					star_etc();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				slash_with_default();
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1200);
					param_with_default();
					}
					}
					setState(1205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1206);
					star_etc();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1209);
						param_no_default();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1212); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1214);
					param_with_default();
					}
					}
					setState(1219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1220);
					star_etc();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1223);
					param_with_default();
					}
					}
					setState(1226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1228);
					star_etc();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1231);
				star_etc();
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

	public static class Slash_no_defaultContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public List<Param_no_defaultContext> param_no_default() {
			return getRuleContexts(Param_no_defaultContext.class);
		}
		public Param_no_defaultContext param_no_default(int i) {
			return getRuleContext(Param_no_defaultContext.class,i);
		}
		public Slash_no_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash_no_default; }
	}

	public final Slash_no_defaultContext slash_no_default() throws RecognitionException {
		Slash_no_defaultContext _localctx = new Slash_no_defaultContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_slash_no_default);
		int _la;
		try {
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1234);
					param_no_default();
					}
					}
					setState(1237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1239);
				match(SLASH);
				setState(1240);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1242);
					param_no_default();
					}
					}
					setState(1245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1247);
				match(SLASH);
				setState(1248);
				if (!(is_(CLOSE_PAREN))) throw new FailedPredicateException(this, "is_(CLOSE_PAREN)");
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

	public static class Slash_with_defaultContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public List<Param_no_defaultContext> param_no_default() {
			return getRuleContexts(Param_no_defaultContext.class);
		}
		public Param_no_defaultContext param_no_default(int i) {
			return getRuleContext(Param_no_defaultContext.class,i);
		}
		public List<Param_with_defaultContext> param_with_default() {
			return getRuleContexts(Param_with_defaultContext.class);
		}
		public Param_with_defaultContext param_with_default(int i) {
			return getRuleContext(Param_with_defaultContext.class,i);
		}
		public Slash_with_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash_with_default; }
	}

	public final Slash_with_defaultContext slash_with_default() throws RecognitionException {
		Slash_with_defaultContext _localctx = new Slash_with_defaultContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_slash_with_default);
		int _la;
		try {
			int _alt;
			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1252);
						param_no_default();
						}
						} 
					}
					setState(1257);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				setState(1259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1258);
					param_with_default();
					}
					}
					setState(1261); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1263);
				match(SLASH);
				setState(1264);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1266);
						param_no_default();
						}
						} 
					}
					setState(1271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
				}
				setState(1273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1272);
					param_with_default();
					}
					}
					setState(1275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1277);
				match(SLASH);
				setState(1278);
				if (!(is_(CLOSE_PAREN))) throw new FailedPredicateException(this, "is_(CLOSE_PAREN)");
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

	public static class Star_etcContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Param_no_defaultContext param_no_default() {
			return getRuleContext(Param_no_defaultContext.class,0);
		}
		public List<Param_maybe_defaultContext> param_maybe_default() {
			return getRuleContexts(Param_maybe_defaultContext.class);
		}
		public Param_maybe_defaultContext param_maybe_default(int i) {
			return getRuleContext(Param_maybe_defaultContext.class,i);
		}
		public KwdsContext kwds() {
			return getRuleContext(KwdsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Star_etcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_etc; }
	}

	public final Star_etcContext star_etc() throws RecognitionException {
		Star_etcContext _localctx = new Star_etcContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_star_etc);
		int _la;
		try {
			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				match(STAR);
				setState(1283);
				param_no_default();
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1284);
					param_maybe_default();
					}
					}
					setState(1289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(1290);
					kwds();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				match(STAR);
				setState(1294);
				match(COMMA);
				setState(1296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1295);
					param_maybe_default();
					}
					}
					setState(1298); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(1300);
					kwds();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1303);
				kwds();
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

	public static class KwdsContext extends ParserRuleContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public Param_no_defaultContext param_no_default() {
			return getRuleContext(Param_no_defaultContext.class,0);
		}
		public KwdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwds; }
	}

	public final KwdsContext kwds() throws RecognitionException {
		KwdsContext _localctx = new KwdsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_kwds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			match(DOUBLESTAR);
			setState(1307);
			param_no_default();
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

	public static class Param_no_defaultContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Param_no_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_no_default; }
	}

	public final Param_no_defaultContext param_no_default() throws RecognitionException {
		Param_no_defaultContext _localctx = new Param_no_defaultContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_param_no_default);
		int _la;
		try {
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				param();
				setState(1310);
				match(COMMA);
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(1311);
					match(TYPE_COMMENT);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314);
				param();
				setState(1316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1315);
					match(TYPE_COMMENT);
					}
					break;
				}
				setState(1318);
				if (!(is_(CLOSE_PAREN))) throw new FailedPredicateException(this, "is_(CLOSE_PAREN)");
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

	public static class Param_with_defaultContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Default_assignmentContext default_assignment() {
			return getRuleContext(Default_assignmentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Param_with_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_with_default; }
	}

	public final Param_with_defaultContext param_with_default() throws RecognitionException {
		Param_with_defaultContext _localctx = new Param_with_defaultContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_param_with_default);
		int _la;
		try {
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				param();
				setState(1323);
				default_assignment();
				setState(1324);
				match(COMMA);
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(1325);
					match(TYPE_COMMENT);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				param();
				setState(1329);
				default_assignment();
				setState(1331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1330);
					match(TYPE_COMMENT);
					}
					break;
				}
				setState(1333);
				if (!(is_(CLOSE_PAREN))) throw new FailedPredicateException(this, "is_(CLOSE_PAREN)");
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

	public static class Param_maybe_defaultContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Default_assignmentContext default_assignment() {
			return getRuleContext(Default_assignmentContext.class,0);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public Param_maybe_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_maybe_default; }
	}

	public final Param_maybe_defaultContext param_maybe_default() throws RecognitionException {
		Param_maybe_defaultContext _localctx = new Param_maybe_defaultContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_param_maybe_default);
		int _la;
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				param();
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1338);
					default_assignment();
					}
				}

				setState(1341);
				match(COMMA);
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(1342);
					match(TYPE_COMMENT);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				param();
				setState(1347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1346);
					default_assignment();
					}
					break;
				}
				setState(1350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1349);
					match(TYPE_COMMENT);
					}
					break;
				}
				setState(1352);
				if (!(is_(CLOSE_PAREN))) throw new FailedPredicateException(this, "is_(CLOSE_PAREN)");
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(NAME);
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1357);
				annotation();
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(COLON);
			setState(1361);
			expression();
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

	public static class Default_assignmentContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_assignment; }
	}

	public final Default_assignmentContext default_assignment() throws RecognitionException {
		Default_assignmentContext _localctx = new Default_assignmentContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_default_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(EQUAL);
			setState(1364);
			expression();
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

	public static class DecoratorsContext extends ParserRuleContext {
		public List<TerminalNode> AT() { return getTokens(PythonParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(PythonParser.AT, i);
		}
		public List<Named_expressionContext> named_expression() {
			return getRuleContexts(Named_expressionContext.class);
		}
		public Named_expressionContext named_expression(int i) {
			return getRuleContext(Named_expressionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public DecoratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorators; }
	}

	public final DecoratorsContext decorators() throws RecognitionException {
		DecoratorsContext _localctx = new DecoratorsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1366);
				match(AT);
				setState(1367);
				named_expression();
				setState(1368);
				match(NEWLINE);
				}
				}
				setState(1372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
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

	public static class Class_defContext extends ParserRuleContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public Class_def_rawContext class_def_raw() {
			return getRuleContext(Class_def_rawContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_class_def);
		try {
			setState(1378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1374);
				decorators();
				setState(1375);
				class_def_raw();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				class_def_raw();
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

	public static class Class_def_rawContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Class_def_rawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def_raw; }
	}

	public final Class_def_rawContext class_def_raw() throws RecognitionException {
		Class_def_rawContext _localctx = new Class_def_rawContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_class_def_raw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(CLASS);
			setState(1381);
			match(NAME);
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(1382);
				match(OPEN_PAREN);
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << TILDE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (DOUBLESTAR - 66)) | (1L << (ELLIPSIS - 66)) | (1L << (NAME - 66)) | (1L << (NUMBER - 66)) | (1L << (STRING - 66)))) != 0)) {
					{
					setState(1383);
					arguments();
					}
				}

				setState(1386);
				match(CLOSE_PAREN);
				}
			}

			setState(1389);
			match(COLON);
			setState(1390);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_block);
		try {
			setState(1398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1392);
				match(NEWLINE);
				setState(1393);
				match(INDENT);
				setState(1394);
				statements();
				setState(1395);
				match(DEDENT);
				}
				break;
			case FALSE:
			case AWAIT:
			case IMPORT:
			case PASS:
			case NONE:
			case BREAK:
			case RAISE:
			case TRUE:
			case RETURN:
			case CONTINUE:
			case LAMBDA:
			case FROM:
			case NONLOCAL:
			case ASSERT:
			case DEL:
			case GLOBAL:
			case NOT:
			case YIELD:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				simple_stmts();
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

	public static class Star_expressionsContext extends ParserRuleContext {
		public List<Star_expressionContext> star_expression() {
			return getRuleContexts(Star_expressionContext.class);
		}
		public Star_expressionContext star_expression(int i) {
			return getRuleContext(Star_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Star_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expressions; }
	}

	public final Star_expressionsContext star_expressions() throws RecognitionException {
		Star_expressionsContext _localctx = new Star_expressionsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_star_expressions);
		try {
			int _alt;
			setState(1414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1400);
				star_expression();
				setState(1403); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1401);
						match(COMMA);
						setState(1402);
						star_expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1405); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1407);
					match(COMMA);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410);
				star_expression();
				setState(1411);
				match(COMMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				star_expression();
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

	public static class Star_expressionContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Star_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expression; }
	}

	public final Star_expressionContext star_expression() throws RecognitionException {
		Star_expressionContext _localctx = new Star_expressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_star_expression);
		try {
			setState(1419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1416);
				match(STAR);
				setState(1417);
				bitwise_or(0);
				}
				break;
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
				expression();
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

	public static class Star_named_expressionsContext extends ParserRuleContext {
		public List<Star_named_expressionContext> star_named_expression() {
			return getRuleContexts(Star_named_expressionContext.class);
		}
		public Star_named_expressionContext star_named_expression(int i) {
			return getRuleContext(Star_named_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Star_named_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_named_expressions; }
	}

	public final Star_named_expressionsContext star_named_expressions() throws RecognitionException {
		Star_named_expressionsContext _localctx = new Star_named_expressionsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_star_named_expressions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			star_named_expression();
			setState(1426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1422);
					match(COMMA);
					setState(1423);
					star_named_expression();
					}
					} 
				}
				setState(1428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			setState(1430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1429);
				match(COMMA);
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

	public static class Star_named_expressionContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public Star_named_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_named_expression; }
	}

	public final Star_named_expressionContext star_named_expression() throws RecognitionException {
		Star_named_expressionContext _localctx = new Star_named_expressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_star_named_expression);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432);
				match(STAR);
				setState(1433);
				bitwise_or(0);
				}
				break;
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				named_expression();
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode COLONEQUAL() { return getToken(PythonParser.COLONEQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(NAME);
			setState(1438);
			match(COLONEQUAL);
			setState(1439);
			expression();
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

	public static class Named_expressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Named_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_expression; }
	}

	public final Named_expressionContext named_expression() throws RecognitionException {
		Named_expressionContext _localctx = new Named_expressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_named_expression);
		try {
			setState(1445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1441);
				assignment_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				expression();
				setState(1443);
				if (!(isnot_(COLONEQUAL))) throw new FailedPredicateException(this, "isnot_(COLONEQUAL)");
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

	public static class Annotated_rhsContext extends ParserRuleContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public Annotated_rhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotated_rhs; }
	}

	public final Annotated_rhsContext annotated_rhs() throws RecognitionException {
		Annotated_rhsContext _localctx = new Annotated_rhsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_annotated_rhs);
		try {
			setState(1449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				yield_expr();
				}
				break;
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1448);
				star_expressions();
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_expressions);
		int _la;
		try {
			int _alt;
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1451);
				expression();
				setState(1454); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1452);
						match(COMMA);
						setState(1453);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1456); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1458);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				expression();
				setState(1462);
				match(COMMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1464);
				expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdefContext lambdef() {
			return getRuleContext(LambdefContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_expression);
		try {
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1467);
				disjunction();
				setState(1468);
				match(IF);
				setState(1469);
				disjunction();
				setState(1470);
				match(ELSE);
				setState(1471);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				disjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1474);
				lambdef();
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

	public static class LambdefContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(PythonParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Lambda_paramsContext lambda_params() {
			return getRuleContext(Lambda_paramsContext.class,0);
		}
		public LambdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef; }
	}

	public final LambdefContext lambdef() throws RecognitionException {
		LambdefContext _localctx = new LambdefContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_lambdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(LAMBDA);
			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (STAR - 50)) | (1L << (DOUBLESTAR - 50)) | (1L << (NAME - 50)))) != 0)) {
				{
				setState(1478);
				lambda_params();
				}
			}

			setState(1481);
			match(COLON);
			setState(1482);
			expression();
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

	public static class Lambda_paramsContext extends ParserRuleContext {
		public Lambda_parametersContext lambda_parameters() {
			return getRuleContext(Lambda_parametersContext.class,0);
		}
		public Lambda_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_params; }
	}

	public final Lambda_paramsContext lambda_params() throws RecognitionException {
		Lambda_paramsContext _localctx = new Lambda_paramsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_lambda_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			lambda_parameters();
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

	public static class Lambda_parametersContext extends ParserRuleContext {
		public Lambda_slash_no_defaultContext lambda_slash_no_default() {
			return getRuleContext(Lambda_slash_no_defaultContext.class,0);
		}
		public List<Lambda_param_no_defaultContext> lambda_param_no_default() {
			return getRuleContexts(Lambda_param_no_defaultContext.class);
		}
		public Lambda_param_no_defaultContext lambda_param_no_default(int i) {
			return getRuleContext(Lambda_param_no_defaultContext.class,i);
		}
		public List<Lambda_param_with_defaultContext> lambda_param_with_default() {
			return getRuleContexts(Lambda_param_with_defaultContext.class);
		}
		public Lambda_param_with_defaultContext lambda_param_with_default(int i) {
			return getRuleContext(Lambda_param_with_defaultContext.class,i);
		}
		public Lambda_star_etcContext lambda_star_etc() {
			return getRuleContext(Lambda_star_etcContext.class,0);
		}
		public Lambda_slash_with_defaultContext lambda_slash_with_default() {
			return getRuleContext(Lambda_slash_with_defaultContext.class,0);
		}
		public Lambda_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_parameters; }
	}

	public final Lambda_parametersContext lambda_parameters() throws RecognitionException {
		Lambda_parametersContext _localctx = new Lambda_parametersContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_lambda_parameters);
		int _la;
		try {
			int _alt;
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				lambda_slash_no_default();
				setState(1490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1487);
						lambda_param_no_default();
						}
						} 
					}
					setState(1492);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1493);
					lambda_param_with_default();
					}
					}
					setState(1498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1499);
					lambda_star_etc();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1502);
				lambda_slash_with_default();
				setState(1506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1503);
					lambda_param_with_default();
					}
					}
					setState(1508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1509);
					lambda_star_etc();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1513); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1512);
						lambda_param_no_default();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1515); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1517);
					lambda_param_with_default();
					}
					}
					setState(1522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1523);
					lambda_star_etc();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1527); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1526);
					lambda_param_with_default();
					}
					}
					setState(1529); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1531);
					lambda_star_etc();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1534);
				lambda_star_etc();
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

	public static class Lambda_slash_no_defaultContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public List<Lambda_param_no_defaultContext> lambda_param_no_default() {
			return getRuleContexts(Lambda_param_no_defaultContext.class);
		}
		public Lambda_param_no_defaultContext lambda_param_no_default(int i) {
			return getRuleContext(Lambda_param_no_defaultContext.class,i);
		}
		public Lambda_slash_no_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_slash_no_default; }
	}

	public final Lambda_slash_no_defaultContext lambda_slash_no_default() throws RecognitionException {
		Lambda_slash_no_defaultContext _localctx = new Lambda_slash_no_defaultContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_lambda_slash_no_default);
		int _la;
		try {
			setState(1553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1537);
					lambda_param_no_default();
					}
					}
					setState(1540); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1542);
				match(SLASH);
				setState(1543);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1546); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1545);
					lambda_param_no_default();
					}
					}
					setState(1548); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1550);
				match(SLASH);
				setState(1551);
				if (!(is_(COLON))) throw new FailedPredicateException(this, "is_(COLON)");
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

	public static class Lambda_slash_with_defaultContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public List<Lambda_param_no_defaultContext> lambda_param_no_default() {
			return getRuleContexts(Lambda_param_no_defaultContext.class);
		}
		public Lambda_param_no_defaultContext lambda_param_no_default(int i) {
			return getRuleContext(Lambda_param_no_defaultContext.class,i);
		}
		public List<Lambda_param_with_defaultContext> lambda_param_with_default() {
			return getRuleContexts(Lambda_param_with_defaultContext.class);
		}
		public Lambda_param_with_defaultContext lambda_param_with_default(int i) {
			return getRuleContext(Lambda_param_with_defaultContext.class,i);
		}
		public Lambda_slash_with_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_slash_with_default; }
	}

	public final Lambda_slash_with_defaultContext lambda_slash_with_default() throws RecognitionException {
		Lambda_slash_with_defaultContext _localctx = new Lambda_slash_with_defaultContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_lambda_slash_with_default);
		int _la;
		try {
			int _alt;
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1555);
						lambda_param_no_default();
						}
						} 
					}
					setState(1560);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				setState(1562); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1561);
					lambda_param_with_default();
					}
					}
					setState(1564); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1566);
				match(SLASH);
				setState(1567);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1569);
						lambda_param_no_default();
						}
						} 
					}
					setState(1574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1576); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1575);
					lambda_param_with_default();
					}
					}
					setState(1578); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1580);
				match(SLASH);
				setState(1581);
				if (!(is_(COLON))) throw new FailedPredicateException(this, "is_(COLON)");
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

	public static class Lambda_star_etcContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Lambda_param_no_defaultContext lambda_param_no_default() {
			return getRuleContext(Lambda_param_no_defaultContext.class,0);
		}
		public List<Lambda_param_maybe_defaultContext> lambda_param_maybe_default() {
			return getRuleContexts(Lambda_param_maybe_defaultContext.class);
		}
		public Lambda_param_maybe_defaultContext lambda_param_maybe_default(int i) {
			return getRuleContext(Lambda_param_maybe_defaultContext.class,i);
		}
		public Lambda_kwdsContext lambda_kwds() {
			return getRuleContext(Lambda_kwdsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Lambda_star_etcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_star_etc; }
	}

	public final Lambda_star_etcContext lambda_star_etc() throws RecognitionException {
		Lambda_star_etcContext _localctx = new Lambda_star_etcContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_lambda_star_etc);
		int _la;
		try {
			setState(1607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1585);
				match(STAR);
				setState(1586);
				lambda_param_no_default();
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(1587);
					lambda_param_maybe_default();
					}
					}
					setState(1592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(1593);
					lambda_kwds();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				match(STAR);
				setState(1597);
				match(COMMA);
				setState(1599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1598);
					lambda_param_maybe_default();
					}
					}
					setState(1601); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(1603);
					lambda_kwds();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1606);
				lambda_kwds();
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

	public static class Lambda_kwdsContext extends ParserRuleContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public Lambda_param_no_defaultContext lambda_param_no_default() {
			return getRuleContext(Lambda_param_no_defaultContext.class,0);
		}
		public Lambda_kwdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_kwds; }
	}

	public final Lambda_kwdsContext lambda_kwds() throws RecognitionException {
		Lambda_kwdsContext _localctx = new Lambda_kwdsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_lambda_kwds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			match(DOUBLESTAR);
			setState(1610);
			lambda_param_no_default();
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

	public static class Lambda_param_no_defaultContext extends ParserRuleContext {
		public Lambda_paramContext lambda_param() {
			return getRuleContext(Lambda_paramContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Lambda_param_no_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_param_no_default; }
	}

	public final Lambda_param_no_defaultContext lambda_param_no_default() throws RecognitionException {
		Lambda_param_no_defaultContext _localctx = new Lambda_param_no_defaultContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_lambda_param_no_default);
		try {
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				lambda_param();
				setState(1613);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1615);
				lambda_param();
				setState(1616);
				if (!(is_(COLON))) throw new FailedPredicateException(this, "is_(COLON)");
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

	public static class Lambda_param_with_defaultContext extends ParserRuleContext {
		public Lambda_paramContext lambda_param() {
			return getRuleContext(Lambda_paramContext.class,0);
		}
		public Default_assignmentContext default_assignment() {
			return getRuleContext(Default_assignmentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Lambda_param_with_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_param_with_default; }
	}

	public final Lambda_param_with_defaultContext lambda_param_with_default() throws RecognitionException {
		Lambda_param_with_defaultContext _localctx = new Lambda_param_with_defaultContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_lambda_param_with_default);
		try {
			setState(1628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1620);
				lambda_param();
				setState(1621);
				default_assignment();
				setState(1622);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1624);
				lambda_param();
				setState(1625);
				default_assignment();
				setState(1626);
				if (!(is_(COLON))) throw new FailedPredicateException(this, "is_(COLON)");
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

	public static class Lambda_param_maybe_defaultContext extends ParserRuleContext {
		public Lambda_paramContext lambda_param() {
			return getRuleContext(Lambda_paramContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Default_assignmentContext default_assignment() {
			return getRuleContext(Default_assignmentContext.class,0);
		}
		public Lambda_param_maybe_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_param_maybe_default; }
	}

	public final Lambda_param_maybe_defaultContext lambda_param_maybe_default() throws RecognitionException {
		Lambda_param_maybe_defaultContext _localctx = new Lambda_param_maybe_defaultContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_lambda_param_maybe_default);
		int _la;
		try {
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1630);
				lambda_param();
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1631);
					default_assignment();
					}
				}

				setState(1634);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				lambda_param();
				setState(1638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1637);
					default_assignment();
					}
					break;
				}
				setState(1640);
				if (!(is_(COLON))) throw new FailedPredicateException(this, "is_(COLON)");
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

	public static class Lambda_paramContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Lambda_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_param; }
	}

	public final Lambda_paramContext lambda_param() throws RecognitionException {
		Lambda_paramContext _localctx = new Lambda_paramContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_lambda_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(NAME);
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

	public static class DisjunctionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PythonParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PythonParser.OR, i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_disjunction);
		try {
			int _alt;
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646);
				conjunction();
				setState(1649); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1647);
						match(OR);
						setState(1648);
						conjunction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1651); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1653);
				conjunction();
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<InversionContext> inversion() {
			return getRuleContexts(InversionContext.class);
		}
		public InversionContext inversion(int i) {
			return getRuleContext(InversionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PythonParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PythonParser.AND, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_conjunction);
		try {
			int _alt;
			setState(1664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1656);
				inversion();
				setState(1659); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1657);
						match(AND);
						setState(1658);
						inversion();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1661); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				inversion();
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

	public static class InversionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public InversionContext inversion() {
			return getRuleContext(InversionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public InversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inversion; }
	}

	public final InversionContext inversion() throws RecognitionException {
		InversionContext _localctx = new InversionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_inversion);
		try {
			setState(1669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666);
				match(NOT);
				setState(1667);
				inversion();
				}
				break;
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1668);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public List<Compare_op_bitwise_or_pairContext> compare_op_bitwise_or_pair() {
			return getRuleContexts(Compare_op_bitwise_or_pairContext.class);
		}
		public Compare_op_bitwise_or_pairContext compare_op_bitwise_or_pair(int i) {
			return getRuleContext(Compare_op_bitwise_or_pairContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_comparison);
		try {
			int _alt;
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1671);
				bitwise_or(0);
				setState(1673); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1672);
						compare_op_bitwise_or_pair();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1675); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1677);
				bitwise_or(0);
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

	public static class Compare_op_bitwise_or_pairContext extends ParserRuleContext {
		public Eq_bitwise_orContext eq_bitwise_or() {
			return getRuleContext(Eq_bitwise_orContext.class,0);
		}
		public Noteq_bitwise_orContext noteq_bitwise_or() {
			return getRuleContext(Noteq_bitwise_orContext.class,0);
		}
		public Lte_bitwise_orContext lte_bitwise_or() {
			return getRuleContext(Lte_bitwise_orContext.class,0);
		}
		public Lt_bitwise_orContext lt_bitwise_or() {
			return getRuleContext(Lt_bitwise_orContext.class,0);
		}
		public Gte_bitwise_orContext gte_bitwise_or() {
			return getRuleContext(Gte_bitwise_orContext.class,0);
		}
		public Gt_bitwise_orContext gt_bitwise_or() {
			return getRuleContext(Gt_bitwise_orContext.class,0);
		}
		public Notin_bitwise_orContext notin_bitwise_or() {
			return getRuleContext(Notin_bitwise_orContext.class,0);
		}
		public In_bitwise_orContext in_bitwise_or() {
			return getRuleContext(In_bitwise_orContext.class,0);
		}
		public Isnot_bitwise_orContext isnot_bitwise_or() {
			return getRuleContext(Isnot_bitwise_orContext.class,0);
		}
		public Is_bitwise_orContext is_bitwise_or() {
			return getRuleContext(Is_bitwise_orContext.class,0);
		}
		public Compare_op_bitwise_or_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_op_bitwise_or_pair; }
	}

	public final Compare_op_bitwise_or_pairContext compare_op_bitwise_or_pair() throws RecognitionException {
		Compare_op_bitwise_or_pairContext _localctx = new Compare_op_bitwise_or_pairContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_compare_op_bitwise_or_pair);
		try {
			setState(1690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				eq_bitwise_or();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				noteq_bitwise_or();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1682);
				lte_bitwise_or();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1683);
				lt_bitwise_or();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1684);
				gte_bitwise_or();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1685);
				gt_bitwise_or();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1686);
				notin_bitwise_or();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1687);
				in_bitwise_or();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1688);
				isnot_bitwise_or();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1689);
				is_bitwise_or();
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

	public static class Eq_bitwise_orContext extends ParserRuleContext {
		public TerminalNode EQEQUAL() { return getToken(PythonParser.EQEQUAL, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Eq_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_bitwise_or; }
	}

	public final Eq_bitwise_orContext eq_bitwise_or() throws RecognitionException {
		Eq_bitwise_orContext _localctx = new Eq_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_eq_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			match(EQEQUAL);
			setState(1693);
			bitwise_or(0);
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

	public static class Noteq_bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public TerminalNode NOTEQUAL() { return getToken(PythonParser.NOTEQUAL, 0); }
		public Noteq_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteq_bitwise_or; }
	}

	public final Noteq_bitwise_orContext noteq_bitwise_or() throws RecognitionException {
		Noteq_bitwise_orContext _localctx = new Noteq_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_noteq_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1695);
			match(NOTEQUAL);
			}
			setState(1696);
			bitwise_or(0);
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

	public static class Lte_bitwise_orContext extends ParserRuleContext {
		public TerminalNode LESSEQUAL() { return getToken(PythonParser.LESSEQUAL, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Lte_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lte_bitwise_or; }
	}

	public final Lte_bitwise_orContext lte_bitwise_or() throws RecognitionException {
		Lte_bitwise_orContext _localctx = new Lte_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_lte_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			match(LESSEQUAL);
			setState(1699);
			bitwise_or(0);
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

	public static class Lt_bitwise_orContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(PythonParser.LESS, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Lt_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt_bitwise_or; }
	}

	public final Lt_bitwise_orContext lt_bitwise_or() throws RecognitionException {
		Lt_bitwise_orContext _localctx = new Lt_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_lt_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			match(LESS);
			setState(1702);
			bitwise_or(0);
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

	public static class Gte_bitwise_orContext extends ParserRuleContext {
		public TerminalNode GREATEREQUAL() { return getToken(PythonParser.GREATEREQUAL, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Gte_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gte_bitwise_or; }
	}

	public final Gte_bitwise_orContext gte_bitwise_or() throws RecognitionException {
		Gte_bitwise_orContext _localctx = new Gte_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_gte_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(GREATEREQUAL);
			setState(1705);
			bitwise_or(0);
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

	public static class Gt_bitwise_orContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(PythonParser.GREATER, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Gt_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt_bitwise_or; }
	}

	public final Gt_bitwise_orContext gt_bitwise_or() throws RecognitionException {
		Gt_bitwise_orContext _localctx = new Gt_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_gt_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			match(GREATER);
			setState(1708);
			bitwise_or(0);
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

	public static class Notin_bitwise_orContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Notin_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notin_bitwise_or; }
	}

	public final Notin_bitwise_orContext notin_bitwise_or() throws RecognitionException {
		Notin_bitwise_orContext _localctx = new Notin_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_notin_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			match(NOT);
			setState(1711);
			match(IN);
			setState(1712);
			bitwise_or(0);
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

	public static class In_bitwise_orContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public In_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_bitwise_or; }
	}

	public final In_bitwise_orContext in_bitwise_or() throws RecognitionException {
		In_bitwise_orContext _localctx = new In_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_in_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			match(IN);
			setState(1715);
			bitwise_or(0);
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

	public static class Isnot_bitwise_orContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Isnot_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isnot_bitwise_or; }
	}

	public final Isnot_bitwise_orContext isnot_bitwise_or() throws RecognitionException {
		Isnot_bitwise_orContext _localctx = new Isnot_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_isnot_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			match(IS);
			setState(1718);
			match(NOT);
			setState(1719);
			bitwise_or(0);
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

	public static class Is_bitwise_orContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public Is_bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_bitwise_or; }
	}

	public final Is_bitwise_orContext is_bitwise_or() throws RecognitionException {
		Is_bitwise_orContext _localctx = new Is_bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_is_bitwise_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			match(IS);
			setState(1722);
			bitwise_or(0);
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

	public static class Bitwise_orContext extends ParserRuleContext {
		public Bitwise_xorContext bitwise_xor() {
			return getRuleContext(Bitwise_xorContext.class,0);
		}
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public TerminalNode VBAR() { return getToken(PythonParser.VBAR, 0); }
		public Bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_or; }
	}

	public final Bitwise_orContext bitwise_or() throws RecognitionException {
		return bitwise_or(0);
	}

	private Bitwise_orContext bitwise_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_orContext _localctx = new Bitwise_orContext(_ctx, _parentState);
		Bitwise_orContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_bitwise_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1725);
			bitwise_xor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bitwise_orContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_or);
					setState(1727);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1728);
					match(VBAR);
					setState(1729);
					bitwise_xor(0);
					}
					} 
				}
				setState(1734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
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

	public static class Bitwise_xorContext extends ParserRuleContext {
		public Bitwise_andContext bitwise_and() {
			return getRuleContext(Bitwise_andContext.class,0);
		}
		public Bitwise_xorContext bitwise_xor() {
			return getRuleContext(Bitwise_xorContext.class,0);
		}
		public TerminalNode CIRCUMFLEX() { return getToken(PythonParser.CIRCUMFLEX, 0); }
		public Bitwise_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_xor; }
	}

	public final Bitwise_xorContext bitwise_xor() throws RecognitionException {
		return bitwise_xor(0);
	}

	private Bitwise_xorContext bitwise_xor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_xorContext _localctx = new Bitwise_xorContext(_ctx, _parentState);
		Bitwise_xorContext _prevctx = _localctx;
		int _startState = 262;
		enterRecursionRule(_localctx, 262, RULE_bitwise_xor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1736);
			bitwise_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bitwise_xorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_xor);
					setState(1738);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1739);
					match(CIRCUMFLEX);
					setState(1740);
					bitwise_and(0);
					}
					} 
				}
				setState(1745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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

	public static class Bitwise_andContext extends ParserRuleContext {
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public Bitwise_andContext bitwise_and() {
			return getRuleContext(Bitwise_andContext.class,0);
		}
		public TerminalNode AMPER() { return getToken(PythonParser.AMPER, 0); }
		public Bitwise_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_and; }
	}

	public final Bitwise_andContext bitwise_and() throws RecognitionException {
		return bitwise_and(0);
	}

	private Bitwise_andContext bitwise_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bitwise_andContext _localctx = new Bitwise_andContext(_ctx, _parentState);
		Bitwise_andContext _prevctx = _localctx;
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_bitwise_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1747);
			shift_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bitwise_andContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitwise_and);
					setState(1749);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1750);
					match(AMPER);
					setState(1751);
					shift_expr(0);
					}
					} 
				}
				setState(1756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
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

	public static class Shift_exprContext extends ParserRuleContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public TerminalNode LEFTSHIFT() { return getToken(PythonParser.LEFTSHIFT, 0); }
		public TerminalNode RIGHTSHIFT() { return getToken(PythonParser.RIGHTSHIFT, 0); }
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		return shift_expr(0);
	}

	private Shift_exprContext shift_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, _parentState);
		Shift_exprContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_shift_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1758);
			sum(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1766);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
					case 1:
						{
						_localctx = new Shift_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expr);
						setState(1760);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1761);
						match(LEFTSHIFT);
						setState(1762);
						sum(0);
						}
						break;
					case 2:
						{
						_localctx = new Shift_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expr);
						setState(1763);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1764);
						match(RIGHTSHIFT);
						setState(1765);
						sum(0);
						}
						break;
					}
					} 
				}
				setState(1770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
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

	public static class SumContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
	}

	public final SumContext sum() throws RecognitionException {
		return sum(0);
	}

	private SumContext sum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumContext _localctx = new SumContext(_ctx, _parentState);
		SumContext _prevctx = _localctx;
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_sum, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1772);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1780);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(1774);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1775);
						match(PLUS);
						setState(1776);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(1777);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1778);
						match(MINUS);
						setState(1779);
						term(0);
						}
						break;
					}
					} 
				}
				setState(1784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public TerminalNode DOUBLESLASH() { return getToken(PythonParser.DOUBLESLASH, 0); }
		public TerminalNode PERCENT() { return getToken(PythonParser.PERCENT, 0); }
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 270;
		enterRecursionRule(_localctx, 270, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1786);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(1805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1803);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(1788);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1789);
						match(STAR);
						setState(1790);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(1791);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1792);
						match(SLASH);
						setState(1793);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(1794);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1795);
						match(DOUBLESLASH);
						setState(1796);
						factor();
						}
						break;
					case 4:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(1797);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1798);
						match(PERCENT);
						setState(1799);
						factor();
						}
						break;
					case 5:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(1800);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1801);
						match(AT);
						setState(1802);
						factor();
						}
						break;
					}
					} 
				}
				setState(1807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(PythonParser.TILDE, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_factor);
		try {
			setState(1815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1808);
				match(PLUS);
				setState(1809);
				factor();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1810);
				match(MINUS);
				setState(1811);
				factor();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1812);
				match(TILDE);
				setState(1813);
				factor();
				}
				break;
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1814);
				power();
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

	public static class PowerContext extends ParserRuleContext {
		public Await_primaryContext await_primary() {
			return getRuleContext(Await_primaryContext.class,0);
		}
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_power);
		try {
			setState(1822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817);
				await_primary();
				setState(1818);
				match(DOUBLESTAR);
				setState(1819);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1821);
				await_primary();
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

	public static class Await_primaryContext extends ParserRuleContext {
		public TerminalNode AWAIT() { return getToken(PythonParser.AWAIT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Await_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_await_primary; }
	}

	public final Await_primaryContext await_primary() throws RecognitionException {
		Await_primaryContext _localctx = new Await_primaryContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_await_primary);
		try {
			setState(1827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1824);
				match(AWAIT);
				setState(1825);
				primary(0);
				}
				break;
			case FALSE:
			case NONE:
			case TRUE:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1826);
				primary(0);
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

	public static class PrimaryContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		return primary(0);
	}

	private PrimaryContext primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryContext _localctx = new PrimaryContext(_ctx, _parentState);
		PrimaryContext _prevctx = _localctx;
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1830);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(1850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1848);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1832);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1833);
						match(DOT);
						setState(1834);
						match(NAME);
						}
						break;
					case 2:
						{
						_localctx = new PrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1835);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1836);
						genexp();
						}
						break;
					case 3:
						{
						_localctx = new PrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1837);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1838);
						match(OPEN_PAREN);
						setState(1840);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << TILDE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (DOUBLESTAR - 66)) | (1L << (ELLIPSIS - 66)) | (1L << (NAME - 66)) | (1L << (NUMBER - 66)) | (1L << (STRING - 66)))) != 0)) {
							{
							setState(1839);
							arguments();
							}
						}

						setState(1842);
						match(CLOSE_PAREN);
						}
						break;
					case 4:
						{
						_localctx = new PrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1843);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1844);
						match(OPEN_BRACK);
						setState(1845);
						slices();
						setState(1846);
						match(CLOSE_BRACK);
						}
						break;
					}
					} 
				}
				setState(1852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
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

	public static class SlicesContext extends ParserRuleContext {
		public List<SliceContext> slice() {
			return getRuleContexts(SliceContext.class);
		}
		public SliceContext slice(int i) {
			return getRuleContext(SliceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public SlicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slices; }
	}

	public final SlicesContext slices() throws RecognitionException {
		SlicesContext _localctx = new SlicesContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_slices);
		int _la;
		try {
			int _alt;
			setState(1867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1853);
				slice();
				setState(1854);
				if (!(isnot_(COMMA))) throw new FailedPredicateException(this, "isnot_(COMMA)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1856);
				slice();
				setState(1861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1857);
						match(COMMA);
						setState(1858);
						slice();
						}
						} 
					}
					setState(1863);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				}
				setState(1865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1864);
					match(COMMA);
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

	public static class SliceContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_slice);
		int _la;
		try {
			setState(1883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ELLIPSIS - 83)) | (1L << (NAME - 83)) | (1L << (NUMBER - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(1869);
					expression();
					}
				}

				setState(1872);
				match(COLON);
				setState(1874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1873);
					expression();
					}
					break;
				}
				setState(1880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1876);
					match(COLON);
					setState(1878);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
					case 1:
						{
						setState(1877);
						expression();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882);
				named_expression();
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListcompContext listcomp() {
			return getRuleContext(ListcompContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public DictcompContext dictcomp() {
			return getRuleContext(DictcompContext.class,0);
		}
		public SetcompContext setcomp() {
			return getRuleContext(SetcompContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(PythonParser.ELLIPSIS, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_atom);
		try {
			setState(1907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1885);
				match(NAME);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1886);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1887);
				match(FALSE);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1888);
				match(NONE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(1889);
				strings();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 6);
				{
				setState(1890);
				match(NUMBER);
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1891);
					tuple();
					}
					break;
				case 2:
					{
					setState(1892);
					group();
					}
					break;
				case 3:
					{
					setState(1893);
					genexp();
					}
					break;
				}
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(1898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1896);
					list();
					}
					break;
				case 2:
					{
					setState(1897);
					listcomp();
					}
					break;
				}
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1900);
					dict();
					}
					break;
				case 2:
					{
					setState(1901);
					set();
					}
					break;
				case 3:
					{
					setState(1902);
					dictcomp();
					}
					break;
				case 4:
					{
					setState(1903);
					setcomp();
					}
					break;
				}
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 10);
				{
				setState(1906);
				match(ELLIPSIS);
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

	public static class StringsContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(PythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PythonParser.STRING, i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_strings);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1910); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1909);
					match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1912); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public Star_named_expressionsContext star_named_expressions() {
			return getRuleContext(Star_named_expressionsContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			match(OPEN_BRACK);
			setState(1916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << TILDE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ELLIPSIS - 83)) | (1L << (NAME - 83)) | (1L << (NUMBER - 83)) | (1L << (STRING - 83)))) != 0)) {
				{
				setState(1915);
				star_named_expressions();
				}
			}

			setState(1918);
			match(CLOSE_BRACK);
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

	public static class ListcompContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public ListcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listcomp; }
	}

	public final ListcompContext listcomp() throws RecognitionException {
		ListcompContext _localctx = new ListcompContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_listcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			match(OPEN_BRACK);
			setState(1921);
			named_expression();
			setState(1922);
			for_if_clauses();
			setState(1923);
			match(CLOSE_BRACK);
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

	public static class TupleContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Star_named_expressionContext star_named_expression() {
			return getRuleContext(Star_named_expressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Star_named_expressionsContext star_named_expressions() {
			return getRuleContext(Star_named_expressionsContext.class,0);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			match(OPEN_PAREN);
			setState(1931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << TILDE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ELLIPSIS - 83)) | (1L << (NAME - 83)) | (1L << (NUMBER - 83)) | (1L << (STRING - 83)))) != 0)) {
				{
				setState(1926);
				star_named_expression();
				setState(1927);
				match(COMMA);
				setState(1929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << TILDE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ELLIPSIS - 83)) | (1L << (NAME - 83)) | (1L << (NUMBER - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(1928);
					star_named_expressions();
					}
				}

				}
			}

			setState(1933);
			match(CLOSE_PAREN);
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

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			match(OPEN_PAREN);
			setState(1938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(1936);
				yield_expr();
				}
				break;
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				{
				setState(1937);
				named_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1940);
			match(CLOSE_PAREN);
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

	public static class GenexpContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GenexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genexp; }
	}

	public final GenexpContext genexp() throws RecognitionException {
		GenexpContext _localctx = new GenexpContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_genexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			match(OPEN_PAREN);
			setState(1947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1943);
				assignment_expression();
				}
				break;
			case 2:
				{
				setState(1944);
				expression();
				setState(1945);
				if (!(isnot_(COLONEQUAL))) throw new FailedPredicateException(this, "isnot_(COLONEQUAL)");
				}
				break;
			}
			setState(1949);
			for_if_clauses();
			setState(1950);
			match(CLOSE_PAREN);
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(PythonParser.OPEN_BRACE, 0); }
		public Star_named_expressionsContext star_named_expressions() {
			return getRuleContext(Star_named_expressionsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PythonParser.CLOSE_BRACE, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			match(OPEN_BRACE);
			setState(1953);
			star_named_expressions();
			setState(1954);
			match(CLOSE_BRACE);
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

	public static class SetcompContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(PythonParser.OPEN_BRACE, 0); }
		public Named_expressionContext named_expression() {
			return getRuleContext(Named_expressionContext.class,0);
		}
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PythonParser.CLOSE_BRACE, 0); }
		public SetcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setcomp; }
	}

	public final SetcompContext setcomp() throws RecognitionException {
		SetcompContext _localctx = new SetcompContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_setcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
			match(OPEN_BRACE);
			setState(1957);
			named_expression();
			setState(1958);
			for_if_clauses();
			setState(1959);
			match(CLOSE_BRACE);
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

	public static class DictContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(PythonParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PythonParser.CLOSE_BRACE, 0); }
		public Double_starred_kvpairsContext double_starred_kvpairs() {
			return getRuleContext(Double_starred_kvpairsContext.class,0);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			match(OPEN_BRACE);
			setState(1963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (DOUBLESTAR - 66)) | (1L << (ELLIPSIS - 66)) | (1L << (NAME - 66)) | (1L << (NUMBER - 66)) | (1L << (STRING - 66)))) != 0)) {
				{
				setState(1962);
				double_starred_kvpairs();
				}
			}

			setState(1965);
			match(CLOSE_BRACE);
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

	public static class DictcompContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(PythonParser.OPEN_BRACE, 0); }
		public KvpairContext kvpair() {
			return getRuleContext(KvpairContext.class,0);
		}
		public For_if_clausesContext for_if_clauses() {
			return getRuleContext(For_if_clausesContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PythonParser.CLOSE_BRACE, 0); }
		public DictcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictcomp; }
	}

	public final DictcompContext dictcomp() throws RecognitionException {
		DictcompContext _localctx = new DictcompContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_dictcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			match(OPEN_BRACE);
			setState(1968);
			kvpair();
			setState(1969);
			for_if_clauses();
			setState(1970);
			match(CLOSE_BRACE);
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

	public static class Double_starred_kvpairsContext extends ParserRuleContext {
		public List<Double_starred_kvpairContext> double_starred_kvpair() {
			return getRuleContexts(Double_starred_kvpairContext.class);
		}
		public Double_starred_kvpairContext double_starred_kvpair(int i) {
			return getRuleContext(Double_starred_kvpairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Double_starred_kvpairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_starred_kvpairs; }
	}

	public final Double_starred_kvpairsContext double_starred_kvpairs() throws RecognitionException {
		Double_starred_kvpairsContext _localctx = new Double_starred_kvpairsContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_double_starred_kvpairs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			double_starred_kvpair();
			setState(1977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1973);
					match(COMMA);
					setState(1974);
					double_starred_kvpair();
					}
					} 
				}
				setState(1979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			setState(1981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1980);
				match(COMMA);
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

	public static class Double_starred_kvpairContext extends ParserRuleContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public Bitwise_orContext bitwise_or() {
			return getRuleContext(Bitwise_orContext.class,0);
		}
		public KvpairContext kvpair() {
			return getRuleContext(KvpairContext.class,0);
		}
		public Double_starred_kvpairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_starred_kvpair; }
	}

	public final Double_starred_kvpairContext double_starred_kvpair() throws RecognitionException {
		Double_starred_kvpairContext _localctx = new Double_starred_kvpairContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_double_starred_kvpair);
		try {
			setState(1986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLESTAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1983);
				match(DOUBLESTAR);
				setState(1984);
				bitwise_or(0);
				}
				break;
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				kvpair();
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

	public static class KvpairContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public KvpairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kvpair; }
	}

	public final KvpairContext kvpair() throws RecognitionException {
		KvpairContext _localctx = new KvpairContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_kvpair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			expression();
			setState(1989);
			match(COLON);
			setState(1990);
			expression();
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

	public static class For_if_clausesContext extends ParserRuleContext {
		public List<For_if_clauseContext> for_if_clause() {
			return getRuleContexts(For_if_clauseContext.class);
		}
		public For_if_clauseContext for_if_clause(int i) {
			return getRuleContext(For_if_clauseContext.class,i);
		}
		public For_if_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_if_clauses; }
	}

	public final For_if_clausesContext for_if_clauses() throws RecognitionException {
		For_if_clausesContext _localctx = new For_if_clausesContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_for_if_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1992);
				for_if_clause();
				}
				}
				setState(1995); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FOR || _la==ASYNC );
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

	public static class For_if_clauseContext extends ParserRuleContext {
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public Star_targetsContext star_targets() {
			return getRuleContext(Star_targetsContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(PythonParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PythonParser.IF, i);
		}
		public For_if_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_if_clause; }
	}

	public final For_if_clauseContext for_if_clause() throws RecognitionException {
		For_if_clauseContext _localctx = new For_if_clauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_for_if_clause);
		int _la;
		try {
			setState(2020);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASYNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1997);
				match(ASYNC);
				setState(1998);
				match(FOR);
				setState(1999);
				star_targets();
				setState(2000);
				match(IN);
				setState(2001);
				disjunction();
				setState(2006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IF) {
					{
					{
					setState(2002);
					match(IF);
					setState(2003);
					disjunction();
					}
					}
					setState(2008);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2009);
				match(FOR);
				setState(2010);
				star_targets();
				setState(2011);
				match(IN);
				setState(2012);
				disjunction();
				setState(2017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IF) {
					{
					{
					setState(2013);
					match(IF);
					setState(2014);
					disjunction();
					}
					}
					setState(2019);
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

	public static class Yield_exprContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(PythonParser.YIELD, 0); }
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Star_expressionsContext star_expressions() {
			return getRuleContext(Star_expressionsContext.class,0);
		}
		public Yield_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expr; }
	}

	public final Yield_exprContext yield_expr() throws RecognitionException {
		Yield_exprContext _localctx = new Yield_exprContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_yield_expr);
		try {
			setState(2029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2022);
				match(YIELD);
				setState(2023);
				match(FROM);
				setState(2024);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2025);
				match(YIELD);
				setState(2027);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2026);
					star_expressions();
					}
					break;
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			args();
			setState(2033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2032);
				match(COMMA);
				}
				break;
			}
			setState(2035);
			if (!(is_(CLOSE_PAREN))) throw new FailedPredicateException(this, "is_(CLOSE_PAREN)");
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

	public static class ArgsContext extends ParserRuleContext {
		public List<Starred_expressionContext> starred_expression() {
			return getRuleContexts(Starred_expressionContext.class);
		}
		public Starred_expressionContext starred_expression(int i) {
			return getRuleContext(Starred_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public KwargsContext kwargs() {
			return getRuleContext(KwargsContext.class,0);
		}
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_args);
		try {
			int _alt;
			setState(2070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2046);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2037);
					starred_expression();
					}
					break;
				case FALSE:
				case AWAIT:
				case NONE:
				case TRUE:
				case LAMBDA:
				case NOT:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case OPEN_BRACE:
				case PLUS:
				case MINUS:
				case TILDE:
				case ELLIPSIS:
				case NAME:
				case NUMBER:
				case STRING:
					{
					setState(2042);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
					case 1:
						{
						setState(2038);
						assignment_expression();
						}
						break;
					case 2:
						{
						setState(2039);
						expression();
						setState(2040);
						if (!(isnot_(COLONEQUAL))) throw new FailedPredicateException(this, "isnot_(COLONEQUAL)");
						}
						break;
					}
					setState(2044);
					if (!(isnot_(EQUAL))) throw new FailedPredicateException(this, "isnot_(EQUAL)");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2062);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2048);
						match(COMMA);
						setState(2058);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STAR:
							{
							setState(2049);
							starred_expression();
							}
							break;
						case FALSE:
						case AWAIT:
						case NONE:
						case TRUE:
						case LAMBDA:
						case NOT:
						case OPEN_PAREN:
						case OPEN_BRACK:
						case OPEN_BRACE:
						case PLUS:
						case MINUS:
						case TILDE:
						case ELLIPSIS:
						case NAME:
						case NUMBER:
						case STRING:
							{
							setState(2054);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
							case 1:
								{
								setState(2050);
								assignment_expression();
								}
								break;
							case 2:
								{
								setState(2051);
								expression();
								setState(2052);
								if (!(isnot_(COLONEQUAL))) throw new FailedPredicateException(this, "isnot_(COLONEQUAL)");
								}
								break;
							}
							setState(2056);
							if (!(isnot_(EQUAL))) throw new FailedPredicateException(this, "isnot_(EQUAL)");
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(2064);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
				}
				setState(2067);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2065);
					match(COMMA);
					setState(2066);
					kwargs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2069);
				kwargs();
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

	public static class KwargsContext extends ParserRuleContext {
		public List<Kwarg_or_starredContext> kwarg_or_starred() {
			return getRuleContexts(Kwarg_or_starredContext.class);
		}
		public Kwarg_or_starredContext kwarg_or_starred(int i) {
			return getRuleContext(Kwarg_or_starredContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<Kwarg_or_double_starredContext> kwarg_or_double_starred() {
			return getRuleContexts(Kwarg_or_double_starredContext.class);
		}
		public Kwarg_or_double_starredContext kwarg_or_double_starred(int i) {
			return getRuleContext(Kwarg_or_double_starredContext.class,i);
		}
		public KwargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwargs; }
	}

	public final KwargsContext kwargs() throws RecognitionException {
		KwargsContext _localctx = new KwargsContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_kwargs);
		try {
			int _alt;
			setState(2105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2072);
				kwarg_or_starred();
				setState(2077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2073);
						match(COMMA);
						setState(2074);
						kwarg_or_starred();
						}
						} 
					}
					setState(2079);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
				}
				setState(2080);
				match(COMMA);
				setState(2081);
				kwarg_or_double_starred();
				setState(2086);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2082);
						match(COMMA);
						setState(2083);
						kwarg_or_double_starred();
						}
						} 
					}
					setState(2088);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2089);
				kwarg_or_starred();
				setState(2094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2090);
						match(COMMA);
						setState(2091);
						kwarg_or_starred();
						}
						} 
					}
					setState(2096);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2097);
				kwarg_or_double_starred();
				setState(2102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2098);
						match(COMMA);
						setState(2099);
						kwarg_or_double_starred();
						}
						} 
					}
					setState(2104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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

	public static class Starred_expressionContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Starred_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starred_expression; }
	}

	public final Starred_expressionContext starred_expression() throws RecognitionException {
		Starred_expressionContext _localctx = new Starred_expressionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_starred_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			match(STAR);
			setState(2108);
			expression();
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

	public static class Kwarg_or_starredContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Starred_expressionContext starred_expression() {
			return getRuleContext(Starred_expressionContext.class,0);
		}
		public Kwarg_or_starredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwarg_or_starred; }
	}

	public final Kwarg_or_starredContext kwarg_or_starred() throws RecognitionException {
		Kwarg_or_starredContext _localctx = new Kwarg_or_starredContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_kwarg_or_starred);
		try {
			setState(2114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(2110);
				match(NAME);
				setState(2111);
				match(EQUAL);
				setState(2112);
				expression();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2113);
				starred_expression();
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

	public static class Kwarg_or_double_starredContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public Kwarg_or_double_starredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwarg_or_double_starred; }
	}

	public final Kwarg_or_double_starredContext kwarg_or_double_starred() throws RecognitionException {
		Kwarg_or_double_starredContext _localctx = new Kwarg_or_double_starredContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_kwarg_or_double_starred);
		try {
			setState(2121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(2116);
				match(NAME);
				setState(2117);
				match(EQUAL);
				setState(2118);
				expression();
				}
				break;
			case DOUBLESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2119);
				match(DOUBLESTAR);
				setState(2120);
				expression();
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

	public static class Star_targetsContext extends ParserRuleContext {
		public List<Star_targetContext> star_target() {
			return getRuleContexts(Star_targetContext.class);
		}
		public Star_targetContext star_target(int i) {
			return getRuleContext(Star_targetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Star_targetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_targets; }
	}

	public final Star_targetsContext star_targets() throws RecognitionException {
		Star_targetsContext _localctx = new Star_targetsContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_star_targets);
		int _la;
		try {
			int _alt;
			setState(2137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2123);
				star_target();
				setState(2124);
				if (!(isnot_(COMMA))) throw new FailedPredicateException(this, "isnot_(COMMA)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2126);
				star_target();
				setState(2131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2127);
						match(COMMA);
						setState(2128);
						star_target();
						}
						} 
					}
					setState(2133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				}
				setState(2135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2134);
					match(COMMA);
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

	public static class Star_targets_list_seqContext extends ParserRuleContext {
		public List<Star_targetContext> star_target() {
			return getRuleContexts(Star_targetContext.class);
		}
		public Star_targetContext star_target(int i) {
			return getRuleContext(Star_targetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Star_targets_list_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_targets_list_seq; }
	}

	public final Star_targets_list_seqContext star_targets_list_seq() throws RecognitionException {
		Star_targets_list_seqContext _localctx = new Star_targets_list_seqContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_star_targets_list_seq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			star_target();
			setState(2144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2140);
					match(COMMA);
					setState(2141);
					star_target();
					}
					} 
				}
				setState(2146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			}
			setState(2148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2147);
				match(COMMA);
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

	public static class Star_targets_tuple_seqContext extends ParserRuleContext {
		public List<Star_targetContext> star_target() {
			return getRuleContexts(Star_targetContext.class);
		}
		public Star_targetContext star_target(int i) {
			return getRuleContext(Star_targetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Star_targets_tuple_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_targets_tuple_seq; }
	}

	public final Star_targets_tuple_seqContext star_targets_tuple_seq() throws RecognitionException {
		Star_targets_tuple_seqContext _localctx = new Star_targets_tuple_seqContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_star_targets_tuple_seq);
		int _la;
		try {
			int _alt;
			setState(2163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2150);
				star_target();
				setState(2153); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2151);
						match(COMMA);
						setState(2152);
						star_target();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2155); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2157);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2160);
				star_target();
				setState(2161);
				match(COMMA);
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

	public static class Star_targetContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Star_targetContext star_target() {
			return getRuleContext(Star_targetContext.class,0);
		}
		public Target_with_star_atomContext target_with_star_atom() {
			return getRuleContext(Target_with_star_atomContext.class,0);
		}
		public Star_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_target; }
	}

	public final Star_targetContext star_target() throws RecognitionException {
		Star_targetContext _localctx = new Star_targetContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_star_target);
		try {
			setState(2169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2165);
				match(STAR);
				{
				setState(2166);
				if (!(isnot_(STAR))) throw new FailedPredicateException(this, "isnot_(STAR)");
				setState(2167);
				star_target();
				}
				}
				break;
			case FALSE:
			case NONE:
			case TRUE:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ELLIPSIS:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2168);
				target_with_star_atom();
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

	public static class Target_with_star_atomContext extends ParserRuleContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public Star_atomContext star_atom() {
			return getRuleContext(Star_atomContext.class,0);
		}
		public Target_with_star_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_with_star_atom; }
	}

	public final Target_with_star_atomContext target_with_star_atom() throws RecognitionException {
		Target_with_star_atomContext _localctx = new Target_with_star_atomContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_target_with_star_atom);
		try {
			setState(2183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2171);
				t_primary(0);
				setState(2172);
				match(DOT);
				setState(2173);
				match(NAME);
				setState(2174);
				if (!(isnot_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "isnot_(OPEN_PAREN, OPEN_BRACK, DOT)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2176);
				t_primary(0);
				setState(2177);
				match(OPEN_BRACK);
				setState(2178);
				slices();
				setState(2179);
				match(CLOSE_BRACK);
				setState(2180);
				if (!(isnot_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "isnot_(OPEN_PAREN, OPEN_BRACK, DOT)");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2182);
				star_atom();
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

	public static class Star_atomContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public Target_with_star_atomContext target_with_star_atom() {
			return getRuleContext(Target_with_star_atomContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Star_targets_tuple_seqContext star_targets_tuple_seq() {
			return getRuleContext(Star_targets_tuple_seqContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public Star_targets_list_seqContext star_targets_list_seq() {
			return getRuleContext(Star_targets_list_seqContext.class,0);
		}
		public Star_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_atom; }
	}

	public final Star_atomContext star_atom() throws RecognitionException {
		Star_atomContext _localctx = new Star_atomContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_star_atom);
		int _la;
		try {
			setState(2200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2185);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2186);
				match(OPEN_PAREN);
				setState(2187);
				target_with_star_atom();
				setState(2188);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2190);
				match(OPEN_PAREN);
				setState(2192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NONE) | (1L << TRUE) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << STAR))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ELLIPSIS - 83)) | (1L << (NAME - 83)) | (1L << (NUMBER - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(2191);
					star_targets_tuple_seq();
					}
				}

				setState(2194);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2195);
				match(OPEN_BRACK);
				setState(2197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NONE) | (1L << TRUE) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << STAR))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ELLIPSIS - 83)) | (1L << (NAME - 83)) | (1L << (NUMBER - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(2196);
					star_targets_list_seq();
					}
				}

				setState(2199);
				match(CLOSE_BRACK);
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

	public static class Single_targetContext extends ParserRuleContext {
		public Single_subscript_attribute_targetContext single_subscript_attribute_target() {
			return getRuleContext(Single_subscript_attribute_targetContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Single_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_target; }
	}

	public final Single_targetContext single_target() throws RecognitionException {
		Single_targetContext _localctx = new Single_targetContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_single_target);
		try {
			setState(2208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2202);
				single_subscript_attribute_target();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2203);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2204);
				match(OPEN_PAREN);
				setState(2205);
				single_target();
				setState(2206);
				match(CLOSE_PAREN);
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

	public static class Single_subscript_attribute_targetContext extends ParserRuleContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public Single_subscript_attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_subscript_attribute_target; }
	}

	public final Single_subscript_attribute_targetContext single_subscript_attribute_target() throws RecognitionException {
		Single_subscript_attribute_targetContext _localctx = new Single_subscript_attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_single_subscript_attribute_target);
		try {
			setState(2221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2210);
				t_primary(0);
				setState(2211);
				match(DOT);
				setState(2212);
				match(NAME);
				setState(2213);
				if (!(isnot_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "isnot_(OPEN_PAREN, OPEN_BRACK, DOT)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2215);
				t_primary(0);
				setState(2216);
				match(OPEN_BRACK);
				setState(2217);
				slices();
				setState(2218);
				match(CLOSE_BRACK);
				setState(2219);
				if (!(isnot_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "isnot_(OPEN_PAREN, OPEN_BRACK, DOT)");
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

	public static class Del_targetsContext extends ParserRuleContext {
		public List<Del_targetContext> del_target() {
			return getRuleContexts(Del_targetContext.class);
		}
		public Del_targetContext del_target(int i) {
			return getRuleContext(Del_targetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Del_targetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_targets; }
	}

	public final Del_targetsContext del_targets() throws RecognitionException {
		Del_targetsContext _localctx = new Del_targetsContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_del_targets);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			del_target();
			setState(2228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2224);
					match(COMMA);
					setState(2225);
					del_target();
					}
					} 
				}
				setState(2230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			}
			setState(2232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2231);
				match(COMMA);
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

	public static class Del_targetContext extends ParserRuleContext {
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public Del_t_atomContext del_t_atom() {
			return getRuleContext(Del_t_atomContext.class,0);
		}
		public Del_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_target; }
	}

	public final Del_targetContext del_target() throws RecognitionException {
		Del_targetContext _localctx = new Del_targetContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_del_target);
		try {
			setState(2246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2234);
				t_primary(0);
				setState(2235);
				match(DOT);
				setState(2236);
				match(NAME);
				setState(2237);
				if (!(isnot_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "isnot_(OPEN_PAREN, OPEN_BRACK, DOT)");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2239);
				t_primary(0);
				setState(2240);
				match(OPEN_BRACK);
				setState(2241);
				slices();
				setState(2242);
				match(CLOSE_BRACK);
				setState(2243);
				if (!(isnot_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "isnot_(OPEN_PAREN, OPEN_BRACK, DOT)");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2245);
				del_t_atom();
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

	public static class Del_t_atomContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public Del_targetContext del_target() {
			return getRuleContext(Del_targetContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Del_targetsContext del_targets() {
			return getRuleContext(Del_targetsContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public Del_t_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_t_atom; }
	}

	public final Del_t_atomContext del_t_atom() throws RecognitionException {
		Del_t_atomContext _localctx = new Del_t_atomContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_del_t_atom);
		int _la;
		try {
			setState(2263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2248);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2249);
				match(OPEN_PAREN);
				setState(2250);
				del_target();
				setState(2251);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2253);
				match(OPEN_PAREN);
				setState(2255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NONE) | (1L << TRUE) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ELLIPSIS - 83)) | (1L << (NAME - 83)) | (1L << (NUMBER - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(2254);
					del_targets();
					}
				}

				setState(2257);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2258);
				match(OPEN_BRACK);
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NONE) | (1L << TRUE) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ELLIPSIS - 83)) | (1L << (NAME - 83)) | (1L << (NUMBER - 83)) | (1L << (STRING - 83)))) != 0)) {
					{
					setState(2259);
					del_targets();
					}
				}

				setState(2262);
				match(CLOSE_BRACK);
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

	public static class T_primaryContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public T_primaryContext t_primary() {
			return getRuleContext(T_primaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode OPEN_BRACK() { return getToken(PythonParser.OPEN_BRACK, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PythonParser.CLOSE_BRACK, 0); }
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public T_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_primary; }
	}

	public final T_primaryContext t_primary() throws RecognitionException {
		return t_primary(0);
	}

	private T_primaryContext t_primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		T_primaryContext _localctx = new T_primaryContext(_ctx, _parentState);
		T_primaryContext _prevctx = _localctx;
		int _startState = 352;
		enterRecursionRule(_localctx, 352, RULE_t_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2266);
			atom();
			setState(2267);
			if (!(is_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "is_(OPEN_PAREN, OPEN_BRACK, DOT)");
			}
			_ctx.stop = _input.LT(-1);
			setState(2292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
					case 1:
						{
						_localctx = new T_primaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t_primary);
						setState(2269);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2270);
						match(DOT);
						setState(2271);
						match(NAME);
						setState(2272);
						if (!(is_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "is_(OPEN_PAREN, OPEN_BRACK, DOT)");
						}
						break;
					case 2:
						{
						_localctx = new T_primaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t_primary);
						setState(2273);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2274);
						match(OPEN_BRACK);
						setState(2275);
						slices();
						setState(2276);
						match(CLOSE_BRACK);
						setState(2277);
						if (!(is_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "is_(OPEN_PAREN, OPEN_BRACK, DOT)");
						}
						break;
					case 3:
						{
						_localctx = new T_primaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t_primary);
						setState(2279);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2280);
						genexp();
						setState(2281);
						if (!(is_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "is_(OPEN_PAREN, OPEN_BRACK, DOT)");
						}
						break;
					case 4:
						{
						_localctx = new T_primaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t_primary);
						setState(2283);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2284);
						match(OPEN_PAREN);
						setState(2286);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << AWAIT) | (1L << NONE) | (1L << TRUE) | (1L << LAMBDA) | (1L << NOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << OPEN_BRACE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << TILDE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (DOUBLESTAR - 66)) | (1L << (ELLIPSIS - 66)) | (1L << (NAME - 66)) | (1L << (NUMBER - 66)) | (1L << (STRING - 66)))) != 0)) {
							{
							setState(2285);
							arguments();
							}
						}

						setState(2288);
						match(CLOSE_PAREN);
						setState(2289);
						if (!(is_(OPEN_PAREN, OPEN_BRACK, DOT))) throw new FailedPredicateException(this, "is_(OPEN_PAREN, OPEN_BRACK, DOT)");
						}
						break;
					}
					} 
				}
				setState(2294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
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

	public static class Match_skwContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Match_skwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_skw; }
	}

	public final Match_skwContext match_skw() throws RecognitionException {
		Match_skwContext _localctx = new Match_skwContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_match_skw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2295);
			if (!(isCurrentToken("match"))) throw new FailedPredicateException(this, "isCurrentToken(\"match\")");
			setState(2296);
			match(NAME);
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

	public static class Case_skwContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Case_skwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_skw; }
	}

	public final Case_skwContext case_skw() throws RecognitionException {
		Case_skwContext _localctx = new Case_skwContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_case_skw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2298);
			if (!(isCurrentToken("case"))) throw new FailedPredicateException(this, "isCurrentToken(\"case\")");
			setState(2299);
			match(NAME);
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

	public static class Underscore_skwContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Underscore_skwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underscore_skw; }
	}

	public final Underscore_skwContext underscore_skw() throws RecognitionException {
		Underscore_skwContext _localctx = new Underscore_skwContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_underscore_skw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			if (!(isCurrentToken("_"))) throw new FailedPredicateException(this, "isCurrentToken(\"_\")");
			setState(2302);
			match(NAME);
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

	public static class Name_except_underscoreContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Name_except_underscoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_except_underscore; }
	}

	public final Name_except_underscoreContext name_except_underscore() throws RecognitionException {
		Name_except_underscoreContext _localctx = new Name_except_underscoreContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_name_except_underscore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2304);
			if (!(is_notCurrentToken("_"))) throw new FailedPredicateException(this, "is_notCurrentToken(\"_\")");
			setState(2305);
			match(NAME);
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
		case 9:
			return simple_stmts_sempred((Simple_stmtsContext)_localctx, predIndex);
		case 12:
			return assignment_sempred((AssignmentContext)_localctx, predIndex);
		case 18:
			return del_stmt_sempred((Del_stmtContext)_localctx, predIndex);
		case 22:
			return import_from_targets_sempred((Import_from_targetsContext)_localctx, predIndex);
		case 27:
			return dotted_name_sempred((Dotted_nameContext)_localctx, predIndex);
		case 34:
			return with_item_sempred((With_itemContext)_localctx, predIndex);
		case 47:
			return literal_pattern_sempred((Literal_patternContext)_localctx, predIndex);
		case 48:
			return literal_expr_sempred((Literal_exprContext)_localctx, predIndex);
		case 55:
			return pattern_capture_target_sempred((Pattern_capture_targetContext)_localctx, predIndex);
		case 57:
			return value_pattern_sempred((Value_patternContext)_localctx, predIndex);
		case 59:
			return name_or_attr_sempred((Name_or_attrContext)_localctx, predIndex);
		case 78:
			return func_type_comment_sempred((Func_type_commentContext)_localctx, predIndex);
		case 81:
			return slash_no_default_sempred((Slash_no_defaultContext)_localctx, predIndex);
		case 82:
			return slash_with_default_sempred((Slash_with_defaultContext)_localctx, predIndex);
		case 85:
			return param_no_default_sempred((Param_no_defaultContext)_localctx, predIndex);
		case 86:
			return param_with_default_sempred((Param_with_defaultContext)_localctx, predIndex);
		case 87:
			return param_maybe_default_sempred((Param_maybe_defaultContext)_localctx, predIndex);
		case 100:
			return named_expression_sempred((Named_expressionContext)_localctx, predIndex);
		case 107:
			return lambda_slash_no_default_sempred((Lambda_slash_no_defaultContext)_localctx, predIndex);
		case 108:
			return lambda_slash_with_default_sempred((Lambda_slash_with_defaultContext)_localctx, predIndex);
		case 111:
			return lambda_param_no_default_sempred((Lambda_param_no_defaultContext)_localctx, predIndex);
		case 112:
			return lambda_param_with_default_sempred((Lambda_param_with_defaultContext)_localctx, predIndex);
		case 113:
			return lambda_param_maybe_default_sempred((Lambda_param_maybe_defaultContext)_localctx, predIndex);
		case 130:
			return bitwise_or_sempred((Bitwise_orContext)_localctx, predIndex);
		case 131:
			return bitwise_xor_sempred((Bitwise_xorContext)_localctx, predIndex);
		case 132:
			return bitwise_and_sempred((Bitwise_andContext)_localctx, predIndex);
		case 133:
			return shift_expr_sempred((Shift_exprContext)_localctx, predIndex);
		case 134:
			return sum_sempred((SumContext)_localctx, predIndex);
		case 135:
			return term_sempred((TermContext)_localctx, predIndex);
		case 139:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 140:
			return slices_sempred((SlicesContext)_localctx, predIndex);
		case 148:
			return genexp_sempred((GenexpContext)_localctx, predIndex);
		case 159:
			return arguments_sempred((ArgumentsContext)_localctx, predIndex);
		case 160:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 165:
			return star_targets_sempred((Star_targetsContext)_localctx, predIndex);
		case 168:
			return star_target_sempred((Star_targetContext)_localctx, predIndex);
		case 169:
			return target_with_star_atom_sempred((Target_with_star_atomContext)_localctx, predIndex);
		case 172:
			return single_subscript_attribute_target_sempred((Single_subscript_attribute_targetContext)_localctx, predIndex);
		case 174:
			return del_target_sempred((Del_targetContext)_localctx, predIndex);
		case 176:
			return t_primary_sempred((T_primaryContext)_localctx, predIndex);
		case 177:
			return match_skw_sempred((Match_skwContext)_localctx, predIndex);
		case 178:
			return case_skw_sempred((Case_skwContext)_localctx, predIndex);
		case 179:
			return underscore_skw_sempred((Underscore_skwContext)_localctx, predIndex);
		case 180:
			return name_except_underscore_sempred((Name_except_underscoreContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simple_stmts_sempred(Simple_stmtsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isnot_(SEMI);
		}
		return true;
	}
	private boolean assignment_sempred(AssignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return isnot_(EQUAL);
		}
		return true;
	}
	private boolean del_stmt_sempred(Del_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return is_(SEMI, NEWLINE);
		}
		return true;
	}
	private boolean import_from_targets_sempred(Import_from_targetsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return isnot_(COMMA);
		}
		return true;
	}
	private boolean dotted_name_sempred(Dotted_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean with_item_sempred(With_itemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return is_(COMMA, CLOSE_PAREN, COLON);
		}
		return true;
	}
	private boolean literal_pattern_sempred(Literal_patternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return isnot_(PLUS, MINUS);
		}
		return true;
	}
	private boolean literal_expr_sempred(Literal_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return isnot_(PLUS, MINUS);
		}
		return true;
	}
	private boolean pattern_capture_target_sempred(Pattern_capture_targetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return isnot_(DOT, OPEN_PAREN, EQUAL);
		}
		return true;
	}
	private boolean value_pattern_sempred(Value_patternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return isnot_(DOT, OPEN_PAREN, EQUAL);
		}
		return true;
	}
	private boolean name_or_attr_sempred(Name_or_attrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean func_type_comment_sempred(Func_type_commentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return are_(NEWLINE, INDENT);
		}
		return true;
	}
	private boolean slash_no_default_sempred(Slash_no_defaultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return is_(CLOSE_PAREN);
		}
		return true;
	}
	private boolean slash_with_default_sempred(Slash_with_defaultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return is_(CLOSE_PAREN);
		}
		return true;
	}
	private boolean param_no_default_sempred(Param_no_defaultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return is_(CLOSE_PAREN);
		}
		return true;
	}
	private boolean param_with_default_sempred(Param_with_defaultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return is_(CLOSE_PAREN);
		}
		return true;
	}
	private boolean param_maybe_default_sempred(Param_maybe_defaultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return is_(CLOSE_PAREN);
		}
		return true;
	}
	private boolean named_expression_sempred(Named_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return isnot_(COLONEQUAL);
		}
		return true;
	}
	private boolean lambda_slash_no_default_sempred(Lambda_slash_no_defaultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return is_(COLON);
		}
		return true;
	}
	private boolean lambda_slash_with_default_sempred(Lambda_slash_with_defaultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return is_(COLON);
		}
		return true;
	}
	private boolean lambda_param_no_default_sempred(Lambda_param_no_defaultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return is_(COLON);
		}
		return true;
	}
	private boolean lambda_param_with_default_sempred(Lambda_param_with_defaultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return is_(COLON);
		}
		return true;
	}
	private boolean lambda_param_maybe_default_sempred(Lambda_param_maybe_defaultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return is_(COLON);
		}
		return true;
	}
	private boolean bitwise_or_sempred(Bitwise_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_xor_sempred(Bitwise_xorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwise_and_sempred(Bitwise_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean shift_expr_sempred(Shift_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 3);
		case 27:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sum_sempred(SumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 3);
		case 29:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 6);
		case 31:
			return precpred(_ctx, 5);
		case 32:
			return precpred(_ctx, 4);
		case 33:
			return precpred(_ctx, 3);
		case 34:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 5);
		case 36:
			return precpred(_ctx, 4);
		case 37:
			return precpred(_ctx, 3);
		case 38:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean slices_sempred(SlicesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return isnot_(COMMA);
		}
		return true;
	}
	private boolean genexp_sempred(GenexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return isnot_(COLONEQUAL);
		}
		return true;
	}
	private boolean arguments_sempred(ArgumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return is_(CLOSE_PAREN);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return isnot_(COLONEQUAL);
		case 43:
			return isnot_(EQUAL);
		case 44:
			return isnot_(COLONEQUAL);
		case 45:
			return isnot_(EQUAL);
		}
		return true;
	}
	private boolean star_targets_sempred(Star_targetsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return isnot_(COMMA);
		}
		return true;
	}
	private boolean star_target_sempred(Star_targetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return isnot_(STAR);
		}
		return true;
	}
	private boolean target_with_star_atom_sempred(Target_with_star_atomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return isnot_(OPEN_PAREN, OPEN_BRACK, DOT);
		case 49:
			return isnot_(OPEN_PAREN, OPEN_BRACK, DOT);
		}
		return true;
	}
	private boolean single_subscript_attribute_target_sempred(Single_subscript_attribute_targetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return isnot_(OPEN_PAREN, OPEN_BRACK, DOT);
		case 51:
			return isnot_(OPEN_PAREN, OPEN_BRACK, DOT);
		}
		return true;
	}
	private boolean del_target_sempred(Del_targetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return isnot_(OPEN_PAREN, OPEN_BRACK, DOT);
		case 53:
			return isnot_(OPEN_PAREN, OPEN_BRACK, DOT);
		}
		return true;
	}
	private boolean t_primary_sempred(T_primaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return is_(OPEN_PAREN, OPEN_BRACK, DOT);
		case 55:
			return precpred(_ctx, 5);
		case 56:
			return is_(OPEN_PAREN, OPEN_BRACK, DOT);
		case 57:
			return precpred(_ctx, 4);
		case 58:
			return is_(OPEN_PAREN, OPEN_BRACK, DOT);
		case 59:
			return precpred(_ctx, 3);
		case 60:
			return is_(OPEN_PAREN, OPEN_BRACK, DOT);
		case 61:
			return precpred(_ctx, 2);
		case 62:
			return is_(OPEN_PAREN, OPEN_BRACK, DOT);
		}
		return true;
	}
	private boolean match_skw_sempred(Match_skwContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63:
			return isCurrentToken("match");
		}
		return true;
	}
	private boolean case_skw_sempred(Case_skwContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64:
			return isCurrentToken("case");
		}
		return true;
	}
	private boolean underscore_skw_sempred(Underscore_skwContext _localctx, int predIndex) {
		switch (predIndex) {
		case 65:
			return isCurrentToken("_");
		}
		return true;
	}
	private boolean name_except_underscore_sempred(Name_except_underscoreContext _localctx, int predIndex) {
		switch (predIndex) {
		case 66:
			return is_notCurrentToken("_");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u0906\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\3\2\5\2\u016e\n\2\3\2\3\2\3\3\3\3\3\4\3\4\7\4\u0176\n\4\f\4\16\4\u0179"+
		"\13\4\3\4\3\4\3\5\3\5\5\5\u017f\n\5\3\5\3\5\3\5\3\5\7\5\u0185\n\5\f\5"+
		"\16\5\u0188\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7\u0191\n\7\f\7\16\7\u0194"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u01a0\n\7\f\7\16\7\u01a3"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u01ac\n\7\f\7\16\7\u01af\13\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u01c2\n\7\f\7\16\7\u01c5\13\7\5\7\u01c7\n\7\3\b\6\b\u01ca\n\b\r\b\16"+
		"\b\u01cb\3\t\3\t\5\t\u01d0\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01d8\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u01e1\n\13\f\13\16\13\u01e4\13"+
		"\13\3\13\5\13\u01e7\n\13\3\13\3\13\5\13\u01eb\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01fa\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0204\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u020b\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0212\n\16\3\16\3\16\3\16\3\16\5\16\u0218\n\16"+
		"\3\16\3\16\3\16\6\16\u021d\n\16\r\16\16\16\u021e\3\16\3\16\5\16\u0223"+
		"\n\16\3\16\3\16\5\16\u0227\n\16\3\16\3\16\3\16\3\16\5\16\u022d\n\16\5"+
		"\16\u022f\n\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0237\n\20\f\20\16\20"+
		"\u023a\13\20\3\21\3\21\3\21\3\21\7\21\u0240\n\21\f\21\16\21\u0243\13\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u024b\n\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\5\25\u0253\n\25\3\26\3\26\3\26\3\27\3\27\7\27\u025a\n\27\f\27\16"+
		"\27\u025d\13\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u0265\n\27\r\27\16"+
		"\27\u0266\3\27\3\27\5\27\u026b\n\27\3\30\3\30\3\30\5\30\u0270\n\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0278\n\30\3\31\3\31\3\31\7\31\u027d\n"+
		"\31\f\31\16\31\u0280\13\31\3\32\3\32\3\32\5\32\u0285\n\32\3\33\3\33\3"+
		"\33\7\33\u028a\n\33\f\33\16\33\u028d\13\33\3\34\3\34\3\34\5\34\u0292\n"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u029a\n\35\f\35\16\35\u029d\13"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02aa"+
		"\n\36\5\36\u02ac\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u02b9\n\37\5\37\u02bb\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u02c6"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02ce\n\"\3\"\3\"\5\"\u02d2\n\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u02db\n\"\3\"\3\"\5\"\u02df\n\"\5\"\u02e1\n"+
		"\"\3#\3#\3#\3#\3#\7#\u02e8\n#\f#\16#\u02eb\13#\3#\5#\u02ee\n#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\7#\u02f8\n#\f#\16#\u02fb\13#\3#\3#\5#\u02ff\n#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\7#\u0309\n#\f#\16#\u030c\13#\3#\5#\u030f\n#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\7#\u031a\n#\f#\16#\u031d\13#\3#\3#\5#\u0321\n#\3#"+
		"\3#\5#\u0325\n#\3$\3$\3$\3$\3$\3$\5$\u032d\n$\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\6%\u0338\n%\r%\16%\u0339\3%\5%\u033d\n%\3%\5%\u0340\n%\5%\u0342\n"+
		"%\3&\3&\3&\3&\5&\u0348\n&\3&\3&\3&\3&\3&\3&\5&\u0350\n&\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\6(\u035c\n(\r(\16(\u035d\3(\3(\3)\3)\3)\5)\u0365"+
		"\n)\3)\5)\u0368\n)\3*\3*\3*\5*\u036d\n*\3*\3*\3*\3+\3+\3+\3,\3,\5,\u0377"+
		"\n,\3-\3-\5-\u037b\n-\3.\3.\3.\3.\3/\3/\3/\7/\u0384\n/\f/\16/\u0387\13"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0391\n\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\5\61\u039b\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u03a5\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u03af\n\63\3\64\3\64\3\64\5\64\u03b4\n\64\3\65\3\65\3\65\5\65\u03b9"+
		"\n\65\3\66\3\66\3\67\3\67\38\38\39\39\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3"+
		"<\3=\3=\3=\3=\3=\3=\7=\u03d4\n=\f=\16=\u03d7\13=\3>\3>\3>\3>\3?\3?\5?"+
		"\u03df\n?\3?\3?\3?\5?\u03e4\n?\3?\5?\u03e7\n?\3@\3@\3@\5@\u03ec\n@\3A"+
		"\3A\3A\7A\u03f1\nA\fA\16A\u03f4\13A\3A\5A\u03f7\nA\3B\3B\5B\u03fb\nB\3"+
		"C\3C\3C\3C\5C\u0401\nC\3D\3D\3D\3D\3D\5D\u0408\nD\3D\3D\3D\3D\3D\3D\3"+
		"D\5D\u0411\nD\3D\3D\3D\3D\3D\5D\u0418\nD\3D\3D\5D\u041c\nD\3E\3E\3E\7"+
		"E\u0421\nE\fE\16E\u0424\13E\3F\3F\5F\u0428\nF\3F\3F\3F\3G\3G\3G\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\5H\u0438\nH\3H\3H\3H\3H\3H\3H\5H\u0440\nH\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\5H\u044a\nH\3H\3H\5H\u044e\nH\3I\3I\3I\7I\u0453\nI\fI"+
		"\16I\u0456\13I\3J\3J\3J\7J\u045b\nJ\fJ\16J\u045e\13J\3K\3K\3K\3K\3L\3"+
		"L\5L\u0466\nL\3M\3M\3M\3M\5M\u046c\nM\3M\5M\u046f\nM\3N\3N\3N\3N\5N\u0475"+
		"\nN\3O\3O\3O\3O\5O\u047b\nO\3O\3O\3O\5O\u0480\nO\3O\3O\5O\u0484\nO\3O"+
		"\3O\3O\3O\3O\3O\5O\u048c\nO\3O\3O\3O\5O\u0491\nO\3O\3O\5O\u0495\nO\3O"+
		"\5O\u0498\nO\3P\3P\3P\3P\5P\u049e\nP\3Q\3Q\3R\3R\7R\u04a4\nR\fR\16R\u04a7"+
		"\13R\3R\7R\u04aa\nR\fR\16R\u04ad\13R\3R\5R\u04b0\nR\3R\3R\7R\u04b4\nR"+
		"\fR\16R\u04b7\13R\3R\5R\u04ba\nR\3R\6R\u04bd\nR\rR\16R\u04be\3R\7R\u04c2"+
		"\nR\fR\16R\u04c5\13R\3R\5R\u04c8\nR\3R\6R\u04cb\nR\rR\16R\u04cc\3R\5R"+
		"\u04d0\nR\3R\5R\u04d3\nR\3S\6S\u04d6\nS\rS\16S\u04d7\3S\3S\3S\3S\6S\u04de"+
		"\nS\rS\16S\u04df\3S\3S\3S\5S\u04e5\nS\3T\7T\u04e8\nT\fT\16T\u04eb\13T"+
		"\3T\6T\u04ee\nT\rT\16T\u04ef\3T\3T\3T\3T\7T\u04f6\nT\fT\16T\u04f9\13T"+
		"\3T\6T\u04fc\nT\rT\16T\u04fd\3T\3T\3T\5T\u0503\nT\3U\3U\3U\7U\u0508\n"+
		"U\fU\16U\u050b\13U\3U\5U\u050e\nU\3U\3U\3U\6U\u0513\nU\rU\16U\u0514\3"+
		"U\5U\u0518\nU\3U\5U\u051b\nU\3V\3V\3V\3W\3W\3W\5W\u0523\nW\3W\3W\5W\u0527"+
		"\nW\3W\3W\5W\u052b\nW\3X\3X\3X\3X\5X\u0531\nX\3X\3X\3X\5X\u0536\nX\3X"+
		"\3X\5X\u053a\nX\3Y\3Y\5Y\u053e\nY\3Y\3Y\5Y\u0542\nY\3Y\3Y\5Y\u0546\nY"+
		"\3Y\5Y\u0549\nY\3Y\3Y\5Y\u054d\nY\3Z\3Z\5Z\u0551\nZ\3[\3[\3[\3\\\3\\\3"+
		"\\\3]\3]\3]\3]\6]\u055d\n]\r]\16]\u055e\3^\3^\3^\3^\5^\u0565\n^\3_\3_"+
		"\3_\3_\5_\u056b\n_\3_\5_\u056e\n_\3_\3_\3_\3`\3`\3`\3`\3`\3`\5`\u0579"+
		"\n`\3a\3a\3a\6a\u057e\na\ra\16a\u057f\3a\5a\u0583\na\3a\3a\3a\3a\5a\u0589"+
		"\na\3b\3b\3b\5b\u058e\nb\3c\3c\3c\7c\u0593\nc\fc\16c\u0596\13c\3c\5c\u0599"+
		"\nc\3d\3d\3d\5d\u059e\nd\3e\3e\3e\3e\3f\3f\3f\3f\5f\u05a8\nf\3g\3g\5g"+
		"\u05ac\ng\3h\3h\3h\6h\u05b1\nh\rh\16h\u05b2\3h\5h\u05b6\nh\3h\3h\3h\3"+
		"h\5h\u05bc\nh\3i\3i\3i\3i\3i\3i\3i\3i\5i\u05c6\ni\3j\3j\5j\u05ca\nj\3"+
		"j\3j\3j\3k\3k\3l\3l\7l\u05d3\nl\fl\16l\u05d6\13l\3l\7l\u05d9\nl\fl\16"+
		"l\u05dc\13l\3l\5l\u05df\nl\3l\3l\7l\u05e3\nl\fl\16l\u05e6\13l\3l\5l\u05e9"+
		"\nl\3l\6l\u05ec\nl\rl\16l\u05ed\3l\7l\u05f1\nl\fl\16l\u05f4\13l\3l\5l"+
		"\u05f7\nl\3l\6l\u05fa\nl\rl\16l\u05fb\3l\5l\u05ff\nl\3l\5l\u0602\nl\3"+
		"m\6m\u0605\nm\rm\16m\u0606\3m\3m\3m\3m\6m\u060d\nm\rm\16m\u060e\3m\3m"+
		"\3m\5m\u0614\nm\3n\7n\u0617\nn\fn\16n\u061a\13n\3n\6n\u061d\nn\rn\16n"+
		"\u061e\3n\3n\3n\3n\7n\u0625\nn\fn\16n\u0628\13n\3n\6n\u062b\nn\rn\16n"+
		"\u062c\3n\3n\3n\5n\u0632\nn\3o\3o\3o\7o\u0637\no\fo\16o\u063a\13o\3o\5"+
		"o\u063d\no\3o\3o\3o\6o\u0642\no\ro\16o\u0643\3o\5o\u0647\no\3o\5o\u064a"+
		"\no\3p\3p\3p\3q\3q\3q\3q\3q\3q\5q\u0655\nq\3r\3r\3r\3r\3r\3r\3r\3r\5r"+
		"\u065f\nr\3s\3s\5s\u0663\ns\3s\3s\3s\3s\5s\u0669\ns\3s\3s\5s\u066d\ns"+
		"\3t\3t\3u\3u\3u\6u\u0674\nu\ru\16u\u0675\3u\5u\u0679\nu\3v\3v\3v\6v\u067e"+
		"\nv\rv\16v\u067f\3v\5v\u0683\nv\3w\3w\3w\5w\u0688\nw\3x\3x\6x\u068c\n"+
		"x\rx\16x\u068d\3x\5x\u0691\nx\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u069d\n"+
		"y\3z\3z\3z\3{\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\3~\3\177\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\7\u0084\u06c5\n\u0084\f\u0084\16\u0084\u06c8\13\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u06d0\n\u0085\f\u0085"+
		"\16\u0085\u06d3\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\7\u0086\u06db\n\u0086\f\u0086\16\u0086\u06de\13\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u06e9"+
		"\n\u0087\f\u0087\16\u0087\u06ec\13\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\7\u0088\u06f7\n\u0088\f\u0088"+
		"\16\u0088\u06fa\13\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\7\u0089\u070e\n\u0089\f\u0089\16\u0089\u0711"+
		"\13\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u071a\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0721\n"+
		"\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u0726\n\u008c\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u0733\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\7\u008d\u073b\n\u008d\f\u008d\16\u008d\u073e\13\u008d\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u0746\n\u008e\f\u008e\16\u008e"+
		"\u0749\13\u008e\3\u008e\5\u008e\u074c\n\u008e\5\u008e\u074e\n\u008e\3"+
		"\u008f\5\u008f\u0751\n\u008f\3\u008f\3\u008f\5\u008f\u0755\n\u008f\3\u008f"+
		"\3\u008f\5\u008f\u0759\n\u008f\5\u008f\u075b\n\u008f\3\u008f\5\u008f\u075e"+
		"\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\5\u0090\u0769\n\u0090\3\u0090\3\u0090\5\u0090\u076d\n\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0773\n\u0090\3\u0090\5\u0090\u0776"+
		"\n\u0090\3\u0091\6\u0091\u0779\n\u0091\r\u0091\16\u0091\u077a\3\u0092"+
		"\3\u0092\5\u0092\u077f\n\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u078c\n\u0094"+
		"\5\u0094\u078e\n\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\5\u0095"+
		"\u0795\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u079e\n\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099"+
		"\u07ae\n\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009b\7\u009b\u07ba\n\u009b\f\u009b\16\u009b\u07bd"+
		"\13\u009b\3\u009b\5\u009b\u07c0\n\u009b\3\u009c\3\u009c\3\u009c\5\u009c"+
		"\u07c5\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\6\u009e\u07cc\n"+
		"\u009e\r\u009e\16\u009e\u07cd\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\7\u009f\u07d7\n\u009f\f\u009f\16\u009f\u07da\13\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\7\u009f\u07e2\n\u009f"+
		"\f\u009f\16\u009f\u07e5\13\u009f\5\u009f\u07e7\n\u009f\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u07ee\n\u00a0\5\u00a0\u07f0\n\u00a0\3"+
		"\u00a1\3\u00a1\5\u00a1\u07f4\n\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3"+
		"\u00a2\3\u00a2\3\u00a2\5\u00a2\u07fd\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u0801"+
		"\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0809"+
		"\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u080d\n\u00a2\7\u00a2\u080f\n\u00a2\f"+
		"\u00a2\16\u00a2\u0812\13\u00a2\3\u00a2\3\u00a2\5\u00a2\u0816\n\u00a2\3"+
		"\u00a2\5\u00a2\u0819\n\u00a2\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u081e\n\u00a3"+
		"\f\u00a3\16\u00a3\u0821\13\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3"+
		"\u0827\n\u00a3\f\u00a3\16\u00a3\u082a\13\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\7\u00a3\u082f\n\u00a3\f\u00a3\16\u00a3\u0832\13\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\7\u00a3\u0837\n\u00a3\f\u00a3\16\u00a3\u083a\13\u00a3\5\u00a3"+
		"\u083c\n\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u0845\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6"+
		"\u084c\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\7\u00a7"+
		"\u0854\n\u00a7\f\u00a7\16\u00a7\u0857\13\u00a7\3\u00a7\5\u00a7\u085a\n"+
		"\u00a7\5\u00a7\u085c\n\u00a7\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u0861\n\u00a8"+
		"\f\u00a8\16\u00a8\u0864\13\u00a8\3\u00a8\5\u00a8\u0867\n\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\6\u00a9\u086c\n\u00a9\r\u00a9\16\u00a9\u086d\3\u00a9"+
		"\5\u00a9\u0871\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0876\n\u00a9\3"+
		"\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u087c\n\u00aa\3\u00ab\3\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\5\u00ab\u088a\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\5\u00ac\u0893\n\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac"+
		"\u0898\n\u00ac\3\u00ac\5\u00ac\u089b\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\5\u00ad\u08a3\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3"+
		"\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae"+
		"\u08b0\n\u00ae\3\u00af\3\u00af\3\u00af\7\u00af\u08b5\n\u00af\f\u00af\16"+
		"\u00af\u08b8\13\u00af\3\u00af\5\u00af\u08bb\n\u00af\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\5\u00b0\u08c9\n\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\5\u00b1\u08d2\n\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1"+
		"\u08d7\n\u00b1\3\u00b1\5\u00b1\u08da\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3"+
		"\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\5\u00b2\u08f1\n\u00b2\3\u00b2\3\u00b2\7\u00b2\u08f5\n\u00b2\f\u00b2\16"+
		"\u00b2\u08f8\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\2\f8x\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0118\u0162\u00b7\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\2\4\5\2E"+
		"OQQSS\4\2..UU\2\u09cb\2\u016d\3\2\2\2\4\u0171\3\2\2\2\6\u0173\3\2\2\2"+
		"\b\u017c\3\2\2\2\n\u018b\3\2\2\2\f\u01c6\3\2\2\2\16\u01c9\3\2\2\2\20\u01cf"+
		"\3\2\2\2\22\u01d7\3\2\2\2\24\u01ea\3\2\2\2\26\u01f9\3\2\2\2\30\u0203\3"+
		"\2\2\2\32\u022e\3\2\2\2\34\u0230\3\2\2\2\36\u0232\3\2\2\2 \u023b\3\2\2"+
		"\2\"\u0244\3\2\2\2$\u0246\3\2\2\2&\u024c\3\2\2\2(\u0252\3\2\2\2*\u0254"+
		"\3\2\2\2,\u026a\3\2\2\2.\u0277\3\2\2\2\60\u0279\3\2\2\2\62\u0281\3\2\2"+
		"\2\64\u0286\3\2\2\2\66\u028e\3\2\2\28\u0293\3\2\2\2:\u02ab\3\2\2\2<\u02ba"+
		"\3\2\2\2>\u02bc\3\2\2\2@\u02c0\3\2\2\2B\u02e0\3\2\2\2D\u0324\3\2\2\2F"+
		"\u032c\3\2\2\2H\u0341\3\2\2\2J\u034f\3\2\2\2L\u0351\3\2\2\2N\u0355\3\2"+
		"\2\2P\u0367\3\2\2\2R\u0369\3\2\2\2T\u0371\3\2\2\2V\u0376\3\2\2\2X\u037a"+
		"\3\2\2\2Z\u037c\3\2\2\2\\\u0380\3\2\2\2^\u0390\3\2\2\2`\u039a\3\2\2\2"+
		"b\u03a4\3\2\2\2d\u03ae\3\2\2\2f\u03b3\3\2\2\2h\u03b8\3\2\2\2j\u03ba\3"+
		"\2\2\2l\u03bc\3\2\2\2n\u03be\3\2\2\2p\u03c0\3\2\2\2r\u03c4\3\2\2\2t\u03c6"+
		"\3\2\2\2v\u03c9\3\2\2\2x\u03cd\3\2\2\2z\u03d8\3\2\2\2|\u03e6\3\2\2\2~"+
		"\u03e8\3\2\2\2\u0080\u03ed\3\2\2\2\u0082\u03fa\3\2\2\2\u0084\u0400\3\2"+
		"\2\2\u0086\u041b\3\2\2\2\u0088\u041d\3\2\2\2\u008a\u0427\3\2\2\2\u008c"+
		"\u042c\3\2\2\2\u008e\u044d\3\2\2\2\u0090\u044f\3\2\2\2\u0092\u0457\3\2"+
		"\2\2\u0094\u045f\3\2\2\2\u0096\u0463\3\2\2\2\u0098\u046e\3\2\2\2\u009a"+
		"\u0474\3\2\2\2\u009c\u0497\3\2\2\2\u009e\u049d\3\2\2\2\u00a0\u049f\3\2"+
		"\2\2\u00a2\u04d2\3\2\2\2\u00a4\u04e4\3\2\2\2\u00a6\u0502\3\2\2\2\u00a8"+
		"\u051a\3\2\2\2\u00aa\u051c\3\2\2\2\u00ac\u052a\3\2\2\2\u00ae\u0539\3\2"+
		"\2\2\u00b0\u054c\3\2\2\2\u00b2\u054e\3\2\2\2\u00b4\u0552\3\2\2\2\u00b6"+
		"\u0555\3\2\2\2\u00b8\u055c\3\2\2\2\u00ba\u0564\3\2\2\2\u00bc\u0566\3\2"+
		"\2\2\u00be\u0578\3\2\2\2\u00c0\u0588\3\2\2\2\u00c2\u058d\3\2\2\2\u00c4"+
		"\u058f\3\2\2\2\u00c6\u059d\3\2\2\2\u00c8\u059f\3\2\2\2\u00ca\u05a7\3\2"+
		"\2\2\u00cc\u05ab\3\2\2\2\u00ce\u05bb\3\2\2\2\u00d0\u05c5\3\2\2\2\u00d2"+
		"\u05c7\3\2\2\2\u00d4\u05ce\3\2\2\2\u00d6\u0601\3\2\2\2\u00d8\u0613\3\2"+
		"\2\2\u00da\u0631\3\2\2\2\u00dc\u0649\3\2\2\2\u00de\u064b\3\2\2\2\u00e0"+
		"\u0654\3\2\2\2\u00e2\u065e\3\2\2\2\u00e4\u066c\3\2\2\2\u00e6\u066e\3\2"+
		"\2\2\u00e8\u0678\3\2\2\2\u00ea\u0682\3\2\2\2\u00ec\u0687\3\2\2\2\u00ee"+
		"\u0690\3\2\2\2\u00f0\u069c\3\2\2\2\u00f2\u069e\3\2\2\2\u00f4\u06a1\3\2"+
		"\2\2\u00f6\u06a4\3\2\2\2\u00f8\u06a7\3\2\2\2\u00fa\u06aa\3\2\2\2\u00fc"+
		"\u06ad\3\2\2\2\u00fe\u06b0\3\2\2\2\u0100\u06b4\3\2\2\2\u0102\u06b7\3\2"+
		"\2\2\u0104\u06bb\3\2\2\2\u0106\u06be\3\2\2\2\u0108\u06c9\3\2\2\2\u010a"+
		"\u06d4\3\2\2\2\u010c\u06df\3\2\2\2\u010e\u06ed\3\2\2\2\u0110\u06fb\3\2"+
		"\2\2\u0112\u0719\3\2\2\2\u0114\u0720\3\2\2\2\u0116\u0725\3\2\2\2\u0118"+
		"\u0727\3\2\2\2\u011a\u074d\3\2\2\2\u011c\u075d\3\2\2\2\u011e\u0775\3\2"+
		"\2\2\u0120\u0778\3\2\2\2\u0122\u077c\3\2\2\2\u0124\u0782\3\2\2\2\u0126"+
		"\u0787\3\2\2\2\u0128\u0791\3\2\2\2\u012a\u0798\3\2\2\2\u012c\u07a2\3\2"+
		"\2\2\u012e\u07a6\3\2\2\2\u0130\u07ab\3\2\2\2\u0132\u07b1\3\2\2\2\u0134"+
		"\u07b6\3\2\2\2\u0136\u07c4\3\2\2\2\u0138\u07c6\3\2\2\2\u013a\u07cb\3\2"+
		"\2\2\u013c\u07e6\3\2\2\2\u013e\u07ef\3\2\2\2\u0140\u07f1\3\2\2\2\u0142"+
		"\u0818\3\2\2\2\u0144\u083b\3\2\2\2\u0146\u083d\3\2\2\2\u0148\u0844\3\2"+
		"\2\2\u014a\u084b\3\2\2\2\u014c\u085b\3\2\2\2\u014e\u085d\3\2\2\2\u0150"+
		"\u0875\3\2\2\2\u0152\u087b\3\2\2\2\u0154\u0889\3\2\2\2\u0156\u089a\3\2"+
		"\2\2\u0158\u08a2\3\2\2\2\u015a\u08af\3\2\2\2\u015c\u08b1\3\2\2\2\u015e"+
		"\u08c8\3\2\2\2\u0160\u08d9\3\2\2\2\u0162\u08db\3\2\2\2\u0164\u08f9\3\2"+
		"\2\2\u0166\u08fc\3\2\2\2\u0168\u08ff\3\2\2\2\u016a\u0902\3\2\2\2\u016c"+
		"\u016e\5\16\b\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0170\7\2\2\3\u0170\3\3\2\2\2\u0171\u0172\5\22\n\2\u0172"+
		"\5\3\2\2\2\u0173\u0177\5\u00ceh\2\u0174\u0176\7[\2\2\u0175\u0174\3\2\2"+
		"\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7\2\2\3\u017b\7\3\2\2\2\u017c"+
		"\u017e\7(\2\2\u017d\u017f\5\f\7\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7+\2\2\u0181\u0182\7T\2\2\u0182\u0186"+
		"\5\u00d0i\2\u0183\u0185\7[\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2"+
		"\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0189\u018a\7\2\2\3\u018a\t\3\2\2\2\u018b\u018c\5\u00c0a\2\u018c"+
		"\13\3\2\2\2\u018d\u0192\5\u00d0i\2\u018e\u018f\7\60\2\2\u018f\u0191\5"+
		"\u00d0i\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2"+
		"\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196"+
		"\7\60\2\2\u0196\u0197\7\64\2\2\u0197\u0198\5\u00d0i\2\u0198\u0199\7\60"+
		"\2\2\u0199\u019a\7D\2\2\u019a\u019b\5\u00d0i\2\u019b\u01c7\3\2\2\2\u019c"+
		"\u01a1\5\u00d0i\2\u019d\u019e\7\60\2\2\u019e\u01a0\5\u00d0i\2\u019f\u019d"+
		"\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7\60\2\2\u01a5\u01a6\7"+
		"\64\2\2\u01a6\u01a7\5\u00d0i\2\u01a7\u01c7\3\2\2\2\u01a8\u01ad\5\u00d0"+
		"i\2\u01a9\u01aa\7\60\2\2\u01aa\u01ac\5\u00d0i\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2"+
		"\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7\60\2\2\u01b1\u01b2\7D\2\2\u01b2"+
		"\u01b3\5\u00d0i\2\u01b3\u01c7\3\2\2\2\u01b4\u01b5\7\64\2\2\u01b5\u01b6"+
		"\5\u00d0i\2\u01b6\u01b7\7\60\2\2\u01b7\u01b8\7D\2\2\u01b8\u01b9\5\u00d0"+
		"i\2\u01b9\u01c7\3\2\2\2\u01ba\u01bb\7\64\2\2\u01bb\u01c7\5\u00d0i\2\u01bc"+
		"\u01bd\7D\2\2\u01bd\u01c7\5\u00d0i\2\u01be\u01c3\5\u00d0i\2\u01bf\u01c0"+
		"\7\60\2\2\u01c0\u01c2\5\u00d0i\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2"+
		"\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c6\u018d\3\2\2\2\u01c6\u019c\3\2\2\2\u01c6\u01a8\3\2\2\2\u01c6"+
		"\u01b4\3\2\2\2\u01c6\u01ba\3\2\2\2\u01c6\u01bc\3\2\2\2\u01c6\u01be\3\2"+
		"\2\2\u01c7\r\3\2\2\2\u01c8\u01ca\5\20\t\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\17\3\2\2\2\u01cd"+
		"\u01d0\5\30\r\2\u01ce\u01d0\5\24\13\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce"+
		"\3\2\2\2\u01d0\21\3\2\2\2\u01d1\u01d2\5\30\r\2\u01d2\u01d3\7[\2\2\u01d3"+
		"\u01d8\3\2\2\2\u01d4\u01d8\5\24\13\2\u01d5\u01d8\7[\2\2\u01d6\u01d8\7"+
		"\2\2\3\u01d7\u01d1\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d6\3\2\2\2\u01d8\23\3\2\2\2\u01d9\u01da\5\26\f\2\u01da\u01db\6\13"+
		"\2\2\u01db\u01dc\7[\2\2\u01dc\u01eb\3\2\2\2\u01dd\u01e2\5\26\f\2\u01de"+
		"\u01df\7\61\2\2\u01df\u01e1\5\26\f\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3"+
		"\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e5\u01e7\7\61\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3"+
		"\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7[\2\2\u01e9\u01eb\3\2\2\2\u01ea"+
		"\u01d9\3\2\2\2\u01ea\u01dd\3\2\2\2\u01eb\25\3\2\2\2\u01ec\u01fa\5\32\16"+
		"\2\u01ed\u01fa\5\u00c0a\2\u01ee\u01fa\5\u0096L\2\u01ef\u01fa\5(\25\2\u01f0"+
		"\u01fa\5\u0098M\2\u01f1\u01fa\7\t\2\2\u01f2\u01fa\5&\24\2\u01f3\u01fa"+
		"\5\"\22\2\u01f4\u01fa\5$\23\2\u01f5\u01fa\7\13\2\2\u01f6\u01fa\7\25\2"+
		"\2\u01f7\u01fa\5\36\20\2\u01f8\u01fa\5 \21\2\u01f9\u01ec\3\2\2\2\u01f9"+
		"\u01ed\3\2\2\2\u01f9\u01ee\3\2\2\2\u01f9\u01ef\3\2\2\2\u01f9\u01f0\3\2"+
		"\2\2\u01f9\u01f1\3\2\2\2\u01f9\u01f2\3\2\2\2\u01f9\u01f3\3\2\2\2\u01f9"+
		"\u01f4\3\2\2\2\u01f9\u01f5\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01f8\3\2\2\2\u01fa\27\3\2\2\2\u01fb\u0204\5\u009aN\2\u01fc"+
		"\u0204\5:\36\2\u01fd\u0204\5\u00ba^\2\u01fe\u0204\5D#\2\u01ff\u0204\5"+
		"B\"\2\u0200\u0204\5H%\2\u0201\u0204\5@!\2\u0202\u0204\5N(\2\u0203\u01fb"+
		"\3\2\2\2\u0203\u01fc\3\2\2\2\u0203\u01fd\3\2\2\2\u0203\u01fe\3\2\2\2\u0203"+
		"\u01ff\3\2\2\2\u0203\u0200\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2"+
		"\2\2\u0204\31\3\2\2\2\u0205\u0206\7W\2\2\u0206\u0207\7/\2\2\u0207\u020a"+
		"\5\u00d0i\2\u0208\u0209\7:\2\2\u0209\u020b\5\u00ccg\2\u020a\u0208\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u022f\3\2\2\2\u020c\u020d\7(\2\2\u020d"+
		"\u020e\5\u0158\u00ad\2\u020e\u020f\7+\2\2\u020f\u0212\3\2\2\2\u0210\u0212"+
		"\5\u015a\u00ae\2\u0211\u020c\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0213\3"+
		"\2\2\2\u0213\u0214\7/\2\2\u0214\u0217\5\u00d0i\2\u0215\u0216\7:\2\2\u0216"+
		"\u0218\5\u00ccg\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u022f"+
		"\3\2\2\2\u0219\u021a\5\u014c\u00a7\2\u021a\u021b\7:\2\2\u021b\u021d\3"+
		"\2\2\2\u021c\u0219\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u0223\5\u013e\u00a0\2\u0221\u0223"+
		"\5\u00c0a\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2\2\u0223\u0224\3\2\2"+
		"\2\u0224\u0226\6\16\3\2\u0225\u0227\7Z\2\2\u0226\u0225\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u022f\3\2\2\2\u0228\u0229\5\u0158\u00ad\2\u0229\u022c\5"+
		"\34\17\2\u022a\u022d\5\u013e\u00a0\2\u022b\u022d\5\u00c0a\2\u022c\u022a"+
		"\3\2\2\2\u022c\u022b\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u0205\3\2\2\2\u022e"+
		"\u0211\3\2\2\2\u022e\u021c\3\2\2\2\u022e\u0228\3\2\2\2\u022f\33\3\2\2"+
		"\2\u0230\u0231\t\2\2\2\u0231\35\3\2\2\2\u0232\u0233\7 \2\2\u0233\u0238"+
		"\7W\2\2\u0234\u0235\7\60\2\2\u0235\u0237\7W\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\37\3\2\2"+
		"\2\u023a\u0238\3\2\2\2\u023b\u023c\7\34\2\2\u023c\u0241\7W\2\2\u023d\u023e"+
		"\7\60\2\2\u023e\u0240\7W\2\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242!\3\2\2\2\u0243\u0241\3\2\2\2"+
		"\u0244\u0245\5\u013e\u00a0\2\u0245#\3\2\2\2\u0246\u0247\7\36\2\2\u0247"+
		"\u024a\5\u00d0i\2\u0248\u0249\7\60\2\2\u0249\u024b\5\u00d0i\2\u024a\u0248"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b%\3\2\2\2\u024c\u024d\7\37\2\2\u024d"+
		"\u024e\5\u015c\u00af\2\u024e\u024f\6\24\4\2\u024f\'\3\2\2\2\u0250\u0253"+
		"\5*\26\2\u0251\u0253\5,\27\2\u0252\u0250\3\2\2\2\u0252\u0251\3\2\2\2\u0253"+
		")\3\2\2\2\u0254\u0255\7\b\2\2\u0255\u0256\5\64\33\2\u0256+\3\2\2\2\u0257"+
		"\u025b\7\33\2\2\u0258\u025a\t\3\2\2\u0259\u0258\3\2\2\2\u025a\u025d\3"+
		"\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025e\u025f\58\35\2\u025f\u0260\7\b\2\2\u0260\u0261\5."+
		"\30\2\u0261\u026b\3\2\2\2\u0262\u0264\7\33\2\2\u0263\u0265\t\3\2\2\u0264"+
		"\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267\u0268\3\2\2\2\u0268\u0269\7\b\2\2\u0269\u026b\5.\30\2\u026a"+
		"\u0257\3\2\2\2\u026a\u0262\3\2\2\2\u026b-\3\2\2\2\u026c\u026d\7(\2\2\u026d"+
		"\u026f\5\60\31\2\u026e\u0270\7\60\2\2\u026f\u026e\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\7+\2\2\u0272\u0278\3\2\2\2\u0273"+
		"\u0274\5\60\31\2\u0274\u0275\6\30\5\2\u0275\u0278\3\2\2\2\u0276\u0278"+
		"\7\64\2\2\u0277\u026c\3\2\2\2\u0277\u0273\3\2\2\2\u0277\u0276\3\2\2\2"+
		"\u0278/\3\2\2\2\u0279\u027e\5\62\32\2\u027a\u027b\7\60\2\2\u027b\u027d"+
		"\5\62\32\2\u027c\u027a\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2"+
		"\u027e\u027f\3\2\2\2\u027f\61\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0284"+
		"\7W\2\2\u0282\u0283\7\31\2\2\u0283\u0285\7W\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\63\3\2\2\2\u0286\u028b\5\66\34\2\u0287\u0288\7\60"+
		"\2\2\u0288\u028a\5\66\34\2\u0289\u0287\3\2\2\2\u028a\u028d\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\65\3\2\2\2\u028d\u028b\3\2\2"+
		"\2\u028e\u0291\58\35\2\u028f\u0290\7\31\2\2\u0290\u0292\7W\2\2\u0291\u028f"+
		"\3\2\2\2\u0291\u0292\3\2\2\2\u0292\67\3\2\2\2\u0293\u0294\b\35\1\2\u0294"+
		"\u0295\7W\2\2\u0295\u029b\3\2\2\2\u0296\u0297\f\4\2\2\u0297\u0298\7.\2"+
		"\2\u0298\u029a\7W\2\2\u0299\u0296\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c9\3\2\2\2\u029d\u029b\3\2\2\2\u029e"+
		"\u029f\7%\2\2\u029f\u02a0\5\u00caf\2\u02a0\u02a1\7/\2\2\u02a1\u02a2\5"+
		"\u00be`\2\u02a2\u02a3\5<\37\2\u02a3\u02ac\3\2\2\2\u02a4\u02a5\7%\2\2\u02a5"+
		"\u02a6\5\u00caf\2\u02a6\u02a7\7/\2\2\u02a7\u02a9\5\u00be`\2\u02a8\u02aa"+
		"\5> \2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab"+
		"\u029e\3\2\2\2\u02ab\u02a4\3\2\2\2\u02ac;\3\2\2\2\u02ad\u02ae\7$\2\2\u02ae"+
		"\u02af\5\u00caf\2\u02af\u02b0\7/\2\2\u02b0\u02b1\5\u00be`\2\u02b1\u02b2"+
		"\5<\37\2\u02b2\u02bb\3\2\2\2\u02b3\u02b4\7$\2\2\u02b4\u02b5\5\u00caf\2"+
		"\u02b5\u02b6\7/\2\2\u02b6\u02b8\5\u00be`\2\u02b7\u02b9\5> \2\u02b8\u02b7"+
		"\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02ad\3\2\2\2\u02ba"+
		"\u02b3\3\2\2\2\u02bb=\3\2\2\2\u02bc\u02bd\7\7\2\2\u02bd\u02be\7/\2\2\u02be"+
		"\u02bf\5\u00be`\2\u02bf?\3\2\2\2\u02c0\u02c1\7\35\2\2\u02c1\u02c2\5\u00ca"+
		"f\2\u02c2\u02c3\7/\2\2\u02c3\u02c5\5\u00be`\2\u02c4\u02c6\5> \2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6A\3\2\2\2\u02c7\u02c8\7\26\2\2"+
		"\u02c8\u02c9\5\u014c\u00a7\2\u02c9\u02ca\7\r\2\2\u02ca\u02cb\5\u00c0a"+
		"\2\u02cb\u02cd\7/\2\2\u02cc\u02ce\7Z\2\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce"+
		"\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\5\u00be`\2\u02d0\u02d2\5> \2"+
		"\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02e1\3\2\2\2\u02d3\u02d4"+
		"\7#\2\2\u02d4\u02d5\7\26\2\2\u02d5\u02d6\5\u014c\u00a7\2\u02d6\u02d7\7"+
		"\r\2\2\u02d7\u02d8\5\u00c0a\2\u02d8\u02da\7/\2\2\u02d9\u02db\7Z\2\2\u02da"+
		"\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\5\u00be"+
		"`\2\u02dd\u02df\5> \2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1"+
		"\3\2\2\2\u02e0\u02c7\3\2\2\2\u02e0\u02d3\3\2\2\2\u02e1C\3\2\2\2\u02e2"+
		"\u02e3\7\"\2\2\u02e3\u02e4\7(\2\2\u02e4\u02e9\5F$\2\u02e5\u02e6\7\60\2"+
		"\2\u02e6\u02e8\5F$\2\u02e7\u02e5\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7"+
		"\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec"+
		"\u02ee\7\60\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3"+
		"\2\2\2\u02ef\u02f0\7+\2\2\u02f0\u02f1\7/\2\2\u02f1\u02f2\5\u00be`\2\u02f2"+
		"\u0325\3\2\2\2\u02f3\u02f4\7\"\2\2\u02f4\u02f9\5F$\2\u02f5\u02f6\7\60"+
		"\2\2\u02f6\u02f8\5F$\2\u02f7\u02f5\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7"+
		"\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc"+
		"\u02fe\7/\2\2\u02fd\u02ff\7Z\2\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2"+
		"\2\u02ff\u0300\3\2\2\2\u0300\u0301\5\u00be`\2\u0301\u0325\3\2\2\2\u0302"+
		"\u0303\7#\2\2\u0303\u0304\7\"\2\2\u0304\u0305\7(\2\2\u0305\u030a\5F$\2"+
		"\u0306\u0307\7\60\2\2\u0307\u0309\5F$\2\u0308\u0306\3\2\2\2\u0309\u030c"+
		"\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030e\3\2\2\2\u030c"+
		"\u030a\3\2\2\2\u030d\u030f\7\60\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3"+
		"\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\7+\2\2\u0311\u0312\7/\2\2\u0312"+
		"\u0313\5\u00be`\2\u0313\u0325\3\2\2\2\u0314\u0315\7#\2\2\u0315\u0316\7"+
		"\"\2\2\u0316\u031b\5F$\2\u0317\u0318\7\60\2\2\u0318\u031a\5F$\2\u0319"+
		"\u0317\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2"+
		"\2\2\u031c\u031e\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u0320\7/\2\2\u031f"+
		"\u0321\7Z\2\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0323\5\u00be`\2\u0323\u0325\3\2\2\2\u0324\u02e2\3\2\2\2\u0324"+
		"\u02f3\3\2\2\2\u0324\u0302\3\2\2\2\u0324\u0314\3\2\2\2\u0325E\3\2\2\2"+
		"\u0326\u0327\5\u00d0i\2\u0327\u0328\7\31\2\2\u0328\u0329\5\u0152\u00aa"+
		"\2\u0329\u032a\6$\7\2\u032a\u032d\3\2\2\2\u032b\u032d\5\u00d0i\2\u032c"+
		"\u0326\3\2\2\2\u032c\u032b\3\2\2\2\u032dG\3\2\2\2\u032e\u032f\7\30\2\2"+
		"\u032f\u0330\7/\2\2\u0330\u0331\5\u00be`\2\u0331\u0332\5L\'\2\u0332\u0342"+
		"\3\2\2\2\u0333\u0334\7\30\2\2\u0334\u0335\7/\2\2\u0335\u0337\5\u00be`"+
		"\2\u0336\u0338\5J&\2\u0337\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u0337"+
		"\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b\u033d\5> \2\u033c"+
		"\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u0340\5L"+
		"\'\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341"+
		"\u032e\3\2\2\2\u0341\u0333\3\2\2\2\u0342I\3\2\2\2\u0343\u0344\7\f\2\2"+
		"\u0344\u0347\5\u00d0i\2\u0345\u0346\7\31\2\2\u0346\u0348\7W\2\2\u0347"+
		"\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\7/"+
		"\2\2\u034a\u034b\5\u00be`\2\u034b\u0350\3\2\2\2\u034c\u034d\7\f\2\2\u034d"+
		"\u034e\7/\2\2\u034e\u0350\5\u00be`\2\u034f\u0343\3\2\2\2\u034f\u034c\3"+
		"\2\2\2\u0350K\3\2\2\2\u0351\u0352\7\21\2\2\u0352\u0353\7/\2\2\u0353\u0354"+
		"\5\u00be`\2\u0354M\3\2\2\2\u0355\u0356\5\u0164\u00b3\2\u0356\u0357\5P"+
		")\2\u0357\u0358\7/\2\2\u0358\u0359\7[\2\2\u0359\u035b\7\3\2\2\u035a\u035c"+
		"\5R*\2\u035b\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035b\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\7\4\2\2\u0360O\3\2\2\2"+
		"\u0361\u0362\5\u00c6d\2\u0362\u0364\7\60\2\2\u0363\u0365\5\u00c4c\2\u0364"+
		"\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0368\5\u00ca"+
		"f\2\u0367\u0361\3\2\2\2\u0367\u0366\3\2\2\2\u0368Q\3\2\2\2\u0369\u036a"+
		"\5\u0166\u00b4\2\u036a\u036c\5V,\2\u036b\u036d\5T+\2\u036c\u036b\3\2\2"+
		"\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\7/\2\2\u036f\u0370"+
		"\5\u00be`\2\u0370S\3\2\2\2\u0371\u0372\7%\2\2\u0372\u0373\5\u00caf\2\u0373"+
		"U\3\2\2\2\u0374\u0377\5~@\2\u0375\u0377\5X-\2\u0376\u0374\3\2\2\2\u0376"+
		"\u0375\3\2\2\2\u0377W\3\2\2\2\u0378\u037b\5Z.\2\u0379\u037b\5\\/\2\u037a"+
		"\u0378\3\2\2\2\u037a\u0379\3\2\2\2\u037bY\3\2\2\2\u037c\u037d\5\\/\2\u037d"+
		"\u037e\7\31\2\2\u037e\u037f\5p9\2\u037f[\3\2\2\2\u0380\u0385\5^\60\2\u0381"+
		"\u0382\7\66\2\2\u0382\u0384\5^\60\2\u0383\u0381\3\2\2\2\u0384\u0387\3"+
		"\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386]\3\2\2\2\u0387\u0385"+
		"\3\2\2\2\u0388\u0391\5`\61\2\u0389\u0391\5n8\2\u038a\u0391\5r:\2\u038b"+
		"\u0391\5t;\2\u038c\u0391\5z>\2\u038d\u0391\5|?\2\u038e\u0391\5\u0086D"+
		"\2\u038f\u0391\5\u008eH\2\u0390\u0388\3\2\2\2\u0390\u0389\3\2\2\2\u0390"+
		"\u038a\3\2\2\2\u0390\u038b\3\2\2\2\u0390\u038c\3\2\2\2\u0390\u038d\3\2"+
		"\2\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391_\3\2\2\2\u0392\u0393"+
		"\5f\64\2\u0393\u0394\6\61\b\2\u0394\u039b\3\2\2\2\u0395\u039b\5d\63\2"+
		"\u0396\u039b\5\u0120\u0091\2\u0397\u039b\7\n\2\2\u0398\u039b\7\17\2\2"+
		"\u0399\u039b\7\5\2\2\u039a\u0392\3\2\2\2\u039a\u0395\3\2\2\2\u039a\u0396"+
		"\3\2\2\2\u039a\u0397\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039b"+
		"a\3\2\2\2\u039c\u039d\5f\64\2\u039d\u039e\6\62\t\2\u039e\u03a5\3\2\2\2"+
		"\u039f\u03a5\5d\63\2\u03a0\u03a5\5\u0120\u0091\2\u03a1\u03a5\7\n\2\2\u03a2"+
		"\u03a5\7\17\2\2\u03a3\u03a5\7\5\2\2\u03a4\u039c\3\2\2\2\u03a4\u039f\3"+
		"\2\2\2\u03a4\u03a0\3\2\2\2\u03a4\u03a1\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4"+
		"\u03a3\3\2\2\2\u03a5c\3\2\2\2\u03a6\u03a7\5h\65\2\u03a7\u03a8\7\62\2\2"+
		"\u03a8\u03a9\5l\67\2\u03a9\u03af\3\2\2\2\u03aa\u03ab\5h\65\2\u03ab\u03ac"+
		"\7\63\2\2\u03ac\u03ad\5l\67\2\u03ad\u03af\3\2\2\2\u03ae\u03a6\3\2\2\2"+
		"\u03ae\u03aa\3\2\2\2\u03afe\3\2\2\2\u03b0\u03b4\7X\2\2\u03b1\u03b2\7\63"+
		"\2\2\u03b2\u03b4\7X\2\2\u03b3\u03b0\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4"+
		"g\3\2\2\2\u03b5\u03b9\5j\66\2\u03b6\u03b7\7\63\2\2\u03b7\u03b9\5j\66\2"+
		"\u03b8\u03b5\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9i\3\2\2\2\u03ba\u03bb\7"+
		"X\2\2\u03bbk\3\2\2\2\u03bc\u03bd\7X\2\2\u03bdm\3\2\2\2\u03be\u03bf\5p"+
		"9\2\u03bfo\3\2\2\2\u03c0\u03c1\5\u016a\u00b6\2\u03c1\u03c2\7W\2\2\u03c2"+
		"\u03c3\69\n\2\u03c3q\3\2\2\2\u03c4\u03c5\5\u0168\u00b5\2\u03c5s\3\2\2"+
		"\2\u03c6\u03c7\5v<\2\u03c7\u03c8\6;\13\2\u03c8u\3\2\2\2\u03c9\u03ca\5"+
		"x=\2\u03ca\u03cb\7.\2\2\u03cb\u03cc\7W\2\2\u03ccw\3\2\2\2\u03cd\u03ce"+
		"\b=\1\2\u03ce\u03cf\7W\2\2\u03cf\u03d5\3\2\2\2\u03d0\u03d1\f\4\2\2\u03d1"+
		"\u03d2\7.\2\2\u03d2\u03d4\7W\2\2\u03d3\u03d0\3\2\2\2\u03d4\u03d7\3\2\2"+
		"\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6y\3\2\2\2\u03d7\u03d5"+
		"\3\2\2\2\u03d8\u03d9\7(\2\2\u03d9\u03da\5X-\2\u03da\u03db\7+\2\2\u03db"+
		"{\3\2\2\2\u03dc\u03de\7)\2\2\u03dd\u03df\5\u0080A\2\u03de\u03dd\3\2\2"+
		"\2\u03de\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e7\7,\2\2\u03e1\u03e3"+
		"\7(\2\2\u03e2\u03e4\5~@\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03e5\3\2\2\2\u03e5\u03e7\7+\2\2\u03e6\u03dc\3\2\2\2\u03e6\u03e1\3\2"+
		"\2\2\u03e7}\3\2\2\2\u03e8\u03e9\5\u0082B\2\u03e9\u03eb\7\60\2\2\u03ea"+
		"\u03ec\5\u0080A\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\177\3"+
		"\2\2\2\u03ed\u03f2\5\u0082B\2\u03ee\u03ef\7\60\2\2\u03ef\u03f1\5\u0082"+
		"B\2\u03f0\u03ee\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2"+
		"\u03f3\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f5\u03f7\7\60"+
		"\2\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u0081\3\2\2\2\u03f8"+
		"\u03fb\5\u0084C\2\u03f9\u03fb\5X-\2\u03fa\u03f8\3\2\2\2\u03fa\u03f9\3"+
		"\2\2\2\u03fb\u0083\3\2\2\2\u03fc\u03fd\7\64\2\2\u03fd\u0401\5p9\2\u03fe"+
		"\u03ff\7\64\2\2\u03ff\u0401\5r:\2\u0400\u03fc\3\2\2\2\u0400\u03fe\3\2"+
		"\2\2\u0401\u0085\3\2\2\2\u0402\u0403\7*\2\2\u0403\u041c\7-\2\2\u0404\u0405"+
		"\7*\2\2\u0405\u0407\5\u008cG\2\u0406\u0408\7\60\2\2\u0407\u0406\3\2\2"+
		"\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\7-\2\2\u040a\u041c"+
		"\3\2\2\2\u040b\u040c\7*\2\2\u040c\u040d\5\u0088E\2\u040d\u040e\7\60\2"+
		"\2\u040e\u0410\5\u008cG\2\u040f\u0411\7\60\2\2\u0410\u040f\3\2\2\2\u0410"+
		"\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\7-\2\2\u0413\u041c\3\2"+
		"\2\2\u0414\u0415\7*\2\2\u0415\u0417\5\u0088E\2\u0416\u0418\7\60\2\2\u0417"+
		"\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\7-"+
		"\2\2\u041a\u041c\3\2\2\2\u041b\u0402\3\2\2\2\u041b\u0404\3\2\2\2\u041b"+
		"\u040b\3\2\2\2\u041b\u0414\3\2\2\2\u041c\u0087\3\2\2\2\u041d\u0422\5\u008a"+
		"F\2\u041e\u041f\7\60\2\2\u041f\u0421\5\u008aF\2\u0420\u041e\3\2\2\2\u0421"+
		"\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0089\3\2"+
		"\2\2\u0424\u0422\3\2\2\2\u0425\u0428\5b\62\2\u0426\u0428\5v<\2\u0427\u0425"+
		"\3\2\2\2\u0427\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\7/\2\2\u042a"+
		"\u042b\5X-\2\u042b\u008b\3\2\2\2\u042c\u042d\7D\2\2\u042d\u042e\5p9\2"+
		"\u042e\u008d\3\2\2\2\u042f\u0430\5x=\2\u0430\u0431\7(\2\2\u0431\u0432"+
		"\7+\2\2\u0432\u044e\3\2\2\2\u0433\u0434\5x=\2\u0434\u0435\7(\2\2\u0435"+
		"\u0437\5\u0090I\2\u0436\u0438\7\60\2\2\u0437\u0436\3\2\2\2\u0437\u0438"+
		"\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\7+\2\2\u043a\u044e\3\2\2\2\u043b"+
		"\u043c\5x=\2\u043c\u043d\7(\2\2\u043d\u043f\5\u0092J\2\u043e\u0440\7\60"+
		"\2\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441"+
		"\u0442\7+\2\2\u0442\u044e\3\2\2\2\u0443\u0444\5x=\2\u0444\u0445\7(\2\2"+
		"\u0445\u0446\5\u0090I\2\u0446\u0447\7\60\2\2\u0447\u0449\5\u0092J\2\u0448"+
		"\u044a\7\60\2\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3"+
		"\2\2\2\u044b\u044c\7+\2\2\u044c\u044e\3\2\2\2\u044d\u042f\3\2\2\2\u044d"+
		"\u0433\3\2\2\2\u044d\u043b\3\2\2\2\u044d\u0443\3\2\2\2\u044e\u008f\3\2"+
		"\2\2\u044f\u0454\5X-\2\u0450\u0451\7\60\2\2\u0451\u0453\5X-\2\u0452\u0450"+
		"\3\2\2\2\u0453\u0456\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u0091\3\2\2\2\u0456\u0454\3\2\2\2\u0457\u045c\5\u0094K\2\u0458\u0459"+
		"\7\60\2\2\u0459\u045b\5\u0094K\2\u045a\u0458\3\2\2\2\u045b\u045e\3\2\2"+
		"\2\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u0093\3\2\2\2\u045e\u045c"+
		"\3\2\2\2\u045f\u0460\7W\2\2\u0460\u0461\7:\2\2\u0461\u0462\5X-\2\u0462"+
		"\u0095\3\2\2\2\u0463\u0465\7\23\2\2\u0464\u0466\5\u00c0a\2\u0465\u0464"+
		"\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0097\3\2\2\2\u0467\u0468\7\16\2\2"+
		"\u0468\u046b\5\u00d0i\2\u0469\u046a\7\33\2\2\u046a\u046c\5\u00d0i\2\u046b"+
		"\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046f\3\2\2\2\u046d\u046f\7\16"+
		"\2\2\u046e\u0467\3\2\2\2\u046e\u046d\3\2\2\2\u046f\u0099\3\2\2\2\u0470"+
		"\u0471\5\u00b8]\2\u0471\u0472\5\u009cO\2\u0472\u0475\3\2\2\2\u0473\u0475"+
		"\5\u009cO\2\u0474\u0470\3\2\2\2\u0474\u0473\3\2\2\2\u0475\u009b\3\2\2"+
		"\2\u0476\u0477\7\32\2\2\u0477\u0478\7W\2\2\u0478\u047a\7(\2\2\u0479\u047b"+
		"\5\u00a0Q\2\u047a\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2"+
		"\2\u047c\u047f\7+\2\2\u047d\u047e\7T\2\2\u047e\u0480\5\u00d0i\2\u047f"+
		"\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0483\7/"+
		"\2\2\u0482\u0484\5\u009eP\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2\2\2\u0484"+
		"\u0485\3\2\2\2\u0485\u0498\5\u00be`\2\u0486\u0487\7#\2\2\u0487\u0488\7"+
		"\32\2\2\u0488\u0489\7W\2\2\u0489\u048b\7(\2\2\u048a\u048c\5\u00a0Q\2\u048b"+
		"\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u0490\7+"+
		"\2\2\u048e\u048f\7T\2\2\u048f\u0491\5\u00d0i\2\u0490\u048e\3\2\2\2\u0490"+
		"\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0494\7/\2\2\u0493\u0495\5\u009e"+
		"P\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2\2\2\u0496"+
		"\u0498\5\u00be`\2\u0497\u0476\3\2\2\2\u0497\u0486\3\2\2\2\u0498\u009d"+
		"\3\2\2\2\u0499\u049a\7[\2\2\u049a\u049b\7Z\2\2\u049b\u049e\6P\r\2\u049c"+
		"\u049e\7Z\2\2\u049d\u0499\3\2\2\2\u049d\u049c\3\2\2\2\u049e\u009f\3\2"+
		"\2\2\u049f\u04a0\5\u00a2R\2\u04a0\u00a1\3\2\2\2\u04a1\u04a5\5\u00a4S\2"+
		"\u04a2\u04a4\5\u00acW\2\u04a3\u04a2\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5"+
		"\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04ab\3\2\2\2\u04a7\u04a5\3\2"+
		"\2\2\u04a8\u04aa\5\u00aeX\2\u04a9\u04a8\3\2\2\2\u04aa\u04ad\3\2\2\2\u04ab"+
		"\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2"+
		"\2\2\u04ae\u04b0\5\u00a8U\2\u04af\u04ae\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04d3\3\2\2\2\u04b1\u04b5\5\u00a6T\2\u04b2\u04b4\5\u00aeX\2\u04b3\u04b2"+
		"\3\2\2\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6"+
		"\u04b9\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8\u04ba\5\u00a8U\2\u04b9\u04b8"+
		"\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04d3\3\2\2\2\u04bb\u04bd\5\u00acW"+
		"\2\u04bc\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf"+
		"\3\2\2\2\u04bf\u04c3\3\2\2\2\u04c0\u04c2\5\u00aeX\2\u04c1\u04c0\3\2\2"+
		"\2\u04c2\u04c5\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c7"+
		"\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c6\u04c8\5\u00a8U\2\u04c7\u04c6\3\2\2"+
		"\2\u04c7\u04c8\3\2\2\2\u04c8\u04d3\3\2\2\2\u04c9\u04cb\5\u00aeX\2\u04ca"+
		"\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd\3\2"+
		"\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04d0\5\u00a8U\2\u04cf\u04ce\3\2\2\2\u04cf"+
		"\u04d0\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04d3\5\u00a8U\2\u04d2\u04a1"+
		"\3\2\2\2\u04d2\u04b1\3\2\2\2\u04d2\u04bc\3\2\2\2\u04d2\u04ca\3\2\2\2\u04d2"+
		"\u04d1\3\2\2\2\u04d3\u00a3\3\2\2\2\u04d4\u04d6\5\u00acW\2\u04d5\u04d4"+
		"\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8"+
		"\u04d9\3\2\2\2\u04d9\u04da\7\65\2\2\u04da\u04db\7\60\2\2\u04db\u04e5\3"+
		"\2\2\2\u04dc\u04de\5\u00acW\2\u04dd\u04dc\3\2\2\2\u04de\u04df\3\2\2\2"+
		"\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2"+
		"\7\65\2\2\u04e2\u04e3\6S\16\2\u04e3\u04e5\3\2\2\2\u04e4\u04d5\3\2\2\2"+
		"\u04e4\u04dd\3\2\2\2\u04e5\u00a5\3\2\2\2\u04e6\u04e8\5\u00acW\2\u04e7"+
		"\u04e6\3\2\2\2\u04e8\u04eb\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2"+
		"\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04ee\5\u00aeX\2\u04ed"+
		"\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2"+
		"\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\7\65\2\2\u04f2\u04f3\7\60\2\2\u04f3"+
		"\u0503\3\2\2\2\u04f4\u04f6\5\u00acW\2\u04f5\u04f4\3\2\2\2\u04f6\u04f9"+
		"\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9"+
		"\u04f7\3\2\2\2\u04fa\u04fc\5\u00aeX\2\u04fb\u04fa\3\2\2\2\u04fc\u04fd"+
		"\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u0500\7\65\2\2\u0500\u0501\6T\17\2\u0501\u0503\3\2\2\2\u0502\u04e9\3"+
		"\2\2\2\u0502\u04f7\3\2\2\2\u0503\u00a7\3\2\2\2\u0504\u0505\7\64\2\2\u0505"+
		"\u0509\5\u00acW\2\u0506\u0508\5\u00b0Y\2\u0507\u0506\3\2\2\2\u0508\u050b"+
		"\3\2\2\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050d\3\2\2\2\u050b"+
		"\u0509\3\2\2\2\u050c\u050e\5\u00aaV\2\u050d\u050c\3\2\2\2\u050d\u050e"+
		"\3\2\2\2\u050e\u051b\3\2\2\2\u050f\u0510\7\64\2\2\u0510\u0512\7\60\2\2"+
		"\u0511\u0513\5\u00b0Y\2\u0512\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514"+
		"\u0512\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0518\5\u00aa"+
		"V\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051b\3\2\2\2\u0519"+
		"\u051b\5\u00aaV\2\u051a\u0504\3\2\2\2\u051a\u050f\3\2\2\2\u051a\u0519"+
		"\3\2\2\2\u051b\u00a9\3\2\2\2\u051c\u051d\7D\2\2\u051d\u051e\5\u00acW\2"+
		"\u051e\u00ab\3\2\2\2\u051f\u0520\5\u00b2Z\2\u0520\u0522\7\60\2\2\u0521"+
		"\u0523\7Z\2\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u052b\3\2"+
		"\2\2\u0524\u0526\5\u00b2Z\2\u0525\u0527\7Z\2\2\u0526\u0525\3\2\2\2\u0526"+
		"\u0527\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\6W\20\2\u0529\u052b\3\2"+
		"\2\2\u052a\u051f\3\2\2\2\u052a\u0524\3\2\2\2\u052b\u00ad\3\2\2\2\u052c"+
		"\u052d\5\u00b2Z\2\u052d\u052e\5\u00b6\\\2\u052e\u0530\7\60\2\2\u052f\u0531"+
		"\7Z\2\2\u0530\u052f\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u053a\3\2\2\2\u0532"+
		"\u0533\5\u00b2Z\2\u0533\u0535\5\u00b6\\\2\u0534\u0536\7Z\2\2\u0535\u0534"+
		"\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\6X\21\2\u0538"+
		"\u053a\3\2\2\2\u0539\u052c\3\2\2\2\u0539\u0532\3\2\2\2\u053a\u00af\3\2"+
		"\2\2\u053b\u053d\5\u00b2Z\2\u053c\u053e\5\u00b6\\\2\u053d\u053c\3\2\2"+
		"\2\u053d\u053e\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\7\60\2\2\u0540"+
		"\u0542\7Z\2\2\u0541\u0540\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u054d\3\2"+
		"\2\2\u0543\u0545\5\u00b2Z\2\u0544\u0546\5\u00b6\\\2\u0545\u0544\3\2\2"+
		"\2\u0545\u0546\3\2\2\2\u0546\u0548\3\2\2\2\u0547\u0549\7Z\2\2\u0548\u0547"+
		"\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b\6Y\22\2\u054b"+
		"\u054d\3\2\2\2\u054c\u053b\3\2\2\2\u054c\u0543\3\2\2\2\u054d\u00b1\3\2"+
		"\2\2\u054e\u0550\7W\2\2\u054f\u0551\5\u00b4[\2\u0550\u054f\3\2\2\2\u0550"+
		"\u0551\3\2\2\2\u0551\u00b3\3\2\2\2\u0552\u0553\7/\2\2\u0553\u0554\5\u00d0"+
		"i\2\u0554\u00b5\3\2\2\2\u0555\u0556\7:\2\2\u0556\u0557\5\u00d0i\2\u0557"+
		"\u00b7\3\2\2\2\u0558\u0559\7R\2\2\u0559\u055a\5\u00caf\2\u055a\u055b\7"+
		"[\2\2\u055b\u055d\3\2\2\2\u055c\u0558\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"\u055c\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u00b9\3\2\2\2\u0560\u0561\5\u00b8"+
		"]\2\u0561\u0562\5\u00bc_\2\u0562\u0565\3\2\2\2\u0563\u0565\5\u00bc_\2"+
		"\u0564\u0560\3\2\2\2\u0564\u0563\3\2\2\2\u0565\u00bb\3\2\2\2\u0566\u0567"+
		"\7\20\2\2\u0567\u056d\7W\2\2\u0568\u056a\7(\2\2\u0569\u056b\5\u0140\u00a1"+
		"\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u056e"+
		"\7+\2\2\u056d\u0568\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u056f\3\2\2\2\u056f"+
		"\u0570\7/\2\2\u0570\u0571\5\u00be`\2\u0571\u00bd\3\2\2\2\u0572\u0573\7"+
		"[\2\2\u0573\u0574\7\3\2\2\u0574\u0575\5\16\b\2\u0575\u0576\7\4\2\2\u0576"+
		"\u0579\3\2\2\2\u0577\u0579\5\24\13\2\u0578\u0572\3\2\2\2\u0578\u0577\3"+
		"\2\2\2\u0579\u00bf\3\2\2\2\u057a\u057d\5\u00c2b\2\u057b\u057c\7\60\2\2"+
		"\u057c\u057e\5\u00c2b\2\u057d\u057b\3\2\2\2\u057e\u057f\3\2\2\2\u057f"+
		"\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2\u0581\u0583\7\60"+
		"\2\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0589\3\2\2\2\u0584"+
		"\u0585\5\u00c2b\2\u0585\u0586\7\60\2\2\u0586\u0589\3\2\2\2\u0587\u0589"+
		"\5\u00c2b\2\u0588\u057a\3\2\2\2\u0588\u0584\3\2\2\2\u0588\u0587\3\2\2"+
		"\2\u0589\u00c1\3\2\2\2\u058a\u058b\7\64\2\2\u058b\u058e\5\u0106\u0084"+
		"\2\u058c\u058e\5\u00d0i\2\u058d\u058a\3\2\2\2\u058d\u058c\3\2\2\2\u058e"+
		"\u00c3\3\2\2\2\u058f\u0594\5\u00c6d\2\u0590\u0591\7\60\2\2\u0591\u0593"+
		"\5\u00c6d\2\u0592\u0590\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2"+
		"\2\u0594\u0595\3\2\2\2\u0595\u0598\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0599"+
		"\7\60\2\2\u0598\u0597\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u00c5\3\2\2\2"+
		"\u059a\u059b\7\64\2\2\u059b\u059e\5\u0106\u0084\2\u059c\u059e\5\u00ca"+
		"f\2\u059d\u059a\3\2\2\2\u059d\u059c\3\2\2\2\u059e\u00c7\3\2\2\2\u059f"+
		"\u05a0\7W\2\2\u05a0\u05a1\7V\2\2\u05a1\u05a2\5\u00d0i\2\u05a2\u00c9\3"+
		"\2\2\2\u05a3\u05a8\5\u00c8e\2\u05a4\u05a5\5\u00d0i\2\u05a5\u05a6\6f\23"+
		"\2\u05a6\u05a8\3\2\2\2\u05a7\u05a3\3\2\2\2\u05a7\u05a4\3\2\2\2\u05a8\u00cb"+
		"\3\2\2\2\u05a9\u05ac\5\u013e\u00a0\2\u05aa\u05ac\5\u00c0a\2\u05ab\u05a9"+
		"\3\2\2\2\u05ab\u05aa\3\2\2\2\u05ac\u00cd\3\2\2\2\u05ad\u05b0\5\u00d0i"+
		"\2\u05ae\u05af\7\60\2\2\u05af\u05b1\5\u00d0i\2\u05b0\u05ae\3\2\2\2\u05b1"+
		"\u05b2\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5\3\2"+
		"\2\2\u05b4\u05b6\7\60\2\2\u05b5\u05b4\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6"+
		"\u05bc\3\2\2\2\u05b7\u05b8\5\u00d0i\2\u05b8\u05b9\7\60\2\2\u05b9\u05bc"+
		"\3\2\2\2\u05ba\u05bc\5\u00d0i\2\u05bb\u05ad\3\2\2\2\u05bb\u05b7\3\2\2"+
		"\2\u05bb\u05ba\3\2\2\2\u05bc\u00cf\3\2\2\2\u05bd\u05be\5\u00e8u\2\u05be"+
		"\u05bf\7%\2\2\u05bf\u05c0\5\u00e8u\2\u05c0\u05c1\7\7\2\2\u05c1\u05c2\5"+
		"\u00d0i\2\u05c2\u05c6\3\2\2\2\u05c3\u05c6\5\u00e8u\2\u05c4\u05c6\5\u00d2"+
		"j\2\u05c5\u05bd\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c4\3\2\2\2\u05c6"+
		"\u00d1\3\2\2\2\u05c7\u05c9\7\27\2\2\u05c8\u05ca\5\u00d4k\2\u05c9\u05c8"+
		"\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\7/\2\2\u05cc"+
		"\u05cd\5\u00d0i\2\u05cd\u00d3\3\2\2\2\u05ce\u05cf\5\u00d6l\2\u05cf\u00d5"+
		"\3\2\2\2\u05d0\u05d4\5\u00d8m\2\u05d1\u05d3\5\u00e0q\2\u05d2\u05d1\3\2"+
		"\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5"+
		"\u05da\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7\u05d9\5\u00e2r\2\u05d8\u05d7"+
		"\3\2\2\2\u05d9\u05dc\3\2\2\2\u05da\u05d8\3\2\2\2\u05da\u05db\3\2\2\2\u05db"+
		"\u05de\3\2\2\2\u05dc\u05da\3\2\2\2\u05dd\u05df\5\u00dco\2\u05de\u05dd"+
		"\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u0602\3\2\2\2\u05e0\u05e4\5\u00dan"+
		"\2\u05e1\u05e3\5\u00e2r\2\u05e2\u05e1\3\2\2\2\u05e3\u05e6\3\2\2\2\u05e4"+
		"\u05e2\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6\u05e4\3\2"+
		"\2\2\u05e7\u05e9\5\u00dco\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9"+
		"\u0602\3\2\2\2\u05ea\u05ec\5\u00e0q\2\u05eb\u05ea\3\2\2\2\u05ec\u05ed"+
		"\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f2\3\2\2\2\u05ef"+
		"\u05f1\5\u00e2r\2\u05f0\u05ef\3\2\2\2\u05f1\u05f4\3\2\2\2\u05f2\u05f0"+
		"\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f5"+
		"\u05f7\5\u00dco\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u0602"+
		"\3\2\2\2\u05f8\u05fa\5\u00e2r\2\u05f9\u05f8\3\2\2\2\u05fa\u05fb\3\2\2"+
		"\2\u05fb\u05f9\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05ff"+
		"\5\u00dco\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0602\3\2\2"+
		"\2\u0600\u0602\5\u00dco\2\u0601\u05d0\3\2\2\2\u0601\u05e0\3\2\2\2\u0601"+
		"\u05eb\3\2\2\2\u0601\u05f9\3\2\2\2\u0601\u0600\3\2\2\2\u0602\u00d7\3\2"+
		"\2\2\u0603\u0605\5\u00e0q\2\u0604\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606"+
		"\u0604\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0609\7\65"+
		"\2\2\u0609\u060a\7\60\2\2\u060a\u0614\3\2\2\2\u060b\u060d\5\u00e0q\2\u060c"+
		"\u060b\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060c\3\2\2\2\u060e\u060f\3\2"+
		"\2\2\u060f\u0610\3\2\2\2\u0610\u0611\7\65\2\2\u0611\u0612\6m\24\2\u0612"+
		"\u0614\3\2\2\2\u0613\u0604\3\2\2\2\u0613\u060c\3\2\2\2\u0614\u00d9\3\2"+
		"\2\2\u0615\u0617\5\u00e0q\2\u0616\u0615\3\2\2\2\u0617\u061a\3\2\2\2\u0618"+
		"\u0616\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061c\3\2\2\2\u061a\u0618\3\2"+
		"\2\2\u061b\u061d\5\u00e2r\2\u061c\u061b\3\2\2\2\u061d\u061e\3\2\2\2\u061e"+
		"\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\7\65"+
		"\2\2\u0621\u0622\7\60\2\2\u0622\u0632\3\2\2\2\u0623\u0625\5\u00e0q\2\u0624"+
		"\u0623\3\2\2\2\u0625\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2"+
		"\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2\2\2\u0629\u062b\5\u00e2r\2\u062a"+
		"\u0629\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062d\3\2"+
		"\2\2\u062d\u062e\3\2\2\2\u062e\u062f\7\65\2\2\u062f\u0630\6n\25\2\u0630"+
		"\u0632\3\2\2\2\u0631\u0618\3\2\2\2\u0631\u0626\3\2\2\2\u0632\u00db\3\2"+
		"\2\2\u0633\u0634\7\64\2\2\u0634\u0638\5\u00e0q\2\u0635\u0637\5\u00e4s"+
		"\2\u0636\u0635\3\2\2\2\u0637\u063a\3\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639"+
		"\3\2\2\2\u0639\u063c\3\2\2\2\u063a\u0638\3\2\2\2\u063b\u063d\5\u00dep"+
		"\2\u063c\u063b\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u064a\3\2\2\2\u063e\u063f"+
		"\7\64\2\2\u063f\u0641\7\60\2\2\u0640\u0642\5\u00e4s\2\u0641\u0640\3\2"+
		"\2\2\u0642\u0643\3\2\2\2\u0643\u0641\3\2\2\2\u0643\u0644\3\2\2\2\u0644"+
		"\u0646\3\2\2\2\u0645\u0647\5\u00dep\2\u0646\u0645\3\2\2\2\u0646\u0647"+
		"\3\2\2\2\u0647\u064a\3\2\2\2\u0648\u064a\5\u00dep\2\u0649\u0633\3\2\2"+
		"\2\u0649\u063e\3\2\2\2\u0649\u0648\3\2\2\2\u064a\u00dd\3\2\2\2\u064b\u064c"+
		"\7D\2\2\u064c\u064d\5\u00e0q\2\u064d\u00df\3\2\2\2\u064e\u064f\5\u00e6"+
		"t\2\u064f\u0650\7\60\2\2\u0650\u0655\3\2\2\2\u0651\u0652\5\u00e6t\2\u0652"+
		"\u0653\6q\26\2\u0653\u0655\3\2\2\2\u0654\u064e\3\2\2\2\u0654\u0651\3\2"+
		"\2\2\u0655\u00e1\3\2\2\2\u0656\u0657\5\u00e6t\2\u0657\u0658\5\u00b6\\"+
		"\2\u0658\u0659\7\60\2\2\u0659\u065f\3\2\2\2\u065a\u065b\5\u00e6t\2\u065b"+
		"\u065c\5\u00b6\\\2\u065c\u065d\6r\27\2\u065d\u065f\3\2\2\2\u065e\u0656"+
		"\3\2\2\2\u065e\u065a\3\2\2\2\u065f\u00e3\3\2\2\2\u0660\u0662\5\u00e6t"+
		"\2\u0661\u0663\5\u00b6\\\2\u0662\u0661\3\2\2\2\u0662\u0663\3\2\2\2\u0663"+
		"\u0664\3\2\2\2\u0664\u0665\7\60\2\2\u0665\u066d\3\2\2\2\u0666\u0668\5"+
		"\u00e6t\2\u0667\u0669\5\u00b6\\\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2"+
		"\2\2\u0669\u066a\3\2\2\2\u066a\u066b\6s\30\2\u066b\u066d\3\2\2\2\u066c"+
		"\u0660\3\2\2\2\u066c\u0666\3\2\2\2\u066d\u00e5\3\2\2\2\u066e\u066f\7W"+
		"\2\2\u066f\u00e7\3\2\2\2\u0670\u0673\5\u00eav\2\u0671\u0672\7&\2\2\u0672"+
		"\u0674\5\u00eav\2\u0673\u0671\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0673"+
		"\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0679\3\2\2\2\u0677\u0679\5\u00eav"+
		"\2\u0678\u0670\3\2\2\2\u0678\u0677\3\2\2\2\u0679\u00e9\3\2\2\2\u067a\u067d"+
		"\5\u00ecw\2\u067b\u067c\7\24\2\2\u067c\u067e\5\u00ecw\2\u067d\u067b\3"+
		"\2\2\2\u067e\u067f\3\2\2\2\u067f\u067d\3\2\2\2\u067f\u0680\3\2\2\2\u0680"+
		"\u0683\3\2\2\2\u0681\u0683\5\u00ecw\2\u0682\u067a\3\2\2\2\u0682\u0681"+
		"\3\2\2\2\u0683\u00eb\3\2\2\2\u0684\u0685\7!\2\2\u0685\u0688\5\u00ecw\2"+
		"\u0686\u0688\5\u00eex\2\u0687\u0684\3\2\2\2\u0687\u0686\3\2\2\2\u0688"+
		"\u00ed\3\2\2\2\u0689\u068b\5\u0106\u0084\2\u068a\u068c\5\u00f0y\2\u068b"+
		"\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068b\3\2\2\2\u068d\u068e\3\2"+
		"\2\2\u068e\u0691\3\2\2\2\u068f\u0691\5\u0106\u0084\2\u0690\u0689\3\2\2"+
		"\2\u0690\u068f\3\2\2\2\u0691\u00ef\3\2\2\2\u0692\u069d\5\u00f2z\2\u0693"+
		"\u069d\5\u00f4{\2\u0694\u069d\5\u00f6|\2\u0695\u069d\5\u00f8}\2\u0696"+
		"\u069d\5\u00fa~\2\u0697\u069d\5\u00fc\177\2\u0698\u069d\5\u00fe\u0080"+
		"\2\u0699\u069d\5\u0100\u0081\2\u069a\u069d\5\u0102\u0082\2\u069b\u069d"+
		"\5\u0104\u0083\2\u069c\u0692\3\2\2\2\u069c\u0693\3\2\2\2\u069c\u0694\3"+
		"\2\2\2\u069c\u0695\3\2\2\2\u069c\u0696\3\2\2\2\u069c\u0697\3\2\2\2\u069c"+
		"\u0698\3\2\2\2\u069c\u0699\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069b\3\2"+
		"\2\2\u069d\u00f1\3\2\2\2\u069e\u069f\7<\2\2\u069f\u06a0\5\u0106\u0084"+
		"\2\u06a0\u00f3\3\2\2\2\u06a1\u06a2\7=\2\2\u06a2\u06a3\5\u0106\u0084\2"+
		"\u06a3\u00f5\3\2\2\2\u06a4\u06a5\7>\2\2\u06a5\u06a6\5\u0106\u0084\2\u06a6"+
		"\u00f7\3\2\2\2\u06a7\u06a8\78\2\2\u06a8\u06a9\5\u0106\u0084\2\u06a9\u00f9"+
		"\3\2\2\2\u06aa\u06ab\7?\2\2\u06ab\u06ac\5\u0106\u0084\2\u06ac\u00fb\3"+
		"\2\2\2\u06ad\u06ae\79\2\2\u06ae\u06af\5\u0106\u0084\2\u06af\u00fd\3\2"+
		"\2\2\u06b0\u06b1\7!\2\2\u06b1\u06b2\7\r\2\2\u06b2\u06b3\5\u0106\u0084"+
		"\2\u06b3\u00ff\3\2\2\2\u06b4\u06b5\7\r\2\2\u06b5\u06b6\5\u0106\u0084\2"+
		"\u06b6\u0101\3\2\2\2\u06b7\u06b8\7\22\2\2\u06b8\u06b9\7!\2\2\u06b9\u06ba"+
		"\5\u0106\u0084\2\u06ba\u0103\3\2\2\2\u06bb\u06bc\7\22\2\2\u06bc\u06bd"+
		"\5\u0106\u0084\2\u06bd\u0105\3\2\2\2\u06be\u06bf\b\u0084\1\2\u06bf\u06c0"+
		"\5\u0108\u0085\2\u06c0\u06c6\3\2\2\2\u06c1\u06c2\f\4\2\2\u06c2\u06c3\7"+
		"\66\2\2\u06c3\u06c5\5\u0108\u0085\2\u06c4\u06c1\3\2\2\2\u06c5\u06c8\3"+
		"\2\2\2\u06c6\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u0107\3\2\2\2\u06c8"+
		"\u06c6\3\2\2\2\u06c9\u06ca\b\u0085\1\2\u06ca\u06cb\5\u010a\u0086\2\u06cb"+
		"\u06d1\3\2\2\2\u06cc\u06cd\f\4\2\2\u06cd\u06ce\7A\2\2\u06ce\u06d0\5\u010a"+
		"\u0086\2\u06cf\u06cc\3\2\2\2\u06d0\u06d3\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d1"+
		"\u06d2\3\2\2\2\u06d2\u0109\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d4\u06d5\b\u0086"+
		"\1\2\u06d5\u06d6\5\u010c\u0087\2\u06d6\u06dc\3\2\2\2\u06d7\u06d8\f\4\2"+
		"\2\u06d8\u06d9\7\67\2\2\u06d9\u06db\5\u010c\u0087\2\u06da\u06d7\3\2\2"+
		"\2\u06db\u06de\3\2\2\2\u06dc\u06da\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u010b"+
		"\3\2\2\2\u06de\u06dc\3\2\2\2\u06df\u06e0\b\u0087\1\2\u06e0\u06e1\5\u010e"+
		"\u0088\2\u06e1\u06ea\3\2\2\2\u06e2\u06e3\f\5\2\2\u06e3\u06e4\7B\2\2\u06e4"+
		"\u06e9\5\u010e\u0088\2\u06e5\u06e6\f\4\2\2\u06e6\u06e7\7C\2\2\u06e7\u06e9"+
		"\5\u010e\u0088\2\u06e8\u06e2\3\2\2\2\u06e8\u06e5\3\2\2\2\u06e9\u06ec\3"+
		"\2\2\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u010d\3\2\2\2\u06ec"+
		"\u06ea\3\2\2\2\u06ed\u06ee\b\u0088\1\2\u06ee\u06ef\5\u0110\u0089\2\u06ef"+
		"\u06f8\3\2\2\2\u06f0\u06f1\f\5\2\2\u06f1\u06f2\7\62\2\2\u06f2\u06f7\5"+
		"\u0110\u0089\2\u06f3\u06f4\f\4\2\2\u06f4\u06f5\7\63\2\2\u06f5\u06f7\5"+
		"\u0110\u0089\2\u06f6\u06f0\3\2\2\2\u06f6\u06f3\3\2\2\2\u06f7\u06fa\3\2"+
		"\2\2\u06f8\u06f6\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u010f\3\2\2\2\u06fa"+
		"\u06f8\3\2\2\2\u06fb\u06fc\b\u0089\1\2\u06fc\u06fd\5\u0112\u008a\2\u06fd"+
		"\u070f\3\2\2\2\u06fe\u06ff\f\b\2\2\u06ff\u0700\7\64\2\2\u0700\u070e\5"+
		"\u0112\u008a\2\u0701\u0702\f\7\2\2\u0702\u0703\7\65\2\2\u0703\u070e\5"+
		"\u0112\u008a\2\u0704\u0705\f\6\2\2\u0705\u0706\7P\2\2\u0706\u070e\5\u0112"+
		"\u008a\2\u0707\u0708\f\5\2\2\u0708\u0709\7;\2\2\u0709\u070e\5\u0112\u008a"+
		"\2\u070a\u070b\f\4\2\2\u070b\u070c\7R\2\2\u070c\u070e\5\u0112\u008a\2"+
		"\u070d\u06fe\3\2\2\2\u070d\u0701\3\2\2\2\u070d\u0704\3\2\2\2\u070d\u0707"+
		"\3\2\2\2\u070d\u070a\3\2\2\2\u070e\u0711\3\2\2\2\u070f\u070d\3\2\2\2\u070f"+
		"\u0710\3\2\2\2\u0710\u0111\3\2\2\2\u0711\u070f\3\2\2\2\u0712\u0713\7\62"+
		"\2\2\u0713\u071a\5\u0112\u008a\2\u0714\u0715\7\63\2\2\u0715\u071a\5\u0112"+
		"\u008a\2\u0716\u0717\7@\2\2\u0717\u071a\5\u0112\u008a\2\u0718\u071a\5"+
		"\u0114\u008b\2\u0719\u0712\3\2\2\2\u0719\u0714\3\2\2\2\u0719\u0716\3\2"+
		"\2\2\u0719\u0718\3\2\2\2\u071a\u0113\3\2\2\2\u071b\u071c\5\u0116\u008c"+
		"\2\u071c\u071d\7D\2\2\u071d\u071e\5\u0112\u008a\2\u071e\u0721\3\2\2\2"+
		"\u071f\u0721\5\u0116\u008c\2\u0720\u071b\3\2\2\2\u0720\u071f\3\2\2\2\u0721"+
		"\u0115\3\2\2\2\u0722\u0723\7\6\2\2\u0723\u0726\5\u0118\u008d\2\u0724\u0726"+
		"\5\u0118\u008d\2\u0725\u0722\3\2\2\2\u0725\u0724\3\2\2\2\u0726\u0117\3"+
		"\2\2\2\u0727\u0728\b\u008d\1\2\u0728\u0729\5\u011e\u0090\2\u0729\u073c"+
		"\3\2\2\2\u072a\u072b\f\7\2\2\u072b\u072c\7.\2\2\u072c\u073b\7W\2\2\u072d"+
		"\u072e\f\6\2\2\u072e\u073b\5\u012a\u0096\2\u072f\u0730\f\5\2\2\u0730\u0732"+
		"\7(\2\2\u0731\u0733\5\u0140\u00a1\2\u0732\u0731\3\2\2\2\u0732\u0733\3"+
		"\2\2\2\u0733\u0734\3\2\2\2\u0734\u073b\7+\2\2\u0735\u0736\f\4\2\2\u0736"+
		"\u0737\7)\2\2\u0737\u0738\5\u011a\u008e\2\u0738\u0739\7,\2\2\u0739\u073b"+
		"\3\2\2\2\u073a\u072a\3\2\2\2\u073a\u072d\3\2\2\2\u073a\u072f\3\2\2\2\u073a"+
		"\u0735\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a\3\2\2\2\u073c\u073d\3\2"+
		"\2\2\u073d\u0119\3\2\2\2\u073e\u073c\3\2\2\2\u073f\u0740\5\u011c\u008f"+
		"\2\u0740\u0741\6\u008e)\2\u0741\u074e\3\2\2\2\u0742\u0747\5\u011c\u008f"+
		"\2\u0743\u0744\7\60\2\2\u0744\u0746\5\u011c\u008f\2\u0745\u0743\3\2\2"+
		"\2\u0746\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u074b"+
		"\3\2\2\2\u0749\u0747\3\2\2\2\u074a\u074c\7\60\2\2\u074b\u074a\3\2\2\2"+
		"\u074b\u074c\3\2\2\2\u074c\u074e\3\2\2\2\u074d\u073f\3\2\2\2\u074d\u0742"+
		"\3\2\2\2\u074e\u011b\3\2\2\2\u074f\u0751\5\u00d0i\2\u0750\u074f\3\2\2"+
		"\2\u0750\u0751\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0754\7/\2\2\u0753\u0755"+
		"\5\u00d0i\2\u0754\u0753\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u075a\3\2\2"+
		"\2\u0756\u0758\7/\2\2\u0757\u0759\5\u00d0i\2\u0758\u0757\3\2\2\2\u0758"+
		"\u0759\3\2\2\2\u0759\u075b\3\2\2\2\u075a\u0756\3\2\2\2\u075a\u075b\3\2"+
		"\2\2\u075b\u075e\3\2\2\2\u075c\u075e\5\u00caf\2\u075d\u0750\3\2\2\2\u075d"+
		"\u075c\3\2\2\2\u075e\u011d\3\2\2\2\u075f\u0776\7W\2\2\u0760\u0776\7\17"+
		"\2\2\u0761\u0776\7\5\2\2\u0762\u0776\7\n\2\2\u0763\u0776\5\u0120\u0091"+
		"\2\u0764\u0776\7X\2\2\u0765\u0769\5\u0126\u0094\2\u0766\u0769\5\u0128"+
		"\u0095\2\u0767\u0769\5\u012a\u0096\2\u0768\u0765\3\2\2\2\u0768\u0766\3"+
		"\2\2\2\u0768\u0767\3\2\2\2\u0769\u0776\3\2\2\2\u076a\u076d\5\u0122\u0092"+
		"\2\u076b\u076d\5\u0124\u0093\2\u076c\u076a\3\2\2\2\u076c\u076b\3\2\2\2"+
		"\u076d\u0776\3\2\2\2\u076e\u0773\5\u0130\u0099\2\u076f\u0773\5\u012c\u0097"+
		"\2\u0770\u0773\5\u0132\u009a\2\u0771\u0773\5\u012e\u0098\2\u0772\u076e"+
		"\3\2\2\2\u0772\u076f\3\2\2\2\u0772\u0770\3\2\2\2\u0772\u0771\3\2\2\2\u0773"+
		"\u0776\3\2\2\2\u0774\u0776\7U\2\2\u0775\u075f\3\2\2\2\u0775\u0760\3\2"+
		"\2\2\u0775\u0761\3\2\2\2\u0775\u0762\3\2\2\2\u0775\u0763\3\2\2\2\u0775"+
		"\u0764\3\2\2\2\u0775\u0768\3\2\2\2\u0775\u076c\3\2\2\2\u0775\u0772\3\2"+
		"\2\2\u0775\u0774\3\2\2\2\u0776\u011f\3\2\2\2\u0777\u0779\7Y\2\2\u0778"+
		"\u0777\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u0778\3\2\2\2\u077a\u077b\3\2"+
		"\2\2\u077b\u0121\3\2\2\2\u077c\u077e\7)\2\2\u077d\u077f\5\u00c4c\2\u077e"+
		"\u077d\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0781\7,"+
		"\2\2\u0781\u0123\3\2\2\2\u0782\u0783\7)\2\2\u0783\u0784\5\u00caf\2\u0784"+
		"\u0785\5\u013a\u009e\2\u0785\u0786\7,\2\2\u0786\u0125\3\2\2\2\u0787\u078d"+
		"\7(\2\2\u0788\u0789\5\u00c6d\2\u0789\u078b\7\60\2\2\u078a\u078c\5\u00c4"+
		"c\2\u078b\u078a\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078e\3\2\2\2\u078d"+
		"\u0788\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790\7+"+
		"\2\2\u0790\u0127\3\2\2\2\u0791\u0794\7(\2\2\u0792\u0795\5\u013e\u00a0"+
		"\2\u0793\u0795\5\u00caf\2\u0794\u0792\3\2\2\2\u0794\u0793\3\2\2\2\u0795"+
		"\u0796\3\2\2\2\u0796\u0797\7+\2\2\u0797\u0129\3\2\2\2\u0798\u079d\7(\2"+
		"\2\u0799\u079e\5\u00c8e\2\u079a\u079b\5\u00d0i\2\u079b\u079c\6\u0096*"+
		"\2\u079c\u079e\3\2\2\2\u079d\u0799\3\2\2\2\u079d\u079a\3\2\2\2\u079e\u079f"+
		"\3\2\2\2\u079f\u07a0\5\u013a\u009e\2\u07a0\u07a1\7+\2\2\u07a1\u012b\3"+
		"\2\2\2\u07a2\u07a3\7*\2\2\u07a3\u07a4\5\u00c4c\2\u07a4\u07a5\7-\2\2\u07a5"+
		"\u012d\3\2\2\2\u07a6\u07a7\7*\2\2\u07a7\u07a8\5\u00caf\2\u07a8\u07a9\5"+
		"\u013a\u009e\2\u07a9\u07aa\7-\2\2\u07aa\u012f\3\2\2\2\u07ab\u07ad\7*\2"+
		"\2\u07ac\u07ae\5\u0134\u009b\2\u07ad\u07ac\3\2\2\2\u07ad\u07ae\3\2\2\2"+
		"\u07ae\u07af\3\2\2\2\u07af\u07b0\7-\2\2\u07b0\u0131\3\2\2\2\u07b1\u07b2"+
		"\7*\2\2\u07b2\u07b3\5\u0138\u009d\2\u07b3\u07b4\5\u013a\u009e\2\u07b4"+
		"\u07b5\7-\2\2\u07b5\u0133\3\2\2\2\u07b6\u07bb\5\u0136\u009c\2\u07b7\u07b8"+
		"\7\60\2\2\u07b8\u07ba\5\u0136\u009c\2\u07b9\u07b7\3\2\2\2\u07ba\u07bd"+
		"\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07bf\3\2\2\2\u07bd"+
		"\u07bb\3\2\2\2\u07be\u07c0\7\60\2\2\u07bf\u07be\3\2\2\2\u07bf\u07c0\3"+
		"\2\2\2\u07c0\u0135\3\2\2\2\u07c1\u07c2\7D\2\2\u07c2\u07c5\5\u0106\u0084"+
		"\2\u07c3\u07c5\5\u0138\u009d\2\u07c4\u07c1\3\2\2\2\u07c4\u07c3\3\2\2\2"+
		"\u07c5\u0137\3\2\2\2\u07c6\u07c7\5\u00d0i\2\u07c7\u07c8\7/\2\2\u07c8\u07c9"+
		"\5\u00d0i\2\u07c9\u0139\3\2\2\2\u07ca\u07cc\5\u013c\u009f\2\u07cb\u07ca"+
		"\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07cb\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce"+
		"\u013b\3\2\2\2\u07cf\u07d0\7#\2\2\u07d0\u07d1\7\26\2\2\u07d1\u07d2\5\u014c"+
		"\u00a7\2\u07d2\u07d3\7\r\2\2\u07d3\u07d8\5\u00e8u\2\u07d4\u07d5\7%\2\2"+
		"\u07d5\u07d7\5\u00e8u\2\u07d6\u07d4\3\2\2\2\u07d7\u07da\3\2\2\2\u07d8"+
		"\u07d6\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07e7\3\2\2\2\u07da\u07d8\3\2"+
		"\2\2\u07db\u07dc\7\26\2\2\u07dc\u07dd\5\u014c\u00a7\2\u07dd\u07de\7\r"+
		"\2\2\u07de\u07e3\5\u00e8u\2\u07df\u07e0\7%\2\2\u07e0\u07e2\5\u00e8u\2"+
		"\u07e1\u07df\3\2\2\2\u07e2\u07e5\3\2\2\2\u07e3\u07e1\3\2\2\2\u07e3\u07e4"+
		"\3\2\2\2\u07e4\u07e7\3\2\2\2\u07e5\u07e3\3\2\2\2\u07e6\u07cf\3\2\2\2\u07e6"+
		"\u07db\3\2\2\2\u07e7\u013d\3\2\2\2\u07e8\u07e9\7\'\2\2\u07e9\u07ea\7\33"+
		"\2\2\u07ea\u07f0\5\u00d0i\2\u07eb\u07ed\7\'\2\2\u07ec\u07ee\5\u00c0a\2"+
		"\u07ed\u07ec\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07f0\3\2\2\2\u07ef\u07e8"+
		"\3\2\2\2\u07ef\u07eb\3\2\2\2\u07f0\u013f\3\2\2\2\u07f1\u07f3\5\u0142\u00a2"+
		"\2\u07f2\u07f4\7\60\2\2\u07f3\u07f2\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4"+
		"\u07f5\3\2\2\2\u07f5\u07f6\6\u00a1+\2\u07f6\u0141\3\2\2\2\u07f7\u0801"+
		"\5\u0146\u00a4\2\u07f8\u07fd\5\u00c8e\2\u07f9\u07fa\5\u00d0i\2\u07fa\u07fb"+
		"\6\u00a2,\2\u07fb\u07fd\3\2\2\2\u07fc\u07f8\3\2\2\2\u07fc\u07f9\3\2\2"+
		"\2\u07fd\u07fe\3\2\2\2\u07fe\u07ff\6\u00a2-\2\u07ff\u0801\3\2\2\2\u0800"+
		"\u07f7\3\2\2\2\u0800\u07fc\3\2\2\2\u0801\u0810\3\2\2\2\u0802\u080c\7\60"+
		"\2\2\u0803\u080d\5\u0146\u00a4\2\u0804\u0809\5\u00c8e\2\u0805\u0806\5"+
		"\u00d0i\2\u0806\u0807\6\u00a2.\2\u0807\u0809\3\2\2\2\u0808\u0804\3\2\2"+
		"\2\u0808\u0805\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080b\6\u00a2/\2\u080b"+
		"\u080d\3\2\2\2\u080c\u0803\3\2\2\2\u080c\u0808\3\2\2\2\u080d\u080f\3\2"+
		"\2\2\u080e\u0802\3\2\2\2\u080f\u0812\3\2\2\2\u0810\u080e\3\2\2\2\u0810"+
		"\u0811\3\2\2\2\u0811\u0815\3\2\2\2\u0812\u0810\3\2\2\2\u0813\u0814\7\60"+
		"\2\2\u0814\u0816\5\u0144\u00a3\2\u0815\u0813\3\2\2\2\u0815\u0816\3\2\2"+
		"\2\u0816\u0819\3\2\2\2\u0817\u0819\5\u0144\u00a3\2\u0818\u0800\3\2\2\2"+
		"\u0818\u0817\3\2\2\2\u0819\u0143\3\2\2\2\u081a\u081f\5\u0148\u00a5\2\u081b"+
		"\u081c\7\60\2\2\u081c\u081e\5\u0148\u00a5\2\u081d\u081b\3\2\2\2\u081e"+
		"\u0821\3\2\2\2\u081f\u081d\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0822\3\2"+
		"\2\2\u0821\u081f\3\2\2\2\u0822\u0823\7\60\2\2\u0823\u0828\5\u014a\u00a6"+
		"\2\u0824\u0825\7\60\2\2\u0825\u0827\5\u014a\u00a6\2\u0826\u0824\3\2\2"+
		"\2\u0827\u082a\3\2\2\2\u0828\u0826\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u083c"+
		"\3\2\2\2\u082a\u0828\3\2\2\2\u082b\u0830\5\u0148\u00a5\2\u082c\u082d\7"+
		"\60\2\2\u082d\u082f\5\u0148\u00a5\2\u082e\u082c\3\2\2\2\u082f\u0832\3"+
		"\2\2\2\u0830\u082e\3\2\2\2\u0830\u0831\3\2\2\2\u0831\u083c\3\2\2\2\u0832"+
		"\u0830\3\2\2\2\u0833\u0838\5\u014a\u00a6\2\u0834\u0835\7\60\2\2\u0835"+
		"\u0837\5\u014a\u00a6\2\u0836\u0834\3\2\2\2\u0837\u083a\3\2\2\2\u0838\u0836"+
		"\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083c\3\2\2\2\u083a\u0838\3\2\2\2\u083b"+
		"\u081a\3\2\2\2\u083b\u082b\3\2\2\2\u083b\u0833\3\2\2\2\u083c\u0145\3\2"+
		"\2\2\u083d\u083e\7\64\2\2\u083e\u083f\5\u00d0i\2\u083f\u0147\3\2\2\2\u0840"+
		"\u0841\7W\2\2\u0841\u0842\7:\2\2\u0842\u0845\5\u00d0i\2\u0843\u0845\5"+
		"\u0146\u00a4\2\u0844\u0840\3\2\2\2\u0844\u0843\3\2\2\2\u0845\u0149\3\2"+
		"\2\2\u0846\u0847\7W\2\2\u0847\u0848\7:\2\2\u0848\u084c\5\u00d0i\2\u0849"+
		"\u084a\7D\2\2\u084a\u084c\5\u00d0i\2\u084b\u0846\3\2\2\2\u084b\u0849\3"+
		"\2\2\2\u084c\u014b\3\2\2\2\u084d\u084e\5\u0152\u00aa\2\u084e\u084f\6\u00a7"+
		"\60\2\u084f\u085c\3\2\2\2\u0850\u0855\5\u0152\u00aa\2\u0851\u0852\7\60"+
		"\2\2\u0852\u0854\5\u0152\u00aa\2\u0853\u0851\3\2\2\2\u0854\u0857\3\2\2"+
		"\2\u0855\u0853\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0859\3\2\2\2\u0857\u0855"+
		"\3\2\2\2\u0858\u085a\7\60\2\2\u0859\u0858\3\2\2\2\u0859\u085a\3\2\2\2"+
		"\u085a\u085c\3\2\2\2\u085b\u084d\3\2\2\2\u085b\u0850\3\2\2\2\u085c\u014d"+
		"\3\2\2\2\u085d\u0862\5\u0152\u00aa\2\u085e\u085f\7\60\2\2\u085f\u0861"+
		"\5\u0152\u00aa\2\u0860\u085e\3\2\2\2\u0861\u0864\3\2\2\2\u0862\u0860\3"+
		"\2\2\2\u0862\u0863\3\2\2\2\u0863\u0866\3\2\2\2\u0864\u0862\3\2\2\2\u0865"+
		"\u0867\7\60\2\2\u0866\u0865\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u014f\3"+
		"\2\2\2\u0868\u086b\5\u0152\u00aa\2\u0869\u086a\7\60\2\2\u086a\u086c\5"+
		"\u0152\u00aa\2\u086b\u0869\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u086b\3\2"+
		"\2\2\u086d\u086e\3\2\2\2\u086e\u0870\3\2\2\2\u086f\u0871\7\60\2\2\u0870"+
		"\u086f\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0876\3\2\2\2\u0872\u0873\5\u0152"+
		"\u00aa\2\u0873\u0874\7\60\2\2\u0874\u0876\3\2\2\2\u0875\u0868\3\2\2\2"+
		"\u0875\u0872\3\2\2\2\u0876\u0151\3\2\2\2\u0877\u0878\7\64\2\2\u0878\u0879"+
		"\6\u00aa\61\2\u0879\u087c\5\u0152\u00aa\2\u087a\u087c\5\u0154\u00ab\2"+
		"\u087b\u0877\3\2\2\2\u087b\u087a\3\2\2\2\u087c\u0153\3\2\2\2\u087d\u087e"+
		"\5\u0162\u00b2\2\u087e\u087f\7.\2\2\u087f\u0880\7W\2\2\u0880\u0881\6\u00ab"+
		"\62\2\u0881\u088a\3\2\2\2\u0882\u0883\5\u0162\u00b2\2\u0883\u0884\7)\2"+
		"\2\u0884\u0885\5\u011a\u008e\2\u0885\u0886\7,\2\2\u0886\u0887\6\u00ab"+
		"\63\2\u0887\u088a\3\2\2\2\u0888\u088a\5\u0156\u00ac\2\u0889\u087d\3\2"+
		"\2\2\u0889\u0882\3\2\2\2\u0889\u0888\3\2\2\2\u088a\u0155\3\2\2\2\u088b"+
		"\u089b\7W\2\2\u088c\u088d\7(\2\2\u088d\u088e\5\u0154\u00ab\2\u088e\u088f"+
		"\7+\2\2\u088f\u089b\3\2\2\2\u0890\u0892\7(\2\2\u0891\u0893\5\u0150\u00a9"+
		"\2\u0892\u0891\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u089b"+
		"\7+\2\2\u0895\u0897\7)\2\2\u0896\u0898\5\u014e\u00a8\2\u0897\u0896\3\2"+
		"\2\2\u0897\u0898\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089b\7,\2\2\u089a"+
		"\u088b\3\2\2\2\u089a\u088c\3\2\2\2\u089a\u0890\3\2\2\2\u089a\u0895\3\2"+
		"\2\2\u089b\u0157\3\2\2\2\u089c\u08a3\5\u015a\u00ae\2\u089d\u08a3\7W\2"+
		"\2\u089e\u089f\7(\2\2\u089f\u08a0\5\u0158\u00ad\2\u08a0\u08a1\7+\2\2\u08a1"+
		"\u08a3\3\2\2\2\u08a2\u089c\3\2\2\2\u08a2\u089d\3\2\2\2\u08a2\u089e\3\2"+
		"\2\2\u08a3\u0159\3\2\2\2\u08a4\u08a5\5\u0162\u00b2\2\u08a5\u08a6\7.\2"+
		"\2\u08a6\u08a7\7W\2\2\u08a7\u08a8\6\u00ae\64\2\u08a8\u08b0\3\2\2\2\u08a9"+
		"\u08aa\5\u0162\u00b2\2\u08aa\u08ab\7)\2\2\u08ab\u08ac\5\u011a\u008e\2"+
		"\u08ac\u08ad\7,\2\2\u08ad\u08ae\6\u00ae\65\2\u08ae\u08b0\3\2\2\2\u08af"+
		"\u08a4\3\2\2\2\u08af\u08a9\3\2\2\2\u08b0\u015b\3\2\2\2\u08b1\u08b6\5\u015e"+
		"\u00b0\2\u08b2\u08b3\7\60\2\2\u08b3\u08b5\5\u015e\u00b0\2\u08b4\u08b2"+
		"\3\2\2\2\u08b5\u08b8\3\2\2\2\u08b6\u08b4\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7"+
		"\u08ba\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b9\u08bb\7\60\2\2\u08ba\u08b9\3"+
		"\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u015d\3\2\2\2\u08bc\u08bd\5\u0162\u00b2"+
		"\2\u08bd\u08be\7.\2\2\u08be\u08bf\7W\2\2\u08bf\u08c0\6\u00b0\66\2\u08c0"+
		"\u08c9\3\2\2\2\u08c1\u08c2\5\u0162\u00b2\2\u08c2\u08c3\7)\2\2\u08c3\u08c4"+
		"\5\u011a\u008e\2\u08c4\u08c5\7,\2\2\u08c5\u08c6\6\u00b0\67\2\u08c6\u08c9"+
		"\3\2\2\2\u08c7\u08c9\5\u0160\u00b1\2\u08c8\u08bc\3\2\2\2\u08c8\u08c1\3"+
		"\2\2\2\u08c8\u08c7\3\2\2\2\u08c9\u015f\3\2\2\2\u08ca\u08da\7W\2\2\u08cb"+
		"\u08cc\7(\2\2\u08cc\u08cd\5\u015e\u00b0\2\u08cd\u08ce\7+\2\2\u08ce\u08da"+
		"\3\2\2\2\u08cf\u08d1\7(\2\2\u08d0\u08d2\5\u015c\u00af\2\u08d1\u08d0\3"+
		"\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u08da\7+\2\2\u08d4"+
		"\u08d6\7)\2\2\u08d5\u08d7\5\u015c\u00af\2\u08d6\u08d5\3\2\2\2\u08d6\u08d7"+
		"\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08da\7,\2\2\u08d9\u08ca\3\2\2\2\u08d9"+
		"\u08cb\3\2\2\2\u08d9\u08cf\3\2\2\2\u08d9\u08d4\3\2\2\2\u08da\u0161\3\2"+
		"\2\2\u08db\u08dc\b\u00b2\1\2\u08dc\u08dd\5\u011e\u0090\2\u08dd\u08de\6"+
		"\u00b28\2\u08de\u08f6\3\2\2\2\u08df\u08e0\f\7\2\2\u08e0\u08e1\7.\2\2\u08e1"+
		"\u08e2\7W\2\2\u08e2\u08f5\6\u00b2:\2\u08e3\u08e4\f\6\2\2\u08e4\u08e5\7"+
		")\2\2\u08e5\u08e6\5\u011a\u008e\2\u08e6\u08e7\7,\2\2\u08e7\u08e8\6\u00b2"+
		"<\2\u08e8\u08f5\3\2\2\2\u08e9\u08ea\f\5\2\2\u08ea\u08eb\5\u012a\u0096"+
		"\2\u08eb\u08ec\6\u00b2>\2\u08ec\u08f5\3\2\2\2\u08ed\u08ee\f\4\2\2\u08ee"+
		"\u08f0\7(\2\2\u08ef\u08f1\5\u0140\u00a1\2\u08f0\u08ef\3\2\2\2\u08f0\u08f1"+
		"\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u08f3\7+\2\2\u08f3\u08f5\6\u00b2@\2"+
		"\u08f4\u08df\3\2\2\2\u08f4\u08e3\3\2\2\2\u08f4\u08e9\3\2\2\2\u08f4\u08ed"+
		"\3\2\2\2\u08f5\u08f8\3\2\2\2\u08f6\u08f4\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7"+
		"\u0163\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f9\u08fa\6\u00b3A\2\u08fa\u08fb"+
		"\7W\2\2\u08fb\u0165\3\2\2\2\u08fc\u08fd\6\u00b4B\2\u08fd\u08fe\7W\2\2"+
		"\u08fe\u0167\3\2\2\2\u08ff\u0900\6\u00b5C\2\u0900\u0901\7W\2\2\u0901\u0169"+
		"\3\2\2\2\u0902\u0903\6\u00b6D\2\u0903\u0904\7W\2\2\u0904\u016b\3\2\2\2"+
		"\u011f\u016d\u0177\u017e\u0186\u0192\u01a1\u01ad\u01c3\u01c6\u01cb\u01cf"+
		"\u01d7\u01e2\u01e6\u01ea\u01f9\u0203\u020a\u0211\u0217\u021e\u0222\u0226"+
		"\u022c\u022e\u0238\u0241\u024a\u0252\u025b\u0266\u026a\u026f\u0277\u027e"+
		"\u0284\u028b\u0291\u029b\u02a9\u02ab\u02b8\u02ba\u02c5\u02cd\u02d1\u02da"+
		"\u02de\u02e0\u02e9\u02ed\u02f9\u02fe\u030a\u030e\u031b\u0320\u0324\u032c"+
		"\u0339\u033c\u033f\u0341\u0347\u034f\u035d\u0364\u0367\u036c\u0376\u037a"+
		"\u0385\u0390\u039a\u03a4\u03ae\u03b3\u03b8\u03d5\u03de\u03e3\u03e6\u03eb"+
		"\u03f2\u03f6\u03fa\u0400\u0407\u0410\u0417\u041b\u0422\u0427\u0437\u043f"+
		"\u0449\u044d\u0454\u045c\u0465\u046b\u046e\u0474\u047a\u047f\u0483\u048b"+
		"\u0490\u0494\u0497\u049d\u04a5\u04ab\u04af\u04b5\u04b9\u04be\u04c3\u04c7"+
		"\u04cc\u04cf\u04d2\u04d7\u04df\u04e4\u04e9\u04ef\u04f7\u04fd\u0502\u0509"+
		"\u050d\u0514\u0517\u051a\u0522\u0526\u052a\u0530\u0535\u0539\u053d\u0541"+
		"\u0545\u0548\u054c\u0550\u055e\u0564\u056a\u056d\u0578\u057f\u0582\u0588"+
		"\u058d\u0594\u0598\u059d\u05a7\u05ab\u05b2\u05b5\u05bb\u05c5\u05c9\u05d4"+
		"\u05da\u05de\u05e4\u05e8\u05ed\u05f2\u05f6\u05fb\u05fe\u0601\u0606\u060e"+
		"\u0613\u0618\u061e\u0626\u062c\u0631\u0638\u063c\u0643\u0646\u0649\u0654"+
		"\u065e\u0662\u0668\u066c\u0675\u0678\u067f\u0682\u0687\u068d\u0690\u069c"+
		"\u06c6\u06d1\u06dc\u06e8\u06ea\u06f6\u06f8\u070d\u070f\u0719\u0720\u0725"+
		"\u0732\u073a\u073c\u0747\u074b\u074d\u0750\u0754\u0758\u075a\u075d\u0768"+
		"\u076c\u0772\u0775\u077a\u077e\u078b\u078d\u0794\u079d\u07ad\u07bb\u07bf"+
		"\u07c4\u07cd\u07d8\u07e3\u07e6\u07ed\u07ef\u07f3\u07fc\u0800\u0808\u080c"+
		"\u0810\u0815\u0818\u081f\u0828\u0830\u0838\u083b\u0844\u084b\u0855\u0859"+
		"\u085b\u0862\u0866\u086d\u0870\u0875\u087b\u0889\u0892\u0897\u089a\u08a2"+
		"\u08af\u08b6\u08ba\u08c8\u08d1\u08d6\u08d9\u08f0\u08f4\u08f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}