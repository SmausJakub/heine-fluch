package cz.zcu.kiv.fjp.compiler.symbol;


public class SymbolTableItem {

    private String name;

    private int level;

    private String type;

    private int address;

    private int size;

    public SymbolTableItem(String name, String type, int level, int address, int size) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.address = address;
        this.size = size;
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

    @Override
    public String toString() {
        return ("name: " + name + "\t types: " + type + "\t level: " + level + "\t address: " + address + "\t size: " + size + "\n");
    }
}
