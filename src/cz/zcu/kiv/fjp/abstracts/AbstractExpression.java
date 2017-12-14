package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.ExpressionType;

/**
 * Abstract class of expression
 * All expressions extend this class
 * Used to store expression type
 */
public abstract class AbstractExpression {

    /**
     * expression type
     */
    private ExpressionType expressionType;

    /**
     * @param expressionType type of expression
     */
    public AbstractExpression(ExpressionType expressionType) {
        this.expressionType = expressionType;
    }

    public ExpressionType getExpressionType() {
        return expressionType;
    }


}
