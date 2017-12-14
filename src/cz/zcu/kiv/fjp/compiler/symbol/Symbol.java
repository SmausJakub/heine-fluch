package cz.zcu.kiv.fjp.compiler.symbol;

/**
 * A class used to represent a symbol in symbol map during the lexical analysis
 * ANTLR is in charge of that now and thus this class is not needed nor should be used
 */
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
