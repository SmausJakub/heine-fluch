package cz.zcu.kiv.fjp.compiler.compilers;


import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.compiler.types.Goto;
import cz.zcu.kiv.fjp.compiler.types.Program;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.*;

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

        // go through goto list and check for unresolved statements
        for (Goto got : gotoList) {
            SymbolTableItem item = symbolTable.getItem(got.getIdentifier());

            if (item.getAddress() != 0) {
                got.getIns().setOperand(item.getAddress());
            } else {
                err.throwError("Label " + item.getName() + " was declared but never used");
            }

        }


        indexList();

        System.out.println("Symbol Table : \n" + symbolTable.printSymbolTable());
        System.out.println("Instruction List : \n" + printInstructionList());

    }

}
