package edu.nus.sun.image.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.omg.SendingContext.RunTime;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;

public class AbsConWalker implements   AbsConListener {



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
        public String getCondition() {
            return condition;
        }

        public String getVar() {
            return var;
        }

        public String getExpression() {
            return expression;
        }

        String condition;
        String var;
        String expression;
        public void assignVariables(String condition,String var,String expression){
            this.var = var;
            this.condition = condition;
            this.expression = expression;
        }
    }

    public  class InlinedInto{
        String var;
        String expression;
        String inlineCheckType;

        public String getExpression() {
            return expression;
        }

        public String getVar() {
            return var;
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


    //feature set features
    ArrayList features;

    //expression as array
    ArrayList expressionList;
    ArrayList simpleAssignList;
    ArrayList filterList;
    LetBlock letBlock;
    ForAll forAll;
    InlinedInto inlinedInto;

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
            System.out.println(i+" " +filters.get(i));
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

    @Override public void enterExpr(AbsConParser.ExprContext ctx) {

    }

    @Override public void exitExpr(AbsConParser.ExprContext ctx) {
        if(!isRExpr && !isBExpr){
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
        if(Integer.parseInt(ctx.getChild(8).getText())==0) {
            exp = ctx.getChild(0)+"("+ ctx.getChild(2) +","+"sourcecode_vectorindex"+","+ctx.getChild(5) +")";
        } else{
            exp = ctx.getChild(0)+"("+ ctx.getChild(2) +","+"sourcecode_vectorindex"+ctx.getChild(8)+ ","+ctx.getChild(5) +")";
        }
        if(!isSumOfFeatures){
            expressionList.add(exp);
        }

    }

    @Override public void exitSourceOf(AbsConParser.SourceOfContext ctx) {
        isSourceOf  = false;
    }

    @Override
    public void enterSourceOfSize(AbsConParser.SourceOfSizeContext ctx) {
        String exp;
        if(Integer.parseInt(ctx.getChild(5).getText())==0){
             exp = ctx.getChild(0)+"("+ ctx.getChild(2) +","+"sourcecode_vectorindex"+")";
        } else{
             exp = ctx.getChild(0)+"("+ ctx.getChild(2) +","+"sourcecode_vectorindex"+ctx.getChild(5)+")";
        }

        System.out.println(exp);
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
    }

    @Override
    public void exitCloneVector(AbsConParser.CloneVectorContext ctx) {

    }

    @Override
    public void enterQueryVector(AbsConParser.QueryVectorContext ctx) {
        typeOfVariableAndName.put("query",ctx.getChild(1).getText());
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
                    filters.add(new HashMap<>(map));
                }

            } else{
                if(isUniversal){
                    filterList.add(forAll);
                }
            }

        } else{
            if(isUniversal){
                if(isInlinedInto){
                    filters.push(inlinedInto);
                    System.out.println("Added to filters in inlinedinto");
                } else{
                    filters.push(forAll);
                    System.out.println("Added to filters in forall");
                }

            }else{
                if(!map.isEmpty()) {
                    filters.push(new HashMap<>(map));
                    System.out.println("Added to filters in not of universal");
                }

            }
        }
//        if(!isUniversal){
//            if(!map.isEmpty()) {
//                filters.push(new HashMap<>(map));
//                System.out.println("Added to filters in not of universal outside ");
//            }
//
//        }

        isRExpr = false;
        isBExpr = false;
        isInlinedInto = false;
        isUniversal = false;
        isLetBlock = false;
        map.clear();
        expressionList.clear();
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
//        simpleAssignList.clear();
        filterList.clear();
        letBlock = new LetBlock();
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

    }

    @Override
    public void exitExistl(AbsConParser.ExistlContext ctx) {

    }

    @Override
    public void enterUnivsl(AbsConParser.UnivslContext ctx) {
        isUniversal = true;
    }

    @Override
    public void exitUnivsl(AbsConParser.UnivslContext ctx) {
        forAll.assignVariables(forAll.var,forAll.condition,convertArrayListToString(expressionList));
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
    }

    @Override
    public void enterSet(AbsConParser.SetContext ctx) {
        if(isUniversal){
            forAll.condition = ctx.getChild(0).getText();
        }
    }

    @Override
    public void exitSet(AbsConParser.SetContext ctx) {

    }

    @Override
    public void enterNumRange(AbsConParser.NumRangeContext ctx) {

    }

    @Override
    public void exitNumRange(AbsConParser.NumRangeContext ctx) {

    }

    @Override
    public void enterInlineInto(AbsConParser.InlineIntoContext ctx) {
        isInlinedInto = true;
        inlinedInto.setVar(ctx.getChild(2).getText());
        if(isUniversal){
            inlinedInto.setInlineCheckType("ForAll");
        }
    }

    @Override
    public void exitInlineInto(AbsConParser.InlineIntoContext ctx) {

    }

    @Override
    public void enterSetOfIds(AbsConParser.SetOfIdsContext ctx) {

    }

    @Override
    public void exitSetOfIds(AbsConParser.SetOfIdsContext ctx) {

    }

    @Override
    public void enterSize(AbsConParser.SizeContext ctx) {

    }

    @Override
    public void exitSize(AbsConParser.SizeContext ctx) {

    }

    @Override
    public void enterSizeOf(AbsConParser.SizeOfContext ctx) {

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
    }

    @Override
    public void enterBExp(AbsConParser.BExpContext ctx) {

    }

    @Override
    public void exitBExp(AbsConParser.BExpContext ctx) {
    }

    @Override
    public void enterBop(AbsConParser.BopContext ctx) {

    }

    @Override
    public void exitBop(AbsConParser.BopContext ctx) {
        expressionList.add(ctx.getChild(0).getText());
    }


    @Override
    public void enterSimpAssign(AbsConParser.SimpAssignContext ctx) {
        map.put("ID",ctx.getChild(0).getText());
    }

    @Override
    public void exitSimpAssign(AbsConParser.SimpAssignContext ctx) {
        simpleAssignList.add(new HashMap<>(map));
        map.clear();
    }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) {
        switch (node.getText()){
            case "+":
            case "-":
            case "*":
            case "/":expressionList.add(node.getText());
            break;
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
        context.put("filtersList",filterList);
        context.put("vectorNames",typeOfVariableAndName);
        context.put("filterList",filters);
        context.put("assignList",simpleAssignList);
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
