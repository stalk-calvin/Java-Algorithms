/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

public class SelectionSort {
    public static void sort(int[] input) {
        if (input == null || input.length < 2) return;
        int min;

        for (int i = 0; i < input.length; i++) {
            int index = i;
            min = input[i];
            for (int j = i; j < input.length; j++) {
                if (input[j] < min) {
                    index = j;
                    min = input[j];
                }
            }
            //swap i with min
            int temp = input[i];
            input[i] = input[index];
            input[index] = temp;
        }
    }
}
