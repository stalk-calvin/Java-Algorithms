/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnagramGrouper {
    // Performance note: 3 dots would not trigger, new String[]{...}
    public List<List<String>> groupAnagrams(String... words) {
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

    private String sortWordLetters(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
}
