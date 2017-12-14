package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.compiler.types.atoms.*;

/**
 * Atom Visitor
 * Visits the ANTLR tree and creates classes to represent atoms
 */
public class VisitorAtom extends Pascal0LikeBaseVisitor<AbstractAtom> {

    /**
     * visits int atom
     *
     * @param ctx tree context
     * @return AtomInteger
     */
    @Override
    public AbstractAtom visitIntAtom(Pascal0LikeParser.IntAtomContext ctx) {

        return new AtomInteger(Integer.parseInt(ctx.getText()));
    }

    /**
     * visits real atom
     * @param ctx tree context
     * @return AtomReal
     */
    @Override
    public AbstractAtom visitRealAtom(Pascal0LikeParser.RealAtomContext ctx) {

        return new AtomReal(Double.parseDouble(ctx.getText()));

    }

    /**
     * visits boolean atom
     * @param ctx tree context
     * @return AtomBoolean
     */
    @Override
    public AbstractAtom visitBooleanAtom(Pascal0LikeParser.BooleanAtomContext ctx) {

        boolean bool = true;

        // check if there is "true" or "false"
        switch (ctx.op.getType()) {
            case Pascal0LikeParser.TRUE: {
                bool = true;
                break;
            }
            case Pascal0LikeParser.FALSE: {
                bool = false;
                break;
            }
        }

        return new AtomBoolean(bool);
    }

    /**
     * visits id atom
     * @param ctx tree context
     * @return AtomId
     */
    @Override
    public AbstractAtom visitIdAtom(Pascal0LikeParser.IdAtomContext ctx) {

        return new AtomId(ctx.getText());

    }

    /**
     * visits string atom
     * @param ctx tree context
     * @return AtomString
     */
    @Override
    public AbstractAtom visitStringAtom(Pascal0LikeParser.StringAtomContext ctx) {

        String str = ctx.getText();

        // delete the quotes '  '
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");

        return new AtomString(str);

    }


}
