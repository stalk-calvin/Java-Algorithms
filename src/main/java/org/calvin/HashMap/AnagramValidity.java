package org.calvin.HashMap;

import java.util.HashMap;
import java.util.Map;

public class AnagramValidity {
    public static boolean isAnagramWithoutSort(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        Map<Character, Integer> tracker = new HashMap<>();
        for (Character c : s.toCharArray()) tracker.put(c, tracker.getOrDefault(c,0) + 1);
        for (Character c : t.toCharArray()) {
            if (tracker.get(c) != null) {
                if (tracker.get(c) < 0) return false;
                tracker.put(c, tracker.get(c) - 1);
            } else {
                return false;
            }
        }
        for (Map.Entry<Character, Integer> entry : tracker.entrySet()) {
            if (entry.getValue() != 0) return false;
        }
        return true;
    }
}
