package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.ExpressionType;

public class AbstractExpression {

    private ExpressionType expressionType;

    public AbstractExpression(ExpressionType expressionType) {
        this.expressionType = expressionType;
    }

    public ExpressionType getExpressionType() {
        return expressionType;
    }


}
