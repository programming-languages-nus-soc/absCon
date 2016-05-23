// Generated from /Users/Aish/IdeaProjects/AbsCon/AbsCon.g4 by ANTLR 4.5.1
package edu.nus.sun.image.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbsConParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_global = 1, RULE_abDecls = 2, RULE_conDecls = 3, 
		RULE_globalDecl = 4, RULE_ftrDecl = 5, RULE_ftrAssign = 6, RULE_ftrSet = 7, 
		RULE_ids = 8, RULE_abDecl = 9, RULE_concreteVector = 10, RULE_abstractVector = 11, 
		RULE_abAssign = 12, RULE_assign = 13, RULE_iAssign = 14, RULE_accessor = 15, 
		RULE_featureAccessor = 16, RULE_indexAccessor = 17, RULE_gAssign = 18, 
		RULE_dAssign = 19, RULE_expr = 20, RULE_exp = 21, RULE_id = 22, RULE_paranthesizedExp = 23, 
		RULE_sumOfFeatures = 24, RULE_sourceOf = 25, RULE_sourceOfSize = 26, RULE_absFeature = 27, 
		RULE_conDecl = 28, RULE_cloneVector = 29, RULE_queryVector = 30, RULE_concFtrDecl = 31, 
		RULE_filters = 32, RULE_filter = 33, RULE_conditions = 34, RULE_letBlk = 35, 
		RULE_rExpr = 36, RULE_rExp = 37, RULE_rop = 38, RULE_existl = 39, RULE_univsl = 40, 
		RULE_eltChk = 41, RULE_elt = 42, RULE_set = 43, RULE_numRange = 44, RULE_inlineInto = 45, 
		RULE_setOfIds = 46, RULE_size = 47, RULE_sizeOf = 48, RULE_bExpr = 49, 
		RULE_bExp = 50, RULE_bop = 51, RULE_compareInlinedVec = 52, RULE_totalCount = 53, 
		RULE_simpAssign = 54;
	public static final String[] ruleNames = {
		"program", "global", "abDecls", "conDecls", "globalDecl", "ftrDecl", "ftrAssign", 
		"ftrSet", "ids", "abDecl", "concreteVector", "abstractVector", "abAssign", 
		"assign", "iAssign", "accessor", "featureAccessor", "indexAccessor", "gAssign", 
		"dAssign", "expr", "exp", "id", "paranthesizedExp", "sumOfFeatures", "sourceOf", 
		"sourceOfSize", "absFeature", "conDecl", "cloneVector", "queryVector", 
		"concFtrDecl", "filters", "filter", "conditions", "letBlk", "rExpr", "rExp", 
		"rop", "existl", "univsl", "eltChk", "elt", "set", "numRange", "inlineInto", 
		"setOfIds", "size", "sizeOf", "bExpr", "bExp", "bop", "compareInlinedVec", 
		"totalCount", "simpAssign"
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

	@Override
	public String getGrammarFileName() { return "AbsCon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AbsConParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public AbDeclsContext abDecls() {
			return getRuleContext(AbDeclsContext.class,0);
		}
		public ConDeclsContext conDecls() {
			return getRuleContext(ConDeclsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			global();
			setState(111);
			abDecls();
			setState(112);
			conDecls();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(AbsConParser.BLOCKOPEN, 0); }
		public GlobalDeclContext globalDecl() {
			return getRuleContext(GlobalDeclContext.class,0);
		}
		public TerminalNode BLOCKCLOSE() { return getToken(AbsConParser.BLOCKCLOSE, 0); }
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__0);
			setState(115);
			match(BLOCKOPEN);
			setState(116);
			globalDecl();
			setState(117);
			match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbDeclsContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(AbsConParser.BLOCKOPEN, 0); }
		public AbDeclContext abDecl() {
			return getRuleContext(AbDeclContext.class,0);
		}
		public TerminalNode BLOCKCLOSE() { return getToken(AbsConParser.BLOCKCLOSE, 0); }
		public AbDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterAbDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitAbDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitAbDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbDeclsContext abDecls() throws RecognitionException {
		AbDeclsContext _localctx = new AbDeclsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_abDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__1);
			setState(120);
			match(BLOCKOPEN);
			setState(121);
			abDecl();
			setState(122);
			match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConDeclsContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(AbsConParser.BLOCKOPEN, 0); }
		public ConDeclContext conDecl() {
			return getRuleContext(ConDeclContext.class,0);
		}
		public TerminalNode BLOCKCLOSE() { return getToken(AbsConParser.BLOCKCLOSE, 0); }
		public ConDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterConDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitConDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitConDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConDeclsContext conDecls() throws RecognitionException {
		ConDeclsContext _localctx = new ConDeclsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__2);
			setState(125);
			match(BLOCKOPEN);
			setState(126);
			conDecl();
			setState(127);
			match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalDeclContext extends ParserRuleContext {
		public List<FtrDeclContext> ftrDecl() {
			return getRuleContexts(FtrDeclContext.class);
		}
		public FtrDeclContext ftrDecl(int i) {
			return getRuleContext(FtrDeclContext.class,i);
		}
		public GlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterGlobalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitGlobalDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitGlobalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclContext globalDecl() throws RecognitionException {
		GlobalDeclContext _localctx = new GlobalDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_globalDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				ftrDecl();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FtrDeclContext extends ParserRuleContext {
		public FtrAssignContext ftrAssign() {
			return getRuleContext(FtrAssignContext.class,0);
		}
		public FtrSetContext ftrSet() {
			return getRuleContext(FtrSetContext.class,0);
		}
		public FtrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ftrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterFtrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitFtrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitFtrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FtrDeclContext ftrDecl() throws RecognitionException {
		FtrDeclContext _localctx = new FtrDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ftrDecl);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				ftrAssign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				ftrSet();
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

	public static class FtrAssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AbsConParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbsConParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(AbsConParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public TerminalNode DIGITS() { return getToken(AbsConParser.DIGITS, 0); }
		public FtrAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ftrAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterFtrAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitFtrAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitFtrAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FtrAssignContext ftrAssign() throws RecognitionException {
		FtrAssignContext _localctx = new FtrAssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ftrAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(139);
			match(ASSIGN);
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==DIGITS || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(141);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FtrSetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AbsConParser.ASSIGN, 0); }
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public FtrSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ftrSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterFtrSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitFtrSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitFtrSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FtrSetContext ftrSet() throws RecognitionException {
		FtrSetContext _localctx = new FtrSetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ftrSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ID);
			setState(144);
			match(ASSIGN);
			setState(145);
			match(T__3);
			setState(146);
			match(OPENBRACE);
			setState(147);
			ids();
			setState(148);
			match(CLOSEBRACE);
			setState(149);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(AbsConParser.COMMA, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ids);
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(ID);
				setState(153);
				match(COMMA);
				setState(154);
				ids();
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

	public static class AbDeclContext extends ParserRuleContext {
		public ConcreteVectorContext concreteVector() {
			return getRuleContext(ConcreteVectorContext.class,0);
		}
		public AbstractVectorContext abstractVector() {
			return getRuleContext(AbstractVectorContext.class,0);
		}
		public AbAssignContext abAssign() {
			return getRuleContext(AbAssignContext.class,0);
		}
		public AbDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterAbDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitAbDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitAbDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbDeclContext abDecl() throws RecognitionException {
		AbDeclContext _localctx = new AbDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_abDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			concreteVector();
			setState(158);
			abstractVector();
			setState(159);
			abAssign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcreteVectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public ConcreteVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concreteVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterConcreteVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitConcreteVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitConcreteVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcreteVectorContext concreteVector() throws RecognitionException {
		ConcreteVectorContext _localctx = new ConcreteVectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_concreteVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__4);
			setState(162);
			match(ID);
			setState(163);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractVectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public AbstractVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterAbstractVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitAbstractVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitAbstractVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractVectorContext abstractVector() throws RecognitionException {
		AbstractVectorContext _localctx = new AbstractVectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_abstractVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__5);
			setState(166);
			match(ID);
			setState(167);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbAssignContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(AbsConParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(AbsConParser.BLOCKCLOSE, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public AbAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterAbAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitAbAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitAbAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbAssignContext abAssign() throws RecognitionException {
		AbAssignContext _localctx = new AbAssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_abAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__6);
			setState(170);
			match(BLOCKOPEN);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				assign();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << ID))) != 0) );
			setState(176);
			match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public IAssignContext iAssign() {
			return getRuleContext(IAssignContext.class,0);
		}
		public GAssignContext gAssign() {
			return getRuleContext(GAssignContext.class,0);
		}
		public DAssignContext dAssign() {
			return getRuleContext(DAssignContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				iAssign();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				gAssign();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				dAssign();
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

	public static class IAssignContext extends ParserRuleContext {
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AbsConParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public IAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterIAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitIAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitIAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IAssignContext iAssign() throws RecognitionException {
		IAssignContext _localctx = new IAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			accessor();
			setState(184);
			match(ASSIGN);
			setState(185);
			expr();
			setState(186);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessorContext extends ParserRuleContext {
		public FeatureAccessorContext featureAccessor() {
			return getRuleContext(FeatureAccessorContext.class,0);
		}
		public IndexAccessorContext indexAccessor() {
			return getRuleContext(IndexAccessorContext.class,0);
		}
		public AccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitAccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitAccessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessorContext accessor() throws RecognitionException {
		AccessorContext _localctx = new AccessorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_accessor);
		try {
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				featureAccessor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				indexAccessor();
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

	public static class FeatureAccessorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AbsConParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbsConParser.ID, i);
		}
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public FeatureAccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureAccessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterFeatureAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitFeatureAccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitFeatureAccessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureAccessorContext featureAccessor() throws RecognitionException {
		FeatureAccessorContext _localctx = new FeatureAccessorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_featureAccessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
			setState(193);
			match(OPENBRACE);
			setState(194);
			match(ID);
			setState(195);
			match(CLOSEBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAccessorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode SQUAREBRACEOPEN() { return getToken(AbsConParser.SQUAREBRACEOPEN, 0); }
		public TerminalNode DIGITS() { return getToken(AbsConParser.DIGITS, 0); }
		public TerminalNode SQUAREBRACECLOSE() { return getToken(AbsConParser.SQUAREBRACECLOSE, 0); }
		public IndexAccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAccessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterIndexAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitIndexAccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitIndexAccessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAccessorContext indexAccessor() throws RecognitionException {
		IndexAccessorContext _localctx = new IndexAccessorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_indexAccessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ID);
			setState(198);
			match(SQUAREBRACEOPEN);
			setState(199);
			match(DIGITS);
			setState(200);
			match(SQUAREBRACECLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GAssignContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(AbsConParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbsConParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(AbsConParser.COMMA, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public TerminalNode ASSIGN() { return getToken(AbsConParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public GAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterGAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitGAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitGAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GAssignContext gAssign() throws RecognitionException {
		GAssignContext _localctx = new GAssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_gAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__7);
			setState(203);
			match(OPENBRACE);
			setState(204);
			match(ID);
			setState(205);
			match(COMMA);
			setState(206);
			match(ID);
			setState(207);
			match(CLOSEBRACE);
			setState(208);
			match(ASSIGN);
			setState(209);
			expr();
			setState(210);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DAssignContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public NumRangeContext numRange() {
			return getRuleContext(NumRangeContext.class,0);
		}
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public TerminalNode ASSIGN() { return getToken(AbsConParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public DAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterDAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitDAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitDAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DAssignContext dAssign() throws RecognitionException {
		DAssignContext _localctx = new DAssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__8);
			setState(213);
			match(OPENBRACE);
			setState(214);
			numRange();
			setState(215);
			match(CLOSEBRACE);
			setState(216);
			match(ASSIGN);
			setState(217);
			expr();
			setState(218);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(220);
					exp(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(223); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ExpContext extends ParserRuleContext {
		public ParanthesizedExpContext paranthesizedExp() {
			return getRuleContext(ParanthesizedExpContext.class,0);
		}
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
		}
		public TerminalNode DIGITS() { return getToken(AbsConParser.DIGITS, 0); }
		public SumOfFeaturesContext sumOfFeatures() {
			return getRuleContext(SumOfFeaturesContext.class,0);
		}
		public SourceOfContext sourceOf() {
			return getRuleContext(SourceOfContext.class,0);
		}
		public SourceOfSizeContext sourceOfSize() {
			return getRuleContext(SourceOfSizeContext.class,0);
		}
		public TotalCountContext totalCount() {
			return getRuleContext(TotalCountContext.class,0);
		}
		public AbsFeatureContext absFeature() {
			return getRuleContext(AbsFeatureContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MULDIV() { return getToken(AbsConParser.MULDIV, 0); }
		public TerminalNode ADDSUB() { return getToken(AbsConParser.ADDSUB, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(226);
				paranthesizedExp();
				}
				break;
			case 2:
				{
				setState(227);
				accessor();
				}
				break;
			case 3:
				{
				setState(228);
				match(DIGITS);
				}
				break;
			case 4:
				{
				setState(229);
				sumOfFeatures();
				}
				break;
			case 5:
				{
				setState(230);
				sourceOf();
				}
				break;
			case 6:
				{
				setState(231);
				sourceOfSize();
				}
				break;
			case 7:
				{
				setState(232);
				totalCount();
				}
				break;
			case 8:
				{
				setState(233);
				absFeature();
				}
				break;
			case 9:
				{
				setState(234);
				id();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(237);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(238);
						match(MULDIV);
						setState(239);
						exp(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(240);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(241);
						match(ADDSUB);
						setState(242);
						exp(10);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParanthesizedExpContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public ParanthesizedExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paranthesizedExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterParanthesizedExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitParanthesizedExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitParanthesizedExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParanthesizedExpContext paranthesizedExp() throws RecognitionException {
		ParanthesizedExpContext _localctx = new ParanthesizedExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_paranthesizedExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(OPENBRACE);
			setState(251);
			exp(0);
			setState(252);
			match(CLOSEBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumOfFeaturesContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public TerminalNode COMMA() { return getToken(AbsConParser.COMMA, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(AbsConParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbsConParser.ID, i);
		}
		public List<SourceOfContext> sourceOf() {
			return getRuleContexts(SourceOfContext.class);
		}
		public SourceOfContext sourceOf(int i) {
			return getRuleContext(SourceOfContext.class,i);
		}
		public SumOfFeaturesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumOfFeatures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterSumOfFeatures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitSumOfFeatures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitSumOfFeatures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumOfFeaturesContext sumOfFeatures() throws RecognitionException {
		SumOfFeaturesContext _localctx = new SumOfFeaturesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sumOfFeatures);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__9);
			setState(255);
			match(OPENBRACE);
			setState(258);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(256);
				match(ID);
				}
				break;
			case T__10:
				{
				setState(257);
				sourceOf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(260);
			match(COMMA);
			setState(263);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(261);
				match(ID);
				}
				break;
			case T__10:
				{
				setState(262);
				sourceOf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(265);
			match(CLOSEBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceOfContext extends ParserRuleContext {
		public List<TerminalNode> OPENBRACE() { return getTokens(AbsConParser.OPENBRACE); }
		public TerminalNode OPENBRACE(int i) {
			return getToken(AbsConParser.OPENBRACE, i);
		}
		public List<TerminalNode> ID() { return getTokens(AbsConParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbsConParser.ID, i);
		}
		public List<TerminalNode> CLOSEBRACE() { return getTokens(AbsConParser.CLOSEBRACE); }
		public TerminalNode CLOSEBRACE(int i) {
			return getToken(AbsConParser.CLOSEBRACE, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(AbsConParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(AbsConParser.DIGITS, i);
		}
		public SourceOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterSourceOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitSourceOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitSourceOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceOfContext sourceOf() throws RecognitionException {
		SourceOfContext _localctx = new SourceOfContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sourceOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__10);
			setState(268);
			match(OPENBRACE);
			setState(269);
			match(ID);
			setState(270);
			match(CLOSEBRACE);
			setState(271);
			match(OPENBRACE);
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==DIGITS || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(273);
			match(CLOSEBRACE);
			setState(274);
			match(OPENBRACE);
			setState(275);
			match(DIGITS);
			setState(276);
			match(CLOSEBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceOfSizeContext extends ParserRuleContext {
		public List<TerminalNode> OPENBRACE() { return getTokens(AbsConParser.OPENBRACE); }
		public TerminalNode OPENBRACE(int i) {
			return getToken(AbsConParser.OPENBRACE, i);
		}
		public List<TerminalNode> ID() { return getTokens(AbsConParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbsConParser.ID, i);
		}
		public List<TerminalNode> CLOSEBRACE() { return getTokens(AbsConParser.CLOSEBRACE); }
		public TerminalNode CLOSEBRACE(int i) {
			return getToken(AbsConParser.CLOSEBRACE, i);
		}
		public TerminalNode DIGITS() { return getToken(AbsConParser.DIGITS, 0); }
		public SourceOfSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceOfSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterSourceOfSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitSourceOfSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitSourceOfSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceOfSizeContext sourceOfSize() throws RecognitionException {
		SourceOfSizeContext _localctx = new SourceOfSizeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sourceOfSize);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__11);
			setState(279);
			match(OPENBRACE);
			setState(280);
			match(ID);
			setState(281);
			match(CLOSEBRACE);
			setState(282);
			match(OPENBRACE);
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==DIGITS || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(284);
			match(CLOSEBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbsFeatureContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public AbsFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterAbsFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitAbsFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitAbsFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsFeatureContext absFeature() throws RecognitionException {
		AbsFeatureContext _localctx = new AbsFeatureContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_absFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__12);
			setState(287);
			match(OPENBRACE);
			setState(288);
			match(ID);
			setState(289);
			match(CLOSEBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConDeclContext extends ParserRuleContext {
		public CloneVectorContext cloneVector() {
			return getRuleContext(CloneVectorContext.class,0);
		}
		public QueryVectorContext queryVector() {
			return getRuleContext(QueryVectorContext.class,0);
		}
		public ConcFtrDeclContext concFtrDecl() {
			return getRuleContext(ConcFtrDeclContext.class,0);
		}
		public ConDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterConDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitConDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitConDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConDeclContext conDecl() throws RecognitionException {
		ConDeclContext _localctx = new ConDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			cloneVector();
			setState(292);
			queryVector();
			setState(293);
			concFtrDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloneVectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public CloneVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cloneVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterCloneVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitCloneVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitCloneVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloneVectorContext cloneVector() throws RecognitionException {
		CloneVectorContext _localctx = new CloneVectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cloneVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__13);
			setState(296);
			match(ID);
			setState(297);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryVectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public QueryVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterQueryVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitQueryVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitQueryVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryVectorContext queryVector() throws RecognitionException {
		QueryVectorContext _localctx = new QueryVectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_queryVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__14);
			setState(300);
			match(ID);
			setState(301);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcFtrDeclContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(AbsConParser.BLOCKOPEN, 0); }
		public FiltersContext filters() {
			return getRuleContext(FiltersContext.class,0);
		}
		public TerminalNode BLOCKCLOSE() { return getToken(AbsConParser.BLOCKCLOSE, 0); }
		public ConcFtrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concFtrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterConcFtrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitConcFtrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitConcFtrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcFtrDeclContext concFtrDecl() throws RecognitionException {
		ConcFtrDeclContext _localctx = new ConcFtrDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_concFtrDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__15);
			setState(304);
			match(BLOCKOPEN);
			setState(305);
			filters();
			setState(306);
			match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FiltersContext extends ParserRuleContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FiltersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterFilters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitFilters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitFilters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiltersContext filters() throws RecognitionException {
		FiltersContext _localctx = new FiltersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_filters);
		int _la;
		try {
			setState(314);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__17:
			case T__19:
			case T__20:
			case T__24:
			case T__25:
			case T__26:
			case T__28:
			case DIGITS:
			case ID:
			case OPENBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(308);
					filter();
					}
					}
					setState(311); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << DIGITS) | (1L << ID) | (1L << OPENBRACE))) != 0) );
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(T__16);
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

	public static class FilterContext extends ParserRuleContext {
		public LetBlkContext letBlk() {
			return getRuleContext(LetBlkContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_filter);
		try {
			setState(318);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				letBlk();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__19:
			case T__20:
			case T__24:
			case T__25:
			case T__26:
			case T__28:
			case DIGITS:
			case ID:
			case OPENBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				conditions();
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

	public static class ConditionsContext extends ParserRuleContext {
		public ExistlContext existl() {
			return getRuleContext(ExistlContext.class,0);
		}
		public UnivslContext univsl() {
			return getRuleContext(UnivslContext.class,0);
		}
		public RExprContext rExpr() {
			return getRuleContext(RExprContext.class,0);
		}
		public BExprContext bExpr() {
			return getRuleContext(BExprContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditions);
		try {
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				existl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				univsl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				rExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				bExpr();
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

	public static class LetBlkContext extends ParserRuleContext {
		public List<TerminalNode> BLOCKOPEN() { return getTokens(AbsConParser.BLOCKOPEN); }
		public TerminalNode BLOCKOPEN(int i) {
			return getToken(AbsConParser.BLOCKOPEN, i);
		}
		public List<TerminalNode> BLOCKCLOSE() { return getTokens(AbsConParser.BLOCKCLOSE); }
		public TerminalNode BLOCKCLOSE(int i) {
			return getToken(AbsConParser.BLOCKCLOSE, i);
		}
		public List<SimpAssignContext> simpAssign() {
			return getRuleContexts(SimpAssignContext.class);
		}
		public SimpAssignContext simpAssign(int i) {
			return getRuleContext(SimpAssignContext.class,i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public LetBlkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBlk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterLetBlk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitLetBlk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitLetBlk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetBlkContext letBlk() throws RecognitionException {
		LetBlkContext _localctx = new LetBlkContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_letBlk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__17);
			setState(327);
			match(BLOCKOPEN);
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				simpAssign();
				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(333);
			match(BLOCKCLOSE);
			setState(334);
			match(T__18);
			setState(335);
			match(BLOCKOPEN);
			setState(337); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(336);
				conditions();
				}
				}
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__19) | (1L << T__20) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << DIGITS) | (1L << ID) | (1L << OPENBRACE))) != 0) );
			setState(341);
			match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RExprContext extends ParserRuleContext {
		public RExpContext rExp() {
			return getRuleContext(RExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public RExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterRExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitRExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitRExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RExprContext rExpr() throws RecognitionException {
		RExprContext _localctx = new RExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_rExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			rExp();
			setState(344);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RExpContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<RopContext> rop() {
			return getRuleContexts(RopContext.class);
		}
		public RopContext rop(int i) {
			return getRuleContext(RopContext.class,i);
		}
		public RExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterRExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitRExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitRExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RExpContext rExp() throws RecognitionException {
		RExpContext _localctx = new RExpContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(346);
					expr();
					setState(347);
					rop();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(351); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(353);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RopContext extends ParserRuleContext {
		public TerminalNode DOUBLEEQUAL() { return getToken(AbsConParser.DOUBLEEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(AbsConParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(AbsConParser.GREATERTHAN, 0); }
		public TerminalNode NOTEQUAL() { return getToken(AbsConParser.NOTEQUAL, 0); }
		public TerminalNode LESSTHANEQUAL() { return getToken(AbsConParser.LESSTHANEQUAL, 0); }
		public TerminalNode GREATERTHANEQUAL() { return getToken(AbsConParser.GREATERTHANEQUAL, 0); }
		public RopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterRop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitRop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitRop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RopContext rop() throws RecognitionException {
		RopContext _localctx = new RopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLEEQUAL) | (1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << NOTEQUAL) | (1L << LESSTHANEQUAL) | (1L << GREATERTHANEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExistlContext extends ParserRuleContext {
		public EltChkContext eltChk() {
			return getRuleContext(EltChkContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AbsConParser.COLON, 0); }
		public TerminalNode BLOCKOPEN() { return getToken(AbsConParser.BLOCKOPEN, 0); }
		public BExprContext bExpr() {
			return getRuleContext(BExprContext.class,0);
		}
		public TerminalNode BLOCKCLOSE() { return getToken(AbsConParser.BLOCKCLOSE, 0); }
		public ExistlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterExistl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitExistl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitExistl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistlContext existl() throws RecognitionException {
		ExistlContext _localctx = new ExistlContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_existl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__19);
			setState(358);
			eltChk();
			setState(359);
			match(COLON);
			setState(360);
			match(BLOCKOPEN);
			setState(361);
			bExpr();
			setState(362);
			match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnivslContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public EltChkContext eltChk() {
			return getRuleContext(EltChkContext.class,0);
		}
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public TerminalNode COLON() { return getToken(AbsConParser.COLON, 0); }
		public TerminalNode BLOCKOPEN() { return getToken(AbsConParser.BLOCKOPEN, 0); }
		public TerminalNode BLOCKCLOSE() { return getToken(AbsConParser.BLOCKCLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public BExprContext bExpr() {
			return getRuleContext(BExprContext.class,0);
		}
		public CompareInlinedVecContext compareInlinedVec() {
			return getRuleContext(CompareInlinedVecContext.class,0);
		}
		public UnivslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_univsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterUnivsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitUnivsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitUnivsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnivslContext univsl() throws RecognitionException {
		UnivslContext _localctx = new UnivslContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_univsl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__20);
			setState(365);
			match(OPENBRACE);
			setState(366);
			eltChk();
			setState(367);
			match(CLOSEBRACE);
			setState(368);
			match(COLON);
			setState(369);
			match(BLOCKOPEN);
			setState(372);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__24:
			case T__25:
			case T__26:
			case T__28:
			case DIGITS:
			case ID:
			case OPENBRACE:
				{
				setState(370);
				bExpr();
				}
				break;
			case T__27:
				{
				setState(371);
				compareInlinedVec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(374);
			match(BLOCKCLOSE);
			setState(375);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EltChkContext extends ParserRuleContext {
		public EltContext elt() {
			return getRuleContext(EltContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public EltChkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eltChk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterEltChk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitEltChk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitEltChk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EltChkContext eltChk() throws RecognitionException {
		EltChkContext _localctx = new EltChkContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_eltChk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			elt();
			setState(378);
			match(T__18);
			setState(379);
			set();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EltContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public EltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterElt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitElt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitElt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EltContext elt() throws RecognitionException {
		EltContext _localctx = new EltContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elt);
		try {
			setState(386);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(ID);
				}
				break;
			case OPENBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(OPENBRACE);
				setState(383);
				ids();
				setState(384);
				match(CLOSEBRACE);
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public SetOfIdsContext setOfIds() {
			return getRuleContext(SetOfIdsContext.class,0);
		}
		public InlineIntoContext inlineInto() {
			return getRuleContext(InlineIntoContext.class,0);
		}
		public NumRangeContext numRange() {
			return getRuleContext(NumRangeContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_set);
		try {
			setState(392);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(ID);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				setOfIds();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				inlineInto();
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				numRange();
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

	public static class NumRangeContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(AbsConParser.DIGITS, 0); }
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public NumRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterNumRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitNumRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitNumRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumRangeContext numRange() throws RecognitionException {
		NumRangeContext _localctx = new NumRangeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_numRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(DIGITS);
			setState(395);
			match(T__21);
			setState(396);
			size();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineIntoContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public InlineIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineInto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterInlineInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitInlineInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitInlineInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineIntoContext inlineInto() throws RecognitionException {
		InlineIntoContext _localctx = new InlineIntoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inlineInto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__22);
			setState(399);
			match(OPENBRACE);
			setState(400);
			match(ID);
			setState(401);
			match(CLOSEBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetOfIdsContext extends ParserRuleContext {
		public TerminalNode BLOCKOPEN() { return getToken(AbsConParser.BLOCKOPEN, 0); }
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode BLOCKCLOSE() { return getToken(AbsConParser.BLOCKCLOSE, 0); }
		public SetOfIdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfIds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterSetOfIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitSetOfIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitSetOfIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetOfIdsContext setOfIds() throws RecognitionException {
		SetOfIdsContext _localctx = new SetOfIdsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_setOfIds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T__3);
			setState(404);
			match(BLOCKOPEN);
			setState(405);
			ids();
			setState(406);
			match(BLOCKCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(AbsConParser.DIGITS, 0); }
		public SizeOfContext sizeOf() {
			return getRuleContext(SizeOfContext.class,0);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_size);
		try {
			setState(410);
			switch (_input.LA(1)) {
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(DIGITS);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				sizeOf();
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

	public static class SizeOfContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public SizeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterSizeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitSizeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitSizeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeOfContext sizeOf() throws RecognitionException {
		SizeOfContext _localctx = new SizeOfContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sizeOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__23);
			setState(413);
			match(OPENBRACE);
			setState(414);
			match(ID);
			setState(415);
			match(CLOSEBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BExprContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public List<BExpContext> bExp() {
			return getRuleContexts(BExpContext.class);
		}
		public BExpContext bExp(int i) {
			return getRuleContext(BExpContext.class,i);
		}
		public BExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterBExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitBExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitBExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BExprContext bExpr() throws RecognitionException {
		BExprContext _localctx = new BExprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_bExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(417);
				bExp();
				}
				}
				setState(420); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << DIGITS) | (1L << ID) | (1L << OPENBRACE))) != 0) );
			setState(422);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BExpContext extends ParserRuleContext {
		public List<RExpContext> rExp() {
			return getRuleContexts(RExpContext.class);
		}
		public RExpContext rExp(int i) {
			return getRuleContext(RExpContext.class,i);
		}
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public BExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterBExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitBExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitBExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BExpContext bExp() throws RecognitionException {
		BExpContext _localctx = new BExpContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_bExp);
		try {
			setState(436);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				rExp();
				setState(425);
				bop();
				setState(426);
				rExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				rExp();
				setState(429);
				bop();
				setState(430);
				rExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				bop();
				setState(433);
				rExp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				rExp();
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

	public static class BopContext extends ParserRuleContext {
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterBop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitBop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitBop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CompareInlinedVecContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(AbsConParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbsConParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(AbsConParser.COMMA, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public CompareInlinedVecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareInlinedVec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterCompareInlinedVec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitCompareInlinedVec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitCompareInlinedVec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareInlinedVecContext compareInlinedVec() throws RecognitionException {
		CompareInlinedVecContext _localctx = new CompareInlinedVecContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_compareInlinedVec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__27);
			setState(441);
			match(OPENBRACE);
			setState(442);
			match(ID);
			setState(443);
			match(COMMA);
			setState(444);
			match(ID);
			setState(445);
			match(CLOSEBRACE);
			setState(446);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TotalCountContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AbsConParser.OPENBRACE, 0); }
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AbsConParser.CLOSEBRACE, 0); }
		public TotalCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterTotalCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitTotalCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitTotalCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TotalCountContext totalCount() throws RecognitionException {
		TotalCountContext _localctx = new TotalCountContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_totalCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__28);
			setState(449);
			match(OPENBRACE);
			setState(450);
			match(ID);
			setState(451);
			match(CLOSEBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpAssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbsConParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AbsConParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AbsConParser.SEMICOLON, 0); }
		public SimpAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).enterSimpAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbsConListener ) ((AbsConListener)listener).exitSimpAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbsConVisitor ) return ((AbsConVisitor<? extends T>)visitor).visitSimpAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpAssignContext simpAssign() throws RecognitionException {
		SimpAssignContext _localctx = new SimpAssignContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_simpAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(ID);
			setState(454);
			match(ASSIGN);
			setState(455);
			expr();
			setState(456);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		case 21:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u01cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\6\6\u0085\n\6\r\6\16"+
		"\6\u0086\3\7\3\7\5\7\u008b\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\6\16\u00af\n\16\r\16\16\16\u00b0"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u00b8\n\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\5\21\u00c1\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\6\26\u00e0\n\26\r\26\16\26\u00e1\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ee\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u00f6\n\27\f\27\16\27\u00f9\13\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0105\n\32\3\32\3\32\3\32\5\32"+
		"\u010a\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\6\"\u0138\n\"\r\"\16\"\u0139\3\"\5\"\u013d\n\"\3#\3#\5#\u0141\n#\3"+
		"$\3$\3$\3$\5$\u0147\n$\3%\3%\3%\6%\u014c\n%\r%\16%\u014d\3%\3%\3%\3%\6"+
		"%\u0154\n%\r%\16%\u0155\3%\3%\3&\3&\3&\3\'\3\'\3\'\6\'\u0160\n\'\r\'\16"+
		"\'\u0161\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\5"+
		"*\u0177\n*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\5,\u0185\n,\3-\3-\3-\3"+
		"-\5-\u018b\n-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\5\61\u019d\n\61\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u01a5\n\63\r"+
		"\63\16\63\u01a6\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u01b7\n\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\2\3,9\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjln\2\5\4\2##((\3\2-\62\3\2\33\35\u01bc\2p\3\2\2\2\4t\3\2\2\2\6"+
		"y\3\2\2\2\b~\3\2\2\2\n\u0084\3\2\2\2\f\u008a\3\2\2\2\16\u008c\3\2\2\2"+
		"\20\u0091\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3\2\2\2\26\u00a3\3\2\2\2\30"+
		"\u00a7\3\2\2\2\32\u00ab\3\2\2\2\34\u00b7\3\2\2\2\36\u00b9\3\2\2\2 \u00c0"+
		"\3\2\2\2\"\u00c2\3\2\2\2$\u00c7\3\2\2\2&\u00cc\3\2\2\2(\u00d6\3\2\2\2"+
		"*\u00df\3\2\2\2,\u00ed\3\2\2\2.\u00fa\3\2\2\2\60\u00fc\3\2\2\2\62\u0100"+
		"\3\2\2\2\64\u010d\3\2\2\2\66\u0118\3\2\2\28\u0120\3\2\2\2:\u0125\3\2\2"+
		"\2<\u0129\3\2\2\2>\u012d\3\2\2\2@\u0131\3\2\2\2B\u013c\3\2\2\2D\u0140"+
		"\3\2\2\2F\u0146\3\2\2\2H\u0148\3\2\2\2J\u0159\3\2\2\2L\u015f\3\2\2\2N"+
		"\u0165\3\2\2\2P\u0167\3\2\2\2R\u016e\3\2\2\2T\u017b\3\2\2\2V\u0184\3\2"+
		"\2\2X\u018a\3\2\2\2Z\u018c\3\2\2\2\\\u0190\3\2\2\2^\u0195\3\2\2\2`\u019c"+
		"\3\2\2\2b\u019e\3\2\2\2d\u01a4\3\2\2\2f\u01b6\3\2\2\2h\u01b8\3\2\2\2j"+
		"\u01ba\3\2\2\2l\u01c2\3\2\2\2n\u01c7\3\2\2\2pq\5\4\3\2qr\5\6\4\2rs\5\b"+
		"\5\2s\3\3\2\2\2tu\7\3\2\2uv\7&\2\2vw\5\n\6\2wx\7\'\2\2x\5\3\2\2\2yz\7"+
		"\4\2\2z{\7&\2\2{|\5\24\13\2|}\7\'\2\2}\7\3\2\2\2~\177\7\5\2\2\177\u0080"+
		"\7&\2\2\u0080\u0081\5:\36\2\u0081\u0082\7\'\2\2\u0082\t\3\2\2\2\u0083"+
		"\u0085\5\f\7\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\13\3\2\2\2\u0088\u008b\5\16\b\2\u0089\u008b"+
		"\5\20\t\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\r\3\2\2\2\u008c"+
		"\u008d\7(\2\2\u008d\u008e\7)\2\2\u008e\u008f\t\2\2\2\u008f\u0090\7*\2"+
		"\2\u0090\17\3\2\2\2\u0091\u0092\7(\2\2\u0092\u0093\7)\2\2\u0093\u0094"+
		"\7\6\2\2\u0094\u0095\7+\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7,\2\2\u0097"+
		"\u0098\7*\2\2\u0098\21\3\2\2\2\u0099\u009e\7(\2\2\u009a\u009b\7(\2\2\u009b"+
		"\u009c\7\"\2\2\u009c\u009e\5\22\n\2\u009d\u0099\3\2\2\2\u009d\u009a\3"+
		"\2\2\2\u009e\23\3\2\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\5\30\r\2\u00a1"+
		"\u00a2\5\32\16\2\u00a2\25\3\2\2\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5\7(\2"+
		"\2\u00a5\u00a6\7*\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9"+
		"\7(\2\2\u00a9\u00aa\7*\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\7\t\2\2\u00ac"+
		"\u00ae\7&\2\2\u00ad\u00af\5\34\17\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\7\'\2\2\u00b3\33\3\2\2\2\u00b4\u00b8\5\36\20\2\u00b5\u00b8\5&\24"+
		"\2\u00b6\u00b8\5(\25\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\5 \21\2\u00ba\u00bb\7)\2\2\u00bb"+
		"\u00bc\5*\26\2\u00bc\u00bd\7*\2\2\u00bd\37\3\2\2\2\u00be\u00c1\5\"\22"+
		"\2\u00bf\u00c1\5$\23\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1!"+
		"\3\2\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c4\7+\2\2\u00c4\u00c5\7(\2\2\u00c5"+
		"\u00c6\7,\2\2\u00c6#\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8\u00c9\7$\2\2\u00c9"+
		"\u00ca\7#\2\2\u00ca\u00cb\7%\2\2\u00cb%\3\2\2\2\u00cc\u00cd\7\n\2\2\u00cd"+
		"\u00ce\7+\2\2\u00ce\u00cf\7(\2\2\u00cf\u00d0\7\"\2\2\u00d0\u00d1\7(\2"+
		"\2\u00d1\u00d2\7,\2\2\u00d2\u00d3\7)\2\2\u00d3\u00d4\5*\26\2\u00d4\u00d5"+
		"\7*\2\2\u00d5\'\3\2\2\2\u00d6\u00d7\7\13\2\2\u00d7\u00d8\7+\2\2\u00d8"+
		"\u00d9\5Z.\2\u00d9\u00da\7,\2\2\u00da\u00db\7)\2\2\u00db\u00dc\5*\26\2"+
		"\u00dc\u00dd\7*\2\2\u00dd)\3\2\2\2\u00de\u00e0\5,\27\2\u00df\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"+\3\2\2\2\u00e3\u00e4\b\27\1\2\u00e4\u00ee\5\60\31\2\u00e5\u00ee\5 \21"+
		"\2\u00e6\u00ee\7#\2\2\u00e7\u00ee\5\62\32\2\u00e8\u00ee\5\64\33\2\u00e9"+
		"\u00ee\5\66\34\2\u00ea\u00ee\5l\67\2\u00eb\u00ee\58\35\2\u00ec\u00ee\5"+
		".\30\2\u00ed\u00e3\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e6\3\2\2\2\u00ed"+
		"\u00e7\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f7\3\2\2\2\u00ef"+
		"\u00f0\f\f\2\2\u00f0\u00f1\7 \2\2\u00f1\u00f6\5,\27\r\u00f2\u00f3\f\13"+
		"\2\2\u00f3\u00f4\7!\2\2\u00f4\u00f6\5,\27\f\u00f5\u00ef\3\2\2\2\u00f5"+
		"\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8-\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7(\2\2\u00fb/\3\2"+
		"\2\2\u00fc\u00fd\7+\2\2\u00fd\u00fe\5,\27\2\u00fe\u00ff\7,\2\2\u00ff\61"+
		"\3\2\2\2\u0100\u0101\7\f\2\2\u0101\u0104\7+\2\2\u0102\u0105\7(\2\2\u0103"+
		"\u0105\5\64\33\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3"+
		"\2\2\2\u0106\u0109\7\"\2\2\u0107\u010a\7(\2\2\u0108\u010a\5\64\33\2\u0109"+
		"\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7,"+
		"\2\2\u010c\63\3\2\2\2\u010d\u010e\7\r\2\2\u010e\u010f\7+\2\2\u010f\u0110"+
		"\7(\2\2\u0110\u0111\7,\2\2\u0111\u0112\7+\2\2\u0112\u0113\t\2\2\2\u0113"+
		"\u0114\7,\2\2\u0114\u0115\7+\2\2\u0115\u0116\7#\2\2\u0116\u0117\7,\2\2"+
		"\u0117\65\3\2\2\2\u0118\u0119\7\16\2\2\u0119\u011a\7+\2\2\u011a\u011b"+
		"\7(\2\2\u011b\u011c\7,\2\2\u011c\u011d\7+\2\2\u011d\u011e\t\2\2\2\u011e"+
		"\u011f\7,\2\2\u011f\67\3\2\2\2\u0120\u0121\7\17\2\2\u0121\u0122\7+\2\2"+
		"\u0122\u0123\7(\2\2\u0123\u0124\7,\2\2\u01249\3\2\2\2\u0125\u0126\5<\37"+
		"\2\u0126\u0127\5> \2\u0127\u0128\5@!\2\u0128;\3\2\2\2\u0129\u012a\7\20"+
		"\2\2\u012a\u012b\7(\2\2\u012b\u012c\7*\2\2\u012c=\3\2\2\2\u012d\u012e"+
		"\7\21\2\2\u012e\u012f\7(\2\2\u012f\u0130\7*\2\2\u0130?\3\2\2\2\u0131\u0132"+
		"\7\22\2\2\u0132\u0133\7&\2\2\u0133\u0134\5B\"\2\u0134\u0135\7\'\2\2\u0135"+
		"A\3\2\2\2\u0136\u0138\5D#\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u013d\7\23"+
		"\2\2\u013c\u0137\3\2\2\2\u013c\u013b\3\2\2\2\u013dC\3\2\2\2\u013e\u0141"+
		"\5H%\2\u013f\u0141\5F$\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141"+
		"E\3\2\2\2\u0142\u0147\5P)\2\u0143\u0147\5R*\2\u0144\u0147\5J&\2\u0145"+
		"\u0147\5d\63\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0145\3\2\2\2\u0147G\3\2\2\2\u0148\u0149\7\24\2\2\u0149\u014b"+
		"\7&\2\2\u014a\u014c\5n8\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\'"+
		"\2\2\u0150\u0151\7\25\2\2\u0151\u0153\7&\2\2\u0152\u0154\5F$\2\u0153\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\7\'\2\2\u0158I\3\2\2\2\u0159\u015a\5L\'\2\u015a"+
		"\u015b\7*\2\2\u015bK\3\2\2\2\u015c\u015d\5*\26\2\u015d\u015e\5N(\2\u015e"+
		"\u0160\3\2\2\2\u015f\u015c\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\5*\26\2\u0164"+
		"M\3\2\2\2\u0165\u0166\t\3\2\2\u0166O\3\2\2\2\u0167\u0168\7\26\2\2\u0168"+
		"\u0169\5T+\2\u0169\u016a\7\63\2\2\u016a\u016b\7&\2\2\u016b\u016c\5d\63"+
		"\2\u016c\u016d\7\'\2\2\u016dQ\3\2\2\2\u016e\u016f\7\27\2\2\u016f\u0170"+
		"\7+\2\2\u0170\u0171\5T+\2\u0171\u0172\7,\2\2\u0172\u0173\7\63\2\2\u0173"+
		"\u0176\7&\2\2\u0174\u0177\5d\63\2\u0175\u0177\5j\66\2\u0176\u0174\3\2"+
		"\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7\'\2\2\u0179"+
		"\u017a\7*\2\2\u017aS\3\2\2\2\u017b\u017c\5V,\2\u017c\u017d\7\25\2\2\u017d"+
		"\u017e\5X-\2\u017eU\3\2\2\2\u017f\u0185\7(\2\2\u0180\u0181\7+\2\2\u0181"+
		"\u0182\5\22\n\2\u0182\u0183\7,\2\2\u0183\u0185\3\2\2\2\u0184\u017f\3\2"+
		"\2\2\u0184\u0180\3\2\2\2\u0185W\3\2\2\2\u0186\u018b\7(\2\2\u0187\u018b"+
		"\5^\60\2\u0188\u018b\5\\/\2\u0189\u018b\5Z.\2\u018a\u0186\3\2\2\2\u018a"+
		"\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018bY\3\2\2\2"+
		"\u018c\u018d\7#\2\2\u018d\u018e\7\30\2\2\u018e\u018f\5`\61\2\u018f[\3"+
		"\2\2\2\u0190\u0191\7\31\2\2\u0191\u0192\7+\2\2\u0192\u0193\7(\2\2\u0193"+
		"\u0194\7,\2\2\u0194]\3\2\2\2\u0195\u0196\7\6\2\2\u0196\u0197\7&\2\2\u0197"+
		"\u0198\5\22\n\2\u0198\u0199\7\'\2\2\u0199_\3\2\2\2\u019a\u019d\7#\2\2"+
		"\u019b\u019d\5b\62\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019da\3"+
		"\2\2\2\u019e\u019f\7\32\2\2\u019f\u01a0\7+\2\2\u01a0\u01a1\7(\2\2\u01a1"+
		"\u01a2\7,\2\2\u01a2c\3\2\2\2\u01a3\u01a5\5f\64\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\u01a9\7*\2\2\u01a9e\3\2\2\2\u01aa\u01ab\5L\'\2\u01ab\u01ac"+
		"\5h\65\2\u01ac\u01ad\5L\'\2\u01ad\u01b7\3\2\2\2\u01ae\u01af\5L\'\2\u01af"+
		"\u01b0\5h\65\2\u01b0\u01b1\5L\'\2\u01b1\u01b7\3\2\2\2\u01b2\u01b3\5h\65"+
		"\2\u01b3\u01b4\5L\'\2\u01b4\u01b7\3\2\2\2\u01b5\u01b7\5L\'\2\u01b6\u01aa"+
		"\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"g\3\2\2\2\u01b8\u01b9\t\4\2\2\u01b9i\3\2\2\2\u01ba\u01bb\7\36\2\2\u01bb"+
		"\u01bc\7+\2\2\u01bc\u01bd\7(\2\2\u01bd\u01be\7\"\2\2\u01be\u01bf\7(\2"+
		"\2\u01bf\u01c0\7,\2\2\u01c0\u01c1\7*\2\2\u01c1k\3\2\2\2\u01c2\u01c3\7"+
		"\37\2\2\u01c3\u01c4\7+\2\2\u01c4\u01c5\7(\2\2\u01c5\u01c6\7,\2\2\u01c6"+
		"m\3\2\2\2\u01c7\u01c8\7(\2\2\u01c8\u01c9\7)\2\2\u01c9\u01ca\5*\26\2\u01ca"+
		"\u01cb\7*\2\2\u01cbo\3\2\2\2\33\u0086\u008a\u009d\u00b0\u00b7\u00c0\u00e1"+
		"\u00ed\u00f5\u00f7\u0104\u0109\u0139\u013c\u0140\u0146\u014d\u0155\u0161"+
		"\u0176\u0184\u018a\u019c\u01a6\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}