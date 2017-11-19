package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.ExpressionType;

public class AbstractExpression {

    private ExpressionType type;

    public AbstractExpression(ExpressionType type) {
        this.type = type;
    }

    public ExpressionType getType() {
        return type;
    }


}
