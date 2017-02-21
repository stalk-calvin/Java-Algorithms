/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class Factorial {
    //Recursive
    public long factorialRecursive(int i) {
        if (i <= 1) {
            return 1;
        } else if (i == 2) {
            return 2;
        }

        return i * factorialRecursive(i-1);
    }

    //Iterative
    public long factorialIterative(int i) {
        long result = i;
        while (i > 2) {
            i--;
            result = result * i;
        }
        return result;
    }


    //Dynamic Programming
    public long factorialDynamicProgramming(int i) {
        if (i <= 2) return i;
        long[] result = new long[i+1];
        result[0] = 1;
        result[1] = 1;
        for (int j = 2; j < result.length; j++) {
            result[j] = result[j-1] * j;
        }
        return result[i];
    }

}
