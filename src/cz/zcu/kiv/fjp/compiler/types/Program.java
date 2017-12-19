package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.enums.ProgramMode;

/**
 * Program
 */
public class Program {

    /**
     * Block
     */
    private Block block;

    /**
     * program identifier
     */
    private String identifier;

    /**
     * program mode
     */
    private ProgramMode programMode;

    /**
     * @param block program block
     */
    public Program(String identifier, ProgramMode programMode, Block block) {
        this.block = block;
        this.identifier = identifier;
        this.programMode = programMode;
    }

    public Block getBlock() {
        return block;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ProgramMode getProgramMode() {
        return programMode;
    }
}
