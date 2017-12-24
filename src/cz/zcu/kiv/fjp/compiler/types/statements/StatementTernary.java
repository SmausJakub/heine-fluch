package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * Ternary statement
 * Created by visitors and compiled by compilers
 */
public class StatementTernary extends AbstractStatement {

    /**
     * first expression
     */
    private AbstractExpression expressionOne;

    /**
     * second expression
     */
    private AbstractExpression expressionTwo;

    /**
     * condition
     */
    private AbstractExpression condition;

    /**
     * identifier
     */
    private String identifier;

    /**
     * @param identifier    identifier
     * @param condition    condition
     * @param expressionOne first expression
     * @param expressionTwo second expression
     * @param line          line number
     */
    public StatementTernary(String identifier, AbstractExpression condition, AbstractExpression expressionOne, AbstractExpression expressionTwo, int line) {
        super(StatementType.TERNARY, line);
        this.identifier = identifier;
        this.condition = condition;
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }


    public AbstractExpression getExpressionOne() {
        return expressionOne;
    }

    public AbstractExpression getExpressionTwo() {
        return expressionTwo;
    }

    public AbstractExpression getCondition() {
        return condition;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(identifier).append(" := ").append(condition.toString()).append(" ? ").append(expressionOne.toString()).append(" ! ").append(expressionTwo.toString()).append(";");

        return builder.toString();
    }
}
