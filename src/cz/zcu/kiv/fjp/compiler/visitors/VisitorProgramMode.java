package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.enums.ProgramMode;

public class VisitorProgramMode extends Pascal0LikeBaseVisitor<ProgramMode> {

    @Override
    public ProgramMode visitLegacyMode(Pascal0LikeParser.LegacyModeContext ctx) {
        return ProgramMode.LEGACY;
    }

    @Override
    public ProgramMode visitDefaultMode(Pascal0LikeParser.DefaultModeContext ctx) {
        return ProgramMode.DEFAULT;
    }

    @Override
    public ProgramMode visitStrictMode(Pascal0LikeParser.StrictModeContext ctx) {
        return ProgramMode.STRICT;
    }

}
