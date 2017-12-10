package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.compiler.types.Program;

public class CompilerProgram {

    private Program program;

    public CompilerProgram(Program program) {
        this.program = program;
    }

    public Program getProgram() {
        return program;
    }

    public void compileProgram() {

        Block mainBlock = program.getBlock();
        new CompilerBlock(mainBlock, true).compileBlock();

    }

}
