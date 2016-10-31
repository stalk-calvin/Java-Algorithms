package org.calvin.Arrays;

import java.util.Arrays;

// Given an array of size n, find the majority element. The majority element is the element that appears more than
// n/2 times.
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
