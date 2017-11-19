package cz.zcu.kiv.fjp.instruction;

public class Instruction {


    private int index;
    private String instructionCode;
    private int level;
    private int operand;

    public Instruction(int index, String instructionCode, int level, int operand) {
        this.index = index;
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

    public int getIndex() {
        return index;
    }

    public String toString() {

        return (index + "\t" + instructionCode + "\t" + level + " " + operand + "\n");

    }


}
