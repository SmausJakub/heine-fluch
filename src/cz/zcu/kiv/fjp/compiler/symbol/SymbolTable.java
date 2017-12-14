package cz.zcu.kiv.fjp.compiler.symbol;

import java.util.HashMap;
import java.util.Map;

/**
 * Symbol Table class
 * This class handles the symbol table used during the compilation of a program
 * Symbol table itself is a map with keys as strings (identifiers) and values as the items themselves
 */
public class SymbolTable {

    private static SymbolTable instance = new SymbolTable();

    private HashMap<String, SymbolTableItem> symbolTable;

    private SymbolTable() {

        symbolTable = new HashMap<>();
    }

    public static SymbolTable getInstance() {
        return instance;
    }

    /**
     * adds an item to the symbol table using given key
     *
     * @param name key where to store the item, should be name of the item
     * @param item item itself
     */
    public void addItem(String name, SymbolTableItem item) {
        this.symbolTable.put(name, item);
    }

    /**
     * returns the size of the symbol table
     * @return size of the symbol table
     */
    public int getSize() {
        return this.symbolTable.size();
    }

    /**
     * removes an item from the symbol table using given key
     * @param name key, should be the name of the item
     * @return removed item
     */
    public SymbolTableItem removeItem(String name) {
        return this.symbolTable.remove(name);
    }

    /**
     * gets an item from the symbol table using given key
     * does not check if the item exists
     * @param name key, should be the name of the item
     * @return item item
     * @see #contains(String)
     */
    public SymbolTableItem getItem(String name) {
        return this.symbolTable.get(name);
    }

    /**
     * checks if item of a given name exists in the symbol table (name should be the key of the item)
     * @param name name of the item
     * @return true if exists, false otherwise
     */
    public boolean contains(String name) {
        return symbolTable.containsKey(name);
    }

    /**
     * prints the symbol table into a readable format
     * @return printed symbol table
     */
    public String printSymbolTable() {
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<String, SymbolTableItem> entry : symbolTable.entrySet()) {
            builder.append(entry.getValue().toString());
        }

        return builder.toString();
    }

}
