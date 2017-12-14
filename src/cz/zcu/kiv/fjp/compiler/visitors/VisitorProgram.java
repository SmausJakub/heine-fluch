package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.compiler.types.Program;

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

        return new Program(block);
    }


}
