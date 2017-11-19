package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.types.expressions.*;
import cz.zcu.kiv.fjp.enums.OperatorAddition;
import cz.zcu.kiv.fjp.enums.OperatorLogic;
import cz.zcu.kiv.fjp.enums.OperatorMultiplication;
import cz.zcu.kiv.fjp.enums.OperatorRelation;

public class VisitorExpression extends Pascal0LikeBaseVisitor<AbstractExpression> {

    @Override
    public AbstractExpression visitUnaryExpr(Pascal0LikeParser.UnaryExprContext ctx) {

        ExpressionUnary expressionUnary = new ExpressionUnary();

        AbstractExpression abstractExpression = this.visit(ctx.expression());

        expressionUnary.setExpression(abstractExpression);
        return expressionUnary;
    }

    @Override
    public AbstractExpression visitNotExpr(Pascal0LikeParser.NotExprContext ctx) {

        ExpressionNot expressionNot = new ExpressionNot();

        AbstractExpression abstractExpression = this.visit(ctx.expression());

        expressionNot.setExpression(abstractExpression);

        return expressionNot;

    }

    @Override
    public AbstractExpression visitLogicExpr(Pascal0LikeParser.LogicExprContext ctx) {

        ExpressionLogic expressionLogic = new ExpressionLogic();

        AbstractExpression leftExpression = this.visit(ctx.expression(0));
        AbstractExpression rightExpression = this.visit(ctx.expression(1));

        expressionLogic.setLeftExpression(leftExpression);
        expressionLogic.setRightExpression(rightExpression);

        OperatorLogic operator = null;
        switch (ctx.op.getType()) {
            case Pascal0LikeParser.AND: {
                operator = OperatorLogic.AND;
                break;
            }
            case Pascal0LikeParser.OR: {
                operator = OperatorLogic.OR;
                break;
            }
        }

        expressionLogic.setOperator(operator);

        return expressionLogic;

    }

    @Override
    public AbstractExpression visitMultiplicationExpr(Pascal0LikeParser.MultiplicationExprContext ctx) {
        ExpressionMultiplication expressionMultiplication = new ExpressionMultiplication();

        AbstractExpression leftExpression = this.visit(ctx.expression(0));
        AbstractExpression rightExpression = this.visit(ctx.expression(1));

        expressionMultiplication.setLeftExpression(leftExpression);
        expressionMultiplication.setRightExpression(rightExpression);

        OperatorMultiplication operator = null;

        switch (ctx.op.getType()) {
            case Pascal0LikeParser.MULTIPLY: {
                operator = OperatorMultiplication.MULTIPLY;
                break;
            }
            case Pascal0LikeParser.DIVIDE: {
                operator = OperatorMultiplication.DIVIDE;
                break;
            }
        }

        expressionMultiplication.setOperator(operator);

        return expressionMultiplication;

    }

    @Override
    public AbstractExpression visitAtomExpr(Pascal0LikeParser.AtomExprContext ctx) {

        ExpressionAtom expressionAtom = new ExpressionAtom();

        VisitorAtom visitorAtom = new VisitorAtom();
        AbstractAtom atom = visitorAtom.visit(ctx.atom());

        expressionAtom.setAtom(atom);

        return expressionAtom;

    }

    @Override
    public AbstractExpression visitAdditiveExpr(Pascal0LikeParser.AdditiveExprContext ctx) {
        ExpressionAdditive expressionAdditive = new ExpressionAdditive();

        AbstractExpression leftExpression = this.visit(ctx.expression(0));
        AbstractExpression rightExpression = this.visit(ctx.expression(1));

        expressionAdditive.setLeftExpression(leftExpression);
        expressionAdditive.setRightExpression(rightExpression);

        OperatorAddition operator = null;

        switch (ctx.op.getType()) {

            case Pascal0LikeParser.PLUS: {
                operator = OperatorAddition.PLUS;
                break;
            }
            case Pascal0LikeParser.MINUS: {
                operator = OperatorAddition.MINUS;
                break;
            }

        }

        expressionAdditive.setOperator(operator);


        return expressionAdditive;
    }

    @Override
    public AbstractExpression visitRelationalExpr(Pascal0LikeParser.RelationalExprContext ctx) {
        ExpressionRelational expressionRelational = new ExpressionRelational();

        AbstractExpression leftExpression = this.visit(ctx.expression(0));
        AbstractExpression rightExpression = this.visit(ctx.expression(1));

        expressionRelational.setLeftExpression(leftExpression);
        expressionRelational.setRightExpression(rightExpression);

        OperatorRelation operator = null;

        switch (ctx.op.getType()) {

            case Pascal0LikeParser.EQUAL: {
                operator = OperatorRelation.EQUAL;
                break;
            }
            case Pascal0LikeParser.NOT_EQUAL: {
                operator = OperatorRelation.NOT_EQUAL;
                break;
            }
            case Pascal0LikeParser.LE: {
                operator = OperatorRelation.LE;
                break;
            }
            case Pascal0LikeParser.LT: {
                operator = OperatorRelation.LT;
                break;
            }
            case Pascal0LikeParser.GE: {
                operator = OperatorRelation.GE;
                break;
            }
            case Pascal0LikeParser.GT: {
                operator = OperatorRelation.GT;
                break;
            }
        }

        expressionRelational.setOperator(operator);

        return expressionRelational;
    }

    @Override
    public AbstractExpression visitParExpr(Pascal0LikeParser.ParExprContext ctx) {
        ExpressionPar expressionPar = new ExpressionPar();

        AbstractExpression expression = this.visit(ctx.expression());

        expressionPar.setExpression(expression);
        return expressionPar;
    }


}
