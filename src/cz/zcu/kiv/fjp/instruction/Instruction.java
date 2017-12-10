package cz.zcu.kiv.fjp.instruction;

public class Instruction implements Comparable<Instruction> {


    private int index;
    private String instructionCode;
    private int level;
    private int operand;


    public Instruction(String instructionCode, int level, int operand) {
        this(0, instructionCode, level, operand);
    }

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

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {

        return (index + "\t" + instructionCode + "\t" + level + " " + operand + "\n");

    }


    @Override
    public int compareTo(Instruction o) {

        return Integer.compare(this.index, o.index);

    }
}
