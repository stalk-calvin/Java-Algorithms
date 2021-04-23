package org.calvin.Arrays;

public class NonDecreasingArraySingleModification {
//    You are given an array of integers in an arbitrary order. Return whether or not it is possible to make the array non-decreasing by modifying at most 1 element to any value.
//
//    We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
//
//            **Example**:
// - [13, 4, 7] should return true, since we can modify 13 to any value 4 or less, to make it non-decreasing.
// - [1, 4, 3, 7] should return true
// - [1, 8, 3, 7] should return false
    public static boolean canSortWithOneChange(int[] input) {
        if (input.length < 2) return true;
        int count = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] < input[i-1]) {
                if (i == 1 || input[i-2] <= input[i]) {
                    input[i-1] = input[i];
                    count++;
                } else {
                    input[i] = input[i-1];
                    count++;
                }
            }
        }
        return count <= 1;
    }
}
