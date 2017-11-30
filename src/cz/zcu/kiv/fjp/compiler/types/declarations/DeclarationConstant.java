package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.compiler.types.Constant;
import cz.zcu.kiv.fjp.enums.DeclarationType;
import cz.zcu.kiv.fjp.enums.VariableType;

import java.util.List;

public class DeclarationConstant extends AbstractDeclaration {

    private List<Constant> constantList;
    private AbstractAtom value;

    private VariableType type;

    public DeclarationConstant(List<Constant> constantList, VariableType type, AbstractAtom atom) {
        super(DeclarationType.CONSTANT);
        this.constantList = constantList;
        this.value = atom;
        this.type = type;
    }

    public VariableType getType() {
        return type;
    }

    public List<Constant> getConstantList() {
        return constantList;
    }

    public AbstractAtom getValue() {
        return value;
    }

    @Override
    public String toString() {
        return type.getValue() + " " + constantList.toString() + " := " + value.toString();
    }

}
