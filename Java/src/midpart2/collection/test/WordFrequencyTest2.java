package midpart2.collection.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> result = new HashMap<>();

        String[] words = text.split(" ");
        for (String word : words) {
            Integer count = result.getOrDefault(word, 0);
            result.put(word, count);
        }
    }
}
