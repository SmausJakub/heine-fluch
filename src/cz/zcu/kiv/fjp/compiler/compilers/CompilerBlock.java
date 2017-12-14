package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.enums.DeclarationType;
import cz.zcu.kiv.fjp.enums.InstructionCode;
import cz.zcu.kiv.fjp.instruction.Instruction;

import java.util.Collections;
import java.util.List;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.*;

public class CompilerBlock {


    private Block block;

    public CompilerBlock(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

    public void compileBlock() {

        declarationCounter = 0;

        Instruction skip = new Instruction(InstructionCode.JMP.getName(), 0, 0);
        Instruction intJump = new Instruction(InstructionCode.INT.getName(), 0, 0);

        List<AbstractDeclaration> declarationList = block.getDeclarationList();
        List<AbstractStatement> statementList = block.getStatementList();

        boolean procedureCheck = true;

        // procedures last
        Collections.sort(declarationList);

        instructionList.add(intJump);


        for (AbstractDeclaration declaration : declarationList) {

            // skip the procedures code
            if (declaration.getDeclarationType() == DeclarationType.PROCEDURE && procedureCheck) {
                procedureCheck = false;
                instructionList.add(skip);
            }

            new CompilerDeclaration(declaration).compileDeclaration();
        }

        if (!procedureCheck) {
            skip.setOperand(instructionList.size());
        }

        int declarationJmp = declarationCounter + MIN_DECLARATION;

        intJump.setOperand(declarationJmp);

        for (AbstractStatement statement : statementList) {
            new CompilerStatement(statement, false).compileStatement();
        }

        instructionList.add(new Instruction(InstructionCode.RET.getName(), 0, 0));


    }


}
