package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.CaseLimb;

import java.util.ArrayList;
import java.util.List;

/**
 * Case Visitor
 * Visits the ANTLR tree and creates a class for Case Limbs
 */
public class VisitorCase extends Pascal0LikeBaseVisitor<CaseLimb> {

    /**
     * visits a case limb
     *
     * @param ctx tree context
     * @return CaseLimb with atoms and a statement
     */
    @Override
    public CaseLimb visitCase_limb(Pascal0LikeParser.Case_limbContext ctx) {

        List<AbstractAtom> atomList = new ArrayList<>();
        VisitorAtom visitorAtom = new VisitorAtom();

        // loop through all atoms and add them to the list
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
