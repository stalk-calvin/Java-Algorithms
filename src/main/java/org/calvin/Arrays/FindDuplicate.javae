/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public boolean findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        Set<Integer> tracker = new HashSet<>();
        for (int num : nums) {
            if (tracker.contains(num)) {
                return true;
            } else {
                tracker.add(num);
            }
        }

        return false;
    }
}
