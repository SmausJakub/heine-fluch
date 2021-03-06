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

/**
 * Declaration Visitor
 * Visits the ANTLR tree and creates classes for declarations
 */
public class VisitorDeclaration extends Pascal0LikeBaseVisitor<AbstractDeclaration> {

    /**
     * visits simple variable declaration which is assigned
     *
     * @param ctx tree context
     * @return DeclarationVariableSimple with list of variables, expression, variable type and line number
     */
    @Override
    public AbstractDeclaration visitVarSimpleAs(Pascal0LikeParser.VarSimpleAsContext ctx) {
        VariableType type = getType(ctx.type());

        List<Variable> variableList = getIdentifierList(ctx.identifier_list());

        // visit expression
        AbstractExpression expression = new VisitorExpression().visit(ctx.expression());

        return new DeclarationVariableSimple(variableList, expression, type, ctx.getStart().getLine());
    }

    /**
     * visits simple variable declaration which is not assigned
     * @param ctx tree context
     * @return DeclarationVariableSimple with variable list, variable type and line number
     */
    @Override
    public AbstractDeclaration visitVarSimpleUnAs(Pascal0LikeParser.VarSimpleUnAsContext ctx) {
        VariableType type = getType(ctx.type());

        List<Variable> variableList = getIdentifierList(ctx.identifier_list());

        return new DeclarationVariableSimple(variableList, type, ctx.getStart().getLine());
    }

    /**
     * visits variable parallel declaration
     * @param ctx tree context
     * @return DeclarationVariableParallel with variable list, expression list, variable type and line number
     */
    @Override
    public AbstractDeclaration visitVarParallel(Pascal0LikeParser.VarParallelContext ctx) {
        VariableType type = getType(ctx.type());

        List<Variable> variableList = getIdentifierList(ctx.identifier_list());

        List<AbstractExpression> expressionList = new ArrayList<>();

        VisitorExpression visitorExpression = new VisitorExpression();

        // visit all expressions
        for (int i = 0; i < ctx.expression_list().getChildCount(); i++) {
            AbstractExpression expression = visitorExpression.visit(ctx.expression_list().getChild(i));
            if (expression == null) {
                continue;
            }
            expressionList.add(expression);
        }


        return new DeclarationVariableParallel(variableList, expressionList, type, ctx.getStart().getLine());

    }

    /**
     * visits procedure declaration
     * @param ctx tree context
     * @return DeclarationProcedure with Procedure, procedure block and line number
     */
    @Override
    public AbstractDeclaration visitProcedure_declaration_part(Pascal0LikeParser.Procedure_declaration_partContext ctx) {

        String identifier = ctx.IDENT().getText();

        // visit procedure block
        Block block = new VisitorBlock().visit(ctx.block());


        return new DeclarationProcedure(new Procedure(identifier), block, ctx.getStart().getLine());
    }

    /**
     * visits constant declaration
     * @param ctx tree context
     * @return DeclarationConstant with list of constants, variable type, atom and line number
     */
    @Override
    public AbstractDeclaration visitConstant_declaration_part(Pascal0LikeParser.Constant_declaration_partContext ctx) {


        VariableType type = getType(ctx.type());

        String[] split = ctx.identifier_list().getText().split(",");

        List<Constant> constantList = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            constantList.add(new Constant(split[i]));
        }

        // visit atom
        AbstractAtom atom = new VisitorAtom().visit(ctx.atom());

        return new DeclarationConstant(constantList, type, atom, ctx.getStart().getLine());
    }

    /**
     * visits label declaration
     * @param ctx tree context
     * @return DeclarationLabel with list of labels and line number
     */
    @Override
    public AbstractDeclaration visitLabel_declaration_part(Pascal0LikeParser.Label_declaration_partContext ctx) {

        List<Label> labelList = new ArrayList<>();
        String[] split = ctx.label_list().getText().split(",");
        for (int i = 0; i < split.length; i++) {
            labelList.add(new Label(Integer.parseInt(split[i])));
        }


        return new DeclarationLabel(labelList, ctx.getStart().getLine());
    }

    /**
     * returns Variable Type based on ANTLR Parser variable type
     * @param type ANTLR Parser variable type
     * @return Variable Type
     */
    private VariableType getType(Pascal0LikeParser.TypeContext type) {

        VariableType ret = null;

        switch (type.op.getType()) {

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
            case Pascal0LikeParser.VAR: {
                ret = VariableType.VAR;
                break;
            }
        }

        return ret;
    }

    /**
     * splits identifier list by "," and returns list of variables created from found identifiers
     * @param identifier_listContext tree context
     * @return list of variables
     */
    private List<Variable> getIdentifierList(Pascal0LikeParser.Identifier_listContext identifier_listContext) {

        String[] split = identifier_listContext.getText().split(",");
        List<Variable> ret = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            ret.add(new Variable(split[i]));
        }

        return ret;
    }

}
