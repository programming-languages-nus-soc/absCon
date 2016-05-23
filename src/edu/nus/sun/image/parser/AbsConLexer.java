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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, MULDIV=30, ADDSUB=31, 
		COMMA=32, DIGITS=33, SQUAREBRACEOPEN=34, SQUAREBRACECLOSE=35, BLOCKOPEN=36, 
		BLOCKCLOSE=37, ID=38, ASSIGN=39, SEMICOLON=40, OPENBRACE=41, CLOSEBRACE=42, 
		DOUBLEEQUAL=43, LESSTHAN=44, GREATERTHAN=45, NOTEQUAL=46, LESSTHANEQUAL=47, 
		GREATERTHANEQUAL=48, COLON=49, WS=50, COMMENTS=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "MULDIV", "ADDSUB", "COMMA", "DIGITS", 
		"SQUAREBRACEOPEN", "SQUAREBRACECLOSE", "BLOCKOPEN", "BLOCKCLOSE", "ID", 
		"ASSIGN", "SEMICOLON", "OPENBRACE", "CLOSEBRACE", "DOUBLEEQUAL", "LESSTHAN", 
		"GREATERTHAN", "NOTEQUAL", "LESSTHANEQUAL", "GREATERTHANEQUAL", "COLON", 
		"WS", "COMMENTS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#declares'", "'#abstract'", "'#concrete'", "'setOf'", "'#concVec'", 
		"'#abstVec'", "'#assigns'", "'setFeatures'", "'setFeaturesByRange'", "'sumOfFeatures'", 
		"'sourceOf'", "'sourceOfSize'", "'abs'", "'#clone'", "'#query'", "'#filters'", 
		"''", "'let'", "'in'", "'exists'", "'forall'", "'..'", "'inlinedInto'", 
		"'sizeOf'", "'&&'", "'||'", "'not'", "'compare'", "'totalCount'", null, 
		null, "','", null, "'['", "']'", "'{'", "'}'", null, "'='", "';'", "'('", 
		"')'", "'=='", "'<'", "'>'", "'!='", "'<='", "'>='", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "MULDIV", "ADDSUB", "COMMA", "DIGITS", 
		"SQUAREBRACEOPEN", "SQUAREBRACECLOSE", "BLOCKOPEN", "BLOCKCLOSE", "ID", 
		"ASSIGN", "SEMICOLON", "OPENBRACE", "CLOSEBRACE", "DOUBLEEQUAL", "LESSTHAN", 
		"GREATERTHAN", "NOTEQUAL", "LESSTHANEQUAL", "GREATERTHANEQUAL", "COLON", 
		"WS", "COMMENTS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u0193\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\6\"\u0157\n\"\r\"\16\"\u0158\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\6\'\u0164\n\'\r\'\16\'\u0165\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\6\63"+
		"\u0183\n\63\r\63\16\63\u0184\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u018d"+
		"\n\64\f\64\16\64\u0190\13\64\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\b\4\2,,\61\61\4\2--//\3\2\62;\6"+
		"\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u0195\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5s\3\2\2\2\7}\3\2\2\2\t\u0087\3\2\2\2"+
		"\13\u008d\3\2\2\2\r\u0096\3\2\2\2\17\u009f\3\2\2\2\21\u00a8\3\2\2\2\23"+
		"\u00b4\3\2\2\2\25\u00c7\3\2\2\2\27\u00d5\3\2\2\2\31\u00de\3\2\2\2\33\u00eb"+
		"\3\2\2\2\35\u00ef\3\2\2\2\37\u00f6\3\2\2\2!\u00fd\3\2\2\2#\u0106\3\2\2"+
		"\2%\u0107\3\2\2\2\'\u010b\3\2\2\2)\u010e\3\2\2\2+\u0115\3\2\2\2-\u011c"+
		"\3\2\2\2/\u011f\3\2\2\2\61\u012b\3\2\2\2\63\u0132\3\2\2\2\65\u0135\3\2"+
		"\2\2\67\u0138\3\2\2\29\u013c\3\2\2\2;\u0144\3\2\2\2=\u014f\3\2\2\2?\u0151"+
		"\3\2\2\2A\u0153\3\2\2\2C\u0156\3\2\2\2E\u015a\3\2\2\2G\u015c\3\2\2\2I"+
		"\u015e\3\2\2\2K\u0160\3\2\2\2M\u0163\3\2\2\2O\u0167\3\2\2\2Q\u0169\3\2"+
		"\2\2S\u016b\3\2\2\2U\u016d\3\2\2\2W\u016f\3\2\2\2Y\u0172\3\2\2\2[\u0174"+
		"\3\2\2\2]\u0176\3\2\2\2_\u0179\3\2\2\2a\u017c\3\2\2\2c\u017f\3\2\2\2e"+
		"\u0182\3\2\2\2g\u0188\3\2\2\2ij\7%\2\2jk\7f\2\2kl\7g\2\2lm\7e\2\2mn\7"+
		"n\2\2no\7c\2\2op\7t\2\2pq\7g\2\2qr\7u\2\2r\4\3\2\2\2st\7%\2\2tu\7c\2\2"+
		"uv\7d\2\2vw\7u\2\2wx\7v\2\2xy\7t\2\2yz\7c\2\2z{\7e\2\2{|\7v\2\2|\6\3\2"+
		"\2\2}~\7%\2\2~\177\7e\2\2\177\u0080\7q\2\2\u0080\u0081\7p\2\2\u0081\u0082"+
		"\7e\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7v\2\2\u0085"+
		"\u0086\7g\2\2\u0086\b\3\2\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7Q\2\2\u008b\u008c\7h\2\2\u008c\n\3\2\2\2\u008d"+
		"\u008e\7%\2\2\u008e\u008f\7e\2\2\u008f\u0090\7q\2\2\u0090\u0091\7p\2\2"+
		"\u0091\u0092\7e\2\2\u0092\u0093\7X\2\2\u0093\u0094\7g\2\2\u0094\u0095"+
		"\7e\2\2\u0095\f\3\2\2\2\u0096\u0097\7%\2\2\u0097\u0098\7c\2\2\u0098\u0099"+
		"\7d\2\2\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b\u009c\7X\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7e\2\2\u009e\16\3\2\2\2\u009f\u00a0\7%\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7k\2\2"+
		"\u00a4\u00a5\7i\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7u\2\2\u00a7\20\3\2"+
		"\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac"+
		"\7H\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7v\2\2\u00af"+
		"\u00b0\7w\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7u\2\2"+
		"\u00b3\22\3\2\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7"+
		"v\2\2\u00b7\u00b8\7H\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf\u00c0\7D\2\2\u00c0\u00c1\7{\2\2\u00c1\u00c2\7T\2\2"+
		"\u00c2\u00c3\7c\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7i\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\24\3\2\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca"+
		"\7o\2\2\u00ca\u00cb\7Q\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7H\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7w\2\2"+
		"\u00d1\u00d2\7t\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7u\2\2\u00d4\26\3\2"+
		"\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9"+
		"\7t\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7Q\2\2\u00dc"+
		"\u00dd\7h\2\2\u00dd\30\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7w\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7g\2\2"+
		"\u00e4\u00e5\7Q\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7U\2\2\u00e7\u00e8"+
		"\7k\2\2\u00e8\u00e9\7|\2\2\u00e9\u00ea\7g\2\2\u00ea\32\3\2\2\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7u\2\2\u00ee\34\3\2\2\2\u00ef\u00f0"+
		"\7%\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7p\2\2\u00f4\u00f5\7g\2\2\u00f5\36\3\2\2\2\u00f6\u00f7\7%\2\2\u00f7"+
		"\u00f8\7s\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7t\2\2"+
		"\u00fb\u00fc\7{\2\2\u00fc \3\2\2\2\u00fd\u00fe\7%\2\2\u00fe\u00ff\7h\2"+
		"\2\u00ff\u0100\7k\2\2\u0100\u0101\7n\2\2\u0101\u0102\7v\2\2\u0102\u0103"+
		"\7g\2\2\u0103\u0104\7t\2\2\u0104\u0105\7u\2\2\u0105\"\3\2\2\2\u0107\u0108"+
		"\7n\2\2\u0108\u0109\7g\2\2\u0109\u010a\7v\2\2\u010a&\3\2\2\2\u010b\u010c"+
		"\7k\2\2\u010c\u010d\7p\2\2\u010d(\3\2\2\2\u010e\u010f\7g\2\2\u010f\u0110"+
		"\7z\2\2\u0110\u0111\7k\2\2\u0111\u0112\7u\2\2\u0112\u0113\7v\2\2\u0113"+
		"\u0114\7u\2\2\u0114*\3\2\2\2\u0115\u0116\7h\2\2\u0116\u0117\7q\2\2\u0117"+
		"\u0118\7t\2\2\u0118\u0119\7c\2\2\u0119\u011a\7n\2\2\u011a\u011b\7n\2\2"+
		"\u011b,\3\2\2\2\u011c\u011d\7\60\2\2\u011d\u011e\7\60\2\2\u011e.\3\2\2"+
		"\2\u011f\u0120\7k\2\2\u0120\u0121\7p\2\2\u0121\u0122\7n\2\2\u0122\u0123"+
		"\7k\2\2\u0123\u0124\7p\2\2\u0124\u0125\7g\2\2\u0125\u0126\7f\2\2\u0126"+
		"\u0127\7K\2\2\u0127\u0128\7p\2\2\u0128\u0129\7v\2\2\u0129\u012a\7q\2\2"+
		"\u012a\60\3\2\2\2\u012b\u012c\7u\2\2\u012c\u012d\7k\2\2\u012d\u012e\7"+
		"|\2\2\u012e\u012f\7g\2\2\u012f\u0130\7Q\2\2\u0130\u0131\7h\2\2\u0131\62"+
		"\3\2\2\2\u0132\u0133\7(\2\2\u0133\u0134\7(\2\2\u0134\64\3\2\2\2\u0135"+
		"\u0136\7~\2\2\u0136\u0137\7~\2\2\u0137\66\3\2\2\2\u0138\u0139\7p\2\2\u0139"+
		"\u013a\7q\2\2\u013a\u013b\7v\2\2\u013b8\3\2\2\2\u013c\u013d\7e\2\2\u013d"+
		"\u013e\7q\2\2\u013e\u013f\7o\2\2\u013f\u0140\7r\2\2\u0140\u0141\7c\2\2"+
		"\u0141\u0142\7t\2\2\u0142\u0143\7g\2\2\u0143:\3\2\2\2\u0144\u0145\7v\2"+
		"\2\u0145\u0146\7q\2\2\u0146\u0147\7v\2\2\u0147\u0148\7c\2\2\u0148\u0149"+
		"\7n\2\2\u0149\u014a\7E\2\2\u014a\u014b\7q\2\2\u014b\u014c\7w\2\2\u014c"+
		"\u014d\7p\2\2\u014d\u014e\7v\2\2\u014e<\3\2\2\2\u014f\u0150\t\2\2\2\u0150"+
		">\3\2\2\2\u0151\u0152\t\3\2\2\u0152@\3\2\2\2\u0153\u0154\7.\2\2\u0154"+
		"B\3\2\2\2\u0155\u0157\t\4\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2"+
		"\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159D\3\2\2\2\u015a\u015b\7"+
		"]\2\2\u015bF\3\2\2\2\u015c\u015d\7_\2\2\u015dH\3\2\2\2\u015e\u015f\7}"+
		"\2\2\u015fJ\3\2\2\2\u0160\u0161\7\177\2\2\u0161L\3\2\2\2\u0162\u0164\t"+
		"\5\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166N\3\2\2\2\u0167\u0168\7?\2\2\u0168P\3\2\2\2\u0169"+
		"\u016a\7=\2\2\u016aR\3\2\2\2\u016b\u016c\7*\2\2\u016cT\3\2\2\2\u016d\u016e"+
		"\7+\2\2\u016eV\3\2\2\2\u016f\u0170\7?\2\2\u0170\u0171\7?\2\2\u0171X\3"+
		"\2\2\2\u0172\u0173\7>\2\2\u0173Z\3\2\2\2\u0174\u0175\7@\2\2\u0175\\\3"+
		"\2\2\2\u0176\u0177\7#\2\2\u0177\u0178\7?\2\2\u0178^\3\2\2\2\u0179\u017a"+
		"\7>\2\2\u017a\u017b\7?\2\2\u017b`\3\2\2\2\u017c\u017d\7@\2\2\u017d\u017e"+
		"\7?\2\2\u017eb\3\2\2\2\u017f\u0180\7<\2\2\u0180d\3\2\2\2\u0181\u0183\t"+
		"\6\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\b\63\2\2\u0187f\3\2\2\2"+
		"\u0188\u0189\7\61\2\2\u0189\u018a\7\61\2\2\u018a\u018e\3\2\2\2\u018b\u018d"+
		"\n\7\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\b\64"+
		"\2\2\u0192h\3\2\2\2\7\2\u0158\u0165\u0184\u018e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}