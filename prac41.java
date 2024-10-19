import java.io.*;
import java.util.*;

public class prac41 {
    public static void main(String[] args) {
        Set<String> keywords = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", 
            "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", 
            "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", 
            "new", "null", "package", "private", "protected", "public", "return", "short", "static", 
            "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", 
            "try", "void", "volatile", "while"
        ));

    
        String filePath = "SampleJavaFile.java";  
        int keywordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

          
            while ((line = reader.readLine()) != null) {
                String[] words = line.replaceAll("[^a-zA-Z]", " ").split("\\s+");
                for (String word : words) {
                    if (keywords.contains(word)) {
                        keywordCount++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println("Total number of keywords in the file: " + keywordCount);
    }
}

