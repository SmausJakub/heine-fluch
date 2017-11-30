package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementTernary extends AbstractStatement {


    private AbstractExpression expressionOne;
    private AbstractExpression expressionTwo;
    private AbstractExpression expression;
    private String identifier;

    public StatementTernary(String identifier, AbstractExpression expression, AbstractExpression expressionOne, AbstractExpression expressionTwo) {
        super(StatementType.TERNARY);
        this.identifier = identifier;
        this.expression = expression;
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }


    public AbstractExpression getExpressionOne() {
        return expressionOne;
    }

    public AbstractExpression getExpressionTwo() {
        return expressionTwo;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isLabelled()) {
            builder.append(getLabel().getValue()).append(": ");
        }
        builder.append(identifier).append(" := ").append(expression.toString()).append(" ? ").append(expressionOne.toString()).append(" ! ").append(expressionTwo.toString());

        return builder.toString();
    }
}
