package cz.zcu.kiv.fjp.compiler.symbol;


import cz.zcu.kiv.fjp.enums.VariableType;

public class SymbolTableItem {

    private String name;

    private int level;

    private String type;

    private int address;

    private int size;

    private VariableType variableType;

    public SymbolTableItem(String name, String type, int level, int address, int size) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.address = address;
        this.size = size;
    }

    public SymbolTableItem(String name, String type, VariableType variableType, int level, int address, int size) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.address = address;
        this.size = size;
        this.variableType = variableType;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public VariableType getVariableType() {
        return variableType;
    }

    @Override
    public String toString() {
        if (variableType == null) {
            return ("name: " + name + "\t type: " + type + "\t\t\t level: " + level + "\t\t address: " + address + "\t size: " + size + "\n");
        }
        return ("name: " + name + "\t type: " + type + " " + variableType.getValue() + "\t level: " + level + "\t\t address: " + address + "\t size: " + size + "\n");
    }
}
