/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfArrayElementsAreConsecutive {
    public boolean areConsecutive(int[] input) {
        if (input == null || input.length < 2) return true;
        Set<Integer> tracker = new HashSet<>();
        int min = Integer.MAX_VALUE;
        for (int num : input) {
            if (tracker.contains(num)) return false;
            tracker.add(num);
            min = Math.min(num,min);
        }
        for (int i = min; i < min + input.length; i++) {
            if (!tracker.remove(i)) return false;
        }
        return true;
    }
}
