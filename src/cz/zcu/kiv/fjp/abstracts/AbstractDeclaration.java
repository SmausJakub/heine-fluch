package cz.zcu.kiv.fjp.abstracts;

import cz.zcu.kiv.fjp.enums.DeclarationType;

public class AbstractDeclaration {

    private DeclarationType type;

    public AbstractDeclaration(DeclarationType type) {
        this.type = type;
    }

    public DeclarationType getType() {
        return type;
    }
}
