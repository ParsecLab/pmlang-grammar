// Generated from /media/naylour/Work/Parsec/pmlang/grammar/Expressions.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Expressions extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, WHITESPACE=2, COMMENT=3, IDENTIFIER=4, LOG_FUNCTION=5, ONE_ARG_FUNCTION=6, 
		SIN=7, COS=8, TAN=9, COT=10, ASIN=11, ACOS=12, ATAN=13, ACOT=14, CONST_PI=15, 
		CONST_E=16, CONST_PHI=17, CONST_GAMMA=18, CONST_TAU=19, CONST_SQRT2=20, 
		CONST_G=21, CONST_C=22, CONST_H=23, CONST_KB=24, CONST_NA=25, CONST_R=26, 
		CONST_BOHR=27, CONST_FARADAY=28, CONST_DNA_PI=29, SPACIAL_INF=30, SPACIAL_NEG_INF=31, 
		SPECIAL_NAN=32, SPECIAL_EPS=33, SPECIAL_I=34, LPAREN=35, RPAREN=36, COMMA=37, 
		LBRACE=38, RBRACE=39, LBRACK=40, RBRACK=41, PLUS=42, MINUS=43, DOT=44;
	public static final int
		RULE_expr = 0, RULE_trigFunction = 1, RULE_functionalCall = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "trigFunction", "functionalCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'log'", null, null, "'cos'", "'tan'", 
			"'cot'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'('", "')'", "','", "'{'", "'}'", "'['", "']'", "'+'", "'-'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "WHITESPACE", "COMMENT", "IDENTIFIER", "LOG_FUNCTION", 
			"ONE_ARG_FUNCTION", "SIN", "COS", "TAN", "COT", "ASIN", "ACOS", "ATAN", 
			"ACOT", "CONST_PI", "CONST_E", "CONST_PHI", "CONST_GAMMA", "CONST_TAU", 
			"CONST_SQRT2", "CONST_G", "CONST_C", "CONST_H", "CONST_KB", "CONST_NA", 
			"CONST_R", "CONST_BOHR", "CONST_FARADAY", "CONST_DNA_PI", "SPACIAL_INF", 
			"SPACIAL_NEG_INF", "SPECIAL_NAN", "SPECIAL_EPS", "SPECIAL_I", "LPAREN", 
			"RPAREN", "COMMA", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "PLUS", "MINUS", 
			"DOT"
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
	public String getGrammarFileName() { return "Expressions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Expressions(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Expressions.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Expressions.IDENTIFIER, 0); }
		public TerminalNode SIN() { return getToken(Expressions.SIN, 0); }
		public TerminalNode COS() { return getToken(Expressions.COS, 0); }
		public TerminalNode TAN() { return getToken(Expressions.TAN, 0); }
		public TerminalNode COT() { return getToken(Expressions.COT, 0); }
		public TerminalNode ASIN() { return getToken(Expressions.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(Expressions.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(Expressions.ATAN, 0); }
		public TerminalNode ACOT() { return getToken(Expressions.ACOT, 0); }
		public TerminalNode CONST_PI() { return getToken(Expressions.CONST_PI, 0); }
		public TerminalNode CONST_E() { return getToken(Expressions.CONST_E, 0); }
		public TerminalNode CONST_PHI() { return getToken(Expressions.CONST_PHI, 0); }
		public TerminalNode CONST_GAMMA() { return getToken(Expressions.CONST_GAMMA, 0); }
		public TerminalNode CONST_TAU() { return getToken(Expressions.CONST_TAU, 0); }
		public TerminalNode CONST_SQRT2() { return getToken(Expressions.CONST_SQRT2, 0); }
		public TerminalNode CONST_G() { return getToken(Expressions.CONST_G, 0); }
		public TerminalNode CONST_C() { return getToken(Expressions.CONST_C, 0); }
		public TerminalNode CONST_H() { return getToken(Expressions.CONST_H, 0); }
		public TerminalNode CONST_KB() { return getToken(Expressions.CONST_KB, 0); }
		public TerminalNode CONST_NA() { return getToken(Expressions.CONST_NA, 0); }
		public TerminalNode CONST_R() { return getToken(Expressions.CONST_R, 0); }
		public TerminalNode CONST_BOHR() { return getToken(Expressions.CONST_BOHR, 0); }
		public TerminalNode CONST_FARADAY() { return getToken(Expressions.CONST_FARADAY, 0); }
		public TerminalNode CONST_DNA_PI() { return getToken(Expressions.CONST_DNA_PI, 0); }
		public TerminalNode SPACIAL_INF() { return getToken(Expressions.SPACIAL_INF, 0); }
		public TerminalNode SPACIAL_NEG_INF() { return getToken(Expressions.SPACIAL_NEG_INF, 0); }
		public TerminalNode SPECIAL_NAN() { return getToken(Expressions.SPECIAL_NAN, 0); }
		public TerminalNode SPECIAL_EPS() { return getToken(Expressions.SPECIAL_EPS, 0); }
		public TerminalNode SPECIAL_I() { return getToken(Expressions.SPECIAL_I, 0); }
		public TerminalNode ONE_ARG_FUNCTION() { return getToken(Expressions.ONE_ARG_FUNCTION, 0); }
		public TerminalNode LOG_FUNCTION() { return getToken(Expressions.LOG_FUNCTION, 0); }
		public TrigFunctionContext trigFunction() {
			return getRuleContext(TrigFunctionContext.class,0);
		}
		public FunctionalCallContext functionalCall() {
			return getRuleContext(FunctionalCallContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				match(SIN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(9);
				match(COS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(10);
				match(TAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(11);
				match(COT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(12);
				match(ASIN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(13);
				match(ACOS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(14);
				match(ATAN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(15);
				match(ACOT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(16);
				match(CONST_PI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(17);
				match(CONST_E);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(18);
				match(CONST_PHI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(19);
				match(CONST_GAMMA);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(20);
				match(CONST_TAU);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(21);
				match(CONST_SQRT2);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(22);
				match(CONST_G);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(23);
				match(CONST_C);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(24);
				match(CONST_H);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(25);
				match(CONST_KB);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(26);
				match(CONST_NA);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(27);
				match(CONST_R);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(28);
				match(CONST_BOHR);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(29);
				match(CONST_FARADAY);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(30);
				match(CONST_DNA_PI);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(31);
				match(SPACIAL_INF);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(32);
				match(SPACIAL_NEG_INF);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(33);
				match(SPECIAL_NAN);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(34);
				match(SPECIAL_EPS);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(35);
				match(SPECIAL_I);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(36);
				match(ONE_ARG_FUNCTION);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(37);
				match(LOG_FUNCTION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(38);
				trigFunction();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(39);
				functionalCall();
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
	public static class TrigFunctionContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(Expressions.SIN, 0); }
		public TerminalNode LPAREN() { return getToken(Expressions.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Expressions.RPAREN, 0); }
		public TerminalNode COS() { return getToken(Expressions.COS, 0); }
		public TerminalNode TAN() { return getToken(Expressions.TAN, 0); }
		public TerminalNode COT() { return getToken(Expressions.COT, 0); }
		public TerminalNode ASIN() { return getToken(Expressions.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(Expressions.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(Expressions.ATAN, 0); }
		public TerminalNode COMMA() { return getToken(Expressions.COMMA, 0); }
		public TrigFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigFunction; }
	}

	public final TrigFunctionContext trigFunction() throws RecognitionException {
		TrigFunctionContext _localctx = new TrigFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trigFunction);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(SIN);
				setState(43);
				match(LPAREN);
				setState(44);
				expr();
				setState(45);
				match(RPAREN);
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(COS);
				setState(48);
				match(LPAREN);
				setState(49);
				expr();
				setState(50);
				match(RPAREN);
				}
				break;
			case TAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(TAN);
				setState(53);
				match(LPAREN);
				setState(54);
				expr();
				setState(55);
				match(RPAREN);
				}
				break;
			case COT:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(COT);
				setState(58);
				match(LPAREN);
				setState(59);
				expr();
				setState(60);
				match(RPAREN);
				}
				break;
			case ASIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				match(ASIN);
				setState(63);
				match(LPAREN);
				setState(64);
				expr();
				setState(65);
				match(RPAREN);
				}
				break;
			case ACOS:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				match(ACOS);
				setState(68);
				match(LPAREN);
				setState(69);
				expr();
				setState(70);
				match(RPAREN);
				}
				break;
			case ATAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				match(ATAN);
				setState(73);
				match(LPAREN);
				setState(74);
				expr();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(75);
					match(COMMA);
					setState(76);
					expr();
					}
				}

				setState(79);
				match(RPAREN);
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
	public static class FunctionalCallContext extends ParserRuleContext {
		public TrigFunctionContext trigFunction() {
			return getRuleContext(TrigFunctionContext.class,0);
		}
		public TerminalNode ONE_ARG_FUNCTION() { return getToken(Expressions.ONE_ARG_FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(Expressions.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Expressions.RPAREN, 0); }
		public TerminalNode LOG_FUNCTION() { return getToken(Expressions.LOG_FUNCTION, 0); }
		public TerminalNode COMMA() { return getToken(Expressions.COMMA, 0); }
		public FunctionalCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalCall; }
	}

	public final FunctionalCallContext functionalCall() throws RecognitionException {
		FunctionalCallContext _localctx = new FunctionalCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionalCall);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIN:
			case COS:
			case TAN:
			case COT:
			case ASIN:
			case ACOS:
			case ATAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				trigFunction();
				}
				break;
			case ONE_ARG_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(ONE_ARG_FUNCTION);
				setState(85);
				match(LPAREN);
				setState(86);
				expr();
				setState(87);
				match(RPAREN);
				}
				break;
			case LOG_FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(LOG_FUNCTION);
				setState(90);
				match(LPAREN);
				setState(91);
				expr();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(92);
					match(COMMA);
					setState(93);
					expr();
					}
				}

				setState(96);
				match(RPAREN);
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

	public static final String _serializedATN =
		"\u0004\u0001,e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		")\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001N\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001R\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002_\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002c\b\u0002\u0001\u0002\u0000"+
		"\u0000\u0003\u0000\u0002\u0004\u0000\u0000\u008c\u0000(\u0001\u0000\u0000"+
		"\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004b\u0001\u0000\u0000\u0000\u0006"+
		")\u0005\u0001\u0000\u0000\u0007)\u0005\u0004\u0000\u0000\b)\u0005\u0007"+
		"\u0000\u0000\t)\u0005\b\u0000\u0000\n)\u0005\t\u0000\u0000\u000b)\u0005"+
		"\n\u0000\u0000\f)\u0005\u000b\u0000\u0000\r)\u0005\f\u0000\u0000\u000e"+
		")\u0005\r\u0000\u0000\u000f)\u0005\u000e\u0000\u0000\u0010)\u0005\u000f"+
		"\u0000\u0000\u0011)\u0005\u0010\u0000\u0000\u0012)\u0005\u0011\u0000\u0000"+
		"\u0013)\u0005\u0012\u0000\u0000\u0014)\u0005\u0013\u0000\u0000\u0015)"+
		"\u0005\u0014\u0000\u0000\u0016)\u0005\u0015\u0000\u0000\u0017)\u0005\u0016"+
		"\u0000\u0000\u0018)\u0005\u0017\u0000\u0000\u0019)\u0005\u0018\u0000\u0000"+
		"\u001a)\u0005\u0019\u0000\u0000\u001b)\u0005\u001a\u0000\u0000\u001c)"+
		"\u0005\u001b\u0000\u0000\u001d)\u0005\u001c\u0000\u0000\u001e)\u0005\u001d"+
		"\u0000\u0000\u001f)\u0005\u001e\u0000\u0000 )\u0005\u001f\u0000\u0000"+
		"!)\u0005 \u0000\u0000\")\u0005!\u0000\u0000#)\u0005\"\u0000\u0000$)\u0005"+
		"\u0006\u0000\u0000%)\u0005\u0005\u0000\u0000&)\u0003\u0002\u0001\u0000"+
		"\')\u0003\u0004\u0002\u0000(\u0006\u0001\u0000\u0000\u0000(\u0007\u0001"+
		"\u0000\u0000\u0000(\b\u0001\u0000\u0000\u0000(\t\u0001\u0000\u0000\u0000"+
		"(\n\u0001\u0000\u0000\u0000(\u000b\u0001\u0000\u0000\u0000(\f\u0001\u0000"+
		"\u0000\u0000(\r\u0001\u0000\u0000\u0000(\u000e\u0001\u0000\u0000\u0000"+
		"(\u000f\u0001\u0000\u0000\u0000(\u0010\u0001\u0000\u0000\u0000(\u0011"+
		"\u0001\u0000\u0000\u0000(\u0012\u0001\u0000\u0000\u0000(\u0013\u0001\u0000"+
		"\u0000\u0000(\u0014\u0001\u0000\u0000\u0000(\u0015\u0001\u0000\u0000\u0000"+
		"(\u0016\u0001\u0000\u0000\u0000(\u0017\u0001\u0000\u0000\u0000(\u0018"+
		"\u0001\u0000\u0000\u0000(\u0019\u0001\u0000\u0000\u0000(\u001a\u0001\u0000"+
		"\u0000\u0000(\u001b\u0001\u0000\u0000\u0000(\u001c\u0001\u0000\u0000\u0000"+
		"(\u001d\u0001\u0000\u0000\u0000(\u001e\u0001\u0000\u0000\u0000(\u001f"+
		"\u0001\u0000\u0000\u0000( \u0001\u0000\u0000\u0000(!\u0001\u0000\u0000"+
		"\u0000(\"\u0001\u0000\u0000\u0000(#\u0001\u0000\u0000\u0000($\u0001\u0000"+
		"\u0000\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001"+
		"\u0000\u0000\u0000)\u0001\u0001\u0000\u0000\u0000*+\u0005\u0007\u0000"+
		"\u0000+,\u0005#\u0000\u0000,-\u0003\u0000\u0000\u0000-.\u0005$\u0000\u0000"+
		".R\u0001\u0000\u0000\u0000/0\u0005\b\u0000\u000001\u0005#\u0000\u0000"+
		"12\u0003\u0000\u0000\u000023\u0005$\u0000\u00003R\u0001\u0000\u0000\u0000"+
		"45\u0005\t\u0000\u000056\u0005#\u0000\u000067\u0003\u0000\u0000\u0000"+
		"78\u0005$\u0000\u00008R\u0001\u0000\u0000\u00009:\u0005\n\u0000\u0000"+
		":;\u0005#\u0000\u0000;<\u0003\u0000\u0000\u0000<=\u0005$\u0000\u0000="+
		"R\u0001\u0000\u0000\u0000>?\u0005\u000b\u0000\u0000?@\u0005#\u0000\u0000"+
		"@A\u0003\u0000\u0000\u0000AB\u0005$\u0000\u0000BR\u0001\u0000\u0000\u0000"+
		"CD\u0005\f\u0000\u0000DE\u0005#\u0000\u0000EF\u0003\u0000\u0000\u0000"+
		"FG\u0005$\u0000\u0000GR\u0001\u0000\u0000\u0000HI\u0005\r\u0000\u0000"+
		"IJ\u0005#\u0000\u0000JM\u0003\u0000\u0000\u0000KL\u0005%\u0000\u0000L"+
		"N\u0003\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OP\u0005$\u0000\u0000PR\u0001\u0000\u0000"+
		"\u0000Q*\u0001\u0000\u0000\u0000Q/\u0001\u0000\u0000\u0000Q4\u0001\u0000"+
		"\u0000\u0000Q9\u0001\u0000\u0000\u0000Q>\u0001\u0000\u0000\u0000QC\u0001"+
		"\u0000\u0000\u0000QH\u0001\u0000\u0000\u0000R\u0003\u0001\u0000\u0000"+
		"\u0000Sc\u0003\u0002\u0001\u0000TU\u0005\u0006\u0000\u0000UV\u0005#\u0000"+
		"\u0000VW\u0003\u0000\u0000\u0000WX\u0005$\u0000\u0000Xc\u0001\u0000\u0000"+
		"\u0000YZ\u0005\u0005\u0000\u0000Z[\u0005#\u0000\u0000[^\u0003\u0000\u0000"+
		"\u0000\\]\u0005%\u0000\u0000]_\u0003\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005"+
		"$\u0000\u0000ac\u0001\u0000\u0000\u0000bS\u0001\u0000\u0000\u0000bT\u0001"+
		"\u0000\u0000\u0000bY\u0001\u0000\u0000\u0000c\u0005\u0001\u0000\u0000"+
		"\u0000\u0005(MQ^b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}