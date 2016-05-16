// Generated from /Users/Aish/IdeaProjects/AbsCon/AbsCon.g4 by ANTLR 4.5.1
package edu.nus.sun.image.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbsConLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, MULDIV=26, ADDSUB=27, COMMA=28, DIGITS=29, SQUAREBRACEOPEN=30, 
		SQUAREBRACECLOSE=31, BLOCKOPEN=32, BLOCKCLOSE=33, ID=34, ASSIGN=35, SEMICOLON=36, 
		OPENBRACE=37, CLOSEBRACE=38, DOUBLEEQUAL=39, LESSTHAN=40, GREATERTHAN=41, 
		NOTEQUAL=42, LESSTHANEQUAL=43, GREATERTHANEQUAL=44, COLON=45, WS=46, COMMENTS=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"MULDIV", "ADDSUB", "COMMA", "DIGITS", "SQUAREBRACEOPEN", "SQUAREBRACECLOSE", 
		"BLOCKOPEN", "BLOCKCLOSE", "ID", "ASSIGN", "SEMICOLON", "OPENBRACE", "CLOSEBRACE", 
		"DOUBLEEQUAL", "LESSTHAN", "GREATERTHAN", "NOTEQUAL", "LESSTHANEQUAL", 
		"GREATERTHANEQUAL", "COLON", "WS", "COMMENTS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#declares'", "'#abstract'", "'#concrete'", "'setOf'", "'#concVec'", 
		"'#abstVec'", "'#assigns'", "'setFeatures'", "'sumOfFeatures'", "'sourceOf'", 
		"'abs'", "'#clone'", "'#query'", "'#filters'", "''", "'let'", "'in'", 
		"'exists'", "'forall'", "'..'", "'inlinedInto'", "'sizeOf'", "'&&'", "'||'", 
		"'not'", null, null, "','", null, "'['", "']'", "'{'", "'}'", null, "'='", 
		"';'", "'('", "')'", "'=='", "'<'", "'>'", "'!='", "'<='", "'>='", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "MULDIV", "ADDSUB", "COMMA", "DIGITS", "SQUAREBRACEOPEN", 
		"SQUAREBRACECLOSE", "BLOCKOPEN", "BLOCKCLOSE", "ID", "ASSIGN", "SEMICOLON", 
		"OPENBRACE", "CLOSEBRACE", "DOUBLEEQUAL", "LESSTHAN", "GREATERTHAN", "NOTEQUAL", 
		"LESSTHANEQUAL", "GREATERTHANEQUAL", "COLON", "WS", "COMMENTS"
	};
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


	public AbsConLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AbsCon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0158\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\6\36\u011c\n\36\r\36\16\36\u011d\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\6#\u0129\n#\r#\16#\u012a\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\6/\u0148"+
		"\n/\r/\16/\u0149\3/\3/\3\60\3\60\3\60\3\60\7\60\u0152\n\60\f\60\16\60"+
		"\u0155\13\60\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"\3\2\b\4\2,,\61\61\4\2--//\3\2\62;\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\u015a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\3a\3\2\2\2\5k\3\2\2\2\7u\3\2\2\2\t\177\3\2\2\2\13\u0085\3"+
		"\2\2\2\r\u008e\3\2\2\2\17\u0097\3\2\2\2\21\u00a0\3\2\2\2\23\u00ac\3\2"+
		"\2\2\25\u00ba\3\2\2\2\27\u00c3\3\2\2\2\31\u00c7\3\2\2\2\33\u00ce\3\2\2"+
		"\2\35\u00d5\3\2\2\2\37\u00de\3\2\2\2!\u00df\3\2\2\2#\u00e3\3\2\2\2%\u00e6"+
		"\3\2\2\2\'\u00ed\3\2\2\2)\u00f4\3\2\2\2+\u00f7\3\2\2\2-\u0103\3\2\2\2"+
		"/\u010a\3\2\2\2\61\u010d\3\2\2\2\63\u0110\3\2\2\2\65\u0114\3\2\2\2\67"+
		"\u0116\3\2\2\29\u0118\3\2\2\2;\u011b\3\2\2\2=\u011f\3\2\2\2?\u0121\3\2"+
		"\2\2A\u0123\3\2\2\2C\u0125\3\2\2\2E\u0128\3\2\2\2G\u012c\3\2\2\2I\u012e"+
		"\3\2\2\2K\u0130\3\2\2\2M\u0132\3\2\2\2O\u0134\3\2\2\2Q\u0137\3\2\2\2S"+
		"\u0139\3\2\2\2U\u013b\3\2\2\2W\u013e\3\2\2\2Y\u0141\3\2\2\2[\u0144\3\2"+
		"\2\2]\u0147\3\2\2\2_\u014d\3\2\2\2ab\7%\2\2bc\7f\2\2cd\7g\2\2de\7e\2\2"+
		"ef\7n\2\2fg\7c\2\2gh\7t\2\2hi\7g\2\2ij\7u\2\2j\4\3\2\2\2kl\7%\2\2lm\7"+
		"c\2\2mn\7d\2\2no\7u\2\2op\7v\2\2pq\7t\2\2qr\7c\2\2rs\7e\2\2st\7v\2\2t"+
		"\6\3\2\2\2uv\7%\2\2vw\7e\2\2wx\7q\2\2xy\7p\2\2yz\7e\2\2z{\7t\2\2{|\7g"+
		"\2\2|}\7v\2\2}~\7g\2\2~\b\3\2\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2"+
		"\u0081\u0082\7v\2\2\u0082\u0083\7Q\2\2\u0083\u0084\7h\2\2\u0084\n\3\2"+
		"\2\2\u0085\u0086\7%\2\2\u0086\u0087\7e\2\2\u0087\u0088\7q\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7e\2\2\u008a\u008b\7X\2\2\u008b\u008c\7g\2\2\u008c"+
		"\u008d\7e\2\2\u008d\f\3\2\2\2\u008e\u008f\7%\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7d\2\2\u0091\u0092\7u\2\2\u0092\u0093\7v\2\2\u0093\u0094\7X\2\2"+
		"\u0094\u0095\7g\2\2\u0095\u0096\7e\2\2\u0096\16\3\2\2\2\u0097\u0098\7"+
		"%\2\2\u0098\u0099\7c\2\2\u0099\u009a\7u\2\2\u009a\u009b\7u\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7i\2\2\u009d\u009e\7p\2\2\u009e\u009f\7u\2\2\u009f"+
		"\20\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7v\2\2\u00a3"+
		"\u00a4\7H\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7\u00a8\7w\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab"+
		"\7u\2\2\u00ab\22\3\2\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af"+
		"\7o\2\2\u00af\u00b0\7Q\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7H\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7w\2\2"+
		"\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7u\2\2\u00b9\24\3\2"+
		"\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7Q\2\2\u00c1"+
		"\u00c2\7h\2\2\u00c2\26\3\2\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7d\2\2\u00c5"+
		"\u00c6\7u\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7%\2\2\u00c8\u00c9\7e\2\2\u00c9"+
		"\u00ca\7n\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\32\3\2\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d0\7s\2\2\u00d0\u00d1\7"+
		"w\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7{\2\2\u00d4\34"+
		"\3\2\2\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7k\2\2\u00d8"+
		"\u00d9\7n\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7t\2\2"+
		"\u00dc\u00dd\7u\2\2\u00dd\36\3\2\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7"+
		"g\2\2\u00e1\u00e2\7v\2\2\u00e2\"\3\2\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5$\3\2\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7z\2\2\u00e8\u00e9"+
		"\7k\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7u\2\2\u00ec"+
		"&\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7t\2\2\u00f0"+
		"\u00f1\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7n\2\2\u00f3(\3\2\2\2\u00f4"+
		"\u00f5\7\60\2\2\u00f5\u00f6\7\60\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7k\2\2"+
		"\u00f8\u00f9\7p\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc"+
		"\7p\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff\7K\2\2\u00ff"+
		"\u0100\7p\2\2\u0100\u0101\7v\2\2\u0101\u0102\7q\2\2\u0102,\3\2\2\2\u0103"+
		"\u0104\7u\2\2\u0104\u0105\7k\2\2\u0105\u0106\7|\2\2\u0106\u0107\7g\2\2"+
		"\u0107\u0108\7Q\2\2\u0108\u0109\7h\2\2\u0109.\3\2\2\2\u010a\u010b\7(\2"+
		"\2\u010b\u010c\7(\2\2\u010c\60\3\2\2\2\u010d\u010e\7~\2\2\u010e\u010f"+
		"\7~\2\2\u010f\62\3\2\2\2\u0110\u0111\7p\2\2\u0111\u0112\7q\2\2\u0112\u0113"+
		"\7v\2\2\u0113\64\3\2\2\2\u0114\u0115\t\2\2\2\u0115\66\3\2\2\2\u0116\u0117"+
		"\t\3\2\2\u01178\3\2\2\2\u0118\u0119\7.\2\2\u0119:\3\2\2\2\u011a\u011c"+
		"\t\4\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e<\3\2\2\2\u011f\u0120\7]\2\2\u0120>\3\2\2\2\u0121"+
		"\u0122\7_\2\2\u0122@\3\2\2\2\u0123\u0124\7}\2\2\u0124B\3\2\2\2\u0125\u0126"+
		"\7\177\2\2\u0126D\3\2\2\2\u0127\u0129\t\5\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012bF\3\2\2\2"+
		"\u012c\u012d\7?\2\2\u012dH\3\2\2\2\u012e\u012f\7=\2\2\u012fJ\3\2\2\2\u0130"+
		"\u0131\7*\2\2\u0131L\3\2\2\2\u0132\u0133\7+\2\2\u0133N\3\2\2\2\u0134\u0135"+
		"\7?\2\2\u0135\u0136\7?\2\2\u0136P\3\2\2\2\u0137\u0138\7>\2\2\u0138R\3"+
		"\2\2\2\u0139\u013a\7@\2\2\u013aT\3\2\2\2\u013b\u013c\7#\2\2\u013c\u013d"+
		"\7?\2\2\u013dV\3\2\2\2\u013e\u013f\7>\2\2\u013f\u0140\7?\2\2\u0140X\3"+
		"\2\2\2\u0141\u0142\7@\2\2\u0142\u0143\7?\2\2\u0143Z\3\2\2\2\u0144\u0145"+
		"\7<\2\2\u0145\\\3\2\2\2\u0146\u0148\t\6\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\b/\2\2\u014c^\3\2\2\2\u014d\u014e\7\61\2\2\u014e\u014f"+
		"\7\61\2\2\u014f\u0153\3\2\2\2\u0150\u0152\n\7\2\2\u0151\u0150\3\2\2\2"+
		"\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\b\60\2\2\u0157`\3\2\2\2\7\2\u011d"+
		"\u012a\u0149\u0153\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}