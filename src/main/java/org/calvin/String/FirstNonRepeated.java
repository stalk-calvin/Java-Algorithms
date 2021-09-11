/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeated {
    public static Character findFirstNonRepeated(String x) {
        if (x == null || x.length() == 0) return null;
        if (x.length() < 2) return x.charAt(0);
        Map<Character, Integer> tracker = new HashMap<>();
        for (char c : x.toCharArray()) tracker.put(c, tracker.getOrDefault(c, 0) + 1);
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (tracker.get(c).equals(1)) {
                return c;
            }
        }
        return null;
    }

    public static Character findFirstNonRepeatedAllLowercase(String input) {
        input = input.toLowerCase();
        int[] visited = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            visited[c - 'a']++;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (visited[c - 'a'] == 1) {
                return c;
            }
        }
        return null;
    }
}
