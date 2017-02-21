/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

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
}
