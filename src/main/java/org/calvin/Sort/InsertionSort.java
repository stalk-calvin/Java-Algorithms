/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import org.calvin.__Utils.AssortedMethods;

public class InsertionSort {
    public static void sort(int[] input) {
        if (input == null || input.length < 2) return;
        for(int i = 0; i<input.length; i++) {
            int temp = input[i];
            int j;
            for (j = i - 1; j >= 0 && temp < input[j]; j--) {
                input[j+1] = input[j];
                input[j] = temp;
            }
        }
    }

    public static void sortAnother(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    AssortedMethods.swap(input, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
