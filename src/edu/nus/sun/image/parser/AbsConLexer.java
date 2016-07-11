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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, MULDIV=34, ADDSUB=35, COMMA=36, DIGITS=37, SQUAREBRACEOPEN=38, 
		SQUAREBRACECLOSE=39, BLOCKOPEN=40, BLOCKCLOSE=41, ID=42, ASSIGN=43, SEMICOLON=44, 
		OPENBRACE=45, CLOSEBRACE=46, DOUBLEEQUAL=47, LESSTHAN=48, GREATERTHAN=49, 
		NOTEQUAL=50, LESSTHANEQUAL=51, GREATERTHANEQUAL=52, COLON=53, WS=54, COMMENTS=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"MULDIV", "ADDSUB", "COMMA", "DIGITS", "SQUAREBRACEOPEN", "SQUAREBRACECLOSE", 
		"BLOCKOPEN", "BLOCKCLOSE", "ID", "ASSIGN", "SEMICOLON", "OPENBRACE", "CLOSEBRACE", 
		"DOUBLEEQUAL", "LESSTHAN", "GREATERTHAN", "NOTEQUAL", "LESSTHANEQUAL", 
		"GREATERTHANEQUAL", "COLON", "WS", "COMMENTS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#declares'", "'#abstract'", "'#concrete'", "'setOf'", "'#concVec'", 
		"'#abstVec'", "'#assigns'", "'setFeatures'", "'setFeaturesByRange'", "'sumOfFeatures'", 
		"'sourceOf'", "'sourceOfSize'", "'abs'", "'#query'", "'#clone'", "'VT_SOURCECODE'", 
		"'VT_BYTECODE'", "'VT_BYTECODE_INLINED'", "'#filters'", "''", "'let'", 
		"'in'", "'enumerateWhenTrue'", "'exists'", "'forall'", "'..'", "'inlinedInto'", 
		"'sizeOf'", "'||'", "'&&'", "'not'", "'compare'", "'totalCount'", null, 
		null, "','", null, "'['", "']'", "'{'", "'}'", null, "'='", "';'", "'('", 
		"')'", "'=='", "'<'", "'>'", "'!='", "'<='", "'>='", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "MULDIV", 
		"ADDSUB", "COMMA", "DIGITS", "SQUAREBRACEOPEN", "SQUAREBRACECLOSE", "BLOCKOPEN", 
		"BLOCKCLOSE", "ID", "ASSIGN", "SEMICOLON", "OPENBRACE", "CLOSEBRACE", 
		"DOUBLEEQUAL", "LESSTHAN", "GREATERTHAN", "NOTEQUAL", "LESSTHANEQUAL", 
		"GREATERTHANEQUAL", "COLON", "WS", "COMMENTS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u01db\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\6&\u019f\n&\r&\16"+
		"&\u01a0\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\6+\u01ac\n+\r+\16+\u01ad\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\6\67\u01cb\n\67\r\67\16\67\u01cc"+
		"\3\67\3\67\38\38\38\38\78\u01d5\n8\f8\168\u01d8\138\38\38\2\29\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9\3\2\b\4"+
		"\2,,\61\61\4\2--//\3\2\62;\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\u01dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5{\3\2\2\2\7\u0085\3\2\2\2\t\u008f\3"+
		"\2\2\2\13\u0095\3\2\2\2\r\u009e\3\2\2\2\17\u00a7\3\2\2\2\21\u00b0\3\2"+
		"\2\2\23\u00bc\3\2\2\2\25\u00cf\3\2\2\2\27\u00dd\3\2\2\2\31\u00e6\3\2\2"+
		"\2\33\u00f3\3\2\2\2\35\u00f7\3\2\2\2\37\u00fe\3\2\2\2!\u0105\3\2\2\2#"+
		"\u0113\3\2\2\2%\u011f\3\2\2\2\'\u0133\3\2\2\2)\u013c\3\2\2\2+\u013d\3"+
		"\2\2\2-\u0141\3\2\2\2/\u0144\3\2\2\2\61\u0156\3\2\2\2\63\u015d\3\2\2\2"+
		"\65\u0164\3\2\2\2\67\u0167\3\2\2\29\u0173\3\2\2\2;\u017a\3\2\2\2=\u017d"+
		"\3\2\2\2?\u0180\3\2\2\2A\u0184\3\2\2\2C\u018c\3\2\2\2E\u0197\3\2\2\2G"+
		"\u0199\3\2\2\2I\u019b\3\2\2\2K\u019e\3\2\2\2M\u01a2\3\2\2\2O\u01a4\3\2"+
		"\2\2Q\u01a6\3\2\2\2S\u01a8\3\2\2\2U\u01ab\3\2\2\2W\u01af\3\2\2\2Y\u01b1"+
		"\3\2\2\2[\u01b3\3\2\2\2]\u01b5\3\2\2\2_\u01b7\3\2\2\2a\u01ba\3\2\2\2c"+
		"\u01bc\3\2\2\2e\u01be\3\2\2\2g\u01c1\3\2\2\2i\u01c4\3\2\2\2k\u01c7\3\2"+
		"\2\2m\u01ca\3\2\2\2o\u01d0\3\2\2\2qr\7%\2\2rs\7f\2\2st\7g\2\2tu\7e\2\2"+
		"uv\7n\2\2vw\7c\2\2wx\7t\2\2xy\7g\2\2yz\7u\2\2z\4\3\2\2\2{|\7%\2\2|}\7"+
		"c\2\2}~\7d\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7c\2\2\u0082\u0083\7e\2\2\u0083\u0084\7v\2\2\u0084\6\3\2\2\2\u0085\u0086"+
		"\7%\2\2\u0086\u0087\7e\2\2\u0087\u0088\7q\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7e\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7v\2\2"+
		"\u008d\u008e\7g\2\2\u008e\b\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091\7g"+
		"\2\2\u0091\u0092\7v\2\2\u0092\u0093\7Q\2\2\u0093\u0094\7h\2\2\u0094\n"+
		"\3\2\2\2\u0095\u0096\7%\2\2\u0096\u0097\7e\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7p\2\2\u0099\u009a\7e\2\2\u009a\u009b\7X\2\2\u009b\u009c\7g\2\2"+
		"\u009c\u009d\7e\2\2\u009d\f\3\2\2\2\u009e\u009f\7%\2\2\u009f\u00a0\7c"+
		"\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4"+
		"\7X\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7e\2\2\u00a6\16\3\2\2\2\u00a7\u00a8"+
		"\7%\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7k\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7u\2\2"+
		"\u00af\20\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7"+
		"v\2\2\u00b3\u00b4\7H\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7"+
		"\7v\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\22\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\u00bf\7v\2\2\u00bf\u00c0\7H\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7c\2\2"+
		"\u00c2\u00c3\7v\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7D\2\2\u00c8\u00c9\7{\2\2\u00c9"+
		"\u00ca\7T\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7i\2\2"+
		"\u00cd\u00ce\7g\2\2\u00ce\24\3\2\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7"+
		"w\2\2\u00d1\u00d2\7o\2\2\u00d2\u00d3\7Q\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5"+
		"\7H\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7u\2\2"+
		"\u00dc\26\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7"+
		"w\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4"+
		"\7Q\2\2\u00e4\u00e5\7h\2\2\u00e5\30\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7q\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7e\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ec\u00ed\7Q\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7U\2\2"+
		"\u00ef\u00f0\7k\2\2\u00f0\u00f1\7|\2\2\u00f1\u00f2\7g\2\2\u00f2\32\3\2"+
		"\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7u\2\2\u00f6\34"+
		"\3\2\2\2\u00f7\u00f8\7%\2\2\u00f8\u00f9\7s\2\2\u00f9\u00fa\7w\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7{\2\2\u00fd\36\3\2\2\2\u00fe"+
		"\u00ff\7%\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7n\2\2\u0101\u0102\7q\2\2"+
		"\u0102\u0103\7p\2\2\u0103\u0104\7g\2\2\u0104 \3\2\2\2\u0105\u0106\7X\2"+
		"\2\u0106\u0107\7V\2\2\u0107\u0108\7a\2\2\u0108\u0109\7U\2\2\u0109\u010a"+
		"\7Q\2\2\u010a\u010b\7W\2\2\u010b\u010c\7T\2\2\u010c\u010d\7E\2\2\u010d"+
		"\u010e\7G\2\2\u010e\u010f\7E\2\2\u010f\u0110\7Q\2\2\u0110\u0111\7F\2\2"+
		"\u0111\u0112\7G\2\2\u0112\"\3\2\2\2\u0113\u0114\7X\2\2\u0114\u0115\7V"+
		"\2\2\u0115\u0116\7a\2\2\u0116\u0117\7D\2\2\u0117\u0118\7[\2\2\u0118\u0119"+
		"\7V\2\2\u0119\u011a\7G\2\2\u011a\u011b\7E\2\2\u011b\u011c\7Q\2\2\u011c"+
		"\u011d\7F\2\2\u011d\u011e\7G\2\2\u011e$\3\2\2\2\u011f\u0120\7X\2\2\u0120"+
		"\u0121\7V\2\2\u0121\u0122\7a\2\2\u0122\u0123\7D\2\2\u0123\u0124\7[\2\2"+
		"\u0124\u0125\7V\2\2\u0125\u0126\7G\2\2\u0126\u0127\7E\2\2\u0127\u0128"+
		"\7Q\2\2\u0128\u0129\7F\2\2\u0129\u012a\7G\2\2\u012a\u012b\7a\2\2\u012b"+
		"\u012c\7K\2\2\u012c\u012d\7P\2\2\u012d\u012e\7N\2\2\u012e\u012f\7K\2\2"+
		"\u012f\u0130\7P\2\2\u0130\u0131\7G\2\2\u0131\u0132\7F\2\2\u0132&\3\2\2"+
		"\2\u0133\u0134\7%\2\2\u0134\u0135\7h\2\2\u0135\u0136\7k\2\2\u0136\u0137"+
		"\7n\2\2\u0137\u0138\7v\2\2\u0138\u0139\7g\2\2\u0139\u013a\7t\2\2\u013a"+
		"\u013b\7u\2\2\u013b(\3\2\2\2\u013d\u013e\7n\2\2\u013e\u013f\7g\2\2\u013f"+
		"\u0140\7v\2\2\u0140,\3\2\2\2\u0141\u0142\7k\2\2\u0142\u0143\7p\2\2\u0143"+
		".\3\2\2\2\u0144\u0145\7g\2\2\u0145\u0146\7p\2\2\u0146\u0147\7w\2\2\u0147"+
		"\u0148\7o\2\2\u0148\u0149\7g\2\2\u0149\u014a\7t\2\2\u014a\u014b\7c\2\2"+
		"\u014b\u014c\7v\2\2\u014c\u014d\7g\2\2\u014d\u014e\7Y\2\2\u014e\u014f"+
		"\7j\2\2\u014f\u0150\7g\2\2\u0150\u0151\7p\2\2\u0151\u0152\7V\2\2\u0152"+
		"\u0153\7t\2\2\u0153\u0154\7w\2\2\u0154\u0155\7g\2\2\u0155\60\3\2\2\2\u0156"+
		"\u0157\7g\2\2\u0157\u0158\7z\2\2\u0158\u0159\7k\2\2\u0159\u015a\7u\2\2"+
		"\u015a\u015b\7v\2\2\u015b\u015c\7u\2\2\u015c\62\3\2\2\2\u015d\u015e\7"+
		"h\2\2\u015e\u015f\7q\2\2\u015f\u0160\7t\2\2\u0160\u0161\7c\2\2\u0161\u0162"+
		"\7n\2\2\u0162\u0163\7n\2\2\u0163\64\3\2\2\2\u0164\u0165\7\60\2\2\u0165"+
		"\u0166\7\60\2\2\u0166\66\3\2\2\2\u0167\u0168\7k\2\2\u0168\u0169\7p\2\2"+
		"\u0169\u016a\7n\2\2\u016a\u016b\7k\2\2\u016b\u016c\7p\2\2\u016c\u016d"+
		"\7g\2\2\u016d\u016e\7f\2\2\u016e\u016f\7K\2\2\u016f\u0170\7p\2\2\u0170"+
		"\u0171\7v\2\2\u0171\u0172\7q\2\2\u01728\3\2\2\2\u0173\u0174\7u\2\2\u0174"+
		"\u0175\7k\2\2\u0175\u0176\7|\2\2\u0176\u0177\7g\2\2\u0177\u0178\7Q\2\2"+
		"\u0178\u0179\7h\2\2\u0179:\3\2\2\2\u017a\u017b\7~\2\2\u017b\u017c\7~\2"+
		"\2\u017c<\3\2\2\2\u017d\u017e\7(\2\2\u017e\u017f\7(\2\2\u017f>\3\2\2\2"+
		"\u0180\u0181\7p\2\2\u0181\u0182\7q\2\2\u0182\u0183\7v\2\2\u0183@\3\2\2"+
		"\2\u0184\u0185\7e\2\2\u0185\u0186\7q\2\2\u0186\u0187\7o\2\2\u0187\u0188"+
		"\7r\2\2\u0188\u0189\7c\2\2\u0189\u018a\7t\2\2\u018a\u018b\7g\2\2\u018b"+
		"B\3\2\2\2\u018c\u018d\7v\2\2\u018d\u018e\7q\2\2\u018e\u018f\7v\2\2\u018f"+
		"\u0190\7c\2\2\u0190\u0191\7n\2\2\u0191\u0192\7E\2\2\u0192\u0193\7q\2\2"+
		"\u0193\u0194\7w\2\2\u0194\u0195\7p\2\2\u0195\u0196\7v\2\2\u0196D\3\2\2"+
		"\2\u0197\u0198\t\2\2\2\u0198F\3\2\2\2\u0199\u019a\t\3\2\2\u019aH\3\2\2"+
		"\2\u019b\u019c\7.\2\2\u019cJ\3\2\2\2\u019d\u019f\t\4\2\2\u019e\u019d\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"L\3\2\2\2\u01a2\u01a3\7]\2\2\u01a3N\3\2\2\2\u01a4\u01a5\7_\2\2\u01a5P"+
		"\3\2\2\2\u01a6\u01a7\7}\2\2\u01a7R\3\2\2\2\u01a8\u01a9\7\177\2\2\u01a9"+
		"T\3\2\2\2\u01aa\u01ac\t\5\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2"+
		"\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01aeV\3\2\2\2\u01af\u01b0\7"+
		"?\2\2\u01b0X\3\2\2\2\u01b1\u01b2\7=\2\2\u01b2Z\3\2\2\2\u01b3\u01b4\7*"+
		"\2\2\u01b4\\\3\2\2\2\u01b5\u01b6\7+\2\2\u01b6^\3\2\2\2\u01b7\u01b8\7?"+
		"\2\2\u01b8\u01b9\7?\2\2\u01b9`\3\2\2\2\u01ba\u01bb\7>\2\2\u01bbb\3\2\2"+
		"\2\u01bc\u01bd\7@\2\2\u01bdd\3\2\2\2\u01be\u01bf\7#\2\2\u01bf\u01c0\7"+
		"?\2\2\u01c0f\3\2\2\2\u01c1\u01c2\7>\2\2\u01c2\u01c3\7?\2\2\u01c3h\3\2"+
		"\2\2\u01c4\u01c5\7@\2\2\u01c5\u01c6\7?\2\2\u01c6j\3\2\2\2\u01c7\u01c8"+
		"\7<\2\2\u01c8l\3\2\2\2\u01c9\u01cb\t\6\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\b\67\2\2\u01cfn\3\2\2\2\u01d0\u01d1\7\61\2\2\u01d1\u01d2\7\61\2"+
		"\2\u01d2\u01d6\3\2\2\2\u01d3\u01d5\n\7\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8"+
		"\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d9\u01da\b8\2\2\u01dap\3\2\2\2\7\2\u01a0\u01ad\u01cc"+
		"\u01d6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}