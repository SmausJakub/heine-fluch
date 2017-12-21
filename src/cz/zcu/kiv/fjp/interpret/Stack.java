package cz.zcu.kiv.fjp.interpret;

import cz.zcu.kiv.fjp.errors.ErrorStackOverflow;
import cz.zcu.kiv.fjp.errors.ErrorStackUnderflow;

import static cz.zcu.kiv.fjp.interpret.Interpreter.err;

public class Stack {

    private int base;                       // Baze
    private int top;                        // Vrchol
    private int STACK_SIZE = 500;
    private int[] stackItems = new int[STACK_SIZE];


    public Stack(int base, int top) {
        this.base = base;
        this.top = top;
    }

    public void push(int value) {

        if (top  > stackItems.length) {
            err.throwError(new ErrorStackOverflow(), value);
        }

        stackItems[top] = value;
        top++;
    }

    public int pop() {

        int item;
        top--;
        if (top < 0) {
            err.throwError(new ErrorStackUnderflow(), top);
        }

        item = stackItems[top];
        stackItems[top] = 0;
        return item;
    }

    public int top() {

        int item;

        if(top > STACK_SIZE) {
            err.throwError(new ErrorStackUnderflow(), top);
        }

        item = stackItems[top-1];
        return item;
    }

    public int getValue(int item) {

        return stackItems[item-1];
    }

    public void setValue(int item, int value) {

        stackItems[item-1] = value;
    }

    public float getFloatValue(int item) {

        return Float.intBitsToFloat(stackItems[item-1]);
    }

    public void setFloatValue(int item, float value) {

        stackItems[item-1] = Float.floatToRawIntBits(value);
    }


    public int getBaseOfItem(int level) {
        int newBase = base;

        for(int i = 0; i < level; i++) {
            newBase = stackItems[base];
        }
        return newBase;
    }

    public int[] getStackItems() {
        return stackItems;
    }

    public void increaseTop(int value){
        this.top += value;
    }

    public void reduceTop(int value){
        this.top -= value;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public float floatTop() {
        int value = top();
        return Float.intBitsToFloat(value);
    }

    public float floatPop() {
        int value = pop();
        return Float.intBitsToFloat(value);
    }

    public void floatPush(float value) {
        int intValue = Float.floatToRawIntBits(value);
        push(intValue);
    }

}
