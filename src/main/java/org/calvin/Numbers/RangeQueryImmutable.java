/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class RangeQueryImmutable {

    int[] nums;

    public RangeQueryImmutable(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];

        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if (i > nums.length || j > nums.length) return -1;
        if (i == 0)
            return nums[j];

        return nums[j] - nums[i - 1];
    }
}
