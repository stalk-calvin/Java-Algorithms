/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DynamicProgramming;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n < 3) return n;
        int[] m = new int[n + 1];
        m[1] = 1;
        m[2] = 2;
        for (int i = 3; i <= n; i++) {
            m[i] = m[i - 1] + m[i - 2];
        }
        return m[n];
    }
}
