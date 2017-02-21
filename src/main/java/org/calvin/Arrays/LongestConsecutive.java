/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxLen = 1;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        while (!set.isEmpty()) {
            int len = 0;
            int val = set.iterator().next();
            int p = val, q = val - 1;
            while (set.remove(p++)) len++;
            while (set.remove(q--)) len++;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
