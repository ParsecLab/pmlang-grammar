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
public class PMLangParser extends Parser {
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
		VBAR=47, DOUBLEVBAR=48, HASH=49, ARROW_RIGHT=50, ARROW_LEFT=51, FROM=52, 
		TO=53, CONST_PI=54, CONST_E=55, CONST_PHI=56, CONST_INF=57, CONST_DELTA=58, 
		CONST_C=59, CONST_HBAR=60, CONST_G=61, CONST_N_A=62, CONST_I=63, CONST_R_GAS=64, 
		NUMBER=65, STRING=66, IDENTIFIER=67, WS=68, COMMENT=69, ERRORTOKEN=70, 
		CONSTANT=71;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_literal = 2, RULE_range = 3, RULE_range_body = 4, 
		RULE_literal_list = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "literal", "range", "range_body", "literal_list"
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
			"'to'", null, "'e'", null, null, null, "'c'", null, "'G'", "'N_A'", "'i'", 
			"'R_gas'"
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
			"DOUBLEVBAR", "HASH", "ARROW_RIGHT", "ARROW_LEFT", "FROM", "TO", "CONST_PI", 
			"CONST_E", "CONST_PHI", "CONST_INF", "CONST_DELTA", "CONST_C", "CONST_HBAR", 
			"CONST_G", "CONST_N_A", "CONST_I", "CONST_R_GAS", "NUMBER", "STRING", 
			"IDENTIFIER", "WS", "COMMENT", "ERRORTOKEN", "CONSTANT"
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

	public PMLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PMLangParser.EOF, 0); }
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
			setState(12);
			expr();
			setState(13);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				literal();
				}
				break;
			case RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				range();
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
		public TerminalNode NUMBER() { return getToken(PMLangParser.NUMBER, 0); }
		public TerminalNode CONSTANT() { return getToken(PMLangParser.CONSTANT, 0); }
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
			setState(19);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==CONSTANT) ) {
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
		public TerminalNode RANGE() { return getToken(PMLangParser.RANGE, 0); }
		public TerminalNode LBRACE() { return getToken(PMLangParser.LBRACE, 0); }
		public Range_bodyContext range_body() {
			return getRuleContext(Range_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PMLangParser.RBRACE, 0); }
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
			setState(21);
			match(RANGE);
			setState(22);
			match(LBRACE);
			setState(23);
			range_body(0);
			setState(24);
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
		public List<TerminalNode> COMMA() { return getTokens(PMLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PMLangParser.COMMA, i);
		}
		public TerminalNode LSQB() { return getToken(PMLangParser.LSQB, 0); }
		public TerminalNode LPAR() { return getToken(PMLangParser.LPAR, 0); }
		public TerminalNode RSQB() { return getToken(PMLangParser.RSQB, 0); }
		public TerminalNode RPAR() { return getToken(PMLangParser.RPAR, 0); }
		public TerminalNode NUMBER() { return getToken(PMLangParser.NUMBER, 0); }
		public Range_bodyContext range_body() {
			return getRuleContext(Range_bodyContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(PMLangParser.LBRACE, 0); }
		public Literal_listContext literal_list() {
			return getRuleContext(Literal_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PMLangParser.RBRACE, 0); }
		public TerminalNode PLUS() { return getToken(PMLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PMLangParser.MINUS, 0); }
		public TerminalNode EXCLUDE() { return getToken(PMLangParser.EXCLUDE, 0); }
		public TerminalNode INCLUDE() { return getToken(PMLangParser.INCLUDE, 0); }
		public TerminalNode STEP() { return getToken(PMLangParser.STEP, 0); }
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(27);
				_la = _input.LA(1);
				if ( !(_la==LPAR || _la==LSQB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(28);
				literal();
				setState(29);
				match(COMMA);
				setState(30);
				literal();
				setState(31);
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
				setState(33);
				_la = _input.LA(1);
				if ( !(_la==LPAR || _la==LSQB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(34);
				literal();
				setState(35);
				match(COMMA);
				setState(36);
				match(NUMBER);
				setState(37);
				match(COMMA);
				setState(38);
				literal();
				setState(39);
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
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Range_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_range_body);
						setState(43);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(45);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==PLUS || _la==MINUS) {
							{
							setState(44);
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

						setState(47);
						match(LBRACE);
						setState(48);
						literal_list();
						setState(49);
						match(RBRACE);
						}
						break;
					case 2:
						{
						_localctx = new Range_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_range_body);
						setState(51);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(52);
						_la = _input.LA(1);
						if ( !(_la==INCLUDE || _la==EXCLUDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(53);
							literal();
							}
							break;
						case 2:
							{
							setState(54);
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
						setState(57);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(58);
						match(STEP);
						setState(59);
						literal();
						}
						break;
					}
					} 
				}
				setState(64);
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
		public List<TerminalNode> COMMA() { return getTokens(PMLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PMLangParser.COMMA, i);
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
			setState(65);
			literal();
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					match(COMMA);
					setState(67);
					literal();
					}
					} 
				}
				setState(72);
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
		"\u0004\u0001GJ\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004*\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004.\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u00048\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004=\b\u0004\n\u0004\f\u0004@\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005E\b\u0005\n\u0005\f\u0005H\t\u0005\u0001"+
		"\u0005\u0000\u0001\b\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0005\u0002"+
		"\u0000AAGG\u0002\u0000))++\u0002\u0000**,,\u0001\u0000!\"\u0001\u0000"+
		"\u001e\u001fK\u0000\f\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000"+
		"\u0000\u0000\u0004\u0013\u0001\u0000\u0000\u0000\u0006\u0015\u0001\u0000"+
		"\u0000\u0000\b)\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000\f\r"+
		"\u0003\u0002\u0001\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001"+
		"\u0000\u0000\u0000\u000f\u0012\u0003\u0004\u0002\u0000\u0010\u0012\u0003"+
		"\u0006\u0003\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0003\u0001\u0000\u0000\u0000\u0013\u0014\u0007"+
		"\u0000\u0000\u0000\u0014\u0005\u0001\u0000\u0000\u0000\u0015\u0016\u0005"+
		"\u001d\u0000\u0000\u0016\u0017\u0005-\u0000\u0000\u0017\u0018\u0003\b"+
		"\u0004\u0000\u0018\u0019\u0005.\u0000\u0000\u0019\u0007\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0006\u0004\uffff\uffff\u0000\u001b\u001c\u0007\u0001"+
		"\u0000\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\'\u0000"+
		"\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0007\u0002\u0000\u0000"+
		" *\u0001\u0000\u0000\u0000!\"\u0007\u0001\u0000\u0000\"#\u0003\u0004\u0002"+
		"\u0000#$\u0005\'\u0000\u0000$%\u0005A\u0000\u0000%&\u0005\'\u0000\u0000"+
		"&\'\u0003\u0004\u0002\u0000\'(\u0007\u0002\u0000\u0000(*\u0001\u0000\u0000"+
		"\u0000)\u001a\u0001\u0000\u0000\u0000)!\u0001\u0000\u0000\u0000*>\u0001"+
		"\u0000\u0000\u0000+-\n\u0003\u0000\u0000,.\u0007\u0003\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/0\u0005-\u0000\u000001\u0003\n\u0005\u000012\u0005.\u0000\u00002=\u0001"+
		"\u0000\u0000\u000034\n\u0002\u0000\u000047\u0007\u0004\u0000\u000058\u0003"+
		"\u0004\u0002\u000068\u0003\n\u0005\u000075\u0001\u0000\u0000\u000076\u0001"+
		"\u0000\u0000\u00008=\u0001\u0000\u0000\u00009:\n\u0001\u0000\u0000:;\u0005"+
		" \u0000\u0000;=\u0003\u0004\u0002\u0000<+\u0001\u0000\u0000\u0000<3\u0001"+
		"\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\t\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000AF\u0003\u0004\u0002\u0000BC\u0005\'\u0000"+
		"\u0000CE\u0003\u0004\u0002\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u000b"+
		"\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000\u0007\u0011)-7<>F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}