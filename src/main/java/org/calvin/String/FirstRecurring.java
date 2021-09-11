package org.calvin.String;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurring {

    public static Character findFirstRecurring(String input) {
        if (input == null || input.length() < 2) return null;
        Map<Character, Integer> tracker = new HashMap<>();
        for (char c : input.toCharArray()) tracker.put(c, tracker.getOrDefault(c, 0) + 1);
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (tracker.get(c) > 1) {
                return c;
            }
        }
        return null;
    }

    public static Character findFirstRecurringAllLowercase(String input) {
        input = input.toLowerCase();
        int[] visited = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            visited[c - 'a']++;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (visited[c - 'a'] > 1) {
                return c;
            }
        }
        return null;
    }
}
