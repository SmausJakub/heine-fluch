package cz.zcu.kiv.fjp.enums;

public enum OperatorRelation {

    EQUAL("="),
    NOT_EQUAL("<>"),
    LT("<"),
    LE("<="),
    GE(">="),
    GT(">");

    private String symbol;

    OperatorRelation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
