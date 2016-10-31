/*
 * Copyright Calvin Lee - 2016
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class CheckIfArrayElementsAreConsecutive {

    public boolean areConsecutive(int input[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }
        for (int i = 0; i < input.length; i++) {
            if (Math.abs(input[i]) - min >= input.length) {
                return false;
            }
            if (input[Math.abs(input[i]) - min] < 0) {
                return false;
            }
            input[Math.abs(input[i]) - min] = -input[Math.abs(input[i]) - min];
        }
        for (int i = 0; i < input.length; i++) {
            input[i] = Math.abs(input[i]);
        }
        return true;
    }
}
