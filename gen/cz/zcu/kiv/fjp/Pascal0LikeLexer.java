// Generated from C:/Users/Jakub/IdeaProjects/heine-fluch/src/cz/zcu/kiv/fjp\Pascal0Like.g4 by ANTLR 4.7
package cz.zcu.kiv.fjp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pascal0LikeLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"STRING", "INT", "FLOAT", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
		"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
		"X", "Y", "Z", "BEGIN", "AND", "BOOLEAN", "CASE", "CONST", "DO", "OF", 
		"DOWNTO", "ELSE", "END", "FOR", "GOTO", "IF", "INTEGER", "LABEL", "OR", 
		"PROCEDURE", "REAL", "REPEAT", "THEN", "TO", "UNTIL", "WHILE", "STR", 
		"CALL", "READ", "WRITE", "NOT", "TRUE", "FALSE", "VAR", "LEGACY", "PROGRAM", 
		"USE", "DEFAULT", "STRICT", "ODD", "MULTIPLY", "DIVIDE", "MODULO", "DOT", 
		"ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", 
		"GE", "GT", "LPAREN", "RPAREN", "PLUS", "MINUS", "LBRACK", "RBRACK", "TERNARY_ONE", 
		"TERNARY_TWO", "IDENT", "WS"
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


	public Pascal0LikeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascal0Like.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u0214\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\2\7\2\u00bc\n"+
		"\2\f\2\16\2\u00bf\13\2\3\2\3\2\3\3\6\3\u00c4\n\3\r\3\16\3\u00c5\3\4\6"+
		"\4\u00c9\n\4\r\4\16\4\u00ca\3\4\3\4\7\4\u00cf\n\4\f\4\16\4\u00d2\13\4"+
		"\3\4\3\4\6\4\u00d6\n\4\r\4\16\4\u00d7\5\4\u00da\n\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3."+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\3"+
		"9\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3"+
		">\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3"+
		"H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3R\3"+
		"R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\7Z\u020c\nZ\fZ\16Z\u020f"+
		"\13Z\3[\3[\3[\3[\2\2\\\3\3\5\4\7\5\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2"+
		";\2=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a"+
		"\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085"+
		"*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097"+
		"\63\u0099\64\u009b\65\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9"+
		"<\u00ab=\u00ad>\u00af?\u00b1@\u00b3A\u00b5B\3\2!\3\2))\3\2\62;\4\2CCc"+
		"c\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C"+
		"\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0201\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\3\u00b7\3\2\2\2\5\u00c3"+
		"\3\2\2\2\7\u00d9\3\2\2\2\t\u00db\3\2\2\2\13\u00dd\3\2\2\2\r\u00df\3\2"+
		"\2\2\17\u00e1\3\2\2\2\21\u00e3\3\2\2\2\23\u00e5\3\2\2\2\25\u00e7\3\2\2"+
		"\2\27\u00e9\3\2\2\2\31\u00eb\3\2\2\2\33\u00ed\3\2\2\2\35\u00ef\3\2\2\2"+
		"\37\u00f1\3\2\2\2!\u00f3\3\2\2\2#\u00f5\3\2\2\2%\u00f7\3\2\2\2\'\u00f9"+
		"\3\2\2\2)\u00fb\3\2\2\2+\u00fd\3\2\2\2-\u00ff\3\2\2\2/\u0101\3\2\2\2\61"+
		"\u0103\3\2\2\2\63\u0105\3\2\2\2\65\u0107\3\2\2\2\67\u0109\3\2\2\29\u010b"+
		"\3\2\2\2;\u010d\3\2\2\2=\u010f\3\2\2\2?\u0115\3\2\2\2A\u0119\3\2\2\2C"+
		"\u0121\3\2\2\2E\u0126\3\2\2\2G\u012c\3\2\2\2I\u012f\3\2\2\2K\u0132\3\2"+
		"\2\2M\u0139\3\2\2\2O\u013e\3\2\2\2Q\u0142\3\2\2\2S\u0146\3\2\2\2U\u014b"+
		"\3\2\2\2W\u014e\3\2\2\2Y\u0156\3\2\2\2[\u015c\3\2\2\2]\u015f\3\2\2\2_"+
		"\u0169\3\2\2\2a\u016e\3\2\2\2c\u0175\3\2\2\2e\u017a\3\2\2\2g\u017d\3\2"+
		"\2\2i\u0183\3\2\2\2k\u0189\3\2\2\2m\u0190\3\2\2\2o\u0195\3\2\2\2q\u019a"+
		"\3\2\2\2s\u01a0\3\2\2\2u\u01a4\3\2\2\2w\u01a9\3\2\2\2y\u01af\3\2\2\2{"+
		"\u01b3\3\2\2\2}\u01ba\3\2\2\2\177\u01c2\3\2\2\2\u0081\u01c6\3\2\2\2\u0083"+
		"\u01ce\3\2\2\2\u0085\u01d5\3\2\2\2\u0087\u01d9\3\2\2\2\u0089\u01db\3\2"+
		"\2\2\u008b\u01dd\3\2\2\2\u008d\u01df\3\2\2\2\u008f\u01e1\3\2\2\2\u0091"+
		"\u01e4\3\2\2\2\u0093\u01e6\3\2\2\2\u0095\u01e8\3\2\2\2\u0097\u01ea\3\2"+
		"\2\2\u0099\u01ec\3\2\2\2\u009b\u01ef\3\2\2\2\u009d\u01f1\3\2\2\2\u009f"+
		"\u01f4\3\2\2\2\u00a1\u01f7\3\2\2\2\u00a3\u01f9\3\2\2\2\u00a5\u01fb\3\2"+
		"\2\2\u00a7\u01fd\3\2\2\2\u00a9\u01ff\3\2\2\2\u00ab\u0201\3\2\2\2\u00ad"+
		"\u0203\3\2\2\2\u00af\u0205\3\2\2\2\u00b1\u0207\3\2\2\2\u00b3\u0209\3\2"+
		"\2\2\u00b5\u0210\3\2\2\2\u00b7\u00bd\7)\2\2\u00b8\u00b9\7)\2\2\u00b9\u00bc"+
		"\7)\2\2\u00ba\u00bc\n\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7)\2\2\u00c1\4\3\2\2\2\u00c2\u00c4"+
		"\t\3\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\6\3\2\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00c7\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00d0\7\60\2\2\u00cd\u00cf\t\3\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00da"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\7\60\2\2\u00d4\u00d6\t\3\2\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00c8\3\2\2\2\u00d9\u00d3\3\2\2\2\u00da"+
		"\b\3\2\2\2\u00db\u00dc\t\4\2\2\u00dc\n\3\2\2\2\u00dd\u00de\t\5\2\2\u00de"+
		"\f\3\2\2\2\u00df\u00e0\t\6\2\2\u00e0\16\3\2\2\2\u00e1\u00e2\t\7\2\2\u00e2"+
		"\20\3\2\2\2\u00e3\u00e4\t\b\2\2\u00e4\22\3\2\2\2\u00e5\u00e6\t\t\2\2\u00e6"+
		"\24\3\2\2\2\u00e7\u00e8\t\n\2\2\u00e8\26\3\2\2\2\u00e9\u00ea\t\13\2\2"+
		"\u00ea\30\3\2\2\2\u00eb\u00ec\t\f\2\2\u00ec\32\3\2\2\2\u00ed\u00ee\t\r"+
		"\2\2\u00ee\34\3\2\2\2\u00ef\u00f0\t\16\2\2\u00f0\36\3\2\2\2\u00f1\u00f2"+
		"\t\17\2\2\u00f2 \3\2\2\2\u00f3\u00f4\t\20\2\2\u00f4\"\3\2\2\2\u00f5\u00f6"+
		"\t\21\2\2\u00f6$\3\2\2\2\u00f7\u00f8\t\22\2\2\u00f8&\3\2\2\2\u00f9\u00fa"+
		"\t\23\2\2\u00fa(\3\2\2\2\u00fb\u00fc\t\24\2\2\u00fc*\3\2\2\2\u00fd\u00fe"+
		"\t\25\2\2\u00fe,\3\2\2\2\u00ff\u0100\t\26\2\2\u0100.\3\2\2\2\u0101\u0102"+
		"\t\27\2\2\u0102\60\3\2\2\2\u0103\u0104\t\30\2\2\u0104\62\3\2\2\2\u0105"+
		"\u0106\t\31\2\2\u0106\64\3\2\2\2\u0107\u0108\t\32\2\2\u0108\66\3\2\2\2"+
		"\u0109\u010a\t\33\2\2\u010a8\3\2\2\2\u010b\u010c\t\34\2\2\u010c:\3\2\2"+
		"\2\u010d\u010e\t\35\2\2\u010e<\3\2\2\2\u010f\u0110\5\13\6\2\u0110\u0111"+
		"\5\21\t\2\u0111\u0112\5\25\13\2\u0112\u0113\5\31\r\2\u0113\u0114\5#\22"+
		"\2\u0114>\3\2\2\2\u0115\u0116\5\t\5\2\u0116\u0117\5#\22\2\u0117\u0118"+
		"\5\17\b\2\u0118@\3\2\2\2\u0119\u011a\5\13\6\2\u011a\u011b\5%\23\2\u011b"+
		"\u011c\5%\23\2\u011c\u011d\5\37\20\2\u011d\u011e\5\21\t\2\u011e\u011f"+
		"\5\t\5\2\u011f\u0120\5#\22\2\u0120B\3\2\2\2\u0121\u0122\5\r\7\2\u0122"+
		"\u0123\5\t\5\2\u0123\u0124\5-\27\2\u0124\u0125\5\21\t\2\u0125D\3\2\2\2"+
		"\u0126\u0127\5\r\7\2\u0127\u0128\5%\23\2\u0128\u0129\5#\22\2\u0129\u012a"+
		"\5-\27\2\u012a\u012b\5/\30\2\u012bF\3\2\2\2\u012c\u012d\5\17\b\2\u012d"+
		"\u012e\5%\23\2\u012eH\3\2\2\2\u012f\u0130\5%\23\2\u0130\u0131\5\23\n\2"+
		"\u0131J\3\2\2\2\u0132\u0133\5\17\b\2\u0133\u0134\5%\23\2\u0134\u0135\5"+
		"\65\33\2\u0135\u0136\5#\22\2\u0136\u0137\5/\30\2\u0137\u0138\5%\23\2\u0138"+
		"L\3\2\2\2\u0139\u013a\5\21\t\2\u013a\u013b\5\37\20\2\u013b\u013c\5-\27"+
		"\2\u013c\u013d\5\21\t\2\u013dN\3\2\2\2\u013e\u013f\5\21\t\2\u013f\u0140"+
		"\5#\22\2\u0140\u0141\5\17\b\2\u0141P\3\2\2\2\u0142\u0143\5\23\n\2\u0143"+
		"\u0144\5%\23\2\u0144\u0145\5+\26\2\u0145R\3\2\2\2\u0146\u0147\5\25\13"+
		"\2\u0147\u0148\5%\23\2\u0148\u0149\5/\30\2\u0149\u014a\5%\23\2\u014aT"+
		"\3\2\2\2\u014b\u014c\5\31\r\2\u014c\u014d\5\23\n\2\u014dV\3\2\2\2\u014e"+
		"\u014f\5\31\r\2\u014f\u0150\5#\22\2\u0150\u0151\5/\30\2\u0151\u0152\5"+
		"\21\t\2\u0152\u0153\5\25\13\2\u0153\u0154\5\21\t\2\u0154\u0155\5+\26\2"+
		"\u0155X\3\2\2\2\u0156\u0157\5\37\20\2\u0157\u0158\5\t\5\2\u0158\u0159"+
		"\5\13\6\2\u0159\u015a\5\21\t\2\u015a\u015b\5\37\20\2\u015bZ\3\2\2\2\u015c"+
		"\u015d\5%\23\2\u015d\u015e\5+\26\2\u015e\\\3\2\2\2\u015f\u0160\5\'\24"+
		"\2\u0160\u0161\5+\26\2\u0161\u0162\5%\23\2\u0162\u0163\5\r\7\2\u0163\u0164"+
		"\5\21\t\2\u0164\u0165\5\17\b\2\u0165\u0166\5\61\31\2\u0166\u0167\5+\26"+
		"\2\u0167\u0168\5\21\t\2\u0168^\3\2\2\2\u0169\u016a\5+\26\2\u016a\u016b"+
		"\5\21\t\2\u016b\u016c\5\t\5\2\u016c\u016d\5\37\20\2\u016d`\3\2\2\2\u016e"+
		"\u016f\5+\26\2\u016f\u0170\5\21\t\2\u0170\u0171\5\'\24\2\u0171\u0172\5"+
		"\21\t\2\u0172\u0173\5\t\5\2\u0173\u0174\5/\30\2\u0174b\3\2\2\2\u0175\u0176"+
		"\5/\30\2\u0176\u0177\5\27\f\2\u0177\u0178\5\21\t\2\u0178\u0179\5#\22\2"+
		"\u0179d\3\2\2\2\u017a\u017b\5/\30\2\u017b\u017c\5%\23\2\u017cf\3\2\2\2"+
		"\u017d\u017e\5\61\31\2\u017e\u017f\5#\22\2\u017f\u0180\5/\30\2\u0180\u0181"+
		"\5\31\r\2\u0181\u0182\5\37\20\2\u0182h\3\2\2\2\u0183\u0184\5\65\33\2\u0184"+
		"\u0185\5\27\f\2\u0185\u0186\5\31\r\2\u0186\u0187\5\37\20\2\u0187\u0188"+
		"\5\21\t\2\u0188j\3\2\2\2\u0189\u018a\5-\27\2\u018a\u018b\5/\30\2\u018b"+
		"\u018c\5+\26\2\u018c\u018d\5\31\r\2\u018d\u018e\5#\22\2\u018e\u018f\5"+
		"\25\13\2\u018fl\3\2\2\2\u0190\u0191\5\r\7\2\u0191\u0192\5\t\5\2\u0192"+
		"\u0193\5\37\20\2\u0193\u0194\5\37\20\2\u0194n\3\2\2\2\u0195\u0196\5+\26"+
		"\2\u0196\u0197\5\21\t\2\u0197\u0198\5\t\5\2\u0198\u0199\5\17\b\2\u0199"+
		"p\3\2\2\2\u019a\u019b\5\65\33\2\u019b\u019c\5+\26\2\u019c\u019d\5\31\r"+
		"\2\u019d\u019e\5/\30\2\u019e\u019f\5\21\t\2\u019fr\3\2\2\2\u01a0\u01a1"+
		"\5#\22\2\u01a1\u01a2\5%\23\2\u01a2\u01a3\5/\30\2\u01a3t\3\2\2\2\u01a4"+
		"\u01a5\5/\30\2\u01a5\u01a6\5+\26\2\u01a6\u01a7\5\61\31\2\u01a7\u01a8\5"+
		"\21\t\2\u01a8v\3\2\2\2\u01a9\u01aa\5\23\n\2\u01aa\u01ab\5\t\5\2\u01ab"+
		"\u01ac\5\37\20\2\u01ac\u01ad\5-\27\2\u01ad\u01ae\5\21\t\2\u01aex\3\2\2"+
		"\2\u01af\u01b0\5\63\32\2\u01b0\u01b1\5\t\5\2\u01b1\u01b2\5+\26\2\u01b2"+
		"z\3\2\2\2\u01b3\u01b4\5\37\20\2\u01b4\u01b5\5\21\t\2\u01b5\u01b6\5\25"+
		"\13\2\u01b6\u01b7\5\t\5\2\u01b7\u01b8\5\r\7\2\u01b8\u01b9\59\35\2\u01b9"+
		"|\3\2\2\2\u01ba\u01bb\5\'\24\2\u01bb\u01bc\5+\26\2\u01bc\u01bd\5%\23\2"+
		"\u01bd\u01be\5\25\13\2\u01be\u01bf\5+\26\2\u01bf\u01c0\5\t\5\2\u01c0\u01c1"+
		"\5!\21\2\u01c1~\3\2\2\2\u01c2\u01c3\5\61\31\2\u01c3\u01c4\5-\27\2\u01c4"+
		"\u01c5\5\21\t\2\u01c5\u0080\3\2\2\2\u01c6\u01c7\5\17\b\2\u01c7\u01c8\5"+
		"\21\t\2\u01c8\u01c9\5\23\n\2\u01c9\u01ca\5\t\5\2\u01ca\u01cb\5\61\31\2"+
		"\u01cb\u01cc\5\37\20\2\u01cc\u01cd\5/\30\2\u01cd\u0082\3\2\2\2\u01ce\u01cf"+
		"\5-\27\2\u01cf\u01d0\5/\30\2\u01d0\u01d1\5+\26\2\u01d1\u01d2\5\31\r\2"+
		"\u01d2\u01d3\5\r\7\2\u01d3\u01d4\5/\30\2\u01d4\u0084\3\2\2\2\u01d5\u01d6"+
		"\5%\23\2\u01d6\u01d7\5\17\b\2\u01d7\u01d8\5\17\b\2\u01d8\u0086\3\2\2\2"+
		"\u01d9\u01da\7,\2\2\u01da\u0088\3\2\2\2\u01db\u01dc\7\61\2\2\u01dc\u008a"+
		"\3\2\2\2\u01dd\u01de\7\'\2\2\u01de\u008c\3\2\2\2\u01df\u01e0\7\60\2\2"+
		"\u01e0\u008e\3\2\2\2\u01e1\u01e2\7<\2\2\u01e2\u01e3\7?\2\2\u01e3\u0090"+
		"\3\2\2\2\u01e4\u01e5\7.\2\2\u01e5\u0092\3\2\2\2\u01e6\u01e7\7=\2\2\u01e7"+
		"\u0094\3\2\2\2\u01e8\u01e9\7<\2\2\u01e9\u0096\3\2\2\2\u01ea\u01eb\7?\2"+
		"\2\u01eb\u0098\3\2\2\2\u01ec\u01ed\7>\2\2\u01ed\u01ee\7@\2\2\u01ee\u009a"+
		"\3\2\2\2\u01ef\u01f0\7>\2\2\u01f0\u009c\3\2\2\2\u01f1\u01f2\7>\2\2\u01f2"+
		"\u01f3\7?\2\2\u01f3\u009e\3\2\2\2\u01f4\u01f5\7@\2\2\u01f5\u01f6\7?\2"+
		"\2\u01f6\u00a0\3\2\2\2\u01f7\u01f8\7@\2\2\u01f8\u00a2\3\2\2\2\u01f9\u01fa"+
		"\7*\2\2\u01fa\u00a4\3\2\2\2\u01fb\u01fc\7+\2\2\u01fc\u00a6\3\2\2\2\u01fd"+
		"\u01fe\7-\2\2\u01fe\u00a8\3\2\2\2\u01ff\u0200\7/\2\2\u0200\u00aa\3\2\2"+
		"\2\u0201\u0202\7]\2\2\u0202\u00ac\3\2\2\2\u0203\u0204\7_\2\2\u0204\u00ae"+
		"\3\2\2\2\u0205\u0206\7A\2\2\u0206\u00b0\3\2\2\2\u0207\u0208\7#\2\2\u0208"+
		"\u00b2\3\2\2\2\u0209\u020d\t\36\2\2\u020a\u020c\t\37\2\2\u020b\u020a\3"+
		"\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u00b4\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\t \2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0213\b[\2\2\u0213\u00b6\3\2\2\2\13\2\u00bb\u00bd\u00c5\u00ca"+
		"\u00d0\u00d7\u00d9\u020d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}