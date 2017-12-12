package cz.zcu.kiv.fjp.interpret;


public class Stack {

    private int base;                       // Baze
    private int top;                        // Vrchol
    private int MEMORY_SIZE = 500;
    private int STACK_SIZE = 500;
    private int[] stackItems = new int[STACK_SIZE];
    private int[] heap = new int[MEMORY_SIZE];


    public Stack(int base, int top) {
        this.base = base;
        this.top = top;
    }

    public void push(int value) {

        if (top  > stackItems.length) {
            throw new IllegalArgumentException("Doslo k preteceni zasobniku");
        }

        stackItems[top] = value;
        top++;
    }

    public int pop() {

        int item;
        top--;
        if (top < 0) {
            throw new IllegalArgumentException("Doslo k podteceni zasobniku");
        }

        item = stackItems[top];

        return item;
    }

    public int top() {

        int item;

        if(top > STACK_SIZE) {
            throw new IllegalArgumentException("Doslo k podteceni zasobniku");
        }

        item = stackItems[top];
        return item;
    }

    public int getValue(int item) {

        return stackItems[item-1];
    }

    public void setValue(int item, int value) {

        stackItems[item-1] = value;
    }


    public int getBaseOfItem(int level) {
        if(level < 0) {
            throw new IllegalArgumentException("Instruction does not exist");
        }
        int newBase = base;
        while (level > 0) {
            newBase = getValue(newBase);
            level--;
        }
        return newBase;
    }

    public int[] getStackItems() {
        return stackItems;
    }

    public void setStackItems(int[] stackItems) {
        this.stackItems = stackItems;
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
