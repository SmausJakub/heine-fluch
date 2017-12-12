package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.instruction.Instruction;

public class Goto {

    private Instruction ins;

    private String identifier;

    public Goto(Instruction ins, String identifier) {
        this.identifier = identifier;
        this.ins = ins;
    }

    public Instruction getIns() {
        return ins;
    }

    public String getIdentifier() {
        return identifier;
    }


}
