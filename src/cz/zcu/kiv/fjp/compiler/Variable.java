package cz.zcu.kiv.fjp.compiler;

public class Variable extends AParsable<Value> implements ITypeable {

    EType type;

    public Variable(String name, Value value, EType type) {
        super(name, value);
        this.type = type;
    }


    @Override
    String getName() {
        return super.name;
    }

    @Override
    Value getValue() {
        return super.value;
    }

    @Override
    public EType getType() {
        return this.type;
    }
}