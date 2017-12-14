package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing types of logic operator
 * These types can be:
 * and - logical and
 * or - logical or
 */
public enum OperatorLogic {

    AND("and"),
    OR("or");

    private String symbol;

    OperatorLogic(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
