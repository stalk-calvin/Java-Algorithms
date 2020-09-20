/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length < 2) return result;
        Set<Integer> tracker = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            tracker.add(num);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        for (int i = min; i <= max; i++) {
            if (!tracker.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
