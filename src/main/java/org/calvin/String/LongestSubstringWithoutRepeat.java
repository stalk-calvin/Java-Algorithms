/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    public int lengthOfLongestSubstringSimpler(String a) {
        if (a == null || a.length() == 0) return 0;
        Set<Character> tracker = new HashSet<>();
        int max = Integer.MIN_VALUE, count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (tracker.contains(a.charAt(i))) {
                count = 0;
            } else {
                tracker.add(a.charAt(i));
            }
            count++;
            max = Math.max(max, count);
        }
        return max;
    }
}
