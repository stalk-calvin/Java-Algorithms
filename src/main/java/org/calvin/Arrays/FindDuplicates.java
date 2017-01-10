package org.calvin.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            if (tracker.containsKey(nums[i])) {
                return tracker.get(nums[i]);
            } else {
                tracker.put(nums[i], i);
            }
        }

        return 0;
    }
}
