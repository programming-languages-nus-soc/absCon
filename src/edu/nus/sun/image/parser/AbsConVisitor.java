// Generated from /Users/Aish/IdeaProjects/AbsCon/AbsCon.g4 by ANTLR 4.5.1
package edu.nus.sun.image.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbsConParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbsConVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AbsConParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AbsConParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(AbsConParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#abDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbDecls(AbsConParser.AbDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#conDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConDecls(AbsConParser.ConDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#globalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDecl(AbsConParser.GlobalDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#ftrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFtrDecl(AbsConParser.FtrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#ftrAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFtrAssign(AbsConParser.FtrAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#ftrSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFtrSet(AbsConParser.FtrSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(AbsConParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#abDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbDecl(AbsConParser.AbDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#concreteVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcreteVector(AbsConParser.ConcreteVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#abstractVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractVector(AbsConParser.AbstractVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#abAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbAssign(AbsConParser.AbAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(AbsConParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#iAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIAssign(AbsConParser.IAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#accessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessor(AbsConParser.AccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#featureAccessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureAccessor(AbsConParser.FeatureAccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#indexAccessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccessor(AbsConParser.IndexAccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#gAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGAssign(AbsConParser.GAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AbsConParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(AbsConParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(AbsConParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#paranthesizedExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesizedExp(AbsConParser.ParanthesizedExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#sumOfFeatures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumOfFeatures(AbsConParser.SumOfFeaturesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#sourceOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceOf(AbsConParser.SourceOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#sourceOfSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceOfSize(AbsConParser.SourceOfSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#absFeature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsFeature(AbsConParser.AbsFeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#conDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConDecl(AbsConParser.ConDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#cloneVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneVector(AbsConParser.CloneVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#queryVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryVector(AbsConParser.QueryVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#concFtrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcFtrDecl(AbsConParser.ConcFtrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#filters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilters(AbsConParser.FiltersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(AbsConParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(AbsConParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#letBlk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBlk(AbsConParser.LetBlkContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#rExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExpr(AbsConParser.RExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#rExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRExp(AbsConParser.RExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#rop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRop(AbsConParser.RopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#existl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistl(AbsConParser.ExistlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#univsl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnivsl(AbsConParser.UnivslContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#eltChk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEltChk(AbsConParser.EltChkContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#elt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElt(AbsConParser.EltContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(AbsConParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#numRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumRange(AbsConParser.NumRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#inlineInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineInto(AbsConParser.InlineIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#setOfIds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOfIds(AbsConParser.SetOfIdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(AbsConParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#sizeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeOf(AbsConParser.SizeOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#bExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBExpr(AbsConParser.BExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#bExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBExp(AbsConParser.BExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#bop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBop(AbsConParser.BopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbsConParser#simpAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpAssign(AbsConParser.SimpAssignContext ctx);
}