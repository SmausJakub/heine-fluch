package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.StatementType;

public abstract class AbstractStatement {

    private StatementType statementType;

    public AbstractStatement(StatementType statementType) {
        this.statementType = statementType;
    }

    public StatementType getStatementType() {
        return statementType;
    }
}
