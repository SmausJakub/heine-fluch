package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementDoWhile extends AbstractStatement {


    private AbstractExpression condition;
    private AbstractStatement statement;

    public StatementDoWhile(AbstractExpression condition, AbstractStatement statement, int line) {
        super(StatementType.DO_WHILE, line);
        this.statement = statement;
        this.condition = condition;
    }


    public AbstractExpression getCondition() {
        return condition;
    }

    public AbstractStatement getStatement() {
        return statement;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isLabelled()) {
            builder.append(getLabel().getValue()).append(": ");
        }
        builder.append("DO ").append(statement.toString()).append(" WHILE ").append(condition.toString());

        return builder.toString();
    }
}
