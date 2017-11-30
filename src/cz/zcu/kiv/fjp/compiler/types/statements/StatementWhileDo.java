package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementWhileDo extends AbstractStatement {

    private AbstractExpression condition;
    private AbstractStatement statement;


    public StatementWhileDo(AbstractExpression condition, AbstractStatement statement) {
        super(StatementType.WHILE_DO);
        this.condition = condition;
        this.statement = statement;
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
        builder.append("WHILE ").append(condition.toString()).append(" DO ").append(statement.toString());

        return builder.toString();
    }
}
