/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import org.calvin.__Utils.AssortedMethods;

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
            AssortedMethods.swap(input, i, index);
        }
    }

    public static void selectSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    AssortedMethods.swap(input, i, j);
                }
            }
        }
    }
}
