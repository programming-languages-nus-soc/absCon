package edu.nus.sun.image.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FeatureReader {
    public static HashMap<String, Integer> featureMap;

    public static void readMetaDataFeatures(String fileName){
        featureMap = new HashMap<>();
        BufferedReader br = null;
        String currentLine;
        int featureCount=0;
        try {
            br = new BufferedReader(new FileReader(fileName));
            while((currentLine =br.readLine())!=null){
                featureMap.put(currentLine.trim(),featureCount);
                featureCount++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
