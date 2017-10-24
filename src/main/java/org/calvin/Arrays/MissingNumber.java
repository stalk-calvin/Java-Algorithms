/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class MissingNumber {
    public int missingNumber(int[] input) {
        if (input == null) return -1;
        int a = 0; // start from 0
        int count;
        for (count = 0; count < input.length; count++) {
            a = a ^ count ^ input[count];
        }
        return a^count;
    }
}
