/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class Rotate {
    public void rotate(int[] nums, int k) {
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
