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

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public VariableType getVariableType() {
        return variableType;
    }

    public void setVariableType(VariableType variableType) {
        this.variableType = variableType;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("name: ").append(name).append("\t");

        if (name.length() < 2) {
            builder.append("\t");
        }

        builder.append(" type: ").append(type);

        if (variableType == null) {
            builder.append("\t\t\t");
        } else {
            builder.append(" ").append(variableType.getValue()).append("\t");
        }

        builder.append(" level: ").append(level).append("\t").append(" address: ").append(address).append("\t");

        if (address <= 9) {
            builder.append("\t");
        }
        builder.append(" size: ").append(size).append("\n");

        return builder.toString();
    }
}
