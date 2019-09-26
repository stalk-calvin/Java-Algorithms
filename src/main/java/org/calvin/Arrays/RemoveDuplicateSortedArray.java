/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.calvin.__Utils.AssortedMethods.swap;

public class RemoveDuplicateSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 0;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        nums[k] = nums[i];
        for (i = 1; i < nums.length; i++) {
            if (nums[i] > nums[k]) {
                nums[++k] = nums[i];
            }
        }
        return k + 1;
    }

    public int removeDuplicatesMyWay(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums == null ? 0 : nums.length;
        }

        int p=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[p]) {
                continue;
            } else if ( nums[p+1] < nums[i]) {
                swap(nums, p+1, i);
            }
            p++;
        }

        return p+1;
    }

    public int removeDuplicatesMyWayTwo(int[] nums) {
        if (nums == null) return 0;
        if (nums.length < 2) return 1;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                continue;
            } else {
                nums[j] = nums[i-1];
                j++;
            }
        }
        nums[j] = nums[nums.length-1];
        return j+1;
    }
}
