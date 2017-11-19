package cz.zcu.kiv.fjp.compiler.types;


import cz.zcu.kiv.fjp.abstracts.AbstractIdentifier;
import cz.zcu.kiv.fjp.enums.VariableType;

public class Variable extends AbstractIdentifier {


    private VariableType type;

    private Value value;

    private boolean constant = false;

    public Variable(String name, VariableType type, Value value) {

        super(name);
        this.type = type;
        this.value = value;
    }

    public boolean isConstant() {
        return constant;
    }

    public void setConstant(boolean constant) {
        this.constant = constant;
    }


}
