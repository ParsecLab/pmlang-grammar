// Generated from /media/naylour/Work/Parsec/pmlang/grammar/PMLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PMLang extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MATRIX=1, INT=2, NSUM=3, PROD=4, DIFF=5, TENSOR=6, GRAD=7, DIV=8, CURL=9, 
		LAPLACE=10, SCALAR_PRODUCT=11, VECTOR_PRODUCT=12, LIM=13, VEC=14, CONSTR=15, 
		SYS=16, FIELD=17, MEAN=18, VAR=19, STD=20, GRAPH=21, SIMPLIFY=22, EXPAND=23, 
		FACTOR=24, SOLVE=25, TRANSPOSE=26, INV=27, DET=28, RANGE=29, INCLUDE=30, 
		EXCLUDE=31, STEP=32, PLUS=33, MINUS=34, STAR=35, SLASH=36, CARET=37, EQUAL=38, 
		COMMA=39, DOT=40, LPAR=41, RPAR=42, LSQB=43, RSQB=44, LBRACE=45, RBRACE=46, 
		VBAR=47, DOUBLE_VBAR=48, HASH=49, ARROW_RIGHT=50, ARROW_LEFT=51, FROM=52, 
		TO=53, CONSTANTS=54, NUMBER=55, STRING=56, IDENTIFIER=57, WS=58, COMMENT=59, 
		ERRORTOKEN=60;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_literal = 2, RULE_range = 3, RULE_range_body = 4, 
		RULE_literal_list = 5, RULE_matrix_expr = 6, RULE_inv_matrix = 7, RULE_det_matrix = 8, 
		RULE_transpose_matrix = 9, RULE_matrix = 10, RULE_matrix_row = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "literal", "range", "range_body", "literal_list", 
			"matrix_expr", "inv_matrix", "det_matrix", "transpose_matrix", "matrix", 
			"matrix_row"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'lim'", "'vec'", "'constr'", "'sys'", "'field'", "'mean'", "'var'", 
			"'std'", "'graph'", "'simplify'", "'expand'", "'factor'", "'solve'", 
			"'transpose'", "'inv'", "'det'", null, "'include'", "'exclude'", "'step'", 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'='", "','", "'.'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'|'", "'||'", "'#'", "'->'", "'<-'", "'from'", 
			"'to'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MATRIX", "INT", "NSUM", "PROD", "DIFF", "TENSOR", "GRAD", "DIV", 
			"CURL", "LAPLACE", "SCALAR_PRODUCT", "VECTOR_PRODUCT", "LIM", "VEC", 
			"CONSTR", "SYS", "FIELD", "MEAN", "VAR", "STD", "GRAPH", "SIMPLIFY", 
			"EXPAND", "FACTOR", "SOLVE", "TRANSPOSE", "INV", "DET", "RANGE", "INCLUDE", 
			"EXCLUDE", "STEP", "PLUS", "MINUS", "STAR", "SLASH", "CARET", "EQUAL", 
			"COMMA", "DOT", "LPAR", "RPAR", "LSQB", "RSQB", "LBRACE", "RBRACE", "VBAR", 
			"DOUBLE_VBAR", "HASH", "ARROW_RIGHT", "ARROW_LEFT", "FROM", "TO", "CONSTANTS", 
			"NUMBER", "STRING", "IDENTIFIER", "WS", "COMMENT", "ERRORTOKEN"
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
	public String getGrammarFileName() { return "PMLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PMLang(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PMLang.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			expr();
			setState(25);
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
	public static class ExprContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Matrix_exprContext matrix_expr() {
			return getRuleContext(Matrix_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTANTS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				literal();
				}
				break;
			case RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				range();
				}
				break;
			case MATRIX:
			case TRANSPOSE:
			case INV:
			case DET:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				matrix_expr();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PMLang.NUMBER, 0); }
		public TerminalNode CONSTANTS() { return getToken(PMLang.CONSTANTS, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==CONSTANTS || _la==NUMBER) ) {
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
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(PMLang.RANGE, 0); }
		public TerminalNode LBRACE() { return getToken(PMLang.LBRACE, 0); }
		public Range_bodyContext range_body() {
			return getRuleContext(Range_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PMLang.RBRACE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(RANGE);
			setState(35);
			match(LBRACE);
			setState(36);
			range_body(0);
			setState(37);
			match(RBRACE);
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
	public static class Range_bodyContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PMLang.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PMLang.COMMA, i);
		}
		public TerminalNode LSQB() { return getToken(PMLang.LSQB, 0); }
		public TerminalNode LPAR() { return getToken(PMLang.LPAR, 0); }
		public TerminalNode RSQB() { return getToken(PMLang.RSQB, 0); }
		public TerminalNode RPAR() { return getToken(PMLang.RPAR, 0); }
		public TerminalNode NUMBER() { return getToken(PMLang.NUMBER, 0); }
		public Range_bodyContext range_body() {
			return getRuleContext(Range_bodyContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(PMLang.LBRACE, 0); }
		public Literal_listContext literal_list() {
			return getRuleContext(Literal_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PMLang.RBRACE, 0); }
		public TerminalNode PLUS() { return getToken(PMLang.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PMLang.MINUS, 0); }
		public TerminalNode EXCLUDE() { return getToken(PMLang.EXCLUDE, 0); }
		public TerminalNode INCLUDE() { return getToken(PMLang.INCLUDE, 0); }
		public TerminalNode STEP() { return getToken(PMLang.STEP, 0); }
		public Range_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_body; }
	}

	public final Range_bodyContext range_body() throws RecognitionException {
		return range_body(0);
	}

	private Range_bodyContext range_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Range_bodyContext _localctx = new Range_bodyContext(_ctx, _parentState);
		Range_bodyContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_range_body, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(40);
				_la = _input.LA(1);
				if ( !(_la==LPAR || _la==LSQB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(41);
				literal();
				setState(42);
				match(COMMA);
				setState(43);
				literal();
				setState(44);
				_la = _input.LA(1);
				if ( !(_la==RPAR || _la==RSQB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(46);
				_la = _input.LA(1);
				if ( !(_la==LPAR || _la==LSQB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				literal();
				setState(48);
				match(COMMA);
				setState(49);
				match(NUMBER);
				setState(50);
				match(COMMA);
				setState(51);
				literal();
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==RPAR || _la==RSQB) ) {
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
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Range_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_range_body);
						setState(56);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(58);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==PLUS || _la==MINUS) {
							{
							setState(57);
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

						setState(60);
						match(LBRACE);
						setState(61);
						literal_list();
						setState(62);
						match(RBRACE);
						}
						break;
					case 2:
						{
						_localctx = new Range_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_range_body);
						setState(64);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(65);
						_la = _input.LA(1);
						if ( !(_la==INCLUDE || _la==EXCLUDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(68);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(66);
							literal();
							}
							break;
						case 2:
							{
							setState(67);
							literal_list();
							}
							break;
						}
						}
						break;
					case 3:
						{
						_localctx = new Range_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_range_body);
						setState(70);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(71);
						match(STEP);
						setState(72);
						literal();
						}
						break;
					}
					} 
				}
				setState(77);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_listContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PMLang.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PMLang.COMMA, i);
		}
		public Literal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_list; }
	}

	public final Literal_listContext literal_list() throws RecognitionException {
		Literal_listContext _localctx = new Literal_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			literal();
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					match(COMMA);
					setState(80);
					literal();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class Matrix_exprContext extends ParserRuleContext {
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public Inv_matrixContext inv_matrix() {
			return getRuleContext(Inv_matrixContext.class,0);
		}
		public Det_matrixContext det_matrix() {
			return getRuleContext(Det_matrixContext.class,0);
		}
		public Transpose_matrixContext transpose_matrix() {
			return getRuleContext(Transpose_matrixContext.class,0);
		}
		public Matrix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_expr; }
	}

	public final Matrix_exprContext matrix_expr() throws RecognitionException {
		Matrix_exprContext _localctx = new Matrix_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matrix_expr);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATRIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				matrix();
				}
				break;
			case INV:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				inv_matrix();
				}
				break;
			case DET:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				det_matrix();
				}
				break;
			case TRANSPOSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				transpose_matrix();
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
	public static class Inv_matrixContext extends ParserRuleContext {
		public TerminalNode INV() { return getToken(PMLang.INV, 0); }
		public TerminalNode LPAR() { return getToken(PMLang.LPAR, 0); }
		public Matrix_exprContext matrix_expr() {
			return getRuleContext(Matrix_exprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PMLang.RPAR, 0); }
		public Inv_matrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inv_matrix; }
	}

	public final Inv_matrixContext inv_matrix() throws RecognitionException {
		Inv_matrixContext _localctx = new Inv_matrixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inv_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(INV);
			setState(93);
			match(LPAR);
			setState(94);
			matrix_expr();
			setState(95);
			match(RPAR);
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
	public static class Det_matrixContext extends ParserRuleContext {
		public TerminalNode DET() { return getToken(PMLang.DET, 0); }
		public TerminalNode LPAR() { return getToken(PMLang.LPAR, 0); }
		public Matrix_exprContext matrix_expr() {
			return getRuleContext(Matrix_exprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PMLang.RPAR, 0); }
		public Det_matrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_det_matrix; }
	}

	public final Det_matrixContext det_matrix() throws RecognitionException {
		Det_matrixContext _localctx = new Det_matrixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_det_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(DET);
			setState(98);
			match(LPAR);
			setState(99);
			matrix_expr();
			setState(100);
			match(RPAR);
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
	public static class Transpose_matrixContext extends ParserRuleContext {
		public TerminalNode TRANSPOSE() { return getToken(PMLang.TRANSPOSE, 0); }
		public TerminalNode LPAR() { return getToken(PMLang.LPAR, 0); }
		public Matrix_exprContext matrix_expr() {
			return getRuleContext(Matrix_exprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PMLang.RPAR, 0); }
		public Transpose_matrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transpose_matrix; }
	}

	public final Transpose_matrixContext transpose_matrix() throws RecognitionException {
		Transpose_matrixContext _localctx = new Transpose_matrixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transpose_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(TRANSPOSE);
			setState(103);
			match(LPAR);
			setState(104);
			matrix_expr();
			setState(105);
			match(RPAR);
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
	public static class MatrixContext extends ParserRuleContext {
		public TerminalNode MATRIX() { return getToken(PMLang.MATRIX, 0); }
		public TerminalNode LPAR() { return getToken(PMLang.LPAR, 0); }
		public List<Matrix_rowContext> matrix_row() {
			return getRuleContexts(Matrix_rowContext.class);
		}
		public Matrix_rowContext matrix_row(int i) {
			return getRuleContext(Matrix_rowContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(PMLang.RPAR, 0); }
		public TerminalNode LSQB() { return getToken(PMLang.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(PMLang.RSQB, 0); }
		public TerminalNode LBRACE() { return getToken(PMLang.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PMLang.RBRACE, 0); }
		public List<TerminalNode> VBAR() { return getTokens(PMLang.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(PMLang.VBAR, i);
		}
		public List<TerminalNode> DOUBLE_VBAR() { return getTokens(PMLang.DOUBLE_VBAR); }
		public TerminalNode DOUBLE_VBAR(int i) {
			return getToken(PMLang.DOUBLE_VBAR, i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_matrix);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(MATRIX);
				setState(108);
				match(LPAR);
				setState(109);
				matrix_row();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQB) {
					{
					{
					setState(110);
					matrix_row();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(MATRIX);
				setState(119);
				match(LSQB);
				setState(120);
				matrix_row();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQB) {
					{
					{
					setState(121);
					matrix_row();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(RSQB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(MATRIX);
				setState(130);
				match(LBRACE);
				setState(131);
				matrix_row();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQB) {
					{
					{
					setState(132);
					matrix_row();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(MATRIX);
				setState(141);
				match(VBAR);
				setState(142);
				matrix_row();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQB) {
					{
					{
					setState(143);
					matrix_row();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(VBAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(MATRIX);
				setState(152);
				match(DOUBLE_VBAR);
				setState(153);
				matrix_row();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQB) {
					{
					{
					setState(154);
					matrix_row();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(DOUBLE_VBAR);
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
	public static class Matrix_rowContext extends ParserRuleContext {
		public TerminalNode LSQB() { return getToken(PMLang.LSQB, 0); }
		public Literal_listContext literal_list() {
			return getRuleContext(Literal_listContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(PMLang.RSQB, 0); }
		public Matrix_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_row; }
	}

	public final Matrix_rowContext matrix_row() throws RecognitionException {
		Matrix_rowContext _localctx = new Matrix_rowContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matrix_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LSQB);
			setState(165);
			literal_list();
			setState(166);
			match(RSQB);
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
		case 4:
			return range_body_sempred((Range_bodyContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean range_body_sempred(Range_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001<\u00a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u00047\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004;\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004E\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004J\b\u0004\n\u0004\f\u0004M\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005R\b\u0005\n\u0005\f\u0005U\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006[\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\np\b\n\n\n\f\ns\t\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n{\b\n\n\n\f\n~\t\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0086\b\n\n\n\f\n\u0089\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0091\b\n\n\n\f\n\u0094\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u009c\b\n\n\n\f\n\u009f"+
		"\t\n\u0001\n\u0001\n\u0003\n\u00a3\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0000\u0001\b\f\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0000\u0005\u0001\u000067\u0002\u0000)"+
		")++\u0002\u0000**,,\u0001\u0000!\"\u0001\u0000\u001e\u001f\u00b1\u0000"+
		"\u0018\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004"+
		" \u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b6\u0001\u0000"+
		"\u0000\u0000\nN\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000\u0000\u000e"+
		"\\\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000\u0000\u0012f\u0001"+
		"\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000\u0016\u00a4\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0005"+
		"\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001f\u0003"+
		"\u0004\u0002\u0000\u001c\u001f\u0003\u0006\u0003\u0000\u001d\u001f\u0003"+
		"\f\u0006\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\u0003\u0001\u0000"+
		"\u0000\u0000 !\u0007\u0000\u0000\u0000!\u0005\u0001\u0000\u0000\u0000"+
		"\"#\u0005\u001d\u0000\u0000#$\u0005-\u0000\u0000$%\u0003\b\u0004\u0000"+
		"%&\u0005.\u0000\u0000&\u0007\u0001\u0000\u0000\u0000\'(\u0006\u0004\uffff"+
		"\uffff\u0000()\u0007\u0001\u0000\u0000)*\u0003\u0004\u0002\u0000*+\u0005"+
		"\'\u0000\u0000+,\u0003\u0004\u0002\u0000,-\u0007\u0002\u0000\u0000-7\u0001"+
		"\u0000\u0000\u0000./\u0007\u0001\u0000\u0000/0\u0003\u0004\u0002\u0000"+
		"01\u0005\'\u0000\u000012\u00057\u0000\u000023\u0005\'\u0000\u000034\u0003"+
		"\u0004\u0002\u000045\u0007\u0002\u0000\u000057\u0001\u0000\u0000\u0000"+
		"6\'\u0001\u0000\u0000\u00006.\u0001\u0000\u0000\u00007K\u0001\u0000\u0000"+
		"\u00008:\n\u0003\u0000\u00009;\u0007\u0003\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0005-\u0000"+
		"\u0000=>\u0003\n\u0005\u0000>?\u0005.\u0000\u0000?J\u0001\u0000\u0000"+
		"\u0000@A\n\u0002\u0000\u0000AD\u0007\u0004\u0000\u0000BE\u0003\u0004\u0002"+
		"\u0000CE\u0003\n\u0005\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000EJ\u0001\u0000\u0000\u0000FG\n\u0001\u0000\u0000GH\u0005 \u0000"+
		"\u0000HJ\u0003\u0004\u0002\u0000I8\u0001\u0000\u0000\u0000I@\u0001\u0000"+
		"\u0000\u0000IF\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\t\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NS\u0003\u0004\u0002\u0000OP\u0005\'\u0000\u0000"+
		"PR\u0003\u0004\u0002\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u000b\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000V[\u0003\u0014\n\u0000W[\u0003"+
		"\u000e\u0007\u0000X[\u0003\u0010\b\u0000Y[\u0003\u0012\t\u0000ZV\u0001"+
		"\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"ZY\u0001\u0000\u0000\u0000[\r\u0001\u0000\u0000\u0000\\]\u0005\u001b\u0000"+
		"\u0000]^\u0005)\u0000\u0000^_\u0003\f\u0006\u0000_`\u0005*\u0000\u0000"+
		"`\u000f\u0001\u0000\u0000\u0000ab\u0005\u001c\u0000\u0000bc\u0005)\u0000"+
		"\u0000cd\u0003\f\u0006\u0000de\u0005*\u0000\u0000e\u0011\u0001\u0000\u0000"+
		"\u0000fg\u0005\u001a\u0000\u0000gh\u0005)\u0000\u0000hi\u0003\f\u0006"+
		"\u0000ij\u0005*\u0000\u0000j\u0013\u0001\u0000\u0000\u0000kl\u0005\u0001"+
		"\u0000\u0000lm\u0005)\u0000\u0000mq\u0003\u0016\u000b\u0000np\u0003\u0016"+
		"\u000b\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tu\u0005*\u0000\u0000u\u00a3\u0001\u0000\u0000"+
		"\u0000vw\u0005\u0001\u0000\u0000wx\u0005+\u0000\u0000x|\u0003\u0016\u000b"+
		"\u0000y{\u0003\u0016\u000b\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005,"+
		"\u0000\u0000\u0080\u00a3\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0001"+
		"\u0000\u0000\u0082\u0083\u0005-\u0000\u0000\u0083\u0087\u0003\u0016\u000b"+
		"\u0000\u0084\u0086\u0003\u0016\u000b\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005.\u0000\u0000"+
		"\u008b\u00a3\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0001\u0000\u0000"+
		"\u008d\u008e\u0005/\u0000\u0000\u008e\u0092\u0003\u0016\u000b\u0000\u008f"+
		"\u0091\u0003\u0016\u000b\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005/\u0000\u0000\u0096\u00a3"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0001\u0000\u0000\u0098\u0099"+
		"\u00050\u0000\u0000\u0099\u009d\u0003\u0016\u000b\u0000\u009a\u009c\u0003"+
		"\u0016\u000b\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u00050\u0000\u0000\u00a1\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a2k\u0001\u0000\u0000\u0000\u00a2v\u0001\u0000\u0000\u0000"+
		"\u00a2\u0081\u0001\u0000\u0000\u0000\u00a2\u008c\u0001\u0000\u0000\u0000"+
		"\u00a2\u0097\u0001\u0000\u0000\u0000\u00a3\u0015\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005+\u0000\u0000\u00a5\u00a6\u0003\n\u0005\u0000\u00a6"+
		"\u00a7\u0005,\u0000\u0000\u00a7\u0017\u0001\u0000\u0000\u0000\u000e\u001e"+
		"6:DIKSZq|\u0087\u0092\u009d\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}