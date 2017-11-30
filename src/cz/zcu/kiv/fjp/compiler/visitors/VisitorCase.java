package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.CaseLimb;

import java.util.ArrayList;
import java.util.List;

public class VisitorCase extends Pascal0LikeBaseVisitor<CaseLimb> {


    @Override
    public CaseLimb visitCase_limb(Pascal0LikeParser.Case_limbContext ctx) {

        List<AbstractAtom> atomList = new ArrayList<>();
        VisitorAtom visitorAtom = new VisitorAtom();

        for (int i = 0; i < ctx.case_label_list().getChildCount(); i++) {
            AbstractAtom atom = visitorAtom.visit(ctx.case_label_list().getChild(i));
            if (atom == null) {
                continue;
            }
            atomList.add(atom);
        }

        AbstractStatement statement = new VisitorStatement().visit(ctx.statement());


        return new CaseLimb(atomList, statement);
    }


}
