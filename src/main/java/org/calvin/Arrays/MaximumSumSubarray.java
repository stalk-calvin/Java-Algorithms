/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.List;

public class MaximumSumSubarray {
    public int maxSubArray(int[] A) {
        int newsum=A[0];
        int max=A[0];
        for(int i=1;i<A.length;i++){
            newsum=Math.max(newsum+A[i],A[i]);
            max= Math.max(max, newsum);
        }
        return max;
    }

    public int maxSubArrayDP(int[] A) {
        int max = A[0];
        int[] sum = new int[A.length];
        sum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
            max = Math.max(max, sum[i]);
        }

        return max;
    }

    public int findMaximumSubarray(List<Integer > A) {
        int minSum = 0, runningSum = 0, maxSum = 0;
        for (int i = 0; i < A.size(); ++i) {
            runningSum += A.get(i);
            if (runningSum < minSum) {
                minSum = runningSum;
            }
            if (runningSum - minSum > maxSum) {
                maxSum = runningSum - minSum;
            }
        }
        return maxSum;
    }
}
