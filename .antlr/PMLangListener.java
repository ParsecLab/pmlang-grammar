// Generated from /media/naylour/Work/Parsec/pmlang/grammar/PMLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PMLangParser}.
 */
public interface PMLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PMLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PMLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PMLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PMLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PMLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PMLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PMLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PMLangParser.ExprContext ctx);
}