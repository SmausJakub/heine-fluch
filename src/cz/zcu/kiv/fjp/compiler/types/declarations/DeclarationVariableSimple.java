package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.types.Variable;
import cz.zcu.kiv.fjp.enums.DeclarationType;

import java.util.List;

public class DeclarationVariableSimple extends AbstractDeclaration {

    private List<Variable> variableList;
    private List<AbstractExpression> expressionList;

    private boolean init;


    public DeclarationVariableSimple(boolean init) {
        super(DeclarationType.VARIABLE);
        this.init = init;
    }

    public List<Variable> getVariableList() {
        return variableList;
    }

    public List<AbstractExpression> getExpressionList() {
        return expressionList;
    }

    public boolean isInit() {
        return init;
    }

    @Override
    public String toString() {
        return "Variable Simple";
    }


}
