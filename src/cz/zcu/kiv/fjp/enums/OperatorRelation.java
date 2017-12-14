package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing types of relation operator
 * These types can be:
 * equal - =
 * not equal - <>
 * lt - <
 * le - <=
 * ge - >=
 * gt - >
 */
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
