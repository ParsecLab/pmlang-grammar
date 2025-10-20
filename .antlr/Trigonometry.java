// Generated from /media/naylour/Work/Parsec/pmlang/grammar/Trigonometry.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Trigonometry extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIN=1, COS=2, TAN=3, COT=4, ASIN=5, ACOS=6, ATAN=7, ACOT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRIGONOMETRY_FUNCTION", "SIN", "COS", "TAN", "COT", "ASIN", "ACOS", 
			"ATAN", "ACOT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'cos'", "'tan'", "'cot'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SIN", "COS", "TAN", "COT", "ASIN", "ACOS", "ATAN", "ACOT"
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


	public Trigonometry(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Trigonometry.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\b_\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001c"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\""+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005:\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006F\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007R\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b^\b\b\u0000\u0000\t\u0001\u0000\u0003\u0001\u0005"+
		"\u0002\u0007\u0003\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0001"+
		"\u0000\u0000i\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0001\u001b\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005"+
		"#\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000\t+\u0001\u0000"+
		"\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000"+
		"\u000fQ\u0001\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000\u0013\u001c"+
		"\u0003\u0003\u0001\u0000\u0014\u001c\u0003\u0005\u0002\u0000\u0015\u001c"+
		"\u0003\u0007\u0003\u0000\u0016\u001c\u0003\t\u0004\u0000\u0017\u001c\u0003"+
		"\u000b\u0005\u0000\u0018\u001c\u0003\r\u0006\u0000\u0019\u001c\u0003\u000f"+
		"\u0007\u0000\u001a\u001c\u0003\u0011\b\u0000\u001b\u0013\u0001\u0000\u0000"+
		"\u0000\u001b\u0014\u0001\u0000\u0000\u0000\u001b\u0015\u0001\u0000\u0000"+
		"\u0000\u001b\u0016\u0001\u0000\u0000\u0000\u001b\u0017\u0001\u0000\u0000"+
		"\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u0002\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005s\u0000\u0000\u001e\u001f\u0005i\u0000\u0000\u001f"+
		"\"\u0005n\u0000\u0000 \"\u0005\u223f\u0000\u0000!\u001d\u0001\u0000\u0000"+
		"\u0000! \u0001\u0000\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005"+
		"c\u0000\u0000$%\u0005o\u0000\u0000%&\u0005s\u0000\u0000&\u0006\u0001\u0000"+
		"\u0000\u0000\'(\u0005t\u0000\u0000()\u0005a\u0000\u0000)*\u0005n\u0000"+
		"\u0000*\b\u0001\u0000\u0000\u0000+,\u0005c\u0000\u0000,-\u0005o\u0000"+
		"\u0000-.\u0005t\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005a\u0000"+
		"\u000001\u0005s\u0000\u000012\u0005i\u0000\u00002:\u0005n\u0000\u0000"+
		"34\u0005a\u0000\u000045\u0005r\u0000\u000056\u0005c\u0000\u000067\u0005"+
		"s\u0000\u000078\u0005i\u0000\u00008:\u0005n\u0000\u00009/\u0001\u0000"+
		"\u0000\u000093\u0001\u0000\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0005"+
		"a\u0000\u0000<=\u0005c\u0000\u0000=>\u0005o\u0000\u0000>F\u0005s\u0000"+
		"\u0000?@\u0005a\u0000\u0000@A\u0005r\u0000\u0000AB\u0005c\u0000\u0000"+
		"BC\u0005c\u0000\u0000CD\u0005o\u0000\u0000DF\u0005s\u0000\u0000E;\u0001"+
		"\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000F\u000e\u0001\u0000\u0000"+
		"\u0000GH\u0005a\u0000\u0000HI\u0005t\u0000\u0000IJ\u0005a\u0000\u0000"+
		"JR\u0005n\u0000\u0000KL\u0005a\u0000\u0000LM\u0005r\u0000\u0000MN\u0005"+
		"c\u0000\u0000NO\u0005t\u0000\u0000OP\u0005a\u0000\u0000PR\u0005n\u0000"+
		"\u0000QG\u0001\u0000\u0000\u0000QK\u0001\u0000\u0000\u0000R\u0010\u0001"+
		"\u0000\u0000\u0000ST\u0005a\u0000\u0000TU\u0005c\u0000\u0000UV\u0005o"+
		"\u0000\u0000V^\u0005t\u0000\u0000WX\u0005a\u0000\u0000XY\u0005r\u0000"+
		"\u0000YZ\u0005c\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005o\u0000\u0000"+
		"\\^\u0005t\u0000\u0000]S\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000"+
		"^\u0012\u0001\u0000\u0000\u0000\u0007\u0000\u001b!9EQ]\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}