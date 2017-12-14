package cz.zcu.kiv.fjp.compiler.types;

import cz.zcu.kiv.fjp.abstracts.AbstractIdentifier;
import cz.zcu.kiv.fjp.enums.IdentifierType;

/**
 * Label
 */
public class Label extends AbstractIdentifier {

    /**
     * value
     */
    private int value;

    /**
     * @param value label value
     */
    public Label(int value) {
        super(IdentifierType.LABEL);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
