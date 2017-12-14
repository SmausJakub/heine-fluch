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
     * level from which to jump
     */
    private int level;

    /**
     * @param ins        jump instruction
     * @param identifier identifier of label
     */
    public Goto(Instruction ins, String identifier, int level) {
        this.identifier = identifier;
        this.ins = ins;
        this.level = level;
    }

    public Instruction getIns() {
        return ins;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getLevel() {
        return level;
    }
}
