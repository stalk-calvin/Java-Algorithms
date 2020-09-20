/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null) return result;
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tracker.get(target - nums[i]) != null) {
                result[0] = i;
                result[1] = tracker.get(target - nums[i]);
                return result;
            }
            tracker.put(nums[i], i);
        }
        return result;
    }
}
