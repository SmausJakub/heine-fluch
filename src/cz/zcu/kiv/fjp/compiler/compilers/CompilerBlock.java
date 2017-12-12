package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.enums.InstructionCode;
import cz.zcu.kiv.fjp.instruction.Instruction;

import java.util.List;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.*;

public class CompilerBlock {


    private Block block;

    private boolean main;

    public CompilerBlock(Block block, boolean main) {
        this.block = block;
        this.main = main;
    }

    public Block getBlock() {
        return block;
    }

    public boolean isMain() {
        return main;
    }

    public void compileBlock() {

        List<AbstractDeclaration> declarationList = block.getDeclarationList();
        List<AbstractStatement> statementList = block.getStatementList();


        for (AbstractDeclaration declaration : declarationList) {
            new CompilerDeclaration(declaration).compileDeclaration();

        }

        // watch out for main ?
        int declarationJmp = declarationCounter + MIN_DECLARATION;

        instructionList.add(0, new Instruction(InstructionCode.INT.getName(), currentLevel, declarationJmp));

        for (AbstractStatement statement : statementList) {
            new CompilerStatement(statement).compileStatement();
        }

        instructionList.add(new Instruction(InstructionCode.RET.getName(), 0, 0));


    }


}
