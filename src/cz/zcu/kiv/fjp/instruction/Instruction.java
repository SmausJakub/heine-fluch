package cz.zcu.kiv.fjp.instruction;

import java.text.DecimalFormat;

public class Instruction implements Comparable<Instruction> {


    private int index;
    private String instructionCode;
    private int level;
    private double operand;


    public Instruction(String instructionCode, int level, double operand) {
        this(0, instructionCode, level, operand);
    }

    public Instruction(int index, String instructionCode, int level, double operand) {
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
        return (int)operand;
    }

    public float getFloatOperand() { return (float)operand; }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setInstructionCode(String instructionCode) {
        this.instructionCode = instructionCode;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        return (index + "\t" + instructionCode + "\t" + level + " " + format.format(operand) + "\n");

    }


    @Override
    public int compareTo(Instruction o) {

        return Integer.compare(this.index, o.index);

    }
}
