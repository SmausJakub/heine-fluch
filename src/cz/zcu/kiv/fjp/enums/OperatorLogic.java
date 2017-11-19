package cz.zcu.kiv.fjp.enums;

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
