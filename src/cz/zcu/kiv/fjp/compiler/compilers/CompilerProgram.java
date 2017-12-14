package cz.zcu.kiv.fjp.compiler.compilers;


import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.compiler.types.Goto;
import cz.zcu.kiv.fjp.compiler.types.Program;
import cz.zcu.kiv.fjp.errors.ErrorLabelNeverUsed;
import cz.zcu.kiv.fjp.errors.ErrorLabelOutOfReach;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.*;

/**
 * Program Compiler
 * Compiles program into instructions
 */
public class CompilerProgram {

    /**
     * program to compile
     */
    private Program program;

    /**
     * @param program program to compile
     */
    public CompilerProgram(Program program) {
        this.program = program;
    }

    public Program getProgram() {
        return program;
    }

    /**
     * method to compile a program
     * it calls CompilerBlock to compile the program block
     * as all other compilers, works with CompilerData and its static attributes
     */
    public void compileProgram() {

        Block mainBlock = program.getBlock();
        new CompilerBlock(mainBlock).compileBlock();

        checkGotoList();
        indexList();

        System.out.println("Symbol Table : \n" + symbolTable.printSymbolTable());
        System.out.println("Instruction List : \n" + printInstructionList());

    }

    /**
     * method to check gotoList
     * this method is called at the end of compilation. Certain goto statements have to be checked here to assign their instructions. Because of this:
     *  goto 1;
     *  ....
     *  ....
     *  1: a := b;
     *
     *  when goto statement is used before the label itself is assigned, during the compilation the Compiler does not know the address of the label. Thus it is
     *  stored in gotoList and checked again here
     */
    private void checkGotoList() {
        // go through goto list and check for unresolved statements
        for (Goto got : gotoList) {
            SymbolTableItem item = symbolTable.getItem(got.getIdentifier());

            // check if address is still 0
            if (item.getAddress() != 0) {

                // check if we can jump
                if (item.getLevel() >= got.getLevel()) {
                    got.getIns().setOperand(item.getAddress());
                } else {
                    err.throwError(new ErrorLabelOutOfReach(item.getName()));
                }

            } else {
                err.throwError(new ErrorLabelNeverUsed(item.getName()));
            }

        }
    }

}
