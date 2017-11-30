package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementIf extends AbstractStatement {

    private AbstractExpression condition;
    private AbstractStatement elseStatement;
    private AbstractStatement statement;


    public StatementIf(AbstractExpression condition, AbstractStatement statement, AbstractStatement elseStatement) {
        this(condition, statement);
        this.elseStatement = elseStatement;
    }


    public StatementIf(AbstractExpression condition, AbstractStatement statement) {
        super(StatementType.IF);
        this.condition = condition;
        this.statement = statement;
    }


    public AbstractExpression getCondition() {
        return condition;
    }

    public AbstractStatement getElseStatement() {
        return elseStatement;
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
        builder.append("IF ").append(condition.toString()).append(" THEN ").append(statement.toString());
        if (elseStatement != null) {
            builder.append(" ELSE THEN ").append(elseStatement.toString());
        }

        return builder.toString();
    }
}
