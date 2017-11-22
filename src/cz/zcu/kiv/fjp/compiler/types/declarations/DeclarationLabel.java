package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.compiler.types.Label;
import cz.zcu.kiv.fjp.enums.DeclarationType;

import java.util.List;

public class DeclarationLabel extends AbstractDeclaration {

    private List<Label> labelList;

    public DeclarationLabel() {
        super(DeclarationType.LABEL);
    }


    public List<Label> getLabelList() {
        return labelList;
    }

    @Override
    public String toString() {
        return "Label";
    }


}
