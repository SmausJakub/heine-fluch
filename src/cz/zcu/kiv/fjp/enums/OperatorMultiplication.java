package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing types of multiplication operator
 * These types can be:
 * multiply - *
 * divide - /
 */
public enum OperatorMultiplication {

    MULTIPLY("*"),
    DIVIDE("/");

    private String symbol;

    OperatorMultiplication(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
