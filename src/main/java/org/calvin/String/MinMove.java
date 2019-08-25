/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.HashMap;
import java.util.Map;

public class MinMove {
    // O(n + m)
    public int minMoveEnglishOnly(String a, String b) {
        String[] longerShorter = longerShorter(a,b);
        int[] freq = new int[26];
        for (char x : longerShorter[0].toCharArray()) freq[x - 'a']++;
        for (char x : longerShorter[1].toCharArray()) freq[x - 'a']--;

        int r = 0;
        for (int f : freq) r += f;
        return r;
    }

    public int minMove(String a, String b) {
        String[] longerShorter = longerShorter(a,b);
        Map<Character, Integer> tracker = new HashMap<>();
        for (char x : longerShorter[0].toCharArray()) tracker.put(x, tracker.getOrDefault(x, 0) + 1);
        for (char x : longerShorter[1].toCharArray()) {
            if (tracker.containsKey(x)) {
                tracker.put(x, tracker.get(x) - 1);
            }
        }
        int r = 0;
        for (Map.Entry<Character, Integer> x : tracker.entrySet()) {
            r += x.getValue();
        }
        return r;
    }

    private String[] longerShorter(String a, String b) {
        String longer = a;
        String shorter = b;
        if (b.length() > a.length()) {
            longer = b;
            shorter = a;
        }
        return new String[]{longer, shorter};
    }
}
