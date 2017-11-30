package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.compiler.types.Label;
import cz.zcu.kiv.fjp.enums.StatementType;

public abstract class AbstractStatement {

    private StatementType statementType;

    private Label label;

    private boolean labelled;

    public AbstractStatement(StatementType statementType) {
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
