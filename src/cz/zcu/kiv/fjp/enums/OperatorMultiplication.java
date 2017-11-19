package cz.zcu.kiv.fjp.enums;

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
