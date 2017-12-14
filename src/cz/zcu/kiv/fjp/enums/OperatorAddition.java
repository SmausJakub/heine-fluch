package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing types of addition operator
 * These types can be:
 * plus - +
 * minus - -
 */
public enum OperatorAddition {


    PLUS("+"),
    MINUS("-");

    private String symbol;

    OperatorAddition(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }


}
