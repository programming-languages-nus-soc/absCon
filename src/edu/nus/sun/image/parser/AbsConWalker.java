package edu.nus.sun.image.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;

public class AbsConWalker implements   AbsConListener {




    public class NumberRange{
        public String startIndex;
        public String endIndex;

        public String getStartIndex() {
            return startIndex;
        }

        public void setStartIndex(String startIndex) {
            this.startIndex = startIndex;
        }

        public String getEndIndex() {
            return endIndex;
        }

        public void setEndIndex(String endIndex) {
            this.endIndex = endIndex;
        }
    }

    public class LetBlock{
        public ArrayList getFilters() {
            return filters;
        }

        public ArrayList getSimpleAssigns() {
            return simpleAssigns;
        }

        ArrayList simpleAssigns;
        ArrayList filters;

        public void assignVariables(ArrayList simpleAssigns, ArrayList filters) {
            this.simpleAssigns = simpleAssigns;
            this.filters = filters;
        }
    }

    public class ForAll{
        String condition;
        String var;
        String expression;
        NumberRange numberRange;
        boolean isNumberRange;
        Object blockObject;

        public void assignVariables(String condition,String var,String expression,NumberRange numberRange){
            this.var = var;
            this.condition = condition;
            this.expression = expression;
            this.numberRange = numberRange;
        }

        public boolean isNumberRange() {
            return isNumberRange;
        }

        public NumberRange getNumberRange() {
            return numberRange;
        }


        public void setExpression(String expression) {
            this.expression = expression;
        }

        public String getCondition() {
            return condition;
        }

        public String getVar() {
            return var;
        }

        public String getExpression() {
            return expression;
        }

        public Object getBlockObject() {
            return blockObject;
        }

        public void setBlockObject(Object blockObject) {
            this.blockObject = blockObject;
        }
    }

    public class Exists{
        String var;
        String condition;
        String expression;
        NumberRange numberRange;
        boolean isNumberRange;
        boolean isConditionalExpression;
        boolean isInlinedInto;
        Object inlineObject;
        Object blockObject;

        public String getVar() {
            return var;
        }

        public void setVar(String var) {
            this.var = var;
        }

        public String getExpression() {
            return expression;
        }

        public void setExpression(String expression) {
            this.expression = expression;
        }

        public NumberRange getNumberRange() {
            return numberRange;
        }

        public void setNumberRange(NumberRange numberRange) {
            this.numberRange = numberRange;
        }

        public boolean isNumberRange() {
            return isNumberRange;
        }

        public void setNumberRange(boolean numberRange) {
            isNumberRange = numberRange;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public Object getBlockObject() {
            return blockObject;
        }

        public void setBlockObject(Object blockObject) {
            this.blockObject = blockObject;
        }

        public boolean isConditionalExpression() {
            return isConditionalExpression;
        }

        public void setConditionalExpression(boolean conditionalExpression) {
            isConditionalExpression = conditionalExpression;
        }

        public boolean isInlinedInto() {
            return isInlinedInto;
        }

        public void setInlinedInto(boolean inlinedInto) {
            isInlinedInto = inlinedInto;
        }

        public Object getInlineObject() {
            return inlineObject;
        }

        public void setInlineObject(Object inlineObject) {
            this.inlineObject = inlineObject;
        }
    }

    public  class InlinedInto{
        String var;
        String inlineVar;
        String expression;
        String inlineCheckType;
        boolean isCompare;

        public String getExpression() {
            return expression;
        }

        public String getVar() {
            return var;
        }

        public boolean isCompare() {
            return isCompare;
        }

        public void setCompare(boolean compare) {
            isCompare = compare;
        }

        public void setExpression(String expression) {
            this.expression = expression;
        }

        public void setVar(String var) {
            this.var = var;
        }

        public String getInlineCheckType() {
            return inlineCheckType;
        }

        public void setInlineCheckType(String inlineCheckType) {
            this.inlineCheckType = inlineCheckType;
        }

        public String getInlineVar() {
            return inlineVar;
        }

        public void setInlineVar(String inlineVar) {
            this.inlineVar = inlineVar;
        }
    }

    public class ConditionalExpression{
        String binaryExpression;
        ArrayList assignmentExpressions;

        public ArrayList getAssignmentExpressions() {
            return assignmentExpressions;
        }

        public void setAssignmentExpressions(ArrayList assignmentExpressions) {
            this.assignmentExpressions = assignmentExpressions;
        }

        public String getBinaryExpression() {
            return binaryExpression;
        }

        public void setBinaryExpression(String binaryExpression) {
            this.binaryExpression = binaryExpression;
        }

        public void addRecordToAssignmentExpressions(HashMap map){
            assignmentExpressions.add(map);
        }
    }

    //for concerete, abstract, clone, query vector
    HashMap<String,String> typeOfVariableAndName;

    //For Ids and set of Ids
    ArrayList declarationList;
    ArrayList setDeclarationList;

    //IAssign - Assign via index or feature call
    ArrayList assignmentCallList;

    //set set of features as expr
    ArrayList setFeaturesList ;
    ArrayList setFeaturesByRangeList;

    //feature set features
    ArrayList features;

    //expression as array
    ArrayList expressionList;
    ArrayList simpleAssignList;
    ArrayList vectorTypes;
    ArrayList filterList;
    LetBlock letBlock;
    ForAll forAll;
    InlinedInto inlinedInto;
    NumberRange numberRange;
    Exists exists;
    ConditionalExpression condExpr;

    Map map;
    int letBlockCount;

    Stack filters;

    boolean isFeatureSetAssignment;
    boolean iAssign;
    boolean isExp;
    boolean isIndexAccessor;
    boolean isLetBlock;
    boolean isRExp;
    boolean isRExpr;
    boolean isBExpr;
    boolean isCondition;
    boolean isUniversal;
    boolean isSumOfFeatures;
    boolean isSourceOf;
    boolean isInlinedInto;
    boolean isSourceSizeOf;
    boolean isSizeOf;
    boolean isNumRange;
    boolean isExistential;
    boolean isFeatureAccessor;
    boolean isTotalCount;
    boolean isConditionalExpression;
    boolean isOrExpr;
    boolean isEnumerate;
    boolean isbyteCodeSizeOf;
    boolean isByteCodeOf;
    String inlineIndex = "query_vidx";


    @Override public void enterProgram(AbsConParser.ProgramContext ctx) {
        letBlockCount = 0;
        typeOfVariableAndName = new HashMap<>();
        declarationList = new ArrayList();
        assignmentCallList = new ArrayList();
        setFeaturesList = new ArrayList();
        setDeclarationList = new ArrayList();
        expressionList = new ArrayList();
        simpleAssignList = new ArrayList();
        filterList  = new ArrayList();
        filters = new Stack();
        iAssign=false;
        letBlock = new LetBlock();
        forAll = new ForAll();
        inlinedInto = new InlinedInto();
        setFeaturesByRangeList = new ArrayList();
        numberRange = new NumberRange();
        exists = new Exists();
        condExpr = new ConditionalExpression();
        vectorTypes = new ArrayList();

    }

    @Override public void exitProgram(AbsConParser.ProgramContext ctx) {
    }

    @Override public void enterGlobal(AbsConParser.GlobalContext ctx) {

    }

    @Override public void exitGlobal(AbsConParser.GlobalContext ctx) {

    }

    @Override public void enterAbDecls(AbsConParser.AbDeclsContext ctx) {}

    @Override public void exitAbDecls(AbsConParser.AbDeclsContext ctx) {
        writeToAbstractionTemplate();
    }

    @Override
    public void enterConDecls(AbsConParser.ConDeclsContext ctx) {

    }

    @Override
    public void exitConDecls(AbsConParser.ConDeclsContext ctx) {
        for(int i=0;i<filters.size();i++){
            System.out.println(i+" " + filters.get(i));
        }
        writeToConcretizationTemplate();
    }

    @Override public void enterGlobalDecl(AbsConParser.GlobalDeclContext ctx) { }

    @Override public void exitGlobalDecl(AbsConParser.GlobalDeclContext ctx) { }

    @Override public void enterFtrDecl(AbsConParser.FtrDeclContext ctx) { }

    @Override public void exitFtrDecl(AbsConParser.FtrDeclContext ctx) { }

    @Override public void enterFtrAssign(AbsConParser.FtrAssignContext ctx) {
        map = new HashMap<>();
        map.put("id",ctx.getChild(0));
        if(ctx.getChild(2).getText().matches("^-?\\d+$")){
            map.put("index",ctx.getChild(2).getText());
        } else{
            map.put("index",FeatureReader.featureMap.get(ctx.getChild(2).getText()));
        }

        declarationList.add(new HashMap(map));
        map.clear();
    }

    @Override public void exitFtrAssign(AbsConParser.FtrAssignContext ctx) {

    }

    @Override public void enterFtrSet(AbsConParser.FtrSetContext ctx) {
        map = new HashMap<>();
        map.put("id",ctx.getChild(0));
        isFeatureSetAssignment = true;
        features = new ArrayList();
    }

    @Override public void exitFtrSet(AbsConParser.FtrSetContext ctx) {
        map.put("features",new ArrayList(features));
        setDeclarationList.add(new HashMap(map));
        map.clear();
        features.clear();
        isFeatureSetAssignment = false;
    }

    @Override public void enterIds(AbsConParser.IdsContext ctx) {
        if(isFeatureSetAssignment){
            features.add(ctx.getChild(0));
        }
    }

    @Override public void exitIds(AbsConParser.IdsContext ctx) {

    }

    @Override public void enterAbDecl(AbsConParser.AbDeclContext ctx) { }

    @Override public void exitAbDecl(AbsConParser.AbDeclContext ctx) { }

    @Override
    public void enterConcreteVector(AbsConParser.ConcreteVectorContext ctx) {
        typeOfVariableAndName.put("concrete",ctx.getChild(1).getText());
    }

    @Override
    public void exitConcreteVector(AbsConParser.ConcreteVectorContext ctx) {

    }

    @Override
    public void enterAbstractVector(AbsConParser.AbstractVectorContext ctx) {
        typeOfVariableAndName.put("abstract",ctx.getChild(1).getText());
    }

    @Override
    public void exitAbstractVector(AbsConParser.AbstractVectorContext ctx) {

    }

    @Override public void enterAbAssign(AbsConParser.AbAssignContext ctx) {

    }

    @Override public void exitAbAssign(AbsConParser.AbAssignContext ctx) { }

    @Override public void enterAssign(AbsConParser.AssignContext ctx) { }

    @Override public void exitAssign(AbsConParser.AssignContext ctx) { }

    @Override public void enterIAssign(AbsConParser.IAssignContext ctx) {
        iAssign = true;
    }

    @Override public void exitIAssign(AbsConParser.IAssignContext ctx) {
        iAssign = false;
        assignmentCallList.add(new HashMap(map));
        map.clear();
    }

    @Override public void enterAccessor(AbsConParser.AccessorContext ctx) { }

    @Override public void exitAccessor(AbsConParser.AccessorContext ctx) { }

    @Override public void enterFeatureAccessor(AbsConParser.FeatureAccessorContext ctx) {
        isFeatureAccessor = true;
        StringBuilder functionCall = new StringBuilder();
        if(isExp){
            functionCall.append("accessor(");
            functionCall.append(ctx.getChild(0)+","+ctx.getChild(2)+")");
            expressionList.add(functionCall);
        } else{
            map.put("index", ctx.getChild(2));
        }
    }

    @Override public void exitFeatureAccessor(AbsConParser.FeatureAccessorContext ctx) {
        isFeatureAccessor = false;

    }

    @Override public void enterIndexAccessor(AbsConParser.IndexAccessorContext ctx) {
        StringBuilder functionCall = new StringBuilder();
        if(isExp){
            functionCall.append("accessor(");
            functionCall.append(ctx.getChild(0)+","+ctx.getChild(2)+")");
            isIndexAccessor = true;
            expressionList.add(functionCall);
        } else{
            map.put("index", ctx.getChild(2));
        }
    }

    @Override public void exitIndexAccessor(AbsConParser.IndexAccessorContext ctx) {
        isIndexAccessor = false;
    }

    @Override public void enterGAssign(AbsConParser.GAssignContext ctx) {
        StringBuilder functionCall= new StringBuilder();
        functionCall.append(ctx.getChild(0)+"_"+setFeaturesList.size());
        for(int i=1;i<6;i++){
            functionCall.append(ctx.getChild(i));
        }
        map.put("call",functionCall);
    }

    @Override public void exitGAssign(AbsConParser.GAssignContext ctx) {
        setFeaturesList.add(new HashMap(map));
        map.clear();
        expressionList.clear();
    }

    @Override
    public void enterDAssign(AbsConParser.DAssignContext ctx) {

    }

    @Override
    public void exitDAssign(AbsConParser.DAssignContext ctx) {
        System.out.println("The dassign map is "+numberRange.getStartIndex()+numberRange.getEndIndex());
        map.put("range",numberRange);
        setFeaturesByRangeList.add(new HashMap<>(map));
        map.clear();
        expressionList.clear();
    }

    @Override public void enterExpr(AbsConParser.ExprContext ctx) {

    }

    @Override public void exitExpr(AbsConParser.ExprContext ctx) {
        if(!isRExpr && !isBExpr && !isOrExpr){
            map.put("expr",new ArrayList(expressionList));
            expressionList.clear();
        }
    }

    @Override public void enterExp(AbsConParser.ExpContext ctx) {
        isExp = true;
    }

    @Override public void exitExp(AbsConParser.ExpContext ctx) {
        isExp = false;
    }

    @Override
    public void enterId(AbsConParser.IdContext ctx) {
        if(isExp){
            expressionList.add(ctx.getChild(0).getText());
        }
    }

    @Override
    public void exitId(AbsConParser.IdContext ctx) {

    }

    @Override
    public void enterParanthesizedExp(AbsConParser.ParanthesizedExpContext ctx) {

    }

    @Override
    public void exitParanthesizedExp(AbsConParser.ParanthesizedExpContext ctx) {

    }

    @Override public void enterSumOfFeatures(AbsConParser.SumOfFeaturesContext ctx) {
        isSumOfFeatures = true;
        StringBuilder functionCall = new StringBuilder();
        for(int i=0;i<ctx.getChildCount();i++){
            if(ctx.getChild(i).getText().contains("sourceOf")){
                String exp = ctx.getChild(i).getChild(0)+"("+ ctx.getChild(i).getChild(2) +","+"source_index"+ctx.getChild(i).getChild(8)+ ","+ctx.getChild(i).getChild(5) +")";
                functionCall.append(exp);
            } else{
                functionCall.append(ctx.getChild(i));
            }
        }
        expressionList.add(functionCall);
    }

    @Override public void exitSumOfFeatures(AbsConParser.SumOfFeaturesContext ctx) {
        isSumOfFeatures = false;
    }

    @Override public void enterSourceOf(AbsConParser.SourceOfContext ctx) {
        isSourceOf = true;
        String exp;
        exp = ctx.getChild(0)+"("+ ctx.getChild(2) +","+ctx.getChild(5) +")";
        if(!isSumOfFeatures){
            expressionList.add(exp);
        }

    }

    @Override public void exitSourceOf(AbsConParser.SourceOfContext ctx) {
        isSourceOf  = false;
    }

    @Override
    public void enterByteCodeOf(AbsConParser.ByteCodeOfContext ctx) {
        isByteCodeOf = true;
        String exp;
        exp = ctx.getChild(0)+"("+ ctx.getChild(2) +","+ctx.getChild(5) +")";
        if(!isSumOfFeatures){
            expressionList.add(exp);
        }
    }

    @Override
    public void exitByteCodeOf(AbsConParser.ByteCodeOfContext ctx) {
        isByteCodeOf = false;
    }

    @Override
    public void enterByteCodeSizeOf(AbsConParser.ByteCodeSizeOfContext ctx) {
        String exp;
        exp = ctx.getChild(0)+"("+ ctx.getChild(2) +")";
        isbyteCodeSizeOf = true;
        if(isCondition){
            expressionList.add(exp);
        }
    }

    @Override
    public void exitByteCodeSizeOf(AbsConParser.ByteCodeSizeOfContext ctx) {
        isbyteCodeSizeOf = false;
    }

    @Override
    public void enterSourceOfSize(AbsConParser.SourceOfSizeContext ctx) {
        String exp;
        exp = ctx.getChild(0)+"("+ ctx.getChild(2) +")";
        isSourceSizeOf = true;
        if(isCondition){
            expressionList.add(exp);
        }
    }

    @Override
    public void exitSourceOfSize(AbsConParser.SourceOfSizeContext ctx) {
        isSourceSizeOf = false;
    }

    @Override public void enterAbsFeature(AbsConParser.AbsFeatureContext ctx) { }

    @Override public void exitAbsFeature(AbsConParser.AbsFeatureContext ctx) { }

    @Override
    public void enterConDecl(AbsConParser.ConDeclContext ctx) {

    }

    @Override
    public void exitConDecl(AbsConParser.ConDeclContext ctx) {

    }

    @Override
    public void enterCloneVector(AbsConParser.CloneVectorContext ctx) {
        typeOfVariableAndName.put("clone",ctx.getChild(1).getText());
        Map vType = new HashMap<>();
        vType.put("ID","target_vectors");
        vType.put("TYPE",ctx.getChild(3).getText());
        vectorTypes.add(vType);
        System.out.println("THe clone 3 is "+ctx.getChild(3).getText());
    }

    @Override
    public void exitCloneVector(AbsConParser.CloneVectorContext ctx) {

    }

    @Override
    public void enterInlineIndex(AbsConParser.InlineIndexContext ctx) {
        if(ctx.getChild(2).getText().compareTo("target") == 0){
            inlineIndex = "target_vidx";
        }
    }

    @Override
    public void exitInlineIndex(AbsConParser.InlineIndexContext ctx) {

    }

    @Override
    public void enterVectorType(AbsConParser.VectorTypeContext ctx) {

    }

    @Override
    public void exitVectorType(AbsConParser.VectorTypeContext ctx) {

    }

    @Override
    public void enterQueryVector(AbsConParser.QueryVectorContext ctx) {
        typeOfVariableAndName.put("query",ctx.getChild(1).getText());
        Map vType = new HashMap<>();
        vType.put("ID","query_vectors");
        vType.put("TYPE",ctx.getChild(3).getText());
        vectorTypes.add(vType);
        System.out.println("THe query 3 is "+ctx.getChild(3).getText());
    }

    @Override
    public void exitQueryVector(AbsConParser.QueryVectorContext ctx) {

    }

    @Override
    public void enterConcFtrDecl(AbsConParser.ConcFtrDeclContext ctx) {

    }

    @Override
    public void exitConcFtrDecl(AbsConParser.ConcFtrDeclContext ctx) {

    }

    @Override
    public void enterFilters(AbsConParser.FiltersContext ctx) {

    }

    @Override
    public void exitFilters(AbsConParser.FiltersContext ctx) {

    }

    @Override
    public void enterFilter(AbsConParser.FilterContext ctx) {

    }

    @Override
    public void exitFilter(AbsConParser.FilterContext ctx) {

    }

    @Override
    public void enterConditions(AbsConParser.ConditionsContext ctx) {
        isCondition = true;
    }

    @Override
    public void exitConditions(AbsConParser.ConditionsContext ctx) {
        isCondition = false;
        if(isRExpr || isBExpr){
            map.clear();
            if(!expressionList.isEmpty()){
                map.put("type","expr");
                map.put("expr",new ArrayList<>(expressionList));
            }
        }

        if(isLetBlock){
            if(isRExpr || isBExpr){
                if(!map.isEmpty()){
                    filterList.add(new HashMap<>(map));
                    filters.push(new HashMap<>(map));
                }

            } else{
                if(isUniversal){
                    filterList.add(forAll);
                    filters.push(forAll);
                }
                if(isExistential){
                    filters.push(exists);
                }
            }


        } else{
            if(isUniversal){
                if(isInlinedInto){
                    filters.push(inlinedInto);
                } else{
                    filters.push(forAll);
                }

            }else{
                if(!map.isEmpty()) {
                    filters.push(new HashMap<>(map));
                } else{
                    if(isExistential){
                        if(isInlinedInto){
                            if(exists.isConditionalExpression){
                                filters.push(exists);
                            } else{
                                 filters.push(inlinedInto);
                                //TODO:need to look into this logic again
                            }


                        } else{
                            filters.push(exists);
                        }
                    }
                }

            }
        }

        isRExpr = false;
        isBExpr = false;
        isExistential = false;
        isInlinedInto = false;
        isUniversal = false;
        isLetBlock = false;
        map.clear();
        expressionList.clear();
        exists = new Exists();
        inlinedInto = new InlinedInto();
        condExpr = new ConditionalExpression();

    }

    @Override
    public void enterLetBlk(AbsConParser.LetBlkContext ctx) {
        isLetBlock = true;
        letBlockCount+=1;
    }

    @Override
    public void exitLetBlk(AbsConParser.LetBlkContext ctx) {
        isLetBlock = false;
        letBlock.assignVariables(new ArrayList(simpleAssignList),new ArrayList(filterList));
        filters.push(letBlock);
        filterList.clear();
        letBlock = new LetBlock();
    }

    @Override
    public void enterEnumerate(AbsConParser.EnumerateContext ctx) {
        isEnumerate = true;
        map.put("ID",ctx.getChild(0));
        map.put("expr",0);
        simpleAssignList.add(new HashMap<>(map));
        map.clear();
    }

    @Override
    public void exitEnumerate(AbsConParser.EnumerateContext ctx) {
        if(isEnumerate){

            map.put("expr",exists);
            simpleAssignList.add(new HashMap<>(map));
            map.clear();
        }
        exists = new Exists();
        condExpr = new ConditionalExpression();
        inlinedInto = new InlinedInto();
        isEnumerate = false;
    }

    @Override
    public void enterRExpr(AbsConParser.RExprContext ctx) {
        isRExpr = true;
    }

    @Override
    public void exitRExpr(AbsConParser.RExprContext ctx) {
        if(!isCondition){
            isRExpr = false;
        }
        System.out.println(Arrays.toString(expressionList.toArray()));
    }

    @Override
    public void enterRExp(AbsConParser.RExpContext ctx) {
        isRExp = true;
    }

    @Override
    public void exitRExp(AbsConParser.RExpContext ctx) {
        isRExp = false;
    }

    @Override
    public void enterRop(AbsConParser.RopContext ctx) {
        expressionList.add(ctx.getChild(0).getText());
    }

    @Override
    public void exitRop(AbsConParser.RopContext ctx) {

    }

    @Override
    public void enterExistl(AbsConParser.ExistlContext ctx) {
        isExistential = true;
    }

    @Override
    public void exitExistl(AbsConParser.ExistlContext ctx) {
        exists.setExpression(convertArrayListToString(expressionList));
        expressionList.clear();
    }

    @Override
    public void enterUnivsl(AbsConParser.UnivslContext ctx) {
        isUniversal = true;
    }

    @Override
    public void exitUnivsl(AbsConParser.UnivslContext ctx) {
        forAll.setExpression(convertArrayListToString(expressionList));
        expressionList.clear();
    }

    public String convertArrayListToString(ArrayList expression){
        StringBuilder expr = new StringBuilder();
        for(int i=0;i<expression.size();i++){
            expr.append(expression.get(i));
        }
        return expr.toString();
    }

    @Override
    public void enterEltChk(AbsConParser.EltChkContext ctx) {

    }

    @Override
    public void exitEltChk(AbsConParser.EltChkContext ctx) {

    }

    @Override
    public void enterElt(AbsConParser.EltContext ctx) {

    }

    @Override
    public void exitElt(AbsConParser.EltContext ctx) {
        if(isUniversal){
            forAll.var = ctx.getChild(0).getText();
        }
        if(isExistential){
            exists.var = ctx.getChild(0).getText();
        }
    }

    @Override
    public void enterSet(AbsConParser.SetContext ctx) {
        if(isUniversal){
            forAll.condition = ctx.getChild(0).getText();
        }
        if(isExistential){
            exists.condition = ctx.getChild(0).getText();
        }
    }

    @Override
    public void exitSet(AbsConParser.SetContext ctx) {

    }

    @Override
    public void enterNumRange(AbsConParser.NumRangeContext ctx) {
        isNumRange = true;
        numberRange.setStartIndex(ctx.getChild(0).getText());
    }

    @Override
    public void exitNumRange(AbsConParser.NumRangeContext ctx) {
        if(isUniversal){
            forAll.numberRange = numberRange;
            forAll.isNumberRange = true;
        }
        if(isExistential){
            exists.numberRange = numberRange;
            exists.isNumberRange = true;
        }

        isNumRange = false;
    }

    @Override
    public void enterConditionalExpression(AbsConParser.ConditionalExpressionContext ctx) {
        isConditionalExpression = true;
        condExpr.setAssignmentExpressions(new ArrayList());
    }

    @Override
    public void exitConditionalExpression(AbsConParser.ConditionalExpressionContext ctx) {
        if(isUniversal){
            forAll.setBlockObject(condExpr);
        }
        if(isExistential){
           exists.setConditionalExpression(isConditionalExpression);
           exists.setBlockObject(condExpr);
        }

        isConditionalExpression = false;
    }

    @Override
    public void enterInlineInto(AbsConParser.InlineIntoContext ctx) {
        isInlinedInto = true;
        inlinedInto.setVar(ctx.getChild(2).getText());
        if(isUniversal){
            inlinedInto.setInlineCheckType("ForAll");
            inlinedInto.setInlineVar(forAll.getVar());
        }
        if(isExistential){
            inlinedInto.setInlineCheckType("Exists");
            inlinedInto.setInlineVar(exists.getVar());
            exists.setInlinedInto(isInlinedInto);
        }
    }

    @Override
    public void exitInlineInto(AbsConParser.InlineIntoContext ctx) {
        if(isExistential){
            exists.setInlineObject(inlinedInto);
        }
    }

    @Override
    public void enterSetOfIds(AbsConParser.SetOfIdsContext ctx) {

    }

    @Override
    public void exitSetOfIds(AbsConParser.SetOfIdsContext ctx) {

    }

    @Override
    public void enterSize(AbsConParser.SizeContext ctx) {
        numberRange.setEndIndex(ctx.getChild(0).getText());
    }

    @Override
    public void exitSize(AbsConParser.SizeContext ctx) {

    }

    @Override
    public void enterSizeOf(AbsConParser.SizeOfContext ctx) {
        numberRange.setEndIndex(ctx.getText());
        System.out.println("The end index is "+numberRange.getEndIndex());
    }

    @Override
    public void exitSizeOf(AbsConParser.SizeOfContext ctx) {

    }

    @Override
    public void enterBExpr(AbsConParser.BExprContext ctx) {
        isBExpr = true;
    }

    @Override
    public void exitBExpr(AbsConParser.BExprContext ctx) {
        if(!isCondition){
            isBExpr = false;
        }
        if(isInlinedInto){
            inlinedInto.setExpression(convertArrayListToString(expressionList));
        }
    }

    @Override
    public void enterOrExpr(AbsConParser.OrExprContext ctx) {
        isOrExpr = true;
    }

    @Override
    public void exitOrExpr(AbsConParser.OrExprContext ctx) {
        isOrExpr = false;
        if(isConditionalExpression){
            condExpr.setBinaryExpression(convertArrayListToString(expressionList));
            expressionList.clear();
        }
    }

    @Override
    public void enterAndExpr(AbsConParser.AndExprContext ctx) {

    }

    @Override
    public void exitAndExpr(AbsConParser.AndExprContext ctx) {

    }

    @Override
    public void enterNotExpr(AbsConParser.NotExprContext ctx) {

    }

    @Override
    public void exitNotExpr(AbsConParser.NotExprContext ctx) {

    }

    @Override
    public void enterBAtom(AbsConParser.BAtomContext ctx) {

    }

    @Override
    public void exitBAtom(AbsConParser.BAtomContext ctx) {

    }

    @Override
    public void enterCompareInlinedVec(AbsConParser.CompareInlinedVecContext ctx) {
        if(isUniversal && isInlinedInto){
            inlinedInto.isCompare = true;
        }
    }

    @Override
    public void exitCompareInlinedVec(AbsConParser.CompareInlinedVecContext ctx) {

    }

    @Override
    public void enterTotalCount(AbsConParser.TotalCountContext ctx) {
        isTotalCount = true;
        for(int i=0;i<ctx.getChildCount();i++){
            expressionList.add(ctx.getChild(i));
        }
    }

    @Override
    public void exitTotalCount(AbsConParser.TotalCountContext ctx) {
        isTotalCount = false;
    }


    @Override
    public void enterSimpAssign(AbsConParser.SimpAssignContext ctx) {
        map.put("ID",ctx.getChild(0).getText());
    }

    @Override
    public void exitSimpAssign(AbsConParser.SimpAssignContext ctx) {
        if(!isConditionalExpression){
            simpleAssignList.add(new HashMap<>(map));
            map.clear();
        } else{
            condExpr.addRecordToAssignmentExpressions(new HashMap(map));
            map.clear();
        }

    }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) {
        switch (node.getText()){
            case "+":
            case "-":
            case "*":
            case "||":
            case "&&":
            case "/":expressionList.add(node.getText());
            break;
            case "not":expressionList.add("!");
            break;

        }

        if((!isSourceSizeOf && !isSourceOf && !isSumOfFeatures && !isFeatureAccessor&& !isTotalCount) &&( isBExpr || isOrExpr)){
            if(node.getText().equals("(") || node.getText().equals(")")){
                expressionList.add(node.getText());
            }
        }
        if(node.getText().matches("^-?\\d+$")){
            if(isExp && !isIndexAccessor && !isSourceOf && !isSourceSizeOf){
                expressionList.add(node.getText());
            }
        }
    }

    @Override public void visitErrorNode(ErrorNode node) {

    }


    public void writeToAbstractionTemplate(){
        VelocityEngine ve = new VelocityEngine();
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER,"classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        ve.init();
        Template t = ve.getTemplate("templates/Abstraction.cpp.template");
        VelocityContext context = new VelocityContext();
        context.put("declList",declarationList);
        context.put("setDeclList",setDeclarationList);
        context.put("assignmentCallList",assignmentCallList);
        context.put("setFeaturesList",setFeaturesList);
        context.put("setFeaturesByRangeList",setFeaturesByRangeList);
        StringWriter writer = new StringWriter();
        t.merge(context,writer);
        writeToFile("Abstraction.cpp",writer.toString());
    }


    public void writeToConcretizationTemplate(){
        VelocityEngine ve = new VelocityEngine();
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER,"classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        ve.init();
        Template t = ve.getTemplate("templates/Concretization.cpp.template");
        VelocityContext context = new VelocityContext();
        context.put("declList",declarationList);
        context.put("setDeclList",setDeclarationList);
        context.put("vectortypes",vectorTypes);
        context.put("vectorNames",typeOfVariableAndName);
        context.put("filterList",filters);
        context.put("assignList",simpleAssignList);
        context.put("inlineIndex",inlineIndex);
        StringWriter writer = new StringWriter();
        t.merge(context,writer);
        writeToFile("Concretization.cpp",writer.toString());
    }

    public void writeToFile(String fileName,String content){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(content);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void clearIntermediateArrays(){
        setFeaturesList.clear();
        assignmentCallList.clear();
        map.clear();
        features.clear();
        expressionList.clear();
    }
}
