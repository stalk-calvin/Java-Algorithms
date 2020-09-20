/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums == null) return 0;
        if (nums.length == 1) return val == nums[0] ? 0 : 1;
        int pointer = 0;
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) continue;
            nums[pointer++] = nums[i];
            length++;
        }
        return length;
    }
}
