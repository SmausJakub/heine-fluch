package cz.zcu.kiv.fjp.compiler.compilers;


import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.compiler.types.Goto;
import cz.zcu.kiv.fjp.compiler.types.Program;
import cz.zcu.kiv.fjp.errors.ErrorLabelNeverUsed;

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
        new CompilerBlock(mainBlock).compileBlock();

        checkGotoList();
        indexList();

        System.out.println("Symbol Table : \n" + symbolTable.printSymbolTable());
        System.out.println("Instruction List : \n" + printInstructionList());

    }

    private void checkGotoList() {
        // go through goto list and check for unresolved statements
        for (Goto got : gotoList) {
            SymbolTableItem item = symbolTable.getItem(got.getIdentifier());

            if (item.getAddress() != 0) {
                got.getIns().setOperand(item.getAddress());
            } else {
                err.throwError(new ErrorLabelNeverUsed(item.getName()));
            }

        }
    }

}
