package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing instruction operations for OPR and OPF instructions
 */
public enum InstructionOperation {


    NEG("NEG", 1),      // unary minus             -
    ADD("ADD", 2),      // plus                    +
    SUB("SUB", 3),      // minus                   -
    MUL("MUL", 4),      // multiplication          *
    DIV("DIV", 5),      // division                /
    MOD("MOD", 6),      // modulo                  %
    ODD("ODD", 7),      // oddity
    EQ("EQ", 8),        // equal                   =
    NE("NE", 9),        // unequal                 <>
    LT("LT", 10),       // less than               <
    GE("GE", 11),       // greater than or equal   >=
    GT("GT", 12),       // greater than            >
    LE("LE", 13);       // less than or eqaul      <=


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
