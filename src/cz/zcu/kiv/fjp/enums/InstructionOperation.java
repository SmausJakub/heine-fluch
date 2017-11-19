package cz.zcu.kiv.fjp.enums;

public enum InstructionOperation {


    NEG("NEG", 1),
    ADD("ADD", 2),
    SUB("SUB", 3),
    MUL("MUL", 4),
    DIV("DIV", 5),
    MOD("MOD", 6),
    ODD("ODD", 7),
    EQ("EQ", 8),
    NE("NE", 9),
    LT("LT", 10),
    GE("GE", 11),
    GT("GT", 12),
    LE("LE", 13);


    private String name;
    private int code;

    InstructionOperation(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
