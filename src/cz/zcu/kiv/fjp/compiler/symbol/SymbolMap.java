package cz.zcu.kiv.fjp.compiler.symbol;

import java.util.HashMap;
import java.util.Map;

public class SymbolMap {


    private static SymbolMap instance = new SymbolMap();
    private Map<Integer, Symbol> symbolMap;

    private SymbolMap() {

        symbolMap = new HashMap<Integer, Symbol>();

        int i = 0;
        symbolMap.put(++i, new Symbol("null", "nulsym"));
        symbolMap.put(++i, new Symbol("ident", "identsym"));
        symbolMap.put(++i, new Symbol("int", "intsym"));
        symbolMap.put(++i, new Symbol("double", "doublesym"));
        symbolMap.put(++i, new Symbol("bool", "boolsym"));
        symbolMap.put(++i, new Symbol("str", "strsym"));
        symbolMap.put(++i, new Symbol("+", "plussym"));
        symbolMap.put(++i, new Symbol("-", "minussym"));
        symbolMap.put(++i, new Symbol("*", "multsym"));
        symbolMap.put(++i, new Symbol("/", "slashsym"));
        symbolMap.put(++i, new Symbol("=", "eqlsym"));
        symbolMap.put(++i, new Symbol("<>", "neqsym"));
        symbolMap.put(++i, new Symbol("<", "lessym"));
        symbolMap.put(++i, new Symbol("<=", "leqsym"));
        symbolMap.put(++i, new Symbol(">", "gtrsym"));
        symbolMap.put(++i, new Symbol(">=", "geqsym"));
        symbolMap.put(++i, new Symbol("(", "lparentsym"));
        symbolMap.put(++i, new Symbol(")", "rparentsym"));
        symbolMap.put(++i, new Symbol("[", "lbracksym"));
        symbolMap.put(++i, new Symbol("]", "rbracksym"));
        symbolMap.put(++i, new Symbol(",", "commasym"));
        symbolMap.put(++i, new Symbol(";", "semicolomsym"));
        symbolMap.put(++i, new Symbol(".", "periodsym"));
        symbolMap.put(++i, new Symbol(":=", "assignsym"));
        symbolMap.put(++i, new Symbol("!", "negatesym"));
        symbolMap.put(++i, new Symbol("?", "ternaryonesym"));
        symbolMap.put(++i, new Symbol(":", "ternarytwosym"));
        symbolMap.put(++i, new Symbol("begin", "beginsym"));
        symbolMap.put(++i, new Symbol("end", "endsym"));
        symbolMap.put(++i, new Symbol("if", "ifsym"));
        symbolMap.put(++i, new Symbol("then", "thensym"));
        symbolMap.put(++i, new Symbol("while", "whilesym"));
        symbolMap.put(++i, new Symbol("do", "dosym"));
        symbolMap.put(++i, new Symbol("repeat", "repeatsym"));
        symbolMap.put(++i, new Symbol("until", "untilsym"));
        symbolMap.put(++i, new Symbol("call", "callsym"));
        symbolMap.put(++i, new Symbol("const", "constsym"));
        symbolMap.put(++i, new Symbol("integer", "integersym"));
        symbolMap.put(++i, new Symbol("boolean", "booleansym"));
        symbolMap.put(++i, new Symbol("real", "realsym"));
        symbolMap.put(++i, new Symbol("string", "stringsym"));
        symbolMap.put(++i, new Symbol("procedure", "proceduresym"));
        symbolMap.put(++i, new Symbol("else", "elsesym"));
        symbolMap.put(++i, new Symbol("label", "labelsym"));
        symbolMap.put(++i, new Symbol("goto", "gotosym"));
        symbolMap.put(++i, new Symbol("read", "readsym"));
        symbolMap.put(++i, new Symbol("write", "writesym"));
        symbolMap.put(++i, new Symbol("case", "casesym"));
        symbolMap.put(++i, new Symbol("of", "ofsym"));
        symbolMap.put(++i, new Symbol("for", "forsym"));
        symbolMap.put(++i, new Symbol("to", "tosym"));
        symbolMap.put(++i, new Symbol("downto", "downtosym"));
        symbolMap.put(++i, new Symbol("and", "andsym"));
        symbolMap.put(++i, new Symbol("or", "orsym"));
    }

    public static SymbolMap getInstance() {
        return instance;
    }

    public Symbol getSymbolByIndex(int index) {
        return symbolMap.get(index);
    }

    public Symbol getSymbolBySymbol(String symbol) {

        for (Symbol s : symbolMap.values()) {

            if (symbol.equalsIgnoreCase(s.getSymbol())) {
                return s;
            }

        }

        return null;

    }

    public Symbol getSymbolByName(String name) {

        for (Symbol s : symbolMap.values()) {

            if (name.equalsIgnoreCase(s.getName())) {
                return s;
            }

        }

        return null;

    }


}


