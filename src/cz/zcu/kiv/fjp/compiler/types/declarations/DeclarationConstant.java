package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.compiler.types.Variable;
import cz.zcu.kiv.fjp.enums.DeclarationType;

import java.util.List;

public class DeclarationConstant extends AbstractDeclaration {

    private List<Variable> variableList;
    private AbstractAtom value;

    public DeclarationConstant() {
        super(DeclarationType.CONSTANT);
    }

    public List<Variable> getVariableList() {
        return variableList;
    }

    public void setVariableList(List<Variable> variableList) {
        this.variableList = variableList;
    }

    public AbstractAtom getValue() {
        return value;
    }

    public void setValue(AbstractAtom value) {
        this.value = value;
    }
}
