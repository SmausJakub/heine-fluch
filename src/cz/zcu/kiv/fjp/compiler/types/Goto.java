package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.instruction.Instruction;

/**
 * Goto
 */
public class Goto {

    /**
     * jump instruction
     */
    private Instruction ins;

    /**
     * identifier
     */
    private String identifier;

    /**
     * @param ins        jump instruction
     * @param identifier identifier of label
     */
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
