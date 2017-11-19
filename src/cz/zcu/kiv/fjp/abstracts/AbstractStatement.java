package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.StatementType;

public abstract class AbstractStatement {

    private StatementType type;

    public AbstractStatement(StatementType type) {
        this.type = type;
    }

    public StatementType getType() {
        return type;
    }
}
