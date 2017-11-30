package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementAssignment extends AbstractStatement {

    private String identifier;
    private AbstractExpression expression;

    public StatementAssignment(String identifier, AbstractExpression expression) {
        super(StatementType.ASSIGNMENT);
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isLabelled()) {
            builder.append(getLabel().getValue()).append(": ");
        }
        builder.append(identifier).append(" := ").append(expression.toString());

        return builder.toString();
    }
}
