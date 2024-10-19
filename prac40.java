import java.util.*;

public class prac40 {
    public static void main(String[] args) {
    
        String text = "This is a test. This test is simple and this test is fun.";
        String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        
        Set<String> sortedWords = new TreeSet<>(wordCountMap.keySet());

        
        System.out.println("Word counts in alphabetical order:");
        for (String word : sortedWords) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}

