package cz.zcu.kiv.fjp.compiler.types.atoms;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.enums.AtomType;

public class AtomReal extends AbstractAtom {

    private double real;

    public AtomReal(double real) {
        super(AtomType.REAL);
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    @Override
    public String toString() {
        return "" + real;
    }
}
