package cz.zcu.kiv.fjp.interpret;


import cz.zcu.kiv.fjp.instruction.Instruction;
import cz.zcu.kiv.fjp.instruction.InstructionHandler;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Interpreter {

    String result = "vypsani resultu";
    private int MEMORY_SIZE = 20;
    private int STACK_SIZE = 20;

    FloatingInStack operand1 = new FloatingInStack(0);
    FloatingInStack operand2 = new FloatingInStack(0);


    private Stack stack = new Stack(1, 0);
    private int[] stackItems = new int[STACK_SIZE];
    private int[] memoryMap = new int[MEMORY_SIZE];

    private int programCounter;                 // Citac instrukci
    private InstructionHandler instructionHandler;
    private List<Instruction> instructionsList;
    private Instruction instruction;


    public String interpret(File instructions) {

        try {
            instructionHandler = InstructionHandler.getInstance();

            instructionsList = instructionHandler.parseFile(instructions);

            programCounter = 0;
            do {
                if(programCounter < 0 || programCounter > STACK_SIZE){
                    return "Program counter is out of range";
                }

                instruction = instructionsList.get(programCounter);
                System.out.println(instruction.getInstructionCode());
                programCounter++;

                switch (instruction.getInstructionCode()) {

                    case "LIT" :
                        stack.increaseTop(1);
                        stackItems[stack.getTop()] = instruction.getOperand();
                        break;
                    case "OPR" :

                        switch(instruction.getOperand()) {
                            case 0 :
                                stack.changeTop(stack.getBase());
                                programCounter = stackItems[stack.getBase() + 2];
                                stack.setBase(stackItems[stack.getBase()]);
                                break;
                            case 1 :    // NEG
                                stackItems[stack.getTop()] = -stackItems[stack.getTop()];
                                break;
                            case 2 :    // ADD
                                stack.reduceTop(1);
                                stackItems[stack.getTop()] += stackItems[stack.getTop() + 1];
                                break;
                            case 3 :    // SUB
                                stack.reduceTop(1);
                                stackItems[stack.getTop()] -= stackItems[stack.getTop() + 1];
                                break;
                            case 4 :    // MUL
                                stack.reduceTop(1);
                                stackItems[stack.getTop()] *= stackItems[stack.getTop() + 1];
                                break;
                            case 5 :    // DIV
                                stack.reduceTop(1);
                                if(stackItems[stack.getTop() + 1] != 0){
                                    stackItems[stack.getTop()] /= stackItems[stack.getTop() + 1];
                                } else {
                                    return "You are dividing with zero";
                                }
                                break;
                            case 6 :    // MOD
                                stack.reduceTop(1);
                                if(stackItems[stack.getTop() + 1] != 0){
                                    stackItems[stack.getTop()] %= stackItems[stack.getTop() + 1];
                                } else {
                                    return "You are dividing with zero";
                                }

                                break;
                            case 7 :    // ODD
                                stackItems[stack.getTop()] = stackItems[stack.getTop()] % 2;
                                break;
                            case 8 :    // EQ
                                stack.reduceTop(1);
                                if (stackItems[stack.getTop()] == stackItems[stack.getTop() + 1]) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                            case 9 :    // NE
                                stack.reduceTop(1);
                                if (stackItems[stack.getTop()] != stackItems[stack.getTop() + 1]) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                            case 10 :   // LT
                                stack.reduceTop(1);
                                if (stackItems[stack.getTop()] < stackItems[stack.getTop() + 1]) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                            case 11 :   // GE
                                stack.reduceTop(1);
                                if (stackItems[stack.getTop()] >= stackItems[stack.getTop() + 1]) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                            case 12 :   // GT
                                stack.reduceTop(1);
                                if (stackItems[stack.getTop()] > stackItems[stack.getTop() + 1]) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }

                                break;
                            case 13 :   // LE
                                stack.reduceTop(1);
                                if (stackItems[stack.getTop()] <= stackItems[stack.getTop() - 1]) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                        }
                        break;
                    case "LOD" :
                        stack.increaseTop(1);
                        stackItems[stack.getTop()] = stackItems[instruction.getOperand() + getBase(stack.getBase(), instruction.getLevel())];
                        break;
                    case "STO" :
                        stackItems[instruction.getOperand() + getBase(stack.getBase(), instruction.getLevel())] = stackItems[stack.getTop()];
                        stack.reduceTop(1);
                        break;
                    case "CAL" :
                        stackItems[stack.getTop() + 1] = getBase(stack.getBase(), instruction.getLevel());
                        stackItems[stack.getTop() + 2] = stack.getBase();
                        stackItems[stack.getTop() + 3] = programCounter;
                        stack.setBase(stack.getTop() + 1);
                        programCounter = instruction.getOperand();
                        break;
                    case "RET" :
                        stack.setTop(stack.getBase() - 1);
                        programCounter = stackItems[stack.getTop() + 3];
                        stack.setBase(stackItems[stack.getTop() + 2]);
                        break;
                    case "INT" :
                        stack.increaseTop(instruction.getOperand());
                        break;
                    case "JMP" :
                        programCounter = instruction.getOperand();
                        break;
                    case "JMC" :
                        if(stackItems[stack.getTop()] == 0) {
                            programCounter = instruction.getOperand();
                        }
                        stack.reduceTop(1);
                        break;
                    case "REA" : // TODO dodelat
                        stack.increaseTop(1);
                        break;
                    case "WRI" : // TODO

                        stack.reduceTop(1);
                        break;
                    case "OPF" :
                        switch(instruction.getOperand()) {
                            case 1:   // NEG
                                loadFloatingOp(operand1);
                                operand1.setFloatingValue(-operand1.getFloatingValue());
                                writeFloatingOp(operand1);
                                break;
                            case 2:   // ADD
                                loadFloatingOp(operand2);
                                stack.reduceTop(2);
                                loadFloatingOp(operand1);
                                operand1.setFloatingValue(operand1.getFloatingValue() + operand2.getFloatingValue());
                                writeFloatingOp(operand1);
                                break;
                            case 3:   // SUB
                                loadFloatingOp(operand2);
                                stack.reduceTop(2);
                                loadFloatingOp(operand1);
                                operand1.setFloatingValue(operand1.getFloatingValue() - operand2.getFloatingValue());
                                writeFloatingOp(operand1);
                                break;
                            case 4:   // MUL
                                loadFloatingOp(operand2);
                                stack.reduceTop(2);
                                loadFloatingOp(operand1);
                                operand1.setFloatingValue(operand1.getFloatingValue() * operand2.getFloatingValue());
                                writeFloatingOp(operand1);
                                break;
                            case 5:   // DIV
                                loadFloatingOp(operand2);
                                if(operand2.getFloatingValue() == 0) {
                                    return "You are dividing with zero";
                                } else {
                                    stack.reduceTop(2);
                                    loadFloatingOp(operand1);
                                    operand1.setFloatingValue(operand1.getFloatingValue() / operand2.getFloatingValue());
                                    writeFloatingOp(operand1);
                                }

                                break;
                            case 6:   // MOD TODO udelat vypis, ze to nejde

                                break;
                            case 7:   // ODD TODO udelat vypis, ze to nejde

                                break;
                            case 8:   // EQ
                                loadFloatingOp(operand2);
                                stack.reduceTop(2);
                                loadFloatingOp(operand1);
                                stack.reduceTop(1);
                                if(operand1.getFloatingValue() == operand2.getFloatingValue()) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                            case 9:   // NE
                                loadFloatingOp(operand2);
                                stack.reduceTop(2);
                                loadFloatingOp(operand1);
                                stack.reduceTop(1);
                                if(operand1.getFloatingValue() != operand2.getFloatingValue()) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                            case 10:   // LT
                                loadFloatingOp(operand2);
                                stack.reduceTop(2);
                                loadFloatingOp(operand1);
                                stack.reduceTop(1);
                                if(operand1.getFloatingValue() < operand2.getFloatingValue()) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                            case 11:  // GE
                                loadFloatingOp(operand2);
                                stack.reduceTop(2);
                                loadFloatingOp(operand1);
                                stack.reduceTop(1);
                                if(operand1.getFloatingValue() >= operand2.getFloatingValue()) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                            case 12:  // GT
                                loadFloatingOp(operand2);
                                stack.reduceTop(2);
                                loadFloatingOp(operand1);
                                stack.reduceTop(1);
                                if(operand1.getFloatingValue() > operand2.getFloatingValue()) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                            case 13:  // LE
                                loadFloatingOp(operand2);
                                stack.reduceTop(2);
                                loadFloatingOp(operand1);
                                stack.reduceTop(1);
                                if(operand1.getFloatingValue() <= operand2.getFloatingValue()) {
                                    stackItems[stack.getTop()] = 1;
                                } else {
                                    stackItems[stack.getTop()] = 0;
                                }
                                break;
                        }
                        break;
                    case "RTI" :
                        loadFloatingOp(operand1);
                        stack.reduceTop(1);
                        stackItems[stack.getTop()] = (int)operand1.getFloatingValue();
                        break;
                    case "ITR" :
                        operand1.setFloatingValue((double) stackItems[stack.getTop()]);
                        stack.reduceTop(1);
                        stackItems[stack.getTop()] = (int) (operand1.getFloatingValue());
                        break;
                    case "NEW" :

                        break;
                    case "DEL" :

                        break;
                    case "LDA" :

                        break;
                    case "STA" :

                        break;
                    case "PLD" ://TODO

                        break;
                    case "PST"://TODO

                        break;
                    default:
                        System.out.println("End of instructions or unknown instruction.");
                        break;
                }

                System.out.println(Arrays.toString(stackItems));
                System.out.println(stack.getTop());

            } while (programCounter != 0); //TODO mozna pridat podminku kdyz je pocet naplnen

            result = Integer.toString(stackItems[stack.getTop()]);

            System.out.println("Vrchol zasobniku je: " + stack.getTop());
            System.out.println("Baze zasobniku je: " + stack.getBase());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    private void loadFloatingOp(FloatingInStack operand) {
        int[] ints = new int[2];
        ints[0] = stackItems[stack.getTop()];
        ints[1] = stackItems[stack.getTop() - 1];
        operand.toDouble(ints);

    }

    private void writeFloatingOp(FloatingInStack operand) {
        int[] ints = operand.createComponents((double) (stack.getTop() - 1));
        stackItems[stack.getTop() ] = ints[0];
        stackItems[stack.getTop() - 1] = ints[1];

    }


    private int getBase(int base, int level) {
        int oldBase = base;
        while (level > 0) {
            oldBase = stackItems[oldBase + 1];
            level--;
        }
        return oldBase;
    }

}