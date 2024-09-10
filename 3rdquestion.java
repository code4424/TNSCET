import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args)
    {
        String input = "This is a test string. This string is for testing.";
        Map<String, Integer> wordFrequency = countWordFrequency(input);
        
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) 
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static Map<String, Integer> countWordFrequency(String input)
     {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = input.toLowerCase().split("[\\s.]+");
        for (String word : words) 
        {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        return frequencyMap;
    }
}