package cz.zcu.kiv.fjp.interpret;


public class Stack {

    private int base;                       // Baze
    private int top;                        // Vrchol

    public Stack(int base, int top) {
        this.base = base;
        this.top = top;
    }


    public void increaseTop(int value){
        this.top += value;
    }

    public void reduceTop(int value){
        this.top -= value;
    }

    public void changeTop(int value){
        this.top = value;
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


}
