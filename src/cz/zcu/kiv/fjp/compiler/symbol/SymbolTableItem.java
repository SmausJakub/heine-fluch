package cz.zcu.kiv.fjp.compiler.symbol;


import cz.zcu.kiv.fjp.enums.VariableType;

/**
 * Symbol Table Item class
 * Represents a single item in the symbol table
 */
public class SymbolTableItem {

    /**
     * name of the item, also its key in the symbol table
     */
    private String name;

    /**
     * level of the item (where was it declared)
     */
    private int level;

    /**
     * Type of the item in string format
     */
    private String type;

    /**
     * address of the item, has different meaning depending on type
     * variable - address of its position in stack
     * label - starts at 0, when is assigned, address is index of instruction where to jump
     * procedure - index of instruction where procedure starts
     */
    private int address;

    /**
     * size of the item, has different meaning depending on type
     * variable and label - whether it has been assigned (1) or not (0) - after a change variables are always assigned implicit values
     * procedure - number of instructions of the procedure
     */
    private int size;

    /**
     * Variables need variable type to display
     */
    private VariableType variableType;

    /**
     *
     * @param name name of the item
     * @param type type of the item
     * @param level level of the item
     * @param address address of the item
     * @param size size of the item
     */
    public SymbolTableItem(String name, String type, int level, int address, int size) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.address = address;
        this.size = size;
    }

    /**
     *
     * @param name name of the item
     * @param type type of the item
     * @param variableType variable type of the item
     * @param level level of the item
     * @param address address of the item
     * @param size size of the item
     */
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
