package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.compiler.types.Program;
import cz.zcu.kiv.fjp.enums.ProgramMode;

/**
 * Program Visitor
 * Visits ANTLR tree and creates a class Program
 */
public class VisitorProgram extends Pascal0LikeBaseVisitor<Program> {

    /**
     * visits program
     *
     * @param ctx tree context
     * @return Program with block
     */
    @Override
    public Program visitProgram(Pascal0LikeParser.ProgramContext ctx) {

        Block block = new VisitorBlock().visit(ctx.block());

        String identifier = ctx.IDENT().getText();

        ProgramMode mode;

        if (ctx.declare_mode() != null) {
            mode = new VisitorProgramMode().visit(ctx.declare_mode());
        } else {
            mode = ProgramMode.DEFAULT;
        }

        return new Program(identifier, mode, block);
    }


}
