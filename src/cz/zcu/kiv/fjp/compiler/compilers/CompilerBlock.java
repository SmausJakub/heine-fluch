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

/**
 * Block Compiler
 * Compiles block intro instructions
 */
public class CompilerBlock {

    /**
     * block to compile
     */
    private Block block;

    /**
     * @param block block to compile
     */
    public CompilerBlock(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

    /**
     * method to compile a block
     * goes through declarations and statements, calls CompilerDeclaration and CompilerStatement
     */
    public void compileBlock() {

        // null the declaration counter
        declarationCounter = 0;

        // default address
        currentAddress = 3;

        // prepare skip instruction (to skip if we are in procedure) and INT jump (to increase the stack)
        Instruction skip = new Instruction(InstructionCode.JMP.getName(), 0, 0);
        Instruction intJump = new Instruction(InstructionCode.INT.getName(), 0, 0);

        List<AbstractDeclaration> declarationList = block.getDeclarationList();
        List<AbstractStatement> statementList = block.getStatementList();

        // check for procedure declaration
        boolean procedureCheck = true;

        // sort declarations so procedure declarations are last
        Collections.sort(declarationList);

        // add the int jump with temporary values
        instructionList.add(intJump);


        // go through declarations
        for (AbstractDeclaration declaration : declarationList) {

            // if the declaration is a procedure, skip its code
            if (declaration.getDeclarationType() == DeclarationType.PROCEDURE && procedureCheck) {
                procedureCheck = false;

                // to skip the procedure code
                instructionList.add(skip);
            }

            // compile declaration
            new CompilerDeclaration(declaration).compileDeclaration();
        }

        // if we had a procedure declaration, skip to the current index
        if (!procedureCheck) {
            skip.setOperand(instructionList.size());
        }

        // declaration jump is number of declarations made to an address + 3
        int declarationJmp = declarationCounter + MIN_DECLARATION;

        // int stack
        intJump.setOperand(declarationJmp);

        // go through statements and compile them
        for (AbstractStatement statement : statementList) {
            new CompilerStatement(statement, false).compileStatement();
        }

        // return instruction
        instructionList.add(new Instruction(InstructionCode.RET.getName(), 0, 0));


    }


}
