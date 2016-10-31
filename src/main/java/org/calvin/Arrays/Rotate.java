package org.calvin.Arrays;

public class Rotate {
    public void rotate1(int[] nums, int k) {
        if (nums == null) return;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index = (i + k) % nums.length;
            nums[index] = nums[i];
        }
    }

    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
