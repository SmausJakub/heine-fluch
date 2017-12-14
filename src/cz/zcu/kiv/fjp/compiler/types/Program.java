package cz.zcu.kiv.fjp.compiler.types;

/**
 * Program
 */
public class Program {

    /**
     * Block
     */
    private Block block;

    /**
     * @param block program block
     */
    public Program(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }
}
