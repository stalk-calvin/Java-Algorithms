/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class Rotate {
    public int rotated_sorted_search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }

        int l = 0;
        int r = nums.length - 1;
        while (l<=r) {
            int m = l+(r-l)/2;
            if (nums[m]==target) {
                return m;
            } else if (nums[l] <= nums[m]) {
                if (nums[l] <= target && target < nums[m]) {
                    r = m-1;
                } else {
                    l = m+1;
                }
            } else {
                if (nums[m] < target && target <= nums[r]) {
                    l = m+1;
                } else {
                    r = m-1;
                }
            }
        }
        return -1;
    }

    public void arrayRightRotation(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public int[] arrayLeftRotation(int[] a, int n, int k) {
        if (a == null || a.length < n) {
            return a;
        }

        for (int i = 0; i < k; i++) {
            shiftleft(a);
        }

        return a;
    }

    private void shiftleft(int[] a) {
        // store 1st value
        int first = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i+1];
        }
        //set last to first
        a[a.length-1] = first;
    }
}
