package cz.zcu.kiv.fjp.compiler.symbol;

public class Symbol {

    private String symbol;
    private String name;


    public Symbol(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Symbol: " + this.symbol + ", name: " + this.name + "\n";
    }

}
