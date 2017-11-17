package cz.zcu.kiv.fjp.compiler.symbol;

import java.util.HashMap;

public class SymbolMap {

    private SymbolMap() {}

    private static HashMap<Symbol, Integer> symbolMap;

    public static HashMap<Symbol, Integer> getSymbolMap() {
        return symbolMap;
    }



    static {

        symbolMap = new HashMap<Symbol, Integer>();

        int i = 0;
        symbolMap.put(new Symbol("null", "nulsym"), ++i);
        symbolMap.put(new Symbol("ident", "identsym"), ++i);
        symbolMap.put(new Symbol("int", "intsym"), ++i);
        symbolMap.put(new Symbol("double", "doublesym"), ++i);
        symbolMap.put(new Symbol("bool", "boolsym"), ++i);
        symbolMap.put(new Symbol("str", "strsym"), ++i);
        symbolMap.put(new Symbol("+", "plussym"), ++i);
        symbolMap.put(new Symbol("-", "minussym"), ++i);
        symbolMap.put(new Symbol("*", "multsym"), ++i);
        symbolMap.put(new Symbol("/", "slashsym"), ++i);
        symbolMap.put(new Symbol("=", "eqlsym"), ++i);
        symbolMap.put(new Symbol("<>", "neqsym"), ++i);
        symbolMap.put(new Symbol("<", "lessym"), ++i);
        symbolMap.put(new Symbol("<=", "leqsym"), ++i);
        symbolMap.put(new Symbol(">", "gtrsym"), ++i);
        symbolMap.put(new Symbol(">=", "geqsym"), ++i);
        symbolMap.put(new Symbol("(", "lparentsym"), ++i);
        symbolMap.put(new Symbol(")", "rparentsym"), ++i);
        symbolMap.put(new Symbol("[", "lbracksym"), ++i);
        symbolMap.put(new Symbol("]", "rbracksym"), ++i);
        symbolMap.put(new Symbol(",", "commasym"), ++i);
        symbolMap.put(new Symbol(";", "semicolomsym"), ++i);
        symbolMap.put(new Symbol(".", "periodsym"), ++i);
        symbolMap.put(new Symbol(":=", "assignsym"), ++i);
        symbolMap.put(new Symbol("!", "negatesym"), ++i);
        symbolMap.put(new Symbol("?", "ternaryonesym"), ++i);
        symbolMap.put(new Symbol(":", "ternarytwosym"), ++i);
        symbolMap.put(new Symbol("begin", "beginsym"), ++i);
        symbolMap.put(new Symbol("end", "endsym"), ++i);
        symbolMap.put(new Symbol("if", "ifsym"), ++i);
        symbolMap.put(new Symbol("then", "thensym"), ++i);
        symbolMap.put(new Symbol("while", "whilesym"), ++i);
        symbolMap.put(new Symbol("do", "dosym"), ++i);
        symbolMap.put(new Symbol("repeat", "repeatsym"), ++i);
        symbolMap.put(new Symbol("until", "untilsym"), ++i);
        symbolMap.put(new Symbol("call", "callsym"), ++i);
        symbolMap.put(new Symbol("const", "constsym"), ++i);
        symbolMap.put(new Symbol("integer", "integersym"), ++i);
        symbolMap.put(new Symbol("boolean", "booleansym"), ++i);
        symbolMap.put(new Symbol("real", "realsym"), ++i);
        symbolMap.put(new Symbol("string", "stringsym"), ++i);
        symbolMap.put(new Symbol("procedure", "proceduresym"), ++i);
        symbolMap.put(new Symbol("else", "elsesym"), ++i);
        symbolMap.put(new Symbol("label", "labesym"), ++i);
        symbolMap.put(new Symbol("goto", "gotosym"), ++i);
        symbolMap.put(new Symbol("read", "readsym"), ++i);
        symbolMap.put(new Symbol("write", "writesym"), ++i);
        symbolMap.put(new Symbol("case", "casesym"), ++i);
        symbolMap.put(new Symbol("of", "ofsym"), ++i);
        symbolMap.put(new Symbol("for", "forsym"), ++i);
        symbolMap.put(new Symbol("to", "tosym"), ++i);
        symbolMap.put(new Symbol("downto", "downtosym"), ++i);
        symbolMap.put(new Symbol("and", "andsym"), ++i);
        symbolMap.put(new Symbol("or", "orsym"), ++i);


    }



}
