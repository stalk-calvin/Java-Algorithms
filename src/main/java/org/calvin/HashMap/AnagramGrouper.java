package org.calvin.HashMap;

import java.util.*;

public class AnagramGrouper {
    public static List<List<String>> groupAnagrams(String... words) {
        //Arrays.sort(words); // could be ignored depending on the requirement

        Map<String, List<String>> map = new LinkedHashMap<>();
        for (String word : words) {
            String wordWithSortedLetters = sortWordLetters(word);

            if (!map.containsKey(wordWithSortedLetters)) {
                map.put(wordWithSortedLetters, new ArrayList<>());
            }

            map.get(wordWithSortedLetters).add(word);
        }

        return new ArrayList<>(map.values());
    }

    private static String sortWordLetters(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
}
