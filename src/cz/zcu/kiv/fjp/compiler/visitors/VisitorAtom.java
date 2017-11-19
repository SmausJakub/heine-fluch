package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.compiler.types.atoms.*;

public class VisitorAtom extends Pascal0LikeBaseVisitor<AbstractAtom> {


    @Override
    public AbstractAtom visitIntAtom(Pascal0LikeParser.IntAtomContext ctx) {

        AtomInteger atom = new AtomInteger();

        atom.setInteger(Integer.parseInt(ctx.getText()));

        return atom;
    }

    @Override
    public AbstractAtom visitRealAtom(Pascal0LikeParser.RealAtomContext ctx) {
        AtomReal atom = new AtomReal();

        atom.setReal(Double.parseDouble(ctx.getText()));

        return atom;

    }

    @Override
    public AbstractAtom visitBooleanAtom(Pascal0LikeParser.BooleanAtomContext ctx) {
        AtomBoolean atom = new AtomBoolean();

        String text = ctx.getText();
        if (text.equalsIgnoreCase("true")) {
            atom.setBool(true);
        } else {
            atom.setBool(false);
        }

        return atom;
    }

    @Override
    public AbstractAtom visitIdAtom(Pascal0LikeParser.IdAtomContext ctx) {
        AtomId atom = new AtomId();

        atom.setIdentifier(ctx.getText());

        return atom;

    }

    @Override
    public AbstractAtom visitStringAtom(Pascal0LikeParser.StringAtomContext ctx) {

        AtomString atom = new AtomString();

        String str = ctx.getText();

        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");

        atom.setStr(str);

        return atom;

    }


}
