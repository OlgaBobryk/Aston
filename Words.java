

import java.util.*;

public class Words {
    public static Set<String> findUniqueWords(String[] words) {
        Set<String> allUniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(allUniqueWords);
        return allUniqueWords;
    }


    public static Map<String, Integer> getCountOfWords(String[] words) {
        Map<String, Integer> countingWords = new HashMap<>();
        int countOfWords;
        for (String word : words) {
            if (countingWords.containsKey(word)) {
                countOfWords = countingWords.get(word);
                countingWords.put(word, countOfWords + 1);
            } else {
                countingWords.put(word, 1);
            }
        }
        return countingWords;
    }

}