package cz.zcu.kiv.fjp.compiler;

public enum EInstruction {

    LIT("LIT", 0),
    OPR("OPR", 1),
    LOD("LOD", 2),
    STO("STO", 3),
    CAL("CAL", 4),
    RET("RET", 5),
    INT("INT", 6),
    JMP("JMP", 7),
    JMC("JMC", 8),
    REA("REA", 9),
    WRI("WRI", 10),
    OPF("OPF", 11),
    RTI("RTI", 12),
    ITR("ITR", 13),
    NEW("NEW", 14),
    DEL("DEL", 15),
    LDA("LDA", 16),
    STA("STA", 17),
    PLD("PLD", 18),
    PST("PST", 19);

    private String name;
    private int code;

    EInstruction(String name, int code) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }


}




