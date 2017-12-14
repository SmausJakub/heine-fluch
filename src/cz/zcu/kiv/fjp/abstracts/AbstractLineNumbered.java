package cz.zcu.kiv.fjp.abstracts;

public abstract class AbstractLineNumbered {

    private int lineNumber;

    public AbstractLineNumbered(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
