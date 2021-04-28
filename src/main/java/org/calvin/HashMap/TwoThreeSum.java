/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.HashMap;

import java.util.*;

public class TwoThreeSum {
    public static List<Integer> threeSum(List<Integer> nums, int target) {
        Collections.sort(nums);
        List<Integer> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList(nums);
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            List<Integer> twoSums = twoSum(tmp, target-num);
            if (!twoSums.isEmpty()) {
                result.add(num);
                result.add(tmp.get(twoSums.get(0)));
                result.add(tmp.get(twoSums.get(1)));
                return result;
            }
            tmp.remove(0);
        }
        return result;
    }
    public static List<Integer> twoSum(List<Integer> nums, int target) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.size() < 2) return result;
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            if (tracker.get(target - nums.get(i)) != null) {
                result.add(i);
                result.add(tracker.get(target - nums.get(i)));
                return result;
            }
            tracker.put(nums.get(i), i);
        }
        return result;
    }
}
