/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package linter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) {
//        int lineNumber = 1;
//        Path path = Paths.get("gates.js");
//        try{
//            BufferedReader reader = Files.newBufferedReader(path);
//            String line = reader.readLine();
//            while(line != null){
//
//
//                if(line.length() != 0 && line.charAt(line.length()-1) != ';' && line.charAt(line.length()-1) != '{' && line.charAt(line.length()-1) != '}' && !line.contains("if") && !line.contains("else")){
//                    line = "Line " + lineNumber + ": Missing semicolon.";
//                }
//
//
//                System.out.println(line);
//                line = reader.readLine();
//                lineNumber++;
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        App.readJS("gates.js");


    }

    public static String readJS(String place){
        int lineNumber = 1;
        String result = "";
        Path path = Paths.get(place);
        try{
            BufferedReader reader = Files.newBufferedReader(path);
            String line = reader.readLine();
            while(line != null){


                if(line.length() != 0 && line.charAt(line.length()-1) != ';' && line.charAt(line.length()-1) != '{' && line.charAt(line.length()-1) != '}' && !line.contains("if") && !line.contains("else")){
                    line = "Line " + lineNumber + ": Missing semicolon.";
                }


                System.out.println(line);
                result += line;
                line = reader.readLine();
                lineNumber++;

            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
