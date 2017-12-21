// Generated from C:/Users/Kossyr/IdeaProjects/PascaL0like/src/cz/zcu/kiv/fjp\Pascal0Like.g4 by ANTLR 4.7
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
		INT=1, FLOAT=2, BEGIN=3, AND=4, BOOLEAN=5, CASE=6, CONST=7, DO=8, OF=9, 
		DOWNTO=10, ELSE=11, END=12, FOR=13, GOTO=14, IF=15, INTEGER=16, LABEL=17, 
		OR=18, PROCEDURE=19, REAL=20, REPEAT=21, THEN=22, TO=23, UNTIL=24, WHILE=25, 
		CALL=26, READ=27, WRITE=28, NOT=29, TRUE=30, FALSE=31, VAR=32, LEGACY=33, 
		PROGRAM=34, USE=35, DEFAULT=36, STRICT=37, ODD=38, MULTIPLY=39, DIVIDE=40, 
		MODULO=41, DOT=42, ASSIGN=43, COMMA=44, SEMI=45, COLON=46, EQUAL=47, NOT_EQUAL=48, 
		LT=49, LE=50, GE=51, GT=52, LPAREN=53, RPAREN=54, PLUS=55, MINUS=56, LBRACK=57, 
		RBRACK=58, TERNARY_ONE=59, TERNARY_TWO=60, IDENT=61, WS=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z", "BEGIN", "AND", "BOOLEAN", "CASE", "CONST", "DO", "OF", "DOWNTO", 
		"ELSE", "END", "FOR", "GOTO", "IF", "INTEGER", "LABEL", "OR", "PROCEDURE", 
		"REAL", "REPEAT", "THEN", "TO", "UNTIL", "WHILE", "CALL", "READ", "WRITE", 
		"NOT", "TRUE", "FALSE", "VAR", "LEGACY", "PROGRAM", "USE", "DEFAULT", 
		"STRICT", "ODD", "MULTIPLY", "DIVIDE", "MODULO", "DOT", "ASSIGN", "COMMA", 
		"SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", 
		"RPAREN", "PLUS", "MINUS", "LBRACK", "RBRACK", "TERNARY_ONE", "TERNARY_TWO", 
		"IDENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'*'", "'/'", "'%'", "'.'", "':='", "','", "';'", "':'", 
		"'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'+'", "'-'", 
		"'['", "']'", "'?'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "BEGIN", "AND", "BOOLEAN", "CASE", "CONST", "DO", 
		"OF", "DOWNTO", "ELSE", "END", "FOR", "GOTO", "IF", "INTEGER", "LABEL", 
		"OR", "PROCEDURE", "REAL", "REPEAT", "THEN", "TO", "UNTIL", "WHILE", "CALL", 
		"READ", "WRITE", "NOT", "TRUE", "FALSE", "VAR", "LEGACY", "PROGRAM", "USE", 
		"DEFAULT", "STRICT", "ODD", "MULTIPLY", "DIVIDE", "MODULO", "DOT", "ASSIGN", 
		"COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", 
		"LPAREN", "RPAREN", "PLUS", "MINUS", "LBRACK", "RBRACK", "TERNARY_ONE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01fe\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\6\2\u00b5\n\2\r\2\16\2\u00b6\3\3\6"+
		"\3\u00ba\n\3\r\3\16\3\u00bb\3\3\3\3\7\3\u00c0\n\3\f\3\16\3\u00c3\13\3"+
		"\3\3\3\3\6\3\u00c7\n\3\r\3\16\3\u00c8\5\3\u00cb\n\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3H\3H\3"+
		"I\3I\3J\3J\3K\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3"+
		"S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\7X\u01f6\nX\fX\16X\u01f9\13X\3Y\3Y"+
		"\3Y\3Y\2\2Z\3\3\5\4\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33"+
		"\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\5=\6?\7"+
		"A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32"+
		"g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+"+
		"\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099"+
		"\64\u009b\65\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab"+
		"=\u00ad>\u00af?\u00b1@\3\2 \3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4"+
		"\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOo"+
		"o\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2"+
		"XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u01e9\2\3\3\2\2\2\2\5\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?"+
		"\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2"+
		"\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2"+
		"\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e"+
		"\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2"+
		"\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2"+
		"\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\3\u00b4\3\2\2"+
		"\2\5\u00ca\3\2\2\2\7\u00cc\3\2\2\2\t\u00ce\3\2\2\2\13\u00d0\3\2\2\2\r"+
		"\u00d2\3\2\2\2\17\u00d4\3\2\2\2\21\u00d6\3\2\2\2\23\u00d8\3\2\2\2\25\u00da"+
		"\3\2\2\2\27\u00dc\3\2\2\2\31\u00de\3\2\2\2\33\u00e0\3\2\2\2\35\u00e2\3"+
		"\2\2\2\37\u00e4\3\2\2\2!\u00e6\3\2\2\2#\u00e8\3\2\2\2%\u00ea\3\2\2\2\'"+
		"\u00ec\3\2\2\2)\u00ee\3\2\2\2+\u00f0\3\2\2\2-\u00f2\3\2\2\2/\u00f4\3\2"+
		"\2\2\61\u00f6\3\2\2\2\63\u00f8\3\2\2\2\65\u00fa\3\2\2\2\67\u00fc\3\2\2"+
		"\29\u00fe\3\2\2\2;\u0100\3\2\2\2=\u0106\3\2\2\2?\u010a\3\2\2\2A\u0112"+
		"\3\2\2\2C\u0117\3\2\2\2E\u011d\3\2\2\2G\u0120\3\2\2\2I\u0123\3\2\2\2K"+
		"\u012a\3\2\2\2M\u012f\3\2\2\2O\u0133\3\2\2\2Q\u0137\3\2\2\2S\u013c\3\2"+
		"\2\2U\u013f\3\2\2\2W\u0147\3\2\2\2Y\u014d\3\2\2\2[\u0150\3\2\2\2]\u015a"+
		"\3\2\2\2_\u015f\3\2\2\2a\u0166\3\2\2\2c\u016b\3\2\2\2e\u016e\3\2\2\2g"+
		"\u0174\3\2\2\2i\u017a\3\2\2\2k\u017f\3\2\2\2m\u0184\3\2\2\2o\u018a\3\2"+
		"\2\2q\u018e\3\2\2\2s\u0193\3\2\2\2u\u0199\3\2\2\2w\u019d\3\2\2\2y\u01a4"+
		"\3\2\2\2{\u01ac\3\2\2\2}\u01b0\3\2\2\2\177\u01b8\3\2\2\2\u0081\u01bf\3"+
		"\2\2\2\u0083\u01c3\3\2\2\2\u0085\u01c5\3\2\2\2\u0087\u01c7\3\2\2\2\u0089"+
		"\u01c9\3\2\2\2\u008b\u01cb\3\2\2\2\u008d\u01ce\3\2\2\2\u008f\u01d0\3\2"+
		"\2\2\u0091\u01d2\3\2\2\2\u0093\u01d4\3\2\2\2\u0095\u01d6\3\2\2\2\u0097"+
		"\u01d9\3\2\2\2\u0099\u01db\3\2\2\2\u009b\u01de\3\2\2\2\u009d\u01e1\3\2"+
		"\2\2\u009f\u01e3\3\2\2\2\u00a1\u01e5\3\2\2\2\u00a3\u01e7\3\2\2\2\u00a5"+
		"\u01e9\3\2\2\2\u00a7\u01eb\3\2\2\2\u00a9\u01ed\3\2\2\2\u00ab\u01ef\3\2"+
		"\2\2\u00ad\u01f1\3\2\2\2\u00af\u01f3\3\2\2\2\u00b1\u01fa\3\2\2\2\u00b3"+
		"\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\4\3\2\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00c1\7\60\2\2\u00be\u00c0\t\2\2\2\u00bf\u00be\3"+
		"\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00cb\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\60\2\2\u00c5\u00c7\t"+
		"\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00b9\3\2\2\2\u00ca\u00c4\3\2"+
		"\2\2\u00cb\6\3\2\2\2\u00cc\u00cd\t\3\2\2\u00cd\b\3\2\2\2\u00ce\u00cf\t"+
		"\4\2\2\u00cf\n\3\2\2\2\u00d0\u00d1\t\5\2\2\u00d1\f\3\2\2\2\u00d2\u00d3"+
		"\t\6\2\2\u00d3\16\3\2\2\2\u00d4\u00d5\t\7\2\2\u00d5\20\3\2\2\2\u00d6\u00d7"+
		"\t\b\2\2\u00d7\22\3\2\2\2\u00d8\u00d9\t\t\2\2\u00d9\24\3\2\2\2\u00da\u00db"+
		"\t\n\2\2\u00db\26\3\2\2\2\u00dc\u00dd\t\13\2\2\u00dd\30\3\2\2\2\u00de"+
		"\u00df\t\f\2\2\u00df\32\3\2\2\2\u00e0\u00e1\t\r\2\2\u00e1\34\3\2\2\2\u00e2"+
		"\u00e3\t\16\2\2\u00e3\36\3\2\2\2\u00e4\u00e5\t\17\2\2\u00e5 \3\2\2\2\u00e6"+
		"\u00e7\t\20\2\2\u00e7\"\3\2\2\2\u00e8\u00e9\t\21\2\2\u00e9$\3\2\2\2\u00ea"+
		"\u00eb\t\22\2\2\u00eb&\3\2\2\2\u00ec\u00ed\t\23\2\2\u00ed(\3\2\2\2\u00ee"+
		"\u00ef\t\24\2\2\u00ef*\3\2\2\2\u00f0\u00f1\t\25\2\2\u00f1,\3\2\2\2\u00f2"+
		"\u00f3\t\26\2\2\u00f3.\3\2\2\2\u00f4\u00f5\t\27\2\2\u00f5\60\3\2\2\2\u00f6"+
		"\u00f7\t\30\2\2\u00f7\62\3\2\2\2\u00f8\u00f9\t\31\2\2\u00f9\64\3\2\2\2"+
		"\u00fa\u00fb\t\32\2\2\u00fb\66\3\2\2\2\u00fc\u00fd\t\33\2\2\u00fd8\3\2"+
		"\2\2\u00fe\u00ff\t\34\2\2\u00ff:\3\2\2\2\u0100\u0101\5\t\5\2\u0101\u0102"+
		"\5\17\b\2\u0102\u0103\5\23\n\2\u0103\u0104\5\27\f\2\u0104\u0105\5!\21"+
		"\2\u0105<\3\2\2\2\u0106\u0107\5\7\4\2\u0107\u0108\5!\21\2\u0108\u0109"+
		"\5\r\7\2\u0109>\3\2\2\2\u010a\u010b\5\t\5\2\u010b\u010c\5#\22\2\u010c"+
		"\u010d\5#\22\2\u010d\u010e\5\35\17\2\u010e\u010f\5\17\b\2\u010f\u0110"+
		"\5\7\4\2\u0110\u0111\5!\21\2\u0111@\3\2\2\2\u0112\u0113\5\13\6\2\u0113"+
		"\u0114\5\7\4\2\u0114\u0115\5+\26\2\u0115\u0116\5\17\b\2\u0116B\3\2\2\2"+
		"\u0117\u0118\5\13\6\2\u0118\u0119\5#\22\2\u0119\u011a\5!\21\2\u011a\u011b"+
		"\5+\26\2\u011b\u011c\5-\27\2\u011cD\3\2\2\2\u011d\u011e\5\r\7\2\u011e"+
		"\u011f\5#\22\2\u011fF\3\2\2\2\u0120\u0121\5#\22\2\u0121\u0122\5\21\t\2"+
		"\u0122H\3\2\2\2\u0123\u0124\5\r\7\2\u0124\u0125\5#\22\2\u0125\u0126\5"+
		"\63\32\2\u0126\u0127\5!\21\2\u0127\u0128\5-\27\2\u0128\u0129\5#\22\2\u0129"+
		"J\3\2\2\2\u012a\u012b\5\17\b\2\u012b\u012c\5\35\17\2\u012c\u012d\5+\26"+
		"\2\u012d\u012e\5\17\b\2\u012eL\3\2\2\2\u012f\u0130\5\17\b\2\u0130\u0131"+
		"\5!\21\2\u0131\u0132\5\r\7\2\u0132N\3\2\2\2\u0133\u0134\5\21\t\2\u0134"+
		"\u0135\5#\22\2\u0135\u0136\5)\25\2\u0136P\3\2\2\2\u0137\u0138\5\23\n\2"+
		"\u0138\u0139\5#\22\2\u0139\u013a\5-\27\2\u013a\u013b\5#\22\2\u013bR\3"+
		"\2\2\2\u013c\u013d\5\27\f\2\u013d\u013e\5\21\t\2\u013eT\3\2\2\2\u013f"+
		"\u0140\5\27\f\2\u0140\u0141\5!\21\2\u0141\u0142\5-\27\2\u0142\u0143\5"+
		"\17\b\2\u0143\u0144\5\23\n\2\u0144\u0145\5\17\b\2\u0145\u0146\5)\25\2"+
		"\u0146V\3\2\2\2\u0147\u0148\5\35\17\2\u0148\u0149\5\7\4\2\u0149\u014a"+
		"\5\t\5\2\u014a\u014b\5\17\b\2\u014b\u014c\5\35\17\2\u014cX\3\2\2\2\u014d"+
		"\u014e\5#\22\2\u014e\u014f\5)\25\2\u014fZ\3\2\2\2\u0150\u0151\5%\23\2"+
		"\u0151\u0152\5)\25\2\u0152\u0153\5#\22\2\u0153\u0154\5\13\6\2\u0154\u0155"+
		"\5\17\b\2\u0155\u0156\5\r\7\2\u0156\u0157\5/\30\2\u0157\u0158\5)\25\2"+
		"\u0158\u0159\5\17\b\2\u0159\\\3\2\2\2\u015a\u015b\5)\25\2\u015b\u015c"+
		"\5\17\b\2\u015c\u015d\5\7\4\2\u015d\u015e\5\35\17\2\u015e^\3\2\2\2\u015f"+
		"\u0160\5)\25\2\u0160\u0161\5\17\b\2\u0161\u0162\5%\23\2\u0162\u0163\5"+
		"\17\b\2\u0163\u0164\5\7\4\2\u0164\u0165\5-\27\2\u0165`\3\2\2\2\u0166\u0167"+
		"\5-\27\2\u0167\u0168\5\25\13\2\u0168\u0169\5\17\b\2\u0169\u016a\5!\21"+
		"\2\u016ab\3\2\2\2\u016b\u016c\5-\27\2\u016c\u016d\5#\22\2\u016dd\3\2\2"+
		"\2\u016e\u016f\5/\30\2\u016f\u0170\5!\21\2\u0170\u0171\5-\27\2\u0171\u0172"+
		"\5\27\f\2\u0172\u0173\5\35\17\2\u0173f\3\2\2\2\u0174\u0175\5\63\32\2\u0175"+
		"\u0176\5\25\13\2\u0176\u0177\5\27\f\2\u0177\u0178\5\35\17\2\u0178\u0179"+
		"\5\17\b\2\u0179h\3\2\2\2\u017a\u017b\5\13\6\2\u017b\u017c\5\7\4\2\u017c"+
		"\u017d\5\35\17\2\u017d\u017e\5\35\17\2\u017ej\3\2\2\2\u017f\u0180\5)\25"+
		"\2\u0180\u0181\5\17\b\2\u0181\u0182\5\7\4\2\u0182\u0183\5\r\7\2\u0183"+
		"l\3\2\2\2\u0184\u0185\5\63\32\2\u0185\u0186\5)\25\2\u0186\u0187\5\27\f"+
		"\2\u0187\u0188\5-\27\2\u0188\u0189\5\17\b\2\u0189n\3\2\2\2\u018a\u018b"+
		"\5!\21\2\u018b\u018c\5#\22\2\u018c\u018d\5-\27\2\u018dp\3\2\2\2\u018e"+
		"\u018f\5-\27\2\u018f\u0190\5)\25\2\u0190\u0191\5/\30\2\u0191\u0192\5\17"+
		"\b\2\u0192r\3\2\2\2\u0193\u0194\5\21\t\2\u0194\u0195\5\7\4\2\u0195\u0196"+
		"\5\35\17\2\u0196\u0197\5+\26\2\u0197\u0198\5\17\b\2\u0198t\3\2\2\2\u0199"+
		"\u019a\5\61\31\2\u019a\u019b\5\7\4\2\u019b\u019c\5)\25\2\u019cv\3\2\2"+
		"\2\u019d\u019e\5\35\17\2\u019e\u019f\5\17\b\2\u019f\u01a0\5\23\n\2\u01a0"+
		"\u01a1\5\7\4\2\u01a1\u01a2\5\13\6\2\u01a2\u01a3\5\67\34\2\u01a3x\3\2\2"+
		"\2\u01a4\u01a5\5%\23\2\u01a5\u01a6\5)\25\2\u01a6\u01a7\5#\22\2\u01a7\u01a8"+
		"\5\23\n\2\u01a8\u01a9\5)\25\2\u01a9\u01aa\5\7\4\2\u01aa\u01ab\5\37\20"+
		"\2\u01abz\3\2\2\2\u01ac\u01ad\5/\30\2\u01ad\u01ae\5+\26\2\u01ae\u01af"+
		"\5\17\b\2\u01af|\3\2\2\2\u01b0\u01b1\5\r\7\2\u01b1\u01b2\5\17\b\2\u01b2"+
		"\u01b3\5\21\t\2\u01b3\u01b4\5\7\4\2\u01b4\u01b5\5/\30\2\u01b5\u01b6\5"+
		"\35\17\2\u01b6\u01b7\5-\27\2\u01b7~\3\2\2\2\u01b8\u01b9\5+\26\2\u01b9"+
		"\u01ba\5-\27\2\u01ba\u01bb\5)\25\2\u01bb\u01bc\5\27\f\2\u01bc\u01bd\5"+
		"\13\6\2\u01bd\u01be\5-\27\2\u01be\u0080\3\2\2\2\u01bf\u01c0\5#\22\2\u01c0"+
		"\u01c1\5\r\7\2\u01c1\u01c2\5\r\7\2\u01c2\u0082\3\2\2\2\u01c3\u01c4\7,"+
		"\2\2\u01c4\u0084\3\2\2\2\u01c5\u01c6\7\61\2\2\u01c6\u0086\3\2\2\2\u01c7"+
		"\u01c8\7\'\2\2\u01c8\u0088\3\2\2\2\u01c9\u01ca\7\60\2\2\u01ca\u008a\3"+
		"\2\2\2\u01cb\u01cc\7<\2\2\u01cc\u01cd\7?\2\2\u01cd\u008c\3\2\2\2\u01ce"+
		"\u01cf\7.\2\2\u01cf\u008e\3\2\2\2\u01d0\u01d1\7=\2\2\u01d1\u0090\3\2\2"+
		"\2\u01d2\u01d3\7<\2\2\u01d3\u0092\3\2\2\2\u01d4\u01d5\7?\2\2\u01d5\u0094"+
		"\3\2\2\2\u01d6\u01d7\7>\2\2\u01d7\u01d8\7@\2\2\u01d8\u0096\3\2\2\2\u01d9"+
		"\u01da\7>\2\2\u01da\u0098\3\2\2\2\u01db\u01dc\7>\2\2\u01dc\u01dd\7?\2"+
		"\2\u01dd\u009a\3\2\2\2\u01de\u01df\7@\2\2\u01df\u01e0\7?\2\2\u01e0\u009c"+
		"\3\2\2\2\u01e1\u01e2\7@\2\2\u01e2\u009e\3\2\2\2\u01e3\u01e4\7*\2\2\u01e4"+
		"\u00a0\3\2\2\2\u01e5\u01e6\7+\2\2\u01e6\u00a2\3\2\2\2\u01e7\u01e8\7-\2"+
		"\2\u01e8\u00a4\3\2\2\2\u01e9\u01ea\7/\2\2\u01ea\u00a6\3\2\2\2\u01eb\u01ec"+
		"\7]\2\2\u01ec\u00a8\3\2\2\2\u01ed\u01ee\7_\2\2\u01ee\u00aa\3\2\2\2\u01ef"+
		"\u01f0\7A\2\2\u01f0\u00ac\3\2\2\2\u01f1\u01f2\7#\2\2\u01f2\u00ae\3\2\2"+
		"\2\u01f3\u01f7\t\35\2\2\u01f4\u01f6\t\36\2\2\u01f5\u01f4\3\2\2\2\u01f6"+
		"\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u00b0\3\2"+
		"\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\t\37\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fd\bY\2\2\u01fd\u00b2\3\2\2\2\t\2\u00b6\u00bb\u00c1\u00c8\u00ca\u01f7"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}