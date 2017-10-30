/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.HashMap;
import java.util.Map;

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

    public int lengthOfLongestSubstring2(String a) {
        if (a == null || a.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE, count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                count = 0;
            } else {
                map.put(a.charAt(i), 1);
            }
            count++;
            max = Math.max(max, count);
        }
        return max;
    }
}
