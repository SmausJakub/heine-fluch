package cz.zcu.kiv.fjp.enums;

public enum InstructionOperation {


    NEG("NEG", 1),      // unarni minus
    ADD("ADD", 2),      // plus +
    SUB("SUB", 3),      // minus -
    MUL("MUL", 4),      // krat *
    DIV("DIV", 5),      // deleno /
    MOD("MOD", 6),      // modulo %
    ODD("ODD", 7),      // lichost
    EQ("EQ", 8),        // rovna se =
    NE("NE", 9),        // nerovna se <>
    LT("LT", 10),       // mensi nez <
    GE("GE", 11),       // vetsi nebo stejne >=
    GT("GT", 12),       // vetsi nez >
    LE("LE", 13);       // mensi nebo rovno <=


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
