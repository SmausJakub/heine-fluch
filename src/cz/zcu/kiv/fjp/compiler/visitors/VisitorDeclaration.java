package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.types.*;
import cz.zcu.kiv.fjp.compiler.types.declarations.*;
import cz.zcu.kiv.fjp.enums.VariableType;

import java.util.ArrayList;
import java.util.List;

public class VisitorDeclaration extends Pascal0LikeBaseVisitor<AbstractDeclaration> {


    @Override
    public AbstractDeclaration visitVarSimpleAs(Pascal0LikeParser.VarSimpleAsContext ctx) {
        VariableType type = getType(ctx.type());

        List<Variable> variableList = getIdentifierList(ctx.identifier_list());

        AbstractExpression expression = new VisitorExpression().visit(ctx.expression());

        return new DeclarationVariableSimple(variableList, expression, type, ctx.getStart().getLine());
    }


    @Override
    public AbstractDeclaration visitVarSimpleUnAs(Pascal0LikeParser.VarSimpleUnAsContext ctx) {
        VariableType type = getType(ctx.type());

        List<Variable> variableList = getIdentifierList(ctx.identifier_list());

        return new DeclarationVariableSimple(variableList, type, ctx.getStart().getLine());
    }


    @Override
    public AbstractDeclaration visitVarParallel(Pascal0LikeParser.VarParallelContext ctx) {
        VariableType type = getType(ctx.type());

        List<Variable> variableList = getIdentifierList(ctx.identifier_list());

        List<AbstractExpression> expressionList = new ArrayList<>();

        VisitorExpression visitorExpression = new VisitorExpression();

        for (int i = 0; i < ctx.expression_list().getChildCount(); i++) {
            AbstractExpression expression = visitorExpression.visit(ctx.expression_list().getChild(i));
            if (expression == null) {
                continue;
            }
            expressionList.add(expression);
        }


        return new DeclarationVariableParallel(variableList, expressionList, type, ctx.getStart().getLine());

    }


    @Override
    public AbstractDeclaration visitProcedure_declaration_part(Pascal0LikeParser.Procedure_declaration_partContext ctx) {

        String identifier = ctx.IDENT().getText();
        Block block = new VisitorBlock().visit(ctx.block());


        return new DeclarationProcedure(new Procedure(identifier), block, ctx.getStart().getLine());
    }

    @Override
    public AbstractDeclaration visitConstant_declaration_part(Pascal0LikeParser.Constant_declaration_partContext ctx) {


        VariableType type = getType(ctx.type());

        String[] split = ctx.identifier_list().getText().split(",");

        List<Constant> constantList = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            constantList.add(new Constant(split[i]));
        }

        VisitorAtom visitorAtom = new VisitorAtom();
        AbstractAtom atom = visitorAtom.visit(ctx.atom());

        return new DeclarationConstant(constantList, type, atom, ctx.getStart().getLine());
    }


    @Override
    public AbstractDeclaration visitLabel_declaration_part(Pascal0LikeParser.Label_declaration_partContext ctx) {

        List<Label> labelList = new ArrayList<>();
        String[] split = ctx.label_list().getText().split(",");
        for (int i = 0; i < split.length; i++) {
            labelList.add(new Label(Integer.parseInt(split[i])));
        }


        return new DeclarationLabel(labelList, ctx.getStart().getLine());
    }


    private VariableType getType(Pascal0LikeParser.TypeContext type) {

        VariableType ret = null;

        switch (type.op.getType()) {

            case Pascal0LikeParser.STR: {
                ret = VariableType.STRING;
                break;
            }
            case Pascal0LikeParser.REAL: {
                ret = VariableType.REAL;
                break;
            }
            case Pascal0LikeParser.INTEGER: {
                ret = VariableType.INTEGER;
                break;
            }
            case Pascal0LikeParser.BOOLEAN: {
                ret = VariableType.BOOLEAN;
                break;
            }
        }

        return ret;
    }

    private List<Variable> getIdentifierList(Pascal0LikeParser.Identifier_listContext identifier_listContext) {

        String[] split = identifier_listContext.getText().split(",");
        List<Variable> ret = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            ret.add(new Variable(split[i]));
        }

        return ret;
    }

}
