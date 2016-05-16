// Generated from /Users/Aish/IdeaProjects/AbsCon/AbsCon.g4 by ANTLR 4.5.1
package edu.nus.sun.image.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbsConParser}.
 */
public interface AbsConListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AbsConParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AbsConParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AbsConParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(AbsConParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(AbsConParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#abDecls}.
	 * @param ctx the parse tree
	 */
	void enterAbDecls(AbsConParser.AbDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#abDecls}.
	 * @param ctx the parse tree
	 */
	void exitAbDecls(AbsConParser.AbDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#conDecls}.
	 * @param ctx the parse tree
	 */
	void enterConDecls(AbsConParser.ConDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#conDecls}.
	 * @param ctx the parse tree
	 */
	void exitConDecls(AbsConParser.ConDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDecl(AbsConParser.GlobalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDecl(AbsConParser.GlobalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#ftrDecl}.
	 * @param ctx the parse tree
	 */
	void enterFtrDecl(AbsConParser.FtrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#ftrDecl}.
	 * @param ctx the parse tree
	 */
	void exitFtrDecl(AbsConParser.FtrDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#ftrAssign}.
	 * @param ctx the parse tree
	 */
	void enterFtrAssign(AbsConParser.FtrAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#ftrAssign}.
	 * @param ctx the parse tree
	 */
	void exitFtrAssign(AbsConParser.FtrAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#ftrSet}.
	 * @param ctx the parse tree
	 */
	void enterFtrSet(AbsConParser.FtrSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#ftrSet}.
	 * @param ctx the parse tree
	 */
	void exitFtrSet(AbsConParser.FtrSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(AbsConParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(AbsConParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#abDecl}.
	 * @param ctx the parse tree
	 */
	void enterAbDecl(AbsConParser.AbDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#abDecl}.
	 * @param ctx the parse tree
	 */
	void exitAbDecl(AbsConParser.AbDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#concreteVector}.
	 * @param ctx the parse tree
	 */
	void enterConcreteVector(AbsConParser.ConcreteVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#concreteVector}.
	 * @param ctx the parse tree
	 */
	void exitConcreteVector(AbsConParser.ConcreteVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#abstractVector}.
	 * @param ctx the parse tree
	 */
	void enterAbstractVector(AbsConParser.AbstractVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#abstractVector}.
	 * @param ctx the parse tree
	 */
	void exitAbstractVector(AbsConParser.AbstractVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#abAssign}.
	 * @param ctx the parse tree
	 */
	void enterAbAssign(AbsConParser.AbAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#abAssign}.
	 * @param ctx the parse tree
	 */
	void exitAbAssign(AbsConParser.AbAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(AbsConParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(AbsConParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#iAssign}.
	 * @param ctx the parse tree
	 */
	void enterIAssign(AbsConParser.IAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#iAssign}.
	 * @param ctx the parse tree
	 */
	void exitIAssign(AbsConParser.IAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#accessor}.
	 * @param ctx the parse tree
	 */
	void enterAccessor(AbsConParser.AccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#accessor}.
	 * @param ctx the parse tree
	 */
	void exitAccessor(AbsConParser.AccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#featureAccessor}.
	 * @param ctx the parse tree
	 */
	void enterFeatureAccessor(AbsConParser.FeatureAccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#featureAccessor}.
	 * @param ctx the parse tree
	 */
	void exitFeatureAccessor(AbsConParser.FeatureAccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#indexAccessor}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccessor(AbsConParser.IndexAccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#indexAccessor}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccessor(AbsConParser.IndexAccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#gAssign}.
	 * @param ctx the parse tree
	 */
	void enterGAssign(AbsConParser.GAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#gAssign}.
	 * @param ctx the parse tree
	 */
	void exitGAssign(AbsConParser.GAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AbsConParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AbsConParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(AbsConParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(AbsConParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(AbsConParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(AbsConParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#paranthesizedExp}.
	 * @param ctx the parse tree
	 */
	void enterParanthesizedExp(AbsConParser.ParanthesizedExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#paranthesizedExp}.
	 * @param ctx the parse tree
	 */
	void exitParanthesizedExp(AbsConParser.ParanthesizedExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#sumOfFeatures}.
	 * @param ctx the parse tree
	 */
	void enterSumOfFeatures(AbsConParser.SumOfFeaturesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#sumOfFeatures}.
	 * @param ctx the parse tree
	 */
	void exitSumOfFeatures(AbsConParser.SumOfFeaturesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#sourceOf}.
	 * @param ctx the parse tree
	 */
	void enterSourceOf(AbsConParser.SourceOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#sourceOf}.
	 * @param ctx the parse tree
	 */
	void exitSourceOf(AbsConParser.SourceOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#absFeature}.
	 * @param ctx the parse tree
	 */
	void enterAbsFeature(AbsConParser.AbsFeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#absFeature}.
	 * @param ctx the parse tree
	 */
	void exitAbsFeature(AbsConParser.AbsFeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#conDecl}.
	 * @param ctx the parse tree
	 */
	void enterConDecl(AbsConParser.ConDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#conDecl}.
	 * @param ctx the parse tree
	 */
	void exitConDecl(AbsConParser.ConDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#cloneVector}.
	 * @param ctx the parse tree
	 */
	void enterCloneVector(AbsConParser.CloneVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#cloneVector}.
	 * @param ctx the parse tree
	 */
	void exitCloneVector(AbsConParser.CloneVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#queryVector}.
	 * @param ctx the parse tree
	 */
	void enterQueryVector(AbsConParser.QueryVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#queryVector}.
	 * @param ctx the parse tree
	 */
	void exitQueryVector(AbsConParser.QueryVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#concFtrDecl}.
	 * @param ctx the parse tree
	 */
	void enterConcFtrDecl(AbsConParser.ConcFtrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#concFtrDecl}.
	 * @param ctx the parse tree
	 */
	void exitConcFtrDecl(AbsConParser.ConcFtrDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#filters}.
	 * @param ctx the parse tree
	 */
	void enterFilters(AbsConParser.FiltersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#filters}.
	 * @param ctx the parse tree
	 */
	void exitFilters(AbsConParser.FiltersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(AbsConParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(AbsConParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(AbsConParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(AbsConParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#letBlk}.
	 * @param ctx the parse tree
	 */
	void enterLetBlk(AbsConParser.LetBlkContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#letBlk}.
	 * @param ctx the parse tree
	 */
	void exitLetBlk(AbsConParser.LetBlkContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#rExpr}.
	 * @param ctx the parse tree
	 */
	void enterRExpr(AbsConParser.RExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#rExpr}.
	 * @param ctx the parse tree
	 */
	void exitRExpr(AbsConParser.RExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#rExp}.
	 * @param ctx the parse tree
	 */
	void enterRExp(AbsConParser.RExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#rExp}.
	 * @param ctx the parse tree
	 */
	void exitRExp(AbsConParser.RExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#rop}.
	 * @param ctx the parse tree
	 */
	void enterRop(AbsConParser.RopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#rop}.
	 * @param ctx the parse tree
	 */
	void exitRop(AbsConParser.RopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#existl}.
	 * @param ctx the parse tree
	 */
	void enterExistl(AbsConParser.ExistlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#existl}.
	 * @param ctx the parse tree
	 */
	void exitExistl(AbsConParser.ExistlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#univsl}.
	 * @param ctx the parse tree
	 */
	void enterUnivsl(AbsConParser.UnivslContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#univsl}.
	 * @param ctx the parse tree
	 */
	void exitUnivsl(AbsConParser.UnivslContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#eltChk}.
	 * @param ctx the parse tree
	 */
	void enterEltChk(AbsConParser.EltChkContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#eltChk}.
	 * @param ctx the parse tree
	 */
	void exitEltChk(AbsConParser.EltChkContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#elt}.
	 * @param ctx the parse tree
	 */
	void enterElt(AbsConParser.EltContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#elt}.
	 * @param ctx the parse tree
	 */
	void exitElt(AbsConParser.EltContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(AbsConParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(AbsConParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#numRange}.
	 * @param ctx the parse tree
	 */
	void enterNumRange(AbsConParser.NumRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#numRange}.
	 * @param ctx the parse tree
	 */
	void exitNumRange(AbsConParser.NumRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#inlineInto}.
	 * @param ctx the parse tree
	 */
	void enterInlineInto(AbsConParser.InlineIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#inlineInto}.
	 * @param ctx the parse tree
	 */
	void exitInlineInto(AbsConParser.InlineIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#setOfIds}.
	 * @param ctx the parse tree
	 */
	void enterSetOfIds(AbsConParser.SetOfIdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#setOfIds}.
	 * @param ctx the parse tree
	 */
	void exitSetOfIds(AbsConParser.SetOfIdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(AbsConParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(AbsConParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#sizeOf}.
	 * @param ctx the parse tree
	 */
	void enterSizeOf(AbsConParser.SizeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#sizeOf}.
	 * @param ctx the parse tree
	 */
	void exitSizeOf(AbsConParser.SizeOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#bExpr}.
	 * @param ctx the parse tree
	 */
	void enterBExpr(AbsConParser.BExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#bExpr}.
	 * @param ctx the parse tree
	 */
	void exitBExpr(AbsConParser.BExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#bExp}.
	 * @param ctx the parse tree
	 */
	void enterBExp(AbsConParser.BExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#bExp}.
	 * @param ctx the parse tree
	 */
	void exitBExp(AbsConParser.BExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(AbsConParser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(AbsConParser.BopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbsConParser#simpAssign}.
	 * @param ctx the parse tree
	 */
	void enterSimpAssign(AbsConParser.SimpAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbsConParser#simpAssign}.
	 * @param ctx the parse tree
	 */
	void exitSimpAssign(AbsConParser.SimpAssignContext ctx);
}