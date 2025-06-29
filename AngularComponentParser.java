// Generated from AngularComponentParser.g4 by ANTLR 4.13.1
package src.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AngularComponentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, Export=2, Class=3, Interface=4, Extends=5, Implements=6, Constructor=7, 
		Public=8, Private=9, Protected=10, This=11, True=12, False=13, Null=14, 
		From=15, Selector=16, TEMPLATE=17, Styles=18, AT=19, ANG_FOR=20, ANG_IF=21, 
		LeftBrace=22, RightBrace=23, LeftParen=24, RightParen=25, LeftBracket=26, 
		RightBracket=27, Dot=28, Comma=29, Colon=30, SemiColon=31, EQUALS=32, 
		Arrow=33, Bang=34, Question=35, Pipe=36, Plus=37, Minus=38, Multiply=39, 
		Divide=40, Modulo=41, Increment=42, SingleQuote=43, DoubleQuote=44, TAG_OPEN=45, 
		TAG_CLOSE=46, TAG_SLASH_CLOSE=47, HANDLEBAR_OPEN=48, HANDLEBAR_CLOSE=49, 
		TEMPLATE_STRING=50, STRING=51, NUMBER=52, ID=53, COMMENT=54, LINE_COMMENT=55, 
		WS=56, LINE_COMMENT_HTML=57, BLOCK_COMMENT_HTML=58, TAG_OPEN_START_HTML=59, 
		TAG_CLOSE_START_HTML=60, TAG_CLOSE_END_HTML=61, TAG_END_HTML=62, ATTRIBUTE_EQUALS_HTML=63, 
		STRING_HTML=64, STRUCTURAL_DIR_HTML=65, BINDING_HTML=66, EVENT_BINDING_HTML=67, 
		NEGATION_HTML=68, COLON_HTML=69, INTERPOLATION_START_HTML=70, INTERPOLATION_END_HTML=71, 
		DOT_HTML=72, NAME_HTML=73, WS_HTML=74, END_TEMPLATE=75, BACKTICK_HTML=76, 
		BACKTICK_CSS=77, COLON_CSS=78, COMMA_CSS=79, OPEN_LIST=80, CLOSE_LIST=81, 
		DOT_CSS=82, SEMICOLON_CSS=83, LBRACE_CSS=84, RBRACE_CSS=85, PERCENT=86, 
		WS_CSS=87, LINE_COMMENT_CSS=88, BLOCK_COMMENT_CSS=89, PX=90, EM=91, REM=92, 
		ID_CSS=93;
	public static final int
		RULE_program = 0, RULE_importStmt = 1, RULE_componentDecorator = 2, RULE_componentMetadata = 3, 
		RULE_metadataField = 4, RULE_interfaceDecl = 5, RULE_interfaceField = 6, 
		RULE_classDecl = 7, RULE_classMember = 8, RULE_fieldDecl = 9, RULE_constructorDecl = 10, 
		RULE_methodDecl = 11, RULE_parameterList = 12, RULE_parameter = 13, RULE_typeSpec = 14, 
		RULE_primaryType = 15, RULE_functionType = 16, RULE_literalType = 17, 
		RULE_expression = 18, RULE_primaryExpr = 19, RULE_arrayLiteralExpression = 20, 
		RULE_objectLiteralExpression = 21, RULE_objectLiteralPair = 22, RULE_argumentList = 23, 
		RULE_statement = 24, RULE_blockStatement = 25, RULE_expressionStatement = 26, 
		RULE_element = 27, RULE_tag = 28, RULE_openingTag = 29, RULE_closingTag = 30, 
		RULE_selfClosingTag = 31, RULE_attributes = 32, RULE_interpolation = 33, 
		RULE_cssBody = 34, RULE_cssObjects = 35, RULE_csselement = 36, RULE_bodyelement = 37, 
		RULE_cssValue = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStmt", "componentDecorator", "componentMetadata", "metadataField", 
			"interfaceDecl", "interfaceField", "classDecl", "classMember", "fieldDecl", 
			"constructorDecl", "methodDecl", "parameterList", "parameter", "typeSpec", 
			"primaryType", "functionType", "literalType", "expression", "primaryExpr", 
			"arrayLiteralExpression", "objectLiteralExpression", "objectLiteralPair", 
			"argumentList", "statement", "blockStatement", "expressionStatement", 
			"element", "tag", "openingTag", "closingTag", "selfClosingTag", "attributes", 
			"interpolation", "cssBody", "cssObjects", "csselement", "bodyelement", 
			"cssValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'export'", "'class'", "'interface'", "'extends'", 
			"'implements'", "'constructor'", "'public'", "'private'", "'protected'", 
			"'this'", "'true'", "'false'", "'null'", "'from'", "'selector'", "'template'", 
			"'styles'", "'@'", "'*ngFor'", "'*ngIf'", null, null, "'('", "')'", null, 
			null, null, null, null, null, null, "'=>'", null, "'?'", "'|'", "'+'", 
			"'-'", "'*'", "'/'", null, "'++'", null, "'\"'", "'<'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'</'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'`,'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'px'", "'em'", "'rem'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "Export", "Class", "Interface", "Extends", "Implements", 
			"Constructor", "Public", "Private", "Protected", "This", "True", "False", 
			"Null", "From", "Selector", "TEMPLATE", "Styles", "AT", "ANG_FOR", "ANG_IF", 
			"LeftBrace", "RightBrace", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "Dot", "Comma", "Colon", "SemiColon", "EQUALS", "Arrow", 
			"Bang", "Question", "Pipe", "Plus", "Minus", "Multiply", "Divide", "Modulo", 
			"Increment", "SingleQuote", "DoubleQuote", "TAG_OPEN", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"HANDLEBAR_OPEN", "HANDLEBAR_CLOSE", "TEMPLATE_STRING", "STRING", "NUMBER", 
			"ID", "COMMENT", "LINE_COMMENT", "WS", "LINE_COMMENT_HTML", "BLOCK_COMMENT_HTML", 
			"TAG_OPEN_START_HTML", "TAG_CLOSE_START_HTML", "TAG_CLOSE_END_HTML", 
			"TAG_END_HTML", "ATTRIBUTE_EQUALS_HTML", "STRING_HTML", "STRUCTURAL_DIR_HTML", 
			"BINDING_HTML", "EVENT_BINDING_HTML", "NEGATION_HTML", "COLON_HTML", 
			"INTERPOLATION_START_HTML", "INTERPOLATION_END_HTML", "DOT_HTML", "NAME_HTML", 
			"WS_HTML", "END_TEMPLATE", "BACKTICK_HTML", "BACKTICK_CSS", "COLON_CSS", 
			"COMMA_CSS", "OPEN_LIST", "CLOSE_LIST", "DOT_CSS", "SEMICOLON_CSS", "LBRACE_CSS", 
			"RBRACE_CSS", "PERCENT", "WS_CSS", "LINE_COMMENT_CSS", "BLOCK_COMMENT_CSS", 
			"PX", "EM", "REM", "ID_CSS"
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
	public String getGrammarFileName() { return "AngularComponentParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularComponentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularComponentParser.EOF, 0); }
		public List<ImportStmtContext> importStmt() {
			return getRuleContexts(ImportStmtContext.class);
		}
		public ImportStmtContext importStmt(int i) {
			return getRuleContext(ImportStmtContext.class,i);
		}
		public InterfaceDeclContext interfaceDecl() {
			return getRuleContext(InterfaceDeclContext.class,0);
		}
		public ComponentDecoratorContext componentDecorator() {
			return getRuleContext(ComponentDecoratorContext.class,0);
		}
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(78);
				importStmt();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Interface) {
				{
				setState(84);
				interfaceDecl();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(87);
				componentDecorator();
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export || _la==Class) {
				{
				setState(90);
				classDecl();
				}
			}

			setState(93);
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
	public static class ImportStmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularComponentParser.IMPORT, 0); }
		public TerminalNode LeftBrace() { return getToken(AngularComponentParser.LeftBrace, 0); }
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode RightBrace() { return getToken(AngularComponentParser.RightBrace, 0); }
		public TerminalNode From() { return getToken(AngularComponentParser.From, 0); }
		public TerminalNode STRING() { return getToken(AngularComponentParser.STRING, 0); }
		public TerminalNode SemiColon() { return getToken(AngularComponentParser.SemiColon, 0); }
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IMPORT);
			setState(96);
			match(LeftBrace);
			setState(97);
			match(ID);
			setState(98);
			match(RightBrace);
			setState(99);
			match(From);
			setState(100);
			match(STRING);
			setState(101);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
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
	public static class ComponentDecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularComponentParser.AT, 0); }
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode LeftParen() { return getToken(AngularComponentParser.LeftParen, 0); }
		public ComponentMetadataContext componentMetadata() {
			return getRuleContext(ComponentMetadataContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(AngularComponentParser.RightParen, 0); }
		public ComponentDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterComponentDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitComponentDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitComponentDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDecoratorContext componentDecorator() throws RecognitionException {
		ComponentDecoratorContext _localctx = new ComponentDecoratorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_componentDecorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(AT);
			setState(104);
			match(ID);
			setState(105);
			match(LeftParen);
			setState(106);
			componentMetadata();
			setState(107);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
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
	public static class ComponentMetadataContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularComponentParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularComponentParser.RightBrace, 0); }
		public List<MetadataFieldContext> metadataField() {
			return getRuleContexts(MetadataFieldContext.class);
		}
		public MetadataFieldContext metadataField(int i) {
			return getRuleContext(MetadataFieldContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularComponentParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularComponentParser.Comma, i);
		}
		public ComponentMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterComponentMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitComponentMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitComponentMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetadataContext componentMetadata() throws RecognitionException {
		ComponentMetadataContext _localctx = new ComponentMetadataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentMetadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LeftBrace);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) {
				{
				{
				setState(110);
				metadataField();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(111);
					match(Comma);
					}
				}

				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class MetadataFieldContext extends ParserRuleContext {
		public MetadataFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataField; }
	 
		public MetadataFieldContext() { }
		public void copyFrom(MetadataFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorFieldContext extends MetadataFieldContext {
		public TerminalNode Selector() { return getToken(AngularComponentParser.Selector, 0); }
		public TerminalNode Colon() { return getToken(AngularComponentParser.Colon, 0); }
		public TerminalNode STRING() { return getToken(AngularComponentParser.STRING, 0); }
		public TerminalNode SemiColon() { return getToken(AngularComponentParser.SemiColon, 0); }
		public SelectorFieldContext(MetadataFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterSelectorField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitSelectorField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitSelectorField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesFieldContext extends MetadataFieldContext {
		public TerminalNode Styles() { return getToken(AngularComponentParser.Styles, 0); }
		public TerminalNode COLON_CSS() { return getToken(AngularComponentParser.COLON_CSS, 0); }
		public TerminalNode OPEN_LIST() { return getToken(AngularComponentParser.OPEN_LIST, 0); }
		public CssBodyContext cssBody() {
			return getRuleContext(CssBodyContext.class,0);
		}
		public TerminalNode CLOSE_LIST() { return getToken(AngularComponentParser.CLOSE_LIST, 0); }
		public TerminalNode Comma() { return getToken(AngularComponentParser.Comma, 0); }
		public StylesFieldContext(MetadataFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterStylesField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitStylesField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitStylesField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateFieldContext extends MetadataFieldContext {
		public TerminalNode TEMPLATE() { return getToken(AngularComponentParser.TEMPLATE, 0); }
		public TerminalNode COLON_HTML() { return getToken(AngularComponentParser.COLON_HTML, 0); }
		public TerminalNode BACKTICK_HTML() { return getToken(AngularComponentParser.BACKTICK_HTML, 0); }
		public TerminalNode END_TEMPLATE() { return getToken(AngularComponentParser.END_TEMPLATE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateFieldContext(MetadataFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterTemplateField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitTemplateField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitTemplateField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataFieldContext metadataField() throws RecognitionException {
		MetadataFieldContext _localctx = new MetadataFieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metadataField);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Selector:
				_localctx = new SelectorFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(Selector);
				setState(122);
				match(Colon);
				setState(123);
				match(STRING);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(124);
					match(SemiColon);
					}
				}

				}
				break;
			case TEMPLATE:
				_localctx = new TemplateFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(TEMPLATE);
				setState(128);
				match(COLON_HTML);
				setState(129);
				match(BACKTICK_HTML);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 18433L) != 0)) {
					{
					{
					setState(130);
					element();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(END_TEMPLATE);
				}
				break;
			case Styles:
				_localctx = new StylesFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(Styles);
				setState(138);
				match(COLON_CSS);
				setState(139);
				match(OPEN_LIST);
				setState(140);
				cssBody();
				setState(141);
				match(CLOSE_LIST);
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(142);
					match(Comma);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(AngularComponentParser.Interface, 0); }
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode LeftBrace() { return getToken(AngularComponentParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularComponentParser.RightBrace, 0); }
		public List<InterfaceFieldContext> interfaceField() {
			return getRuleContexts(InterfaceFieldContext.class);
		}
		public InterfaceFieldContext interfaceField(int i) {
			return getRuleContext(InterfaceFieldContext.class,i);
		}
		public InterfaceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterInterfaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitInterfaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitInterfaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclContext interfaceDecl() throws RecognitionException {
		InterfaceDeclContext _localctx = new InterfaceDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interfaceDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(Interface);
			setState(148);
			match(ID);
			setState(149);
			match(LeftBrace);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(150);
				interfaceField();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class InterfaceFieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode Colon() { return getToken(AngularComponentParser.Colon, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularComponentParser.SemiColon, 0); }
		public InterfaceFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterInterfaceField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitInterfaceField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitInterfaceField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceFieldContext interfaceField() throws RecognitionException {
		InterfaceFieldContext _localctx = new InterfaceFieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			match(Colon);
			setState(160);
			typeSpec();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(161);
				match(SemiColon);
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
	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(AngularComponentParser.Class, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularComponentParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularComponentParser.ID, i);
		}
		public TerminalNode LeftBrace() { return getToken(AngularComponentParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularComponentParser.RightBrace, 0); }
		public TerminalNode Export() { return getToken(AngularComponentParser.Export, 0); }
		public TerminalNode Extends() { return getToken(AngularComponentParser.Extends, 0); }
		public TerminalNode Implements() { return getToken(AngularComponentParser.Implements, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularComponentParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularComponentParser.Comma, i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(164);
				match(Export);
				}
			}

			setState(167);
			match(Class);
			setState(168);
			match(ID);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(169);
				match(Extends);
				setState(170);
				match(ID);
				}
			}

			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(173);
				match(Implements);
				setState(174);
				match(ID);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(175);
					match(Comma);
					setState(176);
					match(ID);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(184);
			match(LeftBrace);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007199254742912L) != 0)) {
				{
				{
				setState(185);
				classMember();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class ClassMemberContext extends ParserRuleContext {
		public FieldDeclContext fieldDecl() {
			return getRuleContext(FieldDeclContext.class,0);
		}
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public ConstructorDeclContext constructorDecl() {
			return getRuleContext(ConstructorDeclContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classMember);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				fieldDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				methodDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				constructorDecl();
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
	public static class FieldDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode Colon() { return getToken(AngularComponentParser.Colon, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularComponentParser.SemiColon, 0); }
		public TerminalNode EQUALS() { return getToken(AngularComponentParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Public() { return getToken(AngularComponentParser.Public, 0); }
		public TerminalNode Private() { return getToken(AngularComponentParser.Private, 0); }
		public TerminalNode Protected() { return getToken(AngularComponentParser.Protected, 0); }
		public TerminalNode Bang() { return getToken(AngularComponentParser.Bang, 0); }
		public TerminalNode Question() { return getToken(AngularComponentParser.Question, 0); }
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) {
				{
				setState(198);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(201);
			match(ID);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Bang || _la==Question) {
				{
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==Bang || _la==Question) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(205);
			match(Colon);
			setState(206);
			typeSpec();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(207);
				match(EQUALS);
				setState(208);
				expression(0);
				}
			}

			setState(211);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
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
	public static class ConstructorDeclContext extends ParserRuleContext {
		public TerminalNode Constructor() { return getToken(AngularComponentParser.Constructor, 0); }
		public TerminalNode LeftParen() { return getToken(AngularComponentParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularComponentParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(AngularComponentParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularComponentParser.RightBrace, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitConstructorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitConstructorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclContext constructorDecl() throws RecognitionException {
		ConstructorDeclContext _localctx = new ConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(Constructor);
			setState(214);
			match(LeftParen);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007199254742784L) != 0)) {
				{
				setState(215);
				parameterList();
				}
			}

			setState(218);
			match(RightParen);
			setState(219);
			match(LeftBrace);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16888498690750464L) != 0)) {
				{
				{
				setState(220);
				statement();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode LeftParen() { return getToken(AngularComponentParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularComponentParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(AngularComponentParser.Colon, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(AngularComponentParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularComponentParser.RightBrace, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Public() { return getToken(AngularComponentParser.Public, 0); }
		public TerminalNode Private() { return getToken(AngularComponentParser.Private, 0); }
		public TerminalNode Protected() { return getToken(AngularComponentParser.Protected, 0); }
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) {
				{
				setState(228);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(231);
			match(ID);
			setState(232);
			match(LeftParen);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007199254742784L) != 0)) {
				{
				setState(233);
				parameterList();
				}
			}

			setState(236);
			match(RightParen);
			setState(237);
			match(Colon);
			setState(238);
			typeSpec();
			setState(239);
			match(LeftBrace);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16888498690750464L) != 0)) {
				{
				{
				setState(240);
				statement();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularComponentParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularComponentParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			parameter();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(249);
				match(Comma);
				setState(250);
				parameter();
				}
				}
				setState(255);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode Colon() { return getToken(AngularComponentParser.Colon, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode Public() { return getToken(AngularComponentParser.Public, 0); }
		public TerminalNode Private() { return getToken(AngularComponentParser.Private, 0); }
		public TerminalNode Protected() { return getToken(AngularComponentParser.Protected, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) {
				{
				setState(256);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(259);
			match(ID);
			setState(260);
			match(Colon);
			setState(261);
			typeSpec();
			}
		}
		catch (RecognitionException re) {
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
	public static class TypeSpecContext extends ParserRuleContext {
		public List<PrimaryTypeContext> primaryType() {
			return getRuleContexts(PrimaryTypeContext.class);
		}
		public PrimaryTypeContext primaryType(int i) {
			return getRuleContext(PrimaryTypeContext.class,i);
		}
		public List<TerminalNode> Pipe() { return getTokens(AngularComponentParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(AngularComponentParser.Pipe, i);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeSpec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			primaryType();
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					match(Pipe);
					setState(265);
					primaryType();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
	public static class PrimaryTypeContext extends ParserRuleContext {
		public PrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryType; }
	 
		public PrimaryTypeContext() { }
		public void copyFrom(PrimaryTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends PrimaryTypeContext {
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode LeftBracket() { return getToken(AngularComponentParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(AngularComponentParser.RightBracket, 0); }
		public ArrayTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeContext extends PrimaryTypeContext {
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode TAG_OPEN() { return getToken(AngularComponentParser.TAG_OPEN, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(AngularComponentParser.TAG_CLOSE, 0); }
		public GenericTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralTypeeContext extends PrimaryTypeContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public LiteralTypeeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterLiteralTypee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitLiteralTypee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitLiteralTypee(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupedTypeContext extends PrimaryTypeContext {
		public TerminalNode LeftParen() { return getToken(AngularComponentParser.LeftParen, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(AngularComponentParser.RightParen, 0); }
		public GroupedTypeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterGroupedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitGroupedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitGroupedType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeeContext extends PrimaryTypeContext {
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public FunctionTypeeContext(PrimaryTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterFunctionTypee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitFunctionTypee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitFunctionTypee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryTypeContext primaryType() throws RecognitionException {
		PrimaryTypeContext _localctx = new PrimaryTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primaryType);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new GenericTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(ID);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_OPEN) {
					{
					setState(272);
					match(TAG_OPEN);
					setState(273);
					typeSpec();
					setState(274);
					match(TAG_CLOSE);
					}
				}

				}
				break;
			case 2:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(ID);
				setState(279);
				match(LeftBracket);
				setState(280);
				match(RightBracket);
				}
				break;
			case 3:
				_localctx = new FunctionTypeeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				functionType();
				}
				break;
			case 4:
				_localctx = new LiteralTypeeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				literalType();
				}
				break;
			case 5:
				_localctx = new GroupedTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				match(LeftParen);
				setState(284);
				typeSpec();
				setState(285);
				match(RightParen);
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
	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(AngularComponentParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularComponentParser.RightParen, 0); }
		public TerminalNode Arrow() { return getToken(AngularComponentParser.Arrow, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(LeftParen);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007199254742784L) != 0)) {
				{
				setState(290);
				parameterList();
				}
			}

			setState(293);
			match(RightParen);
			setState(294);
			match(Arrow);
			setState(295);
			typeSpec();
			}
		}
		catch (RecognitionException re) {
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
	public static class LiteralTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularComponentParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AngularComponentParser.NUMBER, 0); }
		public TerminalNode True() { return getToken(AngularComponentParser.True, 0); }
		public TerminalNode False() { return getToken(AngularComponentParser.False, 0); }
		public TerminalNode Null() { return getToken(AngularComponentParser.Null, 0); }
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterLiteralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitLiteralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitLiteralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literalType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6755399441084416L) != 0)) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(AngularComponentParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(AngularComponentParser.Minus, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(AngularComponentParser.EQUALS, 0); }
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Increment() { return getToken(AngularComponentParser.Increment, 0); }
		public IncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AngularComponentParser.Dot, 0); }
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public PropertyAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterPropertyAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitPropertyAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitPropertyAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(AngularComponentParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(AngularComponentParser.Divide, 0); }
		public TerminalNode Modulo() { return getToken(AngularComponentParser.Modulo, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularComponentParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularComponentParser.RightParen, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(300);
			primaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(303);
						((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
							((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(304);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(306);
						((AdditiveExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(307);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(309);
						match(EQUALS);
						setState(310);
						expression(2);
						}
						break;
					case 4:
						{
						_localctx = new PropertyAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(312);
						match(Dot);
						setState(313);
						match(ID);
						}
						break;
					case 5:
						{
						_localctx = new FunctionCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(315);
						match(LeftParen);
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16888498690750464L) != 0)) {
							{
							setState(316);
							argumentList();
							}
						}

						setState(319);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new IncrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(321);
						match(Increment);
						}
						break;
					}
					} 
				}
				setState(326);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(AngularComponentParser.This, 0); }
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(AngularComponentParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(AngularComponentParser.STRING, 0); }
		public TerminalNode True() { return getToken(AngularComponentParser.True, 0); }
		public TerminalNode False() { return getToken(AngularComponentParser.False, 0); }
		public TerminalNode Null() { return getToken(AngularComponentParser.Null, 0); }
		public TerminalNode TEMPLATE_STRING() { return getToken(AngularComponentParser.TEMPLATE_STRING, 0); }
		public TerminalNode LeftParen() { return getToken(AngularComponentParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(AngularComponentParser.RightParen, 0); }
		public ArrayLiteralExpressionContext arrayLiteralExpression() {
			return getRuleContext(ArrayLiteralExpressionContext.class,0);
		}
		public ObjectLiteralExpressionContext objectLiteralExpression() {
			return getRuleContext(ObjectLiteralExpressionContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primaryExpr);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case This:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(This);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(STRING);
				}
				break;
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(False);
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 7);
				{
				setState(333);
				match(Null);
				}
				break;
			case TEMPLATE_STRING:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
				match(TEMPLATE_STRING);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 9);
				{
				setState(335);
				match(LeftParen);
				setState(336);
				expression(0);
				setState(337);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 10);
				{
				setState(339);
				arrayLiteralExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 11);
				{
				setState(340);
				objectLiteralExpression();
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
	public static class ArrayLiteralExpressionContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(AngularComponentParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(AngularComponentParser.RightBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularComponentParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularComponentParser.Comma, i);
		}
		public ArrayLiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitArrayLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralExpressionContext arrayLiteralExpression() throws RecognitionException {
		ArrayLiteralExpressionContext _localctx = new ArrayLiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayLiteralExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(LeftBracket);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16888498690750464L) != 0)) {
				{
				setState(344);
				expression(0);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(345);
					match(Comma);
					setState(346);
					expression(0);
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(354);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
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
	public static class ObjectLiteralExpressionContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularComponentParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularComponentParser.RightBrace, 0); }
		public List<ObjectLiteralPairContext> objectLiteralPair() {
			return getRuleContexts(ObjectLiteralPairContext.class);
		}
		public ObjectLiteralPairContext objectLiteralPair(int i) {
			return getRuleContext(ObjectLiteralPairContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularComponentParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularComponentParser.Comma, i);
		}
		public ObjectLiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteralExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralExpressionContext objectLiteralExpression() throws RecognitionException {
		ObjectLiteralExpressionContext _localctx = new ObjectLiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objectLiteralExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(LeftBrace);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(357);
				objectLiteralPair();
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(359);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Comma) {
							{
							setState(358);
							match(Comma);
							}
						}

						setState(361);
						objectLiteralPair();
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(367);
					match(Comma);
					}
				}

				}
			}

			setState(372);
			match(RightBrace);
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(373);
				match(Comma);
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
	public static class ObjectLiteralPairContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularComponentParser.ID, 0); }
		public TerminalNode Colon() { return getToken(AngularComponentParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectLiteralPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteralPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterObjectLiteralPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitObjectLiteralPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitObjectLiteralPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralPairContext objectLiteralPair() throws RecognitionException {
		ObjectLiteralPairContext _localctx = new ObjectLiteralPairContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_objectLiteralPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ID);
			setState(377);
			match(Colon);
			setState(378);
			expression(0);
			}
		}
		catch (RecognitionException re) {
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularComponentParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularComponentParser.Comma, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			expression(0);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(381);
				match(Comma);
				setState(382);
				expression(0);
				}
				}
				setState(387);
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
	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				blockStatement();
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
	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularComponentParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularComponentParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(LeftBrace);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16888498690750464L) != 0)) {
				{
				{
				setState(393);
				statement();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularComponentParser.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			expression(0);
			setState(402);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
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
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationElementContext extends ElementContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public InterpolationElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterInterpolationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitInterpolationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitInterpolationElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNameContext extends ElementContext {
		public TerminalNode NAME_HTML() { return getToken(AngularComponentParser.NAME_HTML, 0); }
		public TerminalNode COLON_HTML() { return getToken(AngularComponentParser.COLON_HTML, 0); }
		public HtmlNameContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterHtmlName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitHtmlName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitHtmlName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagElementContext extends ElementContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TagElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitTagElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_element);
		int _la;
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN_START_HTML:
				_localctx = new TagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				tag();
				}
				break;
			case NAME_HTML:
				_localctx = new HtmlNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(NAME_HTML);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON_HTML) {
					{
					setState(406);
					match(COLON_HTML);
					}
				}

				}
				break;
			case INTERPOLATION_START_HTML:
				_localctx = new InterpolationElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				interpolation();
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
	public static class TagContext extends ParserRuleContext {
		public OpeningTagContext openingTag() {
			return getRuleContext(OpeningTagContext.class,0);
		}
		public ClosingTagContext closingTag() {
			return getRuleContext(ClosingTagContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tag);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				openingTag();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 18433L) != 0)) {
					{
					{
					setState(413);
					element();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				closingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				selfClosingTag();
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
	public static class OpeningTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_START_HTML() { return getToken(AngularComponentParser.TAG_OPEN_START_HTML, 0); }
		public TerminalNode TAG_CLOSE_END_HTML() { return getToken(AngularComponentParser.TAG_CLOSE_END_HTML, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public OpeningTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterOpeningTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitOpeningTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitOpeningTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpeningTagContext openingTag() throws RecognitionException {
		OpeningTagContext _localctx = new OpeningTagContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_openingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(TAG_OPEN_START_HTML);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 263L) != 0)) {
				{
				{
				setState(425);
				attributes();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			match(TAG_CLOSE_END_HTML);
			}
		}
		catch (RecognitionException re) {
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
	public static class ClosingTagContext extends ParserRuleContext {
		public TerminalNode TAG_CLOSE_START_HTML() { return getToken(AngularComponentParser.TAG_CLOSE_START_HTML, 0); }
		public TerminalNode NAME_HTML() { return getToken(AngularComponentParser.NAME_HTML, 0); }
		public TerminalNode TAG_CLOSE_END_HTML() { return getToken(AngularComponentParser.TAG_CLOSE_END_HTML, 0); }
		public ClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosingTagContext closingTag() throws RecognitionException {
		ClosingTagContext _localctx = new ClosingTagContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_closingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(TAG_CLOSE_START_HTML);
			setState(434);
			match(NAME_HTML);
			setState(435);
			match(TAG_CLOSE_END_HTML);
			}
		}
		catch (RecognitionException re) {
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
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_START_HTML() { return getToken(AngularComponentParser.TAG_OPEN_START_HTML, 0); }
		public TerminalNode TAG_END_HTML() { return getToken(AngularComponentParser.TAG_END_HTML, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(TAG_OPEN_START_HTML);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 263L) != 0)) {
				{
				{
				setState(438);
				attributes();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(TAG_END_HTML);
			}
		}
		catch (RecognitionException re) {
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
	public static class AttributesContext extends ParserRuleContext {
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	 
		public AttributesContext() { }
		public void copyFrom(AttributesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingAttributeContext extends AttributesContext {
		public TerminalNode EVENT_BINDING_HTML() { return getToken(AngularComponentParser.EVENT_BINDING_HTML, 0); }
		public TerminalNode ATTRIBUTE_EQUALS_HTML() { return getToken(AngularComponentParser.ATTRIBUTE_EQUALS_HTML, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularComponentParser.STRING_HTML, 0); }
		public EventBindingAttributeContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterEventBindingAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitEventBindingAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitEventBindingAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructuralDirectiveAttributeContext extends AttributesContext {
		public TerminalNode STRUCTURAL_DIR_HTML() { return getToken(AngularComponentParser.STRUCTURAL_DIR_HTML, 0); }
		public TerminalNode ATTRIBUTE_EQUALS_HTML() { return getToken(AngularComponentParser.ATTRIBUTE_EQUALS_HTML, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularComponentParser.STRING_HTML, 0); }
		public StructuralDirectiveAttributeContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterStructuralDirectiveAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitStructuralDirectiveAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitStructuralDirectiveAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBindingAttributeContext extends AttributesContext {
		public TerminalNode BINDING_HTML() { return getToken(AngularComponentParser.BINDING_HTML, 0); }
		public TerminalNode ATTRIBUTE_EQUALS_HTML() { return getToken(AngularComponentParser.ATTRIBUTE_EQUALS_HTML, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularComponentParser.STRING_HTML, 0); }
		public PropertyBindingAttributeContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterPropertyBindingAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitPropertyBindingAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitPropertyBindingAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularAttributeContext extends AttributesContext {
		public TerminalNode NAME_HTML() { return getToken(AngularComponentParser.NAME_HTML, 0); }
		public TerminalNode ATTRIBUTE_EQUALS_HTML() { return getToken(AngularComponentParser.ATTRIBUTE_EQUALS_HTML, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularComponentParser.STRING_HTML, 0); }
		public RegularAttributeContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterRegularAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitRegularAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitRegularAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_attributes);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_HTML:
				_localctx = new RegularAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(NAME_HTML);
				setState(447);
				match(ATTRIBUTE_EQUALS_HTML);
				setState(448);
				match(STRING_HTML);
				}
				break;
			case STRUCTURAL_DIR_HTML:
				_localctx = new StructuralDirectiveAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(STRUCTURAL_DIR_HTML);
				setState(450);
				match(ATTRIBUTE_EQUALS_HTML);
				setState(451);
				match(STRING_HTML);
				}
				break;
			case BINDING_HTML:
				_localctx = new PropertyBindingAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(BINDING_HTML);
				setState(453);
				match(ATTRIBUTE_EQUALS_HTML);
				setState(454);
				match(STRING_HTML);
				}
				break;
			case EVENT_BINDING_HTML:
				_localctx = new EventBindingAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
				match(EVENT_BINDING_HTML);
				setState(456);
				match(ATTRIBUTE_EQUALS_HTML);
				setState(457);
				match(STRING_HTML);
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
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_START_HTML() { return getToken(AngularComponentParser.INTERPOLATION_START_HTML, 0); }
		public TerminalNode NAME_HTML() { return getToken(AngularComponentParser.NAME_HTML, 0); }
		public TerminalNode INTERPOLATION_END_HTML() { return getToken(AngularComponentParser.INTERPOLATION_END_HTML, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(INTERPOLATION_START_HTML);
			setState(461);
			match(NAME_HTML);
			setState(462);
			match(INTERPOLATION_END_HTML);
			}
		}
		catch (RecognitionException re) {
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
	public static class CssBodyContext extends ParserRuleContext {
		public CssBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBody; }
	 
		public CssBodyContext() { }
		public void copyFrom(CssBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBodyContentContext extends CssBodyContext {
		public List<TerminalNode> BACKTICK_CSS() { return getTokens(AngularComponentParser.BACKTICK_CSS); }
		public TerminalNode BACKTICK_CSS(int i) {
			return getToken(AngularComponentParser.BACKTICK_CSS, i);
		}
		public CssObjectsContext cssObjects() {
			return getRuleContext(CssObjectsContext.class,0);
		}
		public TerminalNode COMMA_CSS() { return getToken(AngularComponentParser.COMMA_CSS, 0); }
		public CssBodyContentContext(CssBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterCssBodyContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitCssBodyContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitCssBodyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBodyContext cssBody() throws RecognitionException {
		CssBodyContext _localctx = new CssBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cssBody);
		int _la;
		try {
			_localctx = new CssBodyContentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(BACKTICK_CSS);
			setState(465);
			cssObjects();
			setState(466);
			match(BACKTICK_CSS);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_CSS) {
				{
				setState(467);
				match(COMMA_CSS);
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
	public static class CssObjectsContext extends ParserRuleContext {
		public CssObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssObjects; }
	 
		public CssObjectsContext() { }
		public void copyFrom(CssObjectsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssObjectListContext extends CssObjectsContext {
		public List<CsselementContext> csselement() {
			return getRuleContexts(CsselementContext.class);
		}
		public CsselementContext csselement(int i) {
			return getRuleContext(CsselementContext.class,i);
		}
		public List<TerminalNode> COMMA_CSS() { return getTokens(AngularComponentParser.COMMA_CSS); }
		public TerminalNode COMMA_CSS(int i) {
			return getToken(AngularComponentParser.COMMA_CSS, i);
		}
		public CssObjectListContext(CssObjectsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterCssObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitCssObjectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitCssObjectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssObjectsContext cssObjects() throws RecognitionException {
		CssObjectsContext _localctx = new CssObjectsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cssObjects);
		int _la;
		try {
			_localctx = new CssObjectListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(470);
				csselement();
				}
				break;
			}
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_CSS || _la==DOT_CSS) {
				{
				{
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_CSS) {
					{
					setState(473);
					match(COMMA_CSS);
					}
				}

				setState(476);
				csselement();
				}
				}
				setState(481);
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
	public static class CsselementContext extends ParserRuleContext {
		public CsselementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csselement; }
	 
		public CsselementContext() { }
		public void copyFrom(CsselementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends CsselementContext {
		public TerminalNode DOT_CSS() { return getToken(AngularComponentParser.DOT_CSS, 0); }
		public TerminalNode LBRACE_CSS() { return getToken(AngularComponentParser.LBRACE_CSS, 0); }
		public TerminalNode RBRACE_CSS() { return getToken(AngularComponentParser.RBRACE_CSS, 0); }
		public List<TerminalNode> ID_CSS() { return getTokens(AngularComponentParser.ID_CSS); }
		public TerminalNode ID_CSS(int i) {
			return getToken(AngularComponentParser.ID_CSS, i);
		}
		public List<BodyelementContext> bodyelement() {
			return getRuleContexts(BodyelementContext.class);
		}
		public BodyelementContext bodyelement(int i) {
			return getRuleContext(BodyelementContext.class,i);
		}
		public CssRuleContext(CsselementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsselementContext csselement() throws RecognitionException {
		CsselementContext _localctx = new CsselementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_csselement);
		int _la;
		try {
			_localctx = new CssRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(DOT_CSS);
			setState(484); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(483);
				match(ID_CSS);
				}
				}
				setState(486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID_CSS );
			setState(488);
			match(LBRACE_CSS);
			setState(490); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(489);
				bodyelement();
				}
				}
				setState(492); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID_CSS );
			setState(494);
			match(RBRACE_CSS);
			}
		}
		catch (RecognitionException re) {
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
	public static class BodyelementContext extends ParserRuleContext {
		public BodyelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyelement; }
	 
		public BodyelementContext() { }
		public void copyFrom(BodyelementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyContext extends BodyelementContext {
		public TerminalNode ID_CSS() { return getToken(AngularComponentParser.ID_CSS, 0); }
		public TerminalNode COLON_CSS() { return getToken(AngularComponentParser.COLON_CSS, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode SEMICOLON_CSS() { return getToken(AngularComponentParser.SEMICOLON_CSS, 0); }
		public CssPropertyContext(BodyelementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyelementContext bodyelement() throws RecognitionException {
		BodyelementContext _localctx = new BodyelementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bodyelement);
		try {
			_localctx = new CssPropertyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(ID_CSS);
			setState(497);
			match(COLON_CSS);
			setState(498);
			cssValue();
			setState(499);
			match(SEMICOLON_CSS);
			}
		}
		catch (RecognitionException re) {
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
	public static class CssValueContext extends ParserRuleContext {
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	 
		public CssValueContext() { }
		public void copyFrom(CssValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueExpressionContext extends CssValueContext {
		public TerminalNode PERCENT() { return getToken(AngularComponentParser.PERCENT, 0); }
		public List<TerminalNode> ID_CSS() { return getTokens(AngularComponentParser.ID_CSS); }
		public TerminalNode ID_CSS(int i) {
			return getToken(AngularComponentParser.ID_CSS, i);
		}
		public CssValueExpressionContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).enterCssValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularComponentParserListener ) ((AngularComponentParserListener)listener).exitCssValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularComponentParserVisitor ) return ((AngularComponentParserVisitor<? extends T>)visitor).visitCssValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cssValue);
		int _la;
		try {
			_localctx = new CssValueExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !(_la==PERCENT || _la==ID_CSS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_CSS) {
				{
				setState(502);
				match(ID_CSS);
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID_CSS) {
					{
					setState(503);
					match(ID_CSS);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001]\u01fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0005\u0000"+
		"P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0003\u0000V\b\u0000\u0001"+
		"\u0000\u0003\u0000Y\b\u0000\u0001\u0000\u0003\u0000\\\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003q\b\u0003\u0005\u0003s\b\u0003\n\u0003\f\u0003v\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004~\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u0084\b\u0004\n\u0004\f\u0004\u0087\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0090\b\u0004\u0003\u0004\u0092\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0098\b\u0005\n\u0005\f\u0005\u009b\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a3\b\u0006\u0001\u0007\u0003\u0007\u00a6\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ac\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b2\b\u0007\n"+
		"\u0007\f\u0007\u00b5\t\u0007\u0003\u0007\u00b7\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00bb\b\u0007\n\u0007\f\u0007\u00be\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00c5\b\b\u0001\t\u0003\t"+
		"\u00c8\b\t\u0001\t\u0001\t\u0003\t\u00cc\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00d2\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00d9"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u00de\b\n\n\n\f\n\u00e1\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0003\u000b\u00e6\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00eb\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00f2\b\u000b\n\u000b\f\u000b\u00f5"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00fc"+
		"\b\f\n\f\f\f\u00ff\t\f\u0001\r\u0003\r\u0102\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u010b\b\u000e"+
		"\n\u000e\f\u000e\u010e\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0115\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0120\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0124"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u013e\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0143\b\u0012\n\u0012\f\u0012\u0146\t\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0156\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u015c\b\u0014\n\u0014\f\u0014\u015f\t\u0014\u0003\u0014\u0161"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0168\b\u0015\u0001\u0015\u0005\u0015\u016b\b\u0015\n\u0015\f\u0015"+
		"\u016e\t\u0015\u0001\u0015\u0003\u0015\u0171\b\u0015\u0003\u0015\u0173"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0177\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0180\b\u0017\n\u0017\f\u0017\u0183\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0187\b\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u018b"+
		"\b\u0019\n\u0019\f\u0019\u018e\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0198\b\u001b\u0001\u001b\u0003\u001b\u019b\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u019f\b\u001c\n\u001c\f\u001c\u01a2\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u01a7\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u01ab\b\u001d\n\u001d\f\u001d\u01ae\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01b8\b\u001f\n\u001f\f\u001f\u01bb\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u01cb\b \u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d5\b\"\u0001#\u0003#\u01d8\b#\u0001"+
		"#\u0003#\u01db\b#\u0001#\u0005#\u01de\b#\n#\f#\u01e1\t#\u0001$\u0001$"+
		"\u0004$\u01e5\b$\u000b$\f$\u01e6\u0001$\u0001$\u0004$\u01eb\b$\u000b$"+
		"\f$\u01ec\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0003&\u01f9\b&\u0003&\u01fb\b&\u0001&\u0000\u0001$\'\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJL\u0000\u0006\u0001\u0000\b\n\u0001\u0000\"#\u0002"+
		"\u0000\f\u000e34\u0001\u0000\')\u0001\u0000%&\u0002\u0000VV]]\u0227\u0000"+
		"Q\u0001\u0000\u0000\u0000\u0002_\u0001\u0000\u0000\u0000\u0004g\u0001"+
		"\u0000\u0000\u0000\u0006m\u0001\u0000\u0000\u0000\b\u0091\u0001\u0000"+
		"\u0000\u0000\n\u0093\u0001\u0000\u0000\u0000\f\u009e\u0001\u0000\u0000"+
		"\u0000\u000e\u00a5\u0001\u0000\u0000\u0000\u0010\u00c4\u0001\u0000\u0000"+
		"\u0000\u0012\u00c7\u0001\u0000\u0000\u0000\u0014\u00d5\u0001\u0000\u0000"+
		"\u0000\u0016\u00e5\u0001\u0000\u0000\u0000\u0018\u00f8\u0001\u0000\u0000"+
		"\u0000\u001a\u0101\u0001\u0000\u0000\u0000\u001c\u0107\u0001\u0000\u0000"+
		"\u0000\u001e\u011f\u0001\u0000\u0000\u0000 \u0121\u0001\u0000\u0000\u0000"+
		"\"\u0129\u0001\u0000\u0000\u0000$\u012b\u0001\u0000\u0000\u0000&\u0155"+
		"\u0001\u0000\u0000\u0000(\u0157\u0001\u0000\u0000\u0000*\u0164\u0001\u0000"+
		"\u0000\u0000,\u0178\u0001\u0000\u0000\u0000.\u017c\u0001\u0000\u0000\u0000"+
		"0\u0186\u0001\u0000\u0000\u00002\u0188\u0001\u0000\u0000\u00004\u0191"+
		"\u0001\u0000\u0000\u00006\u019a\u0001\u0000\u0000\u00008\u01a6\u0001\u0000"+
		"\u0000\u0000:\u01a8\u0001\u0000\u0000\u0000<\u01b1\u0001\u0000\u0000\u0000"+
		">\u01b5\u0001\u0000\u0000\u0000@\u01ca\u0001\u0000\u0000\u0000B\u01cc"+
		"\u0001\u0000\u0000\u0000D\u01d0\u0001\u0000\u0000\u0000F\u01d7\u0001\u0000"+
		"\u0000\u0000H\u01e2\u0001\u0000\u0000\u0000J\u01f0\u0001\u0000\u0000\u0000"+
		"L\u01f5\u0001\u0000\u0000\u0000NP\u0003\u0002\u0001\u0000ON\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TV\u0003\n\u0005\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VX\u0001\u0000\u0000\u0000WY\u0003\u0004\u0002\u0000XW\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000Z\\\u0003\u000e"+
		"\u0007\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]^\u0005\u0000\u0000\u0001^\u0001\u0001\u0000\u0000"+
		"\u0000_`\u0005\u0001\u0000\u0000`a\u0005\u0016\u0000\u0000ab\u00055\u0000"+
		"\u0000bc\u0005\u0017\u0000\u0000cd\u0005\u000f\u0000\u0000de\u00053\u0000"+
		"\u0000ef\u0005\u001f\u0000\u0000f\u0003\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0013\u0000\u0000hi\u00055\u0000\u0000ij\u0005\u0018\u0000\u0000jk\u0003"+
		"\u0006\u0003\u0000kl\u0005\u0019\u0000\u0000l\u0005\u0001\u0000\u0000"+
		"\u0000mt\u0005\u0016\u0000\u0000np\u0003\b\u0004\u0000oq\u0005\u001d\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000"+
		"\u0000\u0000rn\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000wx\u0005\u0017\u0000\u0000x\u0007\u0001\u0000"+
		"\u0000\u0000yz\u0005\u0010\u0000\u0000z{\u0005\u001e\u0000\u0000{}\u0005"+
		"3\u0000\u0000|~\u0005\u001f\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0092\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0011"+
		"\u0000\u0000\u0080\u0081\u0005E\u0000\u0000\u0081\u0085\u0005L\u0000\u0000"+
		"\u0082\u0084\u00036\u001b\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u0092\u0005K\u0000\u0000\u0089\u008a"+
		"\u0005\u0012\u0000\u0000\u008a\u008b\u0005N\u0000\u0000\u008b\u008c\u0005"+
		"P\u0000\u0000\u008c\u008d\u0003D\"\u0000\u008d\u008f\u0005Q\u0000\u0000"+
		"\u008e\u0090\u0005\u001d\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000"+
		"\u0091y\u0001\u0000\u0000\u0000\u0091\u007f\u0001\u0000\u0000\u0000\u0091"+
		"\u0089\u0001\u0000\u0000\u0000\u0092\t\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\u0004\u0000\u0000\u0094\u0095\u00055\u0000\u0000\u0095\u0099\u0005"+
		"\u0016\u0000\u0000\u0096\u0098\u0003\f\u0006\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0017"+
		"\u0000\u0000\u009d\u000b\u0001\u0000\u0000\u0000\u009e\u009f\u00055\u0000"+
		"\u0000\u009f\u00a0\u0005\u001e\u0000\u0000\u00a0\u00a2\u0003\u001c\u000e"+
		"\u0000\u00a1\u00a3\u0005\u001f\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\r\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u0005\u0002\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005\u0003\u0000\u0000\u00a8\u00ab\u00055\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ac\u00055\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00b6"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0006\u0000\u0000\u00ae\u00b3"+
		"\u00055\u0000\u0000\u00af\u00b0\u0005\u001d\u0000\u0000\u00b0\u00b2\u0005"+
		"5\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bc\u0005\u0016"+
		"\u0000\u0000\u00b9\u00bb\u0003\u0010\b\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0017\u0000"+
		"\u0000\u00c0\u000f\u0001\u0000\u0000\u0000\u00c1\u00c5\u0003\u0012\t\u0000"+
		"\u00c2\u00c5\u0003\u0016\u000b\u0000\u00c3\u00c5\u0003\u0014\n\u0000\u00c4"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u0011\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c8\u0007\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"\u00cb\u00055\u0000\u0000\u00ca\u00cc\u0007\u0001\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u001e\u0000\u0000\u00ce\u00d1"+
		"\u0003\u001c\u000e\u0000\u00cf\u00d0\u0005 \u0000\u0000\u00d0\u00d2\u0003"+
		"$\u0012\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u001f"+
		"\u0000\u0000\u00d4\u0013\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0007"+
		"\u0000\u0000\u00d6\u00d8\u0005\u0018\u0000\u0000\u00d7\u00d9\u0003\u0018"+
		"\f\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0019\u0000"+
		"\u0000\u00db\u00df\u0005\u0016\u0000\u0000\u00dc\u00de\u00030\u0018\u0000"+
		"\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005\u0017\u0000\u0000\u00e3\u0015\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e6\u0007\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u00055\u0000\u0000\u00e8\u00ea\u0005\u0018\u0000\u0000\u00e9"+
		"\u00eb\u0003\u0018\f\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0005\u0019\u0000\u0000\u00ed\u00ee\u0005\u001e\u0000\u0000\u00ee\u00ef"+
		"\u0003\u001c\u000e\u0000\u00ef\u00f3\u0005\u0016\u0000\u0000\u00f0\u00f2"+
		"\u00030\u0018\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0005\u0017\u0000\u0000\u00f7\u0017\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fd\u0003\u001a\r\u0000\u00f9\u00fa\u0005\u001d"+
		"\u0000\u0000\u00fa\u00fc\u0003\u001a\r\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0019\u0001\u0000\u0000"+
		"\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0102\u0007\u0000\u0000"+
		"\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u00055\u0000\u0000"+
		"\u0104\u0105\u0005\u001e\u0000\u0000\u0105\u0106\u0003\u001c\u000e\u0000"+
		"\u0106\u001b\u0001\u0000\u0000\u0000\u0107\u010c\u0003\u001e\u000f\u0000"+
		"\u0108\u0109\u0005$\u0000\u0000\u0109\u010b\u0003\u001e\u000f\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u001d\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f"+
		"\u0114\u00055\u0000\u0000\u0110\u0111\u0005-\u0000\u0000\u0111\u0112\u0003"+
		"\u001c\u000e\u0000\u0112\u0113\u0005.\u0000\u0000\u0113\u0115\u0001\u0000"+
		"\u0000\u0000\u0114\u0110\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0120\u0001\u0000\u0000\u0000\u0116\u0117\u00055\u0000"+
		"\u0000\u0117\u0118\u0005\u001a\u0000\u0000\u0118\u0120\u0005\u001b\u0000"+
		"\u0000\u0119\u0120\u0003 \u0010\u0000\u011a\u0120\u0003\"\u0011\u0000"+
		"\u011b\u011c\u0005\u0018\u0000\u0000\u011c\u011d\u0003\u001c\u000e\u0000"+
		"\u011d\u011e\u0005\u0019\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000"+
		"\u011f\u010f\u0001\u0000\u0000\u0000\u011f\u0116\u0001\u0000\u0000\u0000"+
		"\u011f\u0119\u0001\u0000\u0000\u0000\u011f\u011a\u0001\u0000\u0000\u0000"+
		"\u011f\u011b\u0001\u0000\u0000\u0000\u0120\u001f\u0001\u0000\u0000\u0000"+
		"\u0121\u0123\u0005\u0018\u0000\u0000\u0122\u0124\u0003\u0018\f\u0000\u0123"+
		"\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0019\u0000\u0000\u0126"+
		"\u0127\u0005!\u0000\u0000\u0127\u0128\u0003\u001c\u000e\u0000\u0128!\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0007\u0002\u0000\u0000\u012a#\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0006\u0012\uffff\uffff\u0000\u012c\u012d\u0003"+
		"&\u0013\u0000\u012d\u0144\u0001\u0000\u0000\u0000\u012e\u012f\n\u0003"+
		"\u0000\u0000\u012f\u0130\u0007\u0003\u0000\u0000\u0130\u0143\u0003$\u0012"+
		"\u0004\u0131\u0132\n\u0002\u0000\u0000\u0132\u0133\u0007\u0004\u0000\u0000"+
		"\u0133\u0143\u0003$\u0012\u0003\u0134\u0135\n\u0001\u0000\u0000\u0135"+
		"\u0136\u0005 \u0000\u0000\u0136\u0143\u0003$\u0012\u0002\u0137\u0138\n"+
		"\u0006\u0000\u0000\u0138\u0139\u0005\u001c\u0000\u0000\u0139\u0143\u0005"+
		"5\u0000\u0000\u013a\u013b\n\u0005\u0000\u0000\u013b\u013d\u0005\u0018"+
		"\u0000\u0000\u013c\u013e\u0003.\u0017\u0000\u013d\u013c\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000"+
		"\u0000\u013f\u0143\u0005\u0019\u0000\u0000\u0140\u0141\n\u0004\u0000\u0000"+
		"\u0141\u0143\u0005*\u0000\u0000\u0142\u012e\u0001\u0000\u0000\u0000\u0142"+
		"\u0131\u0001\u0000\u0000\u0000\u0142\u0134\u0001\u0000\u0000\u0000\u0142"+
		"\u0137\u0001\u0000\u0000\u0000\u0142\u013a\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144"+
		"\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"%\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0156"+
		"\u0005\u000b\u0000\u0000\u0148\u0156\u00055\u0000\u0000\u0149\u0156\u0005"+
		"4\u0000\u0000\u014a\u0156\u00053\u0000\u0000\u014b\u0156\u0005\f\u0000"+
		"\u0000\u014c\u0156\u0005\r\u0000\u0000\u014d\u0156\u0005\u000e\u0000\u0000"+
		"\u014e\u0156\u00052\u0000\u0000\u014f\u0150\u0005\u0018\u0000\u0000\u0150"+
		"\u0151\u0003$\u0012\u0000\u0151\u0152\u0005\u0019\u0000\u0000\u0152\u0156"+
		"\u0001\u0000\u0000\u0000\u0153\u0156\u0003(\u0014\u0000\u0154\u0156\u0003"+
		"*\u0015\u0000\u0155\u0147\u0001\u0000\u0000\u0000\u0155\u0148\u0001\u0000"+
		"\u0000\u0000\u0155\u0149\u0001\u0000\u0000\u0000\u0155\u014a\u0001\u0000"+
		"\u0000\u0000\u0155\u014b\u0001\u0000\u0000\u0000\u0155\u014c\u0001\u0000"+
		"\u0000\u0000\u0155\u014d\u0001\u0000\u0000\u0000\u0155\u014e\u0001\u0000"+
		"\u0000\u0000\u0155\u014f\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\'\u0001\u0000\u0000"+
		"\u0000\u0157\u0160\u0005\u001a\u0000\u0000\u0158\u015d\u0003$\u0012\u0000"+
		"\u0159\u015a\u0005\u001d\u0000\u0000\u015a\u015c\u0003$\u0012\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e"+
		"\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160"+
		"\u0158\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u001b\u0000\u0000\u0163"+
		")\u0001\u0000\u0000\u0000\u0164\u0172\u0005\u0016\u0000\u0000\u0165\u016c"+
		"\u0003,\u0016\u0000\u0166\u0168\u0005\u001d\u0000\u0000\u0167\u0166\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016b\u0003,\u0016\u0000\u016a\u0167\u0001\u0000"+
		"\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000"+
		"\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0171\u0005\u001d"+
		"\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000"+
		"\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0165\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0176\u0005\u0017\u0000\u0000\u0175\u0177\u0005\u001d"+
		"\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000"+
		"\u0000\u0000\u0177+\u0001\u0000\u0000\u0000\u0178\u0179\u00055\u0000\u0000"+
		"\u0179\u017a\u0005\u001e\u0000\u0000\u017a\u017b\u0003$\u0012\u0000\u017b"+
		"-\u0001\u0000\u0000\u0000\u017c\u0181\u0003$\u0012\u0000\u017d\u017e\u0005"+
		"\u001d\u0000\u0000\u017e\u0180\u0003$\u0012\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182/\u0001\u0000\u0000"+
		"\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0187\u00034\u001a\u0000"+
		"\u0185\u0187\u00032\u0019\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0185\u0001\u0000\u0000\u0000\u01871\u0001\u0000\u0000\u0000\u0188\u018c"+
		"\u0005\u0016\u0000\u0000\u0189\u018b\u00030\u0018\u0000\u018a\u0189\u0001"+
		"\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001"+
		"\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190\u0005"+
		"\u0017\u0000\u0000\u01903\u0001\u0000\u0000\u0000\u0191\u0192\u0003$\u0012"+
		"\u0000\u0192\u0193\u0005\u001f\u0000\u0000\u01935\u0001\u0000\u0000\u0000"+
		"\u0194\u019b\u00038\u001c\u0000\u0195\u0197\u0005I\u0000\u0000\u0196\u0198"+
		"\u0005E\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197\u0198\u0001"+
		"\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u019b\u0003"+
		"B!\u0000\u019a\u0194\u0001\u0000\u0000\u0000\u019a\u0195\u0001\u0000\u0000"+
		"\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b7\u0001\u0000\u0000\u0000"+
		"\u019c\u01a0\u0003:\u001d\u0000\u019d\u019f\u00036\u001b\u0000\u019e\u019d"+
		"\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0003<\u001e\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a7\u0003"+
		">\u001f\u0000\u01a6\u019c\u0001\u0000\u0000\u0000\u01a6\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a79\u0001\u0000\u0000\u0000\u01a8\u01ac\u0005;\u0000\u0000"+
		"\u01a9\u01ab\u0003@ \u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u01ac"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0005=\u0000\u0000\u01b0;\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u0005<\u0000\u0000\u01b2\u01b3\u0005I\u0000\u0000"+
		"\u01b3\u01b4\u0005=\u0000\u0000\u01b4=\u0001\u0000\u0000\u0000\u01b5\u01b9"+
		"\u0005;\u0000\u0000\u01b6\u01b8\u0003@ \u0000\u01b7\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005>\u0000"+
		"\u0000\u01bd?\u0001\u0000\u0000\u0000\u01be\u01bf\u0005I\u0000\u0000\u01bf"+
		"\u01c0\u0005?\u0000\u0000\u01c0\u01cb\u0005@\u0000\u0000\u01c1\u01c2\u0005"+
		"A\u0000\u0000\u01c2\u01c3\u0005?\u0000\u0000\u01c3\u01cb\u0005@\u0000"+
		"\u0000\u01c4\u01c5\u0005B\u0000\u0000\u01c5\u01c6\u0005?\u0000\u0000\u01c6"+
		"\u01cb\u0005@\u0000\u0000\u01c7\u01c8\u0005C\u0000\u0000\u01c8\u01c9\u0005"+
		"?\u0000\u0000\u01c9\u01cb\u0005@\u0000\u0000\u01ca\u01be\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c1\u0001\u0000\u0000\u0000\u01ca\u01c4\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c7\u0001\u0000\u0000\u0000\u01cbA\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0005F\u0000\u0000\u01cd\u01ce\u0005I\u0000\u0000\u01ce\u01cf"+
		"\u0005G\u0000\u0000\u01cfC\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005M"+
		"\u0000\u0000\u01d1\u01d2\u0003F#\u0000\u01d2\u01d4\u0005M\u0000\u0000"+
		"\u01d3\u01d5\u0005O\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d5E\u0001\u0000\u0000\u0000\u01d6\u01d8"+
		"\u0003H$\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8\u01df\u0001\u0000\u0000\u0000\u01d9\u01db\u0005O\u0000"+
		"\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01de\u0003H$\u0000\u01dd"+
		"\u01da\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df"+
		"\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0"+
		"G\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e4"+
		"\u0005R\u0000\u0000\u01e3\u01e5\u0005]\u0000\u0000\u01e4\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e8\u01ea\u0005T\u0000\u0000\u01e9\u01eb\u0003J%\u0000"+
		"\u01ea\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005U\u0000\u0000\u01ef"+
		"I\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005]\u0000\u0000\u01f1\u01f2\u0005"+
		"N\u0000\u0000\u01f2\u01f3\u0003L&\u0000\u01f3\u01f4\u0005S\u0000\u0000"+
		"\u01f4K\u0001\u0000\u0000\u0000\u01f5\u01fa\u0007\u0005\u0000\u0000\u01f6"+
		"\u01f8\u0005]\u0000\u0000\u01f7\u01f9\u0005]\u0000\u0000\u01f8\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fa\u01f6\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fbM\u0001\u0000\u0000\u0000=QUX[pt}\u0085\u008f"+
		"\u0091\u0099\u00a2\u00a5\u00ab\u00b3\u00b6\u00bc\u00c4\u00c7\u00cb\u00d1"+
		"\u00d8\u00df\u00e5\u00ea\u00f3\u00fd\u0101\u010c\u0114\u011f\u0123\u013d"+
		"\u0142\u0144\u0155\u015d\u0160\u0167\u016c\u0170\u0172\u0176\u0181\u0186"+
		"\u018c\u0197\u019a\u01a0\u01a6\u01ac\u01b9\u01ca\u01d4\u01d7\u01da\u01df"+
		"\u01e6\u01ec\u01f8\u01fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}