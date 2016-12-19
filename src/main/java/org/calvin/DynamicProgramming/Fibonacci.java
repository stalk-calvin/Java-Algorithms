/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DynamicProgramming;

public class Fibonacci {
    public static int fibDP(int n) {
        if (n < 1) {
            return 0;
        }
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n+1];
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }
}
