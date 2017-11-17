package cz.zcu.kiv.fjp.compiler;

public class Procedure extends AParsable {

    public Procedure(String name) {
        super(name);
    }


    @Override
    String getName() {
        return super.name;
    }

    @Override
    String getValue() {
        return super.name;
    }
}
