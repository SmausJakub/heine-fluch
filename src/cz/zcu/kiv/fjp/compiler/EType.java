package cz.zcu.kiv.fjp.compiler;

public enum EType {
    INTEGER(SymbolMap.INTEGER_SYMBOL),
    REAL(SymbolMap.REAL_SYMBOL),
    BOOLEAN(SymbolMap.BOOLEAN_SYMBOL),
    STRING(SymbolMap.STRING_SYMBOL);

    private String symbol;

    EType(String symbol) {
        this.symbol = symbol;
    }


}
