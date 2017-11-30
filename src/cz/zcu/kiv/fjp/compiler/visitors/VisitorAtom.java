package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.compiler.types.atoms.*;

public class VisitorAtom extends Pascal0LikeBaseVisitor<AbstractAtom> {


    @Override
    public AbstractAtom visitIntAtom(Pascal0LikeParser.IntAtomContext ctx) {

        return new AtomInteger(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AbstractAtom visitRealAtom(Pascal0LikeParser.RealAtomContext ctx) {

        return new AtomReal(Double.parseDouble(ctx.getText()));

    }

    @Override
    public AbstractAtom visitBooleanAtom(Pascal0LikeParser.BooleanAtomContext ctx) {

        boolean bool = true;

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

    @Override
    public AbstractAtom visitIdAtom(Pascal0LikeParser.IdAtomContext ctx) {

        return new AtomId(ctx.getText());

    }

    @Override
    public AbstractAtom visitStringAtom(Pascal0LikeParser.StringAtomContext ctx) {

        String str = ctx.getText();

        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");

        return new AtomString(str);

    }


}
