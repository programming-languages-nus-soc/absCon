package edu.nus.sun.image.parser;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class AbsCon {

    public static void main(String[] args) throws IOException {
        String inputFile = args[0];
        String featureFileName = args[1];
        InputStream is = new FileInputStream(inputFile);
        AbsConLexer lexer = new AbsConLexer(new ANTLRInputStream(is));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AbsConParser parser = new AbsConParser(tokens);
        ParseTree tree = parser.program();
        FeatureReader.readMetaDataFeatures(featureFileName);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new AbsConWalker(),tree);
    }
}
