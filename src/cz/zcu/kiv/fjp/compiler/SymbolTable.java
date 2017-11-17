package cz.zcu.kiv.fjp.compiler;

import java.util.HashMap;

public class SymbolTable {

    private HashMap<String, AParsable> symbolTable;


    private SymbolTable() {

        symbolTable = new HashMap<String, AParsable>();
    }

    public void addItem(String name, AParsable item) {
        this.symbolTable.put(name, item);
    }

    public int getSize() {
        return this.symbolTable.size();
    }

    public AParsable removeItem(String name) {
        return this.symbolTable.remove(name);
    }

    public AParsable getItem(String name) {
        return this.symbolTable.get(name);
    }


}
