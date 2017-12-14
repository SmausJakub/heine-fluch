package cz.zcu.kiv.fjp.compiler.types;


import cz.zcu.kiv.fjp.abstracts.AbstractIdentifier;
import cz.zcu.kiv.fjp.enums.IdentifierType;

public class Procedure extends AbstractIdentifier {

    private String name;

    public Procedure(String name) {
        super(IdentifierType.PROCEDURE);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
