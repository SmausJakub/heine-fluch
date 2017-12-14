package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.compiler.types.Label;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * Abstract class of statement
 * All statements extend this class
 * Used to store the statement type and label if statement is labelled
 */
public abstract class AbstractStatement extends AbstractLineNumbered {

    /**
     * statement type
     */
    private StatementType statementType;

    /**
     * label, if labelled
     */
    private Label label;

    /**
     * boolean to determine if labelled
     */
    private boolean labelled;

    /**
     * @param statementType statement type
     * @param lineNumber    line number
     */
    public AbstractStatement(StatementType statementType, int lineNumber) {
        super(lineNumber);
        this.statementType = statementType;
        this.labelled = false;
    }

    public StatementType getStatementType() {
        return statementType;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
        this.labelled = true;
    }

    public boolean isLabelled() {
        return labelled;
    }
}
