package cz.zcu.kiv.fjp.compiler.symbol;

import java.util.HashMap;

public class SymbolTable {

    private static SymbolTable instance = new SymbolTable();
    private HashMap<String, SymbolTableItem> symbolTable;

    private SymbolTable() {

        symbolTable = new HashMap<>();
    }

    public static SymbolTable getInstance() {
        return instance;
    }

    public void addItem(String name, SymbolTableItem item) {
        this.symbolTable.put(name, item);
    }

    public int getSize() {
        return this.symbolTable.size();
    }

    public SymbolTableItem removeItem(String name) {
        return this.symbolTable.remove(name);
    }

    public SymbolTableItem getItem(String name) {
        return this.symbolTable.get(name);
    }

    public boolean contains(String name) {
        return symbolTable.containsKey(name);
    }

    @Override
    public String toString() {
        return symbolTable.toString();
    }

}
