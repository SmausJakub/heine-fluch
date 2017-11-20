package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.compiler.types.Program;

public class VisitorProgram extends Pascal0LikeBaseVisitor<Program>{

    @Override public Program visitProgram(Pascal0LikeParser.ProgramContext ctx) {

        Program program = new Program();

        VisitorBlock visitorBlock = new VisitorBlock();

        Block block = visitorBlock.visit(ctx.block());

        program.setBlock(block);

        return program;
    }




}
