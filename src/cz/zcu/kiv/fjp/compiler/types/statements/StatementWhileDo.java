package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * While Do statement
 * Created by visitors and compiled by compilers
 */
public class StatementWhileDo extends AbstractStatement {

    /**
     * condition
     */
    private AbstractExpression condition;

    /**
     * statement
     */
    private AbstractStatement statement;

    /**
     * @param condition condition
     * @param statement statement
     * @param line      line number
     */
    public StatementWhileDo(AbstractExpression condition, AbstractStatement statement, int line) {
        super(StatementType.WHILE_DO, line);
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
        builder.append("WHILE ").append(condition.toString()).append(" DO ").append(statement.toString()).append(";");

        return builder.toString();
    }
}
