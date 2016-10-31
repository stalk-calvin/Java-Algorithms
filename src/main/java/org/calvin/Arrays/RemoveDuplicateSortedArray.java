package org.calvin.Arrays;

public class RemoveDuplicateSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 0;
        if (nums.length == 0) {
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
}
