package cz.zcu.kiv.fjp.enums;

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
