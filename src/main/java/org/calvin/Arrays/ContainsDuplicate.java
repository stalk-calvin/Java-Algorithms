package org.calvin.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicateFirst(int[] nums) {
        Set<Integer> checker = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!checker.add(nums[i])) return true;
        }
        return false;
    }

    public boolean containsDuplicateSecond(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
