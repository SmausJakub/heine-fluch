// Generated from C:/Users/Jakub/IdeaProjects/heine-fluch/src/cz/zcu/kiv/fjp\Pascal0Like.g4 by ANTLR 4.7
package cz.zcu.kiv.fjp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pascal0LikeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, INT=2, FLOAT=3, BEGIN=4, AND=5, BOOLEAN=6, CASE=7, CONST=8, 
		DO=9, OF=10, DOWNTO=11, ELSE=12, END=13, FOR=14, GOTO=15, IF=16, INTEGER=17, 
		LABEL=18, OR=19, PROCEDURE=20, REAL=21, REPEAT=22, THEN=23, TO=24, UNTIL=25, 
		WHILE=26, STR=27, CALL=28, READ=29, WRITE=30, NOT=31, TRUE=32, FALSE=33, 
		VAR=34, LEGACY=35, PROGRAM=36, USE=37, DEFAULT=38, STRICT=39, ODD=40, 
		MULTIPLY=41, DIVIDE=42, MODULO=43, DOT=44, ASSIGN=45, COMMA=46, SEMI=47, 
		COLON=48, EQUAL=49, NOT_EQUAL=50, LT=51, LE=52, GE=53, GT=54, LPAREN=55, 
		RPAREN=56, PLUS=57, MINUS=58, LBRACK=59, RBRACK=60, TERNARY_ONE=61, TERNARY_TWO=62, 
		IDENT=63, WS=64;
	public static final int
		RULE_program = 0, RULE_declare_mode = 1, RULE_block = 2, RULE_declaration_part = 3, 
		RULE_procedure_declaration_part = 4, RULE_constant_declaration_part = 5, 
		RULE_label_declaration_part = 6, RULE_variable_declaration_part = 7, RULE_label_list = 8, 
		RULE_identifier_list = 9, RULE_expression_list = 10, RULE_statement_part = 11, 
		RULE_statement = 12, RULE_io_statement = 13, RULE_ternary_statement = 14, 
		RULE_assignment_statement = 15, RULE_goto_statement = 16, RULE_procedure_statement = 17, 
		RULE_compound_statement = 18, RULE_statement_list = 19, RULE_while_do_statement = 20, 
		RULE_do_while_statement = 21, RULE_repeat_statement = 22, RULE_for_statement = 23, 
		RULE_if_statement = 24, RULE_case_statement = 25, RULE_case_limb_list = 26, 
		RULE_case_limb = 27, RULE_case_label_list = 28, RULE_type = 29, RULE_expression = 30, 
		RULE_atom = 31;
	public static final String[] ruleNames = {
		"program", "declare_mode", "block", "declaration_part", "procedure_declaration_part", 
		"constant_declaration_part", "label_declaration_part", "variable_declaration_part", 
		"label_list", "identifier_list", "expression_list", "statement_part", 
		"statement", "io_statement", "ternary_statement", "assignment_statement", 
		"goto_statement", "procedure_statement", "compound_statement", "statement_list", 
		"while_do_statement", "do_while_statement", "repeat_statement", "for_statement", 
		"if_statement", "case_statement", "case_limb_list", "case_limb", "case_label_list", 
		"type", "expression", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'*'", "'/'", "'%'", "'.'", "':='", "','", 
		"';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", 
		"'+'", "'-'", "'['", "']'", "'?'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "INT", "FLOAT", "BEGIN", "AND", "BOOLEAN", "CASE", "CONST", 
		"DO", "OF", "DOWNTO", "ELSE", "END", "FOR", "GOTO", "IF", "INTEGER", "LABEL", 
		"OR", "PROCEDURE", "REAL", "REPEAT", "THEN", "TO", "UNTIL", "WHILE", "STR", 
		"CALL", "READ", "WRITE", "NOT", "TRUE", "FALSE", "VAR", "LEGACY", "PROGRAM", 
		"USE", "DEFAULT", "STRICT", "ODD", "MULTIPLY", "DIVIDE", "MODULO", "DOT", 
		"ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", 
		"GE", "GT", "LPAREN", "RPAREN", "PLUS", "MINUS", "LBRACK", "RBRACK", "TERNARY_ONE", 
		"TERNARY_TWO", "IDENT", "WS"
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
	public String getGrammarFileName() { return "Pascal0Like.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Pascal0LikeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(Pascal0LikeParser.PROGRAM, 0); }
		public TerminalNode LPAREN() { return getToken(Pascal0LikeParser.LPAREN, 0); }
		public TerminalNode IDENT() { return getToken(Pascal0LikeParser.IDENT, 0); }
		public TerminalNode RPAREN() { return getToken(Pascal0LikeParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Pascal0LikeParser.DOT, 0); }
		public Declare_modeContext declare_mode() {
			return getRuleContext(Declare_modeContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(64);
			match(PROGRAM);
			setState(65);
			match(LPAREN);
			setState(66);
			match(IDENT);
			setState(67);
			match(RPAREN);
			setState(68);
			match(SEMI);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USE) {
				{
				setState(69);
				declare_mode();
				}
			}

			setState(72);
			block();
			setState(73);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_modeContext extends ParserRuleContext {
		public Declare_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_mode; }
	 
		public Declare_modeContext() { }
		public void copyFrom(Declare_modeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LegacyModeContext extends Declare_modeContext {
		public TerminalNode USE() { return getToken(Pascal0LikeParser.USE, 0); }
		public TerminalNode LEGACY() { return getToken(Pascal0LikeParser.LEGACY, 0); }
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public LegacyModeContext(Declare_modeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterLegacyMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitLegacyMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitLegacyMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefaultModeContext extends Declare_modeContext {
		public TerminalNode USE() { return getToken(Pascal0LikeParser.USE, 0); }
		public TerminalNode DEFAULT() { return getToken(Pascal0LikeParser.DEFAULT, 0); }
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public DefaultModeContext(Declare_modeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterDefaultMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitDefaultMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitDefaultMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrictModeContext extends Declare_modeContext {
		public TerminalNode USE() { return getToken(Pascal0LikeParser.USE, 0); }
		public TerminalNode STRICT() { return getToken(Pascal0LikeParser.STRICT, 0); }
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public StrictModeContext(Declare_modeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterStrictMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitStrictMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitStrictMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_modeContext declare_mode() throws RecognitionException {
		Declare_modeContext _localctx = new Declare_modeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declare_mode);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new LegacyModeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(USE);
				setState(76);
				match(LEGACY);
				setState(77);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new DefaultModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(USE);
				setState(79);
				match(DEFAULT);
				setState(80);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new StrictModeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(USE);
				setState(82);
				match(STRICT);
				setState(83);
				match(SEMI);
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

	public static class BlockContext extends ParserRuleContext {
		public Declaration_partContext declaration_part() {
			return getRuleContext(Declaration_partContext.class,0);
		}
		public Statement_partContext statement_part() {
			return getRuleContext(Statement_partContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			declaration_part();
			setState(87);
			statement_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_partContext extends ParserRuleContext {
		public List<Label_declaration_partContext> label_declaration_part() {
			return getRuleContexts(Label_declaration_partContext.class);
		}
		public Label_declaration_partContext label_declaration_part(int i) {
			return getRuleContext(Label_declaration_partContext.class,i);
		}
		public List<Constant_declaration_partContext> constant_declaration_part() {
			return getRuleContexts(Constant_declaration_partContext.class);
		}
		public Constant_declaration_partContext constant_declaration_part(int i) {
			return getRuleContext(Constant_declaration_partContext.class,i);
		}
		public List<Variable_declaration_partContext> variable_declaration_part() {
			return getRuleContexts(Variable_declaration_partContext.class);
		}
		public Variable_declaration_partContext variable_declaration_part(int i) {
			return getRuleContext(Variable_declaration_partContext.class,i);
		}
		public List<Procedure_declaration_partContext> procedure_declaration_part() {
			return getRuleContexts(Procedure_declaration_partContext.class);
		}
		public Procedure_declaration_partContext procedure_declaration_part(int i) {
			return getRuleContext(Procedure_declaration_partContext.class,i);
		}
		public Declaration_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterDeclaration_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitDeclaration_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitDeclaration_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_partContext declaration_part() throws RecognitionException {
		Declaration_partContext _localctx = new Declaration_partContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CONST) | (1L << INTEGER) | (1L << LABEL) | (1L << PROCEDURE) | (1L << REAL) | (1L << STR) | (1L << VAR))) != 0)) {
				{
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(89);
					label_declaration_part();
					}
					break;
				case CONST:
					{
					setState(90);
					constant_declaration_part();
					}
					break;
				case BOOLEAN:
				case INTEGER:
				case REAL:
				case STR:
				case VAR:
					{
					setState(91);
					variable_declaration_part();
					}
					break;
				case PROCEDURE:
					{
					setState(92);
					procedure_declaration_part();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97);
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

	public static class Procedure_declaration_partContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(Pascal0LikeParser.PROCEDURE, 0); }
		public TerminalNode IDENT() { return getToken(Pascal0LikeParser.IDENT, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Pascal0LikeParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Pascal0LikeParser.SEMI, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Procedure_declaration_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_declaration_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterProcedure_declaration_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitProcedure_declaration_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitProcedure_declaration_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_declaration_partContext procedure_declaration_part() throws RecognitionException {
		Procedure_declaration_partContext _localctx = new Procedure_declaration_partContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedure_declaration_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PROCEDURE);
			setState(99);
			match(IDENT);
			setState(100);
			match(SEMI);
			setState(101);
			block();
			setState(102);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declaration_partContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(Pascal0LikeParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Pascal0LikeParser.ASSIGN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public Constant_declaration_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterConstant_declaration_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitConstant_declaration_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitConstant_declaration_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declaration_partContext constant_declaration_part() throws RecognitionException {
		Constant_declaration_partContext _localctx = new Constant_declaration_partContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constant_declaration_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(CONST);
			setState(105);
			type();
			setState(106);
			identifier_list();
			setState(107);
			match(ASSIGN);
			setState(108);
			atom();
			setState(109);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_declaration_partContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(Pascal0LikeParser.LABEL, 0); }
		public Label_listContext label_list() {
			return getRuleContext(Label_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public Label_declaration_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_declaration_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterLabel_declaration_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitLabel_declaration_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitLabel_declaration_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_declaration_partContext label_declaration_part() throws RecognitionException {
		Label_declaration_partContext _localctx = new Label_declaration_partContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label_declaration_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LABEL);
			setState(112);
			label_list();
			setState(113);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaration_partContext extends ParserRuleContext {
		public Variable_declaration_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_part; }
	 
		public Variable_declaration_partContext() { }
		public void copyFrom(Variable_declaration_partContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarParallelContext extends Variable_declaration_partContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Pascal0LikeParser.ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(Pascal0LikeParser.LBRACK, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Pascal0LikeParser.RBRACK, 0); }
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public VarParallelContext(Variable_declaration_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterVarParallel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitVarParallel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitVarParallel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarSimpleUnAsContext extends Variable_declaration_partContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public VarSimpleUnAsContext(Variable_declaration_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterVarSimpleUnAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitVarSimpleUnAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitVarSimpleUnAs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarSimpleAsContext extends Variable_declaration_partContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Pascal0LikeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public VarSimpleAsContext(Variable_declaration_partContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterVarSimpleAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitVarSimpleAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitVarSimpleAs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_partContext variable_declaration_part() throws RecognitionException {
		Variable_declaration_partContext _localctx = new Variable_declaration_partContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_declaration_part);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VarSimpleAsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				type();
				setState(116);
				identifier_list();
				setState(117);
				match(ASSIGN);
				setState(118);
				expression(0);
				setState(119);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new VarSimpleUnAsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				type();
				setState(122);
				identifier_list();
				setState(123);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new VarParallelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				type();
				setState(126);
				identifier_list();
				setState(127);
				match(ASSIGN);
				setState(128);
				match(LBRACK);
				setState(129);
				expression_list();
				setState(130);
				match(RBRACK);
				setState(131);
				match(SEMI);
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

	public static class Label_listContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(Pascal0LikeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(Pascal0LikeParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Pascal0LikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Pascal0LikeParser.COMMA, i);
		}
		public Label_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterLabel_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitLabel_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitLabel_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_listContext label_list() throws RecognitionException {
		Label_listContext _localctx = new Label_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_label_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(INT);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				match(INT);
				}
				}
				setState(142);
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

	public static class Identifier_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(Pascal0LikeParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Pascal0LikeParser.IDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Pascal0LikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Pascal0LikeParser.COMMA, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IDENT);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				match(IDENT);
				}
				}
				setState(150);
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Pascal0LikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Pascal0LikeParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			expression(0);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(152);
				match(COMMA);
				setState(153);
				expression(0);
				}
				}
				setState(158);
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

	public static class Statement_partContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(Pascal0LikeParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(Pascal0LikeParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterStatement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitStatement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitStatement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_partContext statement_part() throws RecognitionException {
		Statement_partContext _localctx = new Statement_partContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(BEGIN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BEGIN) | (1L << CASE) | (1L << DO) | (1L << FOR) | (1L << GOTO) | (1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << CALL) | (1L << READ) | (1L << WRITE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(160);
				statement();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(END);
			}
		}
		catch (RecognitionException re) {
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonlabelledContext extends StatementContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public While_do_statementContext while_do_statement() {
			return getRuleContext(While_do_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public Repeat_statementContext repeat_statement() {
			return getRuleContext(Repeat_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Procedure_statementContext procedure_statement() {
			return getRuleContext(Procedure_statementContext.class,0);
		}
		public Goto_statementContext goto_statement() {
			return getRuleContext(Goto_statementContext.class,0);
		}
		public Ternary_statementContext ternary_statement() {
			return getRuleContext(Ternary_statementContext.class,0);
		}
		public Io_statementContext io_statement() {
			return getRuleContext(Io_statementContext.class,0);
		}
		public NonlabelledContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterNonlabelled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitNonlabelled(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitNonlabelled(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelledContext extends StatementContext {
		public TerminalNode INT() { return getToken(Pascal0LikeParser.INT, 0); }
		public TerminalNode COLON() { return getToken(Pascal0LikeParser.COLON, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public While_do_statementContext while_do_statement() {
			return getRuleContext(While_do_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public Repeat_statementContext repeat_statement() {
			return getRuleContext(Repeat_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Procedure_statementContext procedure_statement() {
			return getRuleContext(Procedure_statementContext.class,0);
		}
		public Goto_statementContext goto_statement() {
			return getRuleContext(Goto_statementContext.class,0);
		}
		public Ternary_statementContext ternary_statement() {
			return getRuleContext(Ternary_statementContext.class,0);
		}
		public Io_statementContext io_statement() {
			return getRuleContext(Io_statementContext.class,0);
		}
		public LabelledContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterLabelled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitLabelled(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitLabelled(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new LabelledContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(INT);
				setState(169);
				match(COLON);
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(170);
					compound_statement();
					}
					break;
				case 2:
					{
					setState(171);
					while_do_statement();
					}
					break;
				case 3:
					{
					setState(172);
					do_while_statement();
					}
					break;
				case 4:
					{
					setState(173);
					repeat_statement();
					}
					break;
				case 5:
					{
					setState(174);
					for_statement();
					}
					break;
				case 6:
					{
					setState(175);
					if_statement();
					}
					break;
				case 7:
					{
					setState(176);
					case_statement();
					}
					break;
				case 8:
					{
					setState(177);
					assignment_statement();
					}
					break;
				case 9:
					{
					setState(178);
					procedure_statement();
					}
					break;
				case 10:
					{
					setState(179);
					goto_statement();
					}
					break;
				case 11:
					{
					setState(180);
					ternary_statement();
					}
					break;
				case 12:
					{
					setState(181);
					io_statement();
					}
					break;
				}
				}
				break;
			case BEGIN:
			case CASE:
			case DO:
			case FOR:
			case GOTO:
			case IF:
			case REPEAT:
			case WHILE:
			case CALL:
			case READ:
			case WRITE:
			case IDENT:
				_localctx = new NonlabelledContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(184);
					compound_statement();
					}
					break;
				case 2:
					{
					setState(185);
					while_do_statement();
					}
					break;
				case 3:
					{
					setState(186);
					do_while_statement();
					}
					break;
				case 4:
					{
					setState(187);
					repeat_statement();
					}
					break;
				case 5:
					{
					setState(188);
					for_statement();
					}
					break;
				case 6:
					{
					setState(189);
					if_statement();
					}
					break;
				case 7:
					{
					setState(190);
					case_statement();
					}
					break;
				case 8:
					{
					setState(191);
					assignment_statement();
					}
					break;
				case 9:
					{
					setState(192);
					procedure_statement();
					}
					break;
				case 10:
					{
					setState(193);
					goto_statement();
					}
					break;
				case 11:
					{
					setState(194);
					ternary_statement();
					}
					break;
				case 12:
					{
					setState(195);
					io_statement();
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

	public static class Io_statementContext extends ParserRuleContext {
		public Token op;
		public TerminalNode IDENT() { return getToken(Pascal0LikeParser.IDENT, 0); }
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public TerminalNode WRITE() { return getToken(Pascal0LikeParser.WRITE, 0); }
		public TerminalNode READ() { return getToken(Pascal0LikeParser.READ, 0); }
		public Io_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterIo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitIo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitIo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Io_statementContext io_statement() throws RecognitionException {
		Io_statementContext _localctx = new Io_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_io_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((Io_statementContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==READ || _la==WRITE) ) {
				((Io_statementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(201);
			match(IDENT);
			setState(202);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ternary_statementContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Pascal0LikeParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(Pascal0LikeParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TERNARY_ONE() { return getToken(Pascal0LikeParser.TERNARY_ONE, 0); }
		public TerminalNode TERNARY_TWO() { return getToken(Pascal0LikeParser.TERNARY_TWO, 0); }
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public Ternary_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterTernary_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitTernary_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitTernary_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_statementContext ternary_statement() throws RecognitionException {
		Ternary_statementContext _localctx = new Ternary_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ternary_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IDENT);
			setState(205);
			match(ASSIGN);
			setState(206);
			expression(0);
			setState(207);
			match(TERNARY_ONE);
			setState(208);
			expression(0);
			setState(209);
			match(TERNARY_TWO);
			setState(210);
			expression(0);
			setState(211);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Pascal0LikeParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(Pascal0LikeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(IDENT);
			setState(214);
			match(ASSIGN);
			setState(215);
			expression(0);
			setState(216);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Goto_statementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(Pascal0LikeParser.GOTO, 0); }
		public TerminalNode INT() { return getToken(Pascal0LikeParser.INT, 0); }
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public Goto_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterGoto_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitGoto_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitGoto_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goto_statementContext goto_statement() throws RecognitionException {
		Goto_statementContext _localctx = new Goto_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_goto_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(GOTO);
			setState(219);
			match(INT);
			setState(220);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_statementContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(Pascal0LikeParser.CALL, 0); }
		public TerminalNode IDENT() { return getToken(Pascal0LikeParser.IDENT, 0); }
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public Procedure_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterProcedure_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitProcedure_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitProcedure_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_statementContext procedure_statement() throws RecognitionException {
		Procedure_statementContext _localctx = new Procedure_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_procedure_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(CALL);
			setState(223);
			match(IDENT);
			setState(224);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(Pascal0LikeParser.BEGIN, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode END() { return getToken(Pascal0LikeParser.END, 0); }
		public TerminalNode SEMI() { return getToken(Pascal0LikeParser.SEMI, 0); }
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(BEGIN);
			setState(227);
			statement_list();
			setState(228);
			match(END);
			setState(229);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(231);
				statement();
				}
				break;
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BEGIN) | (1L << CASE) | (1L << DO) | (1L << FOR) | (1L << GOTO) | (1L << IF) | (1L << REPEAT) | (1L << WHILE) | (1L << CALL) | (1L << READ) | (1L << WRITE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(234);
				statement();
				}
				}
				setState(239);
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

	public static class While_do_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Pascal0LikeParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(Pascal0LikeParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterWhile_do_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitWhile_do_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitWhile_do_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_do_statementContext while_do_statement() throws RecognitionException {
		While_do_statementContext _localctx = new While_do_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(WHILE);
			setState(241);
			expression(0);
			setState(242);
			match(DO);
			setState(243);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(Pascal0LikeParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Pascal0LikeParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitDo_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(DO);
			setState(246);
			statement();
			setState(247);
			match(WHILE);
			setState(248);
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

	public static class Repeat_statementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(Pascal0LikeParser.REPEAT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(Pascal0LikeParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repeat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterRepeat_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitRepeat_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitRepeat_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_statementContext repeat_statement() throws RecognitionException {
		Repeat_statementContext _localctx = new Repeat_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_repeat_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(REPEAT);
			setState(251);
			statement();
			setState(252);
			match(UNTIL);
			setState(253);
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

	public static class For_statementContext extends ParserRuleContext {
		public Token op;
		public TerminalNode FOR() { return getToken(Pascal0LikeParser.FOR, 0); }
		public TerminalNode IDENT() { return getToken(Pascal0LikeParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(Pascal0LikeParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DO() { return getToken(Pascal0LikeParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TO() { return getToken(Pascal0LikeParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(Pascal0LikeParser.DOWNTO, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(FOR);
			setState(256);
			match(IDENT);
			setState(257);
			match(ASSIGN);
			setState(258);
			expression(0);
			setState(259);
			((For_statementContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
				((For_statementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(260);
			expression(0);
			setState(261);
			match(DO);
			setState(262);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Pascal0LikeParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> THEN() { return getTokens(Pascal0LikeParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(Pascal0LikeParser.THEN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Pascal0LikeParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(IF);
			setState(265);
			expression(0);
			setState(266);
			match(THEN);
			setState(267);
			statement();
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(268);
				match(ELSE);
				setState(269);
				match(THEN);
				setState(270);
				statement();
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

	public static class Case_statementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Pascal0LikeParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(Pascal0LikeParser.OF, 0); }
		public Case_limb_listContext case_limb_list() {
			return getRuleContext(Case_limb_listContext.class,0);
		}
		public TerminalNode END() { return getToken(Pascal0LikeParser.END, 0); }
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitCase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitCase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_case_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(CASE);
			setState(274);
			expression(0);
			setState(275);
			match(OF);
			setState(276);
			case_limb_list();
			setState(277);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_limb_listContext extends ParserRuleContext {
		public List<Case_limbContext> case_limb() {
			return getRuleContexts(Case_limbContext.class);
		}
		public Case_limbContext case_limb(int i) {
			return getRuleContext(Case_limbContext.class,i);
		}
		public Case_limb_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_limb_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterCase_limb_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitCase_limb_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitCase_limb_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_limb_listContext case_limb_list() throws RecognitionException {
		Case_limb_listContext _localctx = new Case_limb_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_case_limb_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				case_limb();
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << FLOAT) | (1L << TRUE) | (1L << FALSE) | (1L << IDENT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_limbContext extends ParserRuleContext {
		public Case_label_listContext case_label_list() {
			return getRuleContext(Case_label_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Pascal0LikeParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Case_limbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_limb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterCase_limb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitCase_limb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitCase_limb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_limbContext case_limb() throws RecognitionException {
		Case_limbContext _localctx = new Case_limbContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_case_limb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			case_label_list();
			setState(285);
			match(COLON);
			setState(286);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_label_listContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Pascal0LikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Pascal0LikeParser.COMMA, i);
		}
		public Case_label_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterCase_label_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitCase_label_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitCase_label_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_label_listContext case_label_list() throws RecognitionException {
		Case_label_listContext _localctx = new Case_label_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_case_label_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			atom();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289);
				match(COMMA);
				setState(290);
				atom();
				}
				}
				setState(295);
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

	public static class TypeContext extends ParserRuleContext {
		public Token op;
		public TerminalNode STR() { return getToken(Pascal0LikeParser.STR, 0); }
		public TerminalNode REAL() { return getToken(Pascal0LikeParser.REAL, 0); }
		public TerminalNode INTEGER() { return getToken(Pascal0LikeParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(Pascal0LikeParser.BOOLEAN, 0); }
		public TerminalNode VAR() { return getToken(Pascal0LikeParser.VAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((TypeContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << REAL) | (1L << STR) | (1L << VAR))) != 0)) ) {
				((TypeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
	public static class ParExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(Pascal0LikeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Pascal0LikeParser.RPAREN, 0); }
		public ParExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(Pascal0LikeParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(Pascal0LikeParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(Pascal0LikeParser.AND, 0); }
		public TerminalNode OR() { return getToken(Pascal0LikeParser.OR, 0); }
		public LogicExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(Pascal0LikeParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(Pascal0LikeParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(Pascal0LikeParser.MODULO, 0); }
		public MultiplicationExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(Pascal0LikeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Pascal0LikeParser.MINUS, 0); }
		public AdditiveExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(Pascal0LikeParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(Pascal0LikeParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(Pascal0LikeParser.LT, 0); }
		public TerminalNode LE() { return getToken(Pascal0LikeParser.LE, 0); }
		public TerminalNode GT() { return getToken(Pascal0LikeParser.GT, 0); }
		public TerminalNode GE() { return getToken(Pascal0LikeParser.GE, 0); }
		public RelationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OddExprContext extends ExpressionContext {
		public TerminalNode ODD() { return getToken(Pascal0LikeParser.ODD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OddExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterOddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitOddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitOddExpr(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(299);
				match(MINUS);
				setState(300);
				expression(9);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(NOT);
				setState(302);
				expression(8);
				}
				break;
			case ODD:
				{
				_localctx = new OddExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(ODD);
				setState(304);
				expression(7);
				}
				break;
			case STRING:
			case INT:
			case FLOAT:
			case TRUE:
			case FALSE:
			case IDENT:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				atom();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(LPAREN);
				setState(307);
				expression(0);
				setState(308);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(313);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(314);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(316);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(317);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(319);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new LogicExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(322);
						((LogicExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public Token op;
		public TerminalNode TRUE() { return getToken(Pascal0LikeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Pascal0LikeParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode IDENT() { return getToken(Pascal0LikeParser.IDENT, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(Pascal0LikeParser.INT, 0); }
		public IntAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterIntAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitIntAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(Pascal0LikeParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealAtomContext extends AtomContext {
		public TerminalNode FLOAT() { return getToken(Pascal0LikeParser.FLOAT, 0); }
		public RealAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).enterRealAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pascal0LikeListener ) ((Pascal0LikeListener)listener).exitRealAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pascal0LikeVisitor ) return ((Pascal0LikeVisitor<? extends T>)visitor).visitRealAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atom);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new RealAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(FLOAT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				((BooleanAtomContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BooleanAtomContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IDENT:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(IDENT);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				match(STRING);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0153\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\5\2I\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5"+
		"c\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\13"+
		"\3\13\3\13\7\13\u0095\n\13\f\13\16\13\u0098\13\13\3\f\3\f\3\f\7\f\u009d"+
		"\n\f\f\f\16\f\u00a0\13\f\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00b9\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00c7\n\16\5\16\u00c9\n\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\5\25\u00eb"+
		"\n\25\3\25\7\25\u00ee\n\25\f\25\16\25\u00f1\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0112\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\6\34\u011b\n\34\r\34\16"+
		"\34\u011c\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u0126\n\36\f\36\16\36"+
		"\u0129\13\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0139\n"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0147\n \f \16 \u014a\13 \3!"+
		"\3!\3!\3!\3!\5!\u0151\n!\3!\2\3>\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@\2\n\3\2\37 \4\2\r\r\32\32\7\2\b\b\23\23"+
		"\27\27\35\35$$\3\2+-\3\2;<\3\2\638\4\2\7\7\25\25\3\2\"#\2\u0167\2B\3\2"+
		"\2\2\4V\3\2\2\2\6X\3\2\2\2\ba\3\2\2\2\nd\3\2\2\2\fj\3\2\2\2\16q\3\2\2"+
		"\2\20\u0087\3\2\2\2\22\u0089\3\2\2\2\24\u0091\3\2\2\2\26\u0099\3\2\2\2"+
		"\30\u00a1\3\2\2\2\32\u00c8\3\2\2\2\34\u00ca\3\2\2\2\36\u00ce\3\2\2\2 "+
		"\u00d7\3\2\2\2\"\u00dc\3\2\2\2$\u00e0\3\2\2\2&\u00e4\3\2\2\2(\u00ea\3"+
		"\2\2\2*\u00f2\3\2\2\2,\u00f7\3\2\2\2.\u00fc\3\2\2\2\60\u0101\3\2\2\2\62"+
		"\u010a\3\2\2\2\64\u0113\3\2\2\2\66\u011a\3\2\2\28\u011e\3\2\2\2:\u0122"+
		"\3\2\2\2<\u012a\3\2\2\2>\u0138\3\2\2\2@\u0150\3\2\2\2BC\7&\2\2CD\79\2"+
		"\2DE\7A\2\2EF\7:\2\2FH\7\61\2\2GI\5\4\3\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2"+
		"\2JK\5\6\4\2KL\7.\2\2L\3\3\2\2\2MN\7\'\2\2NO\7%\2\2OW\7\61\2\2PQ\7\'\2"+
		"\2QR\7(\2\2RW\7\61\2\2ST\7\'\2\2TU\7)\2\2UW\7\61\2\2VM\3\2\2\2VP\3\2\2"+
		"\2VS\3\2\2\2W\5\3\2\2\2XY\5\b\5\2YZ\5\30\r\2Z\7\3\2\2\2[`\5\16\b\2\\`"+
		"\5\f\7\2]`\5\20\t\2^`\5\n\6\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2"+
		"`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\t\3\2\2\2ca\3\2\2\2de\7\26\2\2ef\7A\2"+
		"\2fg\7\61\2\2gh\5\6\4\2hi\7\61\2\2i\13\3\2\2\2jk\7\n\2\2kl\5<\37\2lm\5"+
		"\24\13\2mn\7/\2\2no\5@!\2op\7\61\2\2p\r\3\2\2\2qr\7\24\2\2rs\5\22\n\2"+
		"st\7\61\2\2t\17\3\2\2\2uv\5<\37\2vw\5\24\13\2wx\7/\2\2xy\5> \2yz\7\61"+
		"\2\2z\u0088\3\2\2\2{|\5<\37\2|}\5\24\13\2}~\7\61\2\2~\u0088\3\2\2\2\177"+
		"\u0080\5<\37\2\u0080\u0081\5\24\13\2\u0081\u0082\7/\2\2\u0082\u0083\7"+
		"=\2\2\u0083\u0084\5\26\f\2\u0084\u0085\7>\2\2\u0085\u0086\7\61\2\2\u0086"+
		"\u0088\3\2\2\2\u0087u\3\2\2\2\u0087{\3\2\2\2\u0087\177\3\2\2\2\u0088\21"+
		"\3\2\2\2\u0089\u008e\7\4\2\2\u008a\u008b\7\60\2\2\u008b\u008d\7\4\2\2"+
		"\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\23\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096\7A\2\2\u0092"+
		"\u0093\7\60\2\2\u0093\u0095\7A\2\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\25\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009e\5> \2\u009a\u009b\7\60\2\2\u009b\u009d\5> \2\u009c"+
		"\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\27\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a5\7\6\2\2\u00a2\u00a4"+
		"\5\32\16\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9"+
		"\7\17\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00b8\7\62\2\2\u00ac"+
		"\u00b9\5&\24\2\u00ad\u00b9\5*\26\2\u00ae\u00b9\5,\27\2\u00af\u00b9\5."+
		"\30\2\u00b0\u00b9\5\60\31\2\u00b1\u00b9\5\62\32\2\u00b2\u00b9\5\64\33"+
		"\2\u00b3\u00b9\5 \21\2\u00b4\u00b9\5$\23\2\u00b5\u00b9\5\"\22\2\u00b6"+
		"\u00b9\5\36\20\2\u00b7\u00b9\5\34\17\2\u00b8\u00ac\3\2\2\2\u00b8\u00ad"+
		"\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8"+
		"\u00b1\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2"+
		"\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00c9\3\2\2\2\u00ba\u00c7\5&\24\2\u00bb\u00c7\5*\26\2\u00bc\u00c7\5,"+
		"\27\2\u00bd\u00c7\5.\30\2\u00be\u00c7\5\60\31\2\u00bf\u00c7\5\62\32\2"+
		"\u00c0\u00c7\5\64\33\2\u00c1\u00c7\5 \21\2\u00c2\u00c7\5$\23\2\u00c3\u00c7"+
		"\5\"\22\2\u00c4\u00c7\5\36\20\2\u00c5\u00c7\5\34\17\2\u00c6\u00ba\3\2"+
		"\2\2\u00c6\u00bb\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00bd\3\2\2\2\u00c6"+
		"\u00be\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2"+
		"\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00aa\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\33\3\2\2\2\u00ca\u00cb\t\2\2\2\u00cb\u00cc\7A\2\2\u00cc\u00cd"+
		"\7\61\2\2\u00cd\35\3\2\2\2\u00ce\u00cf\7A\2\2\u00cf\u00d0\7/\2\2\u00d0"+
		"\u00d1\5> \2\u00d1\u00d2\7?\2\2\u00d2\u00d3\5> \2\u00d3\u00d4\7@\2\2\u00d4"+
		"\u00d5\5> \2\u00d5\u00d6\7\61\2\2\u00d6\37\3\2\2\2\u00d7\u00d8\7A\2\2"+
		"\u00d8\u00d9\7/\2\2\u00d9\u00da\5> \2\u00da\u00db\7\61\2\2\u00db!\3\2"+
		"\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00de\7\4\2\2\u00de\u00df\7\61\2\2\u00df"+
		"#\3\2\2\2\u00e0\u00e1\7\36\2\2\u00e1\u00e2\7A\2\2\u00e2\u00e3\7\61\2\2"+
		"\u00e3%\3\2\2\2\u00e4\u00e5\7\6\2\2\u00e5\u00e6\5(\25\2\u00e6\u00e7\7"+
		"\17\2\2\u00e7\u00e8\7\61\2\2\u00e8\'\3\2\2\2\u00e9\u00eb\5\32\16\2\u00ea"+
		"\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\5\32"+
		"\16\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0)\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\34\2\2"+
		"\u00f3\u00f4\5> \2\u00f4\u00f5\7\13\2\2\u00f5\u00f6\5\32\16\2\u00f6+\3"+
		"\2\2\2\u00f7\u00f8\7\13\2\2\u00f8\u00f9\5\32\16\2\u00f9\u00fa\7\34\2\2"+
		"\u00fa\u00fb\5> \2\u00fb-\3\2\2\2\u00fc\u00fd\7\30\2\2\u00fd\u00fe\5\32"+
		"\16\2\u00fe\u00ff\7\33\2\2\u00ff\u0100\5> \2\u0100/\3\2\2\2\u0101\u0102"+
		"\7\20\2\2\u0102\u0103\7A\2\2\u0103\u0104\7/\2\2\u0104\u0105\5> \2\u0105"+
		"\u0106\t\3\2\2\u0106\u0107\5> \2\u0107\u0108\7\13\2\2\u0108\u0109\5\32"+
		"\16\2\u0109\61\3\2\2\2\u010a\u010b\7\22\2\2\u010b\u010c\5> \2\u010c\u010d"+
		"\7\31\2\2\u010d\u0111\5\32\16\2\u010e\u010f\7\16\2\2\u010f\u0110\7\31"+
		"\2\2\u0110\u0112\5\32\16\2\u0111\u010e\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\63\3\2\2\2\u0113\u0114\7\t\2\2\u0114\u0115\5> \2\u0115\u0116\7\f\2\2"+
		"\u0116\u0117\5\66\34\2\u0117\u0118\7\17\2\2\u0118\65\3\2\2\2\u0119\u011b"+
		"\58\35\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\67\3\2\2\2\u011e\u011f\5:\36\2\u011f\u0120\7\62\2"+
		"\2\u0120\u0121\5\32\16\2\u01219\3\2\2\2\u0122\u0127\5@!\2\u0123\u0124"+
		"\7\60\2\2\u0124\u0126\5@!\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128;\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u012a\u012b\t\4\2\2\u012b=\3\2\2\2\u012c\u012d\b \1\2\u012d\u012e\7<"+
		"\2\2\u012e\u0139\5> \13\u012f\u0130\7!\2\2\u0130\u0139\5> \n\u0131\u0132"+
		"\7*\2\2\u0132\u0139\5> \t\u0133\u0139\5@!\2\u0134\u0135\79\2\2\u0135\u0136"+
		"\5> \2\u0136\u0137\7:\2\2\u0137\u0139\3\2\2\2\u0138\u012c\3\2\2\2\u0138"+
		"\u012f\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0133\3\2\2\2\u0138\u0134\3\2"+
		"\2\2\u0139\u0148\3\2\2\2\u013a\u013b\f\b\2\2\u013b\u013c\t\5\2\2\u013c"+
		"\u0147\5> \t\u013d\u013e\f\7\2\2\u013e\u013f\t\6\2\2\u013f\u0147\5> \b"+
		"\u0140\u0141\f\6\2\2\u0141\u0142\t\7\2\2\u0142\u0147\5> \7\u0143\u0144"+
		"\f\5\2\2\u0144\u0145\t\b\2\2\u0145\u0147\5> \6\u0146\u013a\3\2\2\2\u0146"+
		"\u013d\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149?\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u0151\7\4\2\2\u014c\u0151\7\5\2\2\u014d\u0151\t\t\2\2\u014e"+
		"\u0151\7A\2\2\u014f\u0151\7\3\2\2\u0150\u014b\3\2\2\2\u0150\u014c\3\2"+
		"\2\2\u0150\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"A\3\2\2\2\27HV_a\u0087\u008e\u0096\u009e\u00a5\u00b8\u00c6\u00c8\u00ea"+
		"\u00ef\u0111\u011c\u0127\u0138\u0146\u0148\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}