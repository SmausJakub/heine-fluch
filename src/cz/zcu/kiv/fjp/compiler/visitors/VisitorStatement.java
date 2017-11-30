package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.CaseLimb;
import cz.zcu.kiv.fjp.compiler.types.Label;
import cz.zcu.kiv.fjp.compiler.types.statements.*;
import cz.zcu.kiv.fjp.enums.ForType;
import cz.zcu.kiv.fjp.enums.IOType;

import java.util.ArrayList;
import java.util.List;

public class VisitorStatement extends Pascal0LikeBaseVisitor<AbstractStatement> {

    @Override
    public AbstractStatement visitLabelled(Pascal0LikeParser.LabelledContext ctx) {
        Label label = new Label(Integer.parseInt(ctx.INT().getText()));
        AbstractStatement statement = this.visitChildren(ctx);
        statement.setLabel(label);
        return statement;
    }

    @Override
    public AbstractStatement visitNonlabelled(Pascal0LikeParser.NonlabelledContext ctx) {

        return this.visitChildren(ctx);

    }

    @Override
    public AbstractStatement visitIf_statement(Pascal0LikeParser.If_statementContext ctx) {

        AbstractExpression condition = new VisitorExpression().visit(ctx.expression());
        AbstractStatement statement = this.visit(ctx.statement(0));

        if (ctx.statement(1) != null) {
            AbstractStatement elseStatement = this.visit(ctx.statement(1));

            return new StatementIf(condition, statement, elseStatement);
        } else {
            return new StatementIf(condition, statement);
        }


    }

    @Override
    public AbstractStatement visitCompound_statement(Pascal0LikeParser.Compound_statementContext ctx) {
        List<AbstractStatement> statementList = new ArrayList<>();

        for (int i = 0; i < ctx.statement_list().getChildCount(); i++) {
            AbstractStatement statement = this.visit(ctx.statement_list().getChild(i));
            if (statement == null) {
                continue;
            }
            statementList.add(statement);
        }

        return new StatementCompound(statementList);


    }


    @Override
    public AbstractStatement visitIo_statement(Pascal0LikeParser.Io_statementContext ctx) {

        IOType type = null;
        switch (ctx.op.getType()) {
            case Pascal0LikeParser.READ: {
                type = IOType.READ;
                break;
            }
            case Pascal0LikeParser.WRITE: {
                type = IOType.WRITE;
                break;
            }
        }

        String identifier = ctx.IDENT().getText();

        return new StatementIO(identifier, type);
    }

    @Override
    public AbstractStatement visitTernary_statement(Pascal0LikeParser.Ternary_statementContext ctx) {
        String identifier = ctx.IDENT().getText();
        VisitorExpression visitorExpression = new VisitorExpression();
        AbstractExpression expression = visitorExpression.visit(ctx.expression(0));
        AbstractExpression ternaryOne = visitorExpression.visit(ctx.expression(1));
        AbstractExpression ternaryTwo = visitorExpression.visit(ctx.expression(2));

        return new StatementTernary(identifier, expression, ternaryOne, ternaryTwo);
    }

    @Override
    public AbstractStatement visitAssignment_statement(Pascal0LikeParser.Assignment_statementContext ctx) {
        String identifier = ctx.IDENT().getText();
        AbstractExpression expression = new VisitorExpression().visit(ctx.expression());
        return new StatementAssignment(identifier, expression);
    }

    @Override
    public AbstractStatement visitGoto_statement(Pascal0LikeParser.Goto_statementContext ctx) {
        return new StatementGoto(Integer.parseInt(ctx.INT().getText()));
    }

    @Override
    public AbstractStatement visitProcedure_statement(Pascal0LikeParser.Procedure_statementContext ctx) {
        return new StatementProcedure(ctx.IDENT().getText());

    }


    @Override
    public AbstractStatement visitWhile_do_statement(Pascal0LikeParser.While_do_statementContext ctx) {

        AbstractExpression condition = new VisitorExpression().visit(ctx.expression());
        AbstractStatement statement = this.visit(ctx.statement());

        return new StatementWhileDo(condition, statement);
    }

    @Override
    public AbstractStatement visitDo_while_statement(Pascal0LikeParser.Do_while_statementContext ctx) {
        AbstractExpression condition = new VisitorExpression().visit(ctx.expression());
        AbstractStatement statement = this.visit(ctx.statement());

        return new StatementDoWhile(condition, statement);
    }

    @Override
    public AbstractStatement visitRepeat_statement(Pascal0LikeParser.Repeat_statementContext ctx) {
        AbstractExpression condition = new VisitorExpression().visit(ctx.expression());
        AbstractStatement statement = this.visit(ctx.statement());

        return new StatementRepeat(condition, statement);
    }

    @Override
    public AbstractStatement visitFor_statement(Pascal0LikeParser.For_statementContext ctx) {

        ForType type = null;
        switch (ctx.op.getType()) {
            case Pascal0LikeParser.TO: {
                type = ForType.TO;
                break;
            }
            case Pascal0LikeParser.DOWNTO: {
                type = ForType.DOWNTO;
                break;
            }
        }

        String identifier = ctx.IDENT().getText();
        VisitorExpression visitorExpression = new VisitorExpression();
        AbstractExpression from = visitorExpression.visit(ctx.expression(0));
        AbstractExpression to = visitorExpression.visit(ctx.expression(1));

        AbstractStatement statement = this.visit(ctx.statement());

        return new StatementFor(identifier, from, to, statement, type);


    }

    @Override
    public AbstractStatement visitCase_statement(Pascal0LikeParser.Case_statementContext ctx) {

        AbstractExpression expression = new VisitorExpression().visit(ctx.expression());
        List<CaseLimb> limbList = new ArrayList<>();
        VisitorCase visitorCase = new VisitorCase();

        for (int i = 0; i < ctx.case_limb_list().getChildCount(); i++) {
            CaseLimb caseLimb = visitorCase.visit(ctx.case_limb_list().getChild(i));
            limbList.add(caseLimb);
        }


        return new StatementCase(expression, limbList);
    }
}
