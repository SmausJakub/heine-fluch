package cz.zcu.kiv.fjp.interpret;


import cz.zcu.kiv.fjp.instruction.Instruction;
import cz.zcu.kiv.fjp.instruction.InstructionHandler;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Interpreter {

    String result = "vypsani resultu";
    private int MEMORY_SIZE = 500;

    private Stack stack = new Stack(1, 0);
    private int[] heap = new int[MEMORY_SIZE];

    private int programCounter;                 // Citac instrukci
    private InstructionHandler instructionHandler;
    private List<Instruction> instructionsList;
    private Instruction instruction;
    private Scanner sc = new Scanner(System.in);

    public String interpret(File instructions) throws Exception {

        instructionHandler = InstructionHandler.getInstance();

        instructionsList = instructionHandler.parseFile(instructions);

        Arrays.fill(heap, 0);
        final int STACK_SIZE = stack.getStackItems().length;
        int value1, value2, returnIntValue;

        float returnFloatValue, valueFloat1, valueFloat2;

        programCounter = 0;
        do {
            if (programCounter < 0 || programCounter > STACK_SIZE) {
                return "Program counter is out of range";
            }

            instruction = instructionsList.get(programCounter);
            System.out.println(instruction.getInstructionCode());

            programCounter++;

            switch (instruction.getInstructionCode()) {

                case "LIT":
                    stack.push(instruction.getOperand());
                    break;
                case "LRT":
                    stack.floatPush(instruction.getFloatOperand());
                    break;
                case "OPR":
                    switch (instruction.getOperand()) {
                        case 0:
                            stack.setValue(stack.getTop(), stack.getBase());
                            programCounter = stack.getValue(stack.getBase() + 2);
                            stack.setBase(stack.getValue(stack.getBase()));
                            break;
                        case 1:    // NEG
                            value1 = stack.pop();
                            stack.push(-value1);
                            break;
                        case 2:    // ADD
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 + value2);
                            break;
                        case 3:    // SUB
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 - value2);
                            break;
                        case 4:    // MUL
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 * value2);
                            break;
                        case 5:    // DIV
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 / value2);
                            break;
                        case 6:    // MOD
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 % value2);
                            break;
                        case 7:    // ODD
                            value1 = stack.pop();
                            stack.push(value1 % 2);
                            break;
                        case 8:    // EQ
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 == value2 ? 1 : 0);
                            break;
                        case 9:    // NE
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 != value2 ? 1 : 0);
                            break;
                        case 10:   // LT
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 < value2 ? 1 : 0);
                            break;
                        case 11:   // GE
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 >= value2 ? 1 : 0);
                            break;
                        case 12:   // GT
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 > value2 ? 1 : 0);
                            break;
                        case 13:   // LE
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 <= value2 ? 1 : 0);
                            break;
                    }
                    break;
                case "LOD":
                    value1 = stack.getValue(instruction.getOperand() + stack.getBaseOfItem(instruction.getLevel()));
                    stack.push(value1);
                    break;
                case "STO":
                    value1 = stack.pop();
                    stack.setValue(instruction.getOperand() + stack.getBaseOfItem(instruction.getLevel()), value1);
                    break;
                case "CAL":
                    stack.setValue(stack.getTop() + 1, stack.getBaseOfItem(instruction.getLevel()));
                    stack.setValue(stack.getTop() + 2, stack.getBase());
                    stack.setValue(stack.getTop() + 3, programCounter);
                    stack.setBase(stack.getTop() + 1);
                    programCounter = instruction.getOperand();
                    break;
                case "RET":
                    stack.setTop(stack.getBase() - 1);
                    programCounter = stack.getValue(stack.getTop() + 3);
                    stack.setBase(stack.getValue(stack.getTop() + 2));
                    break;
                case "INT":
                    stack.increaseTop(instruction.getOperand());
                    break;
                case "JMP":
                    programCounter = instruction.getOperand();
                    break;
                case "JMC":
                    if (stack.getValue(stack.getTop()) == 0) {
                        programCounter = instruction.getOperand();
                    }
                    stack.reduceTop(1);
                    break;
                case "REA":
                    stack.increaseTop(1);
                    stack.setValue(stack.getTop(), sc.nextInt());
                    break;
                case "WRI":
                    System.out.println("" + stack.pop());
                    break;
                case "OPF":
                    switch (instruction.getOperand()) {
                        case 1:  // NEG
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = -valueFloat1;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 2:  // ADD
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = valueFloat1 + valueFloat2;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 3:  // SUB
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = valueFloat1 - valueFloat2;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 4:  // MUL
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = valueFloat1 * valueFloat2;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 5:  // DIV
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = valueFloat1 / valueFloat2;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 6:  // MOD TODO udelat vypis, ze to nejde

                            break;
                        case 7:  // ODD TODO udelat vypis, ze to nejde

                            break;
                        case 8:  // EQ
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 == valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 9:  // NE
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 != valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 10:  // LT
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 < valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 11: // GE
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 >= valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 12: // GT
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 > valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 13: // LE
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 <= valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                    }
                    break;
                case "RTI":
                    valueFloat1 = stack.floatPop();
                    returnIntValue = (int) valueFloat1;
                    stack.push(returnIntValue);
                    break;
                case "ITR":
                    value1 = stack.pop();
                    returnFloatValue = value1;
                    stack.floatPush(returnFloatValue);
                    break;
                case "NEW"://TODO vyzkouset
                    int j = MEMORY_SIZE;
                    while (heap.length < j) {
                        j--;
                    }
                    if (j == 0) {
                        return "Allocation on the " + j + " position in heap is not possible";
                    } else {
                        heap[j] = 1;
                    }
                    stack.increaseTop(1);
                    stack.setTop(j);
                    heap[j] = 1;
                    break;
                case "DEL"://TODO vyzkouset
                    if (heap[stack.getTop()] == 0) {
                        return "Deallocation on this position in heap is not possible";
                    }
                    heap[stack.getTop()] = 0;
                    stack.reduceTop(1);
                    break;
                case "LDA": //Todo otestovat
                    stack.setValue(stack.getTop(), stack.getValue(stack.top()));
                    break;
                case "STA"://Todo otestovat
                    stack.setValue(stack.getValue(stack.top()), stack.getValue(stack.getTop() - 1));
                    break;
                case "PLD":
                    value1 = stack.getValue(stack.top() + stack.getBaseOfItem(stack.getValue(stack.getTop() - 1)));
                    stack.reduceTop(1);
                    stack.setValue(stack.getTop(), value1);
                    break;
                case "PST":
                    value1 = stack.getValue(stack.top() + stack.getBaseOfItem(stack.getValue(stack.getTop() - 1)));
                    stack.reduceTop(3);
                    stack.setValue(value1, stack.getValue(stack.getTop() + 1));
                    break;
                default:
                    System.out.println("End of instructions or unknown instruction.");
                    break;
            }

            System.out.println(Arrays.toString(stack.getStackItems()));
            System.out.println(stack.getTop());

        } while (programCounter != 0);

        result = Integer.toString(stack.top());

        return result;
    }

}