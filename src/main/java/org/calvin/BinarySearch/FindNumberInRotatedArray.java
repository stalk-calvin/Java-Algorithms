/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

public class FindNumberInRotatedArray {
    public int find(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + ((end-start) / 2);
            if (nums[mid] == key) {
                return key;
            } else if (nums[mid] >= nums[start]) {
                if (nums[start] <= key && key < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (nums[mid] < key && key <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
