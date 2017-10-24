/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class MoveZeros {
    public int moveAndReturnNumberOfNonZeroes(int[] A) {
        if (A == null) return 0;
        int counter = 0;
        int k = A.length - 1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 0) {
                int x = i;
                while (x < k) {
                    int tmp = A[x + 1];
                    A[x + 1] = A[x];
                    A[x] = tmp;
                    x++;
                }
                if (x >= k) {
                    k--;
                }
            } else {
                counter++;
            }
        }
        return counter;
    }

    public int moveZeros(int[] input) {
        if (input == null) return 0;

        int index = 0;
        for (int num : input) {
            if (num != 0) input[index++] = num;
        }

        int length = index;
        while (index < input.length) input[index++] = 0;
        return length;
    }
}
