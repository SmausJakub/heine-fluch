package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.types.Variable;
import cz.zcu.kiv.fjp.enums.DeclarationType;

import java.util.List;

public class DeclarationVariableSimple extends AbstractDeclaration {

    private List<Variable> variableList;
    private List<AbstractExpression> expressionList;

    private boolean init = false;


    public DeclarationVariableSimple() {
        super(DeclarationType.VARIABLE);
    }
}
