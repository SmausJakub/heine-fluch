package cz.zcu.kiv.fjp.compiler;

public class Instruction {


    private String instructionCode;
    private int level;
    private int operand;

    public Instruction(String instructionCode, int level, int operand) {
        this.instructionCode = instructionCode;
        this.level = level;
        this.operand = operand;
    }

    public String getInstructionCode() {
        return instructionCode;
    }

    public int getLevel() {
        return level;
    }

    public int getOperand() {
        return operand;
    }


}
