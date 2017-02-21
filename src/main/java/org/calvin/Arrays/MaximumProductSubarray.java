/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class MaximumProductSubarray {
    // Dynamic Programming Solution
    // O(n)
    public int maxProduct(int[] input) {
        int[] max = new int[input.length];
        int[] min = new int[input.length];

        max[0] = input[0];
        min[0] = input[0];
        int result = input[0];

        for (int i = 1; i < input.length; i++) {
            // We need to track a minimum value, so that when a negative number is given, it can also find the
            // maximum value. Variable result is used to track maximum product
            if (input[i] > 0) {
                max[i] = Math.max(input[i], max[i - 1] * input[i]);
                min[i] = Math.min(input[i], min[i - 1] * input[i]);
            } else {
                max[i] = Math.max(input[i], min[i - 1] * input[i]);
                min[i] = Math.min(input[i], max[i - 1] * input[i]);
            }

            result = Math.max(result, max[i]);
        }

        return result;
    }
}
