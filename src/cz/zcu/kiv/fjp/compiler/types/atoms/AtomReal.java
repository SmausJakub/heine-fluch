package cz.zcu.kiv.fjp.compiler.types.atoms;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.enums.AtomType;

/**
 * Atom of type real
 * Used to store a single value of type real
 */
public class AtomReal extends AbstractAtom {

    /**
     * value
     */
    private double real;

    /**
     * @param real value
     */
    public AtomReal(double real) {
        super(AtomType.REAL);
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    @Override
    public String toString() {
        return String.valueOf(real);
    }
}
