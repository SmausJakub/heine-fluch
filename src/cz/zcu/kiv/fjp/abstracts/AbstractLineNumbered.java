package cz.zcu.kiv.fjp.abstracts;

/**
 * Abstract class of numbered object
 * Classed which want to store a number of line extend this class
 * Used to store the line number
 */
public abstract class AbstractLineNumbered {

    /**
     * line number
     */
    private int lineNumber;

    /**
     * @param lineNumber line number
     */
    public AbstractLineNumbered(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
