/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.HashMap;
import java.util.Map;

public class NonRepeated {
    public static Character findNonRepeated(String x) {
        if (x == null || x.length() == 0) return null;
        if (x.length() < 2) return x.charAt(0);
        Map<Character, Integer> tracker = new HashMap<>();
        for (char c : x.toCharArray()) {
            Integer previousValue = tracker.get(c);
            tracker.put(c, previousValue == null ? 1 : previousValue + 1);
        }
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (tracker.get(c).equals(1)) {
                return c;
            }
        }
        return null;
    }
}
