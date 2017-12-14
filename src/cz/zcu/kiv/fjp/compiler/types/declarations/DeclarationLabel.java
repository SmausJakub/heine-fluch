package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.compiler.types.Label;
import cz.zcu.kiv.fjp.enums.DeclarationType;

import java.util.List;

public class DeclarationLabel extends AbstractDeclaration {

    private List<Label> labelList;

    public DeclarationLabel(List<Label> labelList, int line) {
        super(DeclarationType.LABEL, line);
        this.labelList = labelList;
    }


    public List<Label> getLabelList() {
        return labelList;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("LABEL ");

        for (int i = 0; i < labelList.size(); i++) {
            builder.append(labelList.get(i).getValue());

            if (i + 1 < labelList.size()) {
                builder.append(", ");
            }
        }

        builder.append(";");
        return builder.toString();
    }


}
