/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

public class CountingSort {
    public static int[] countingSort(int[] input) {
        int[] ret = new int[input.length];
        int[] temp = new int[input.length+1];
        for (int anArr : input) {
            temp[anArr]++;
        }

        for(int i = 1; i <= input.length; i++) {
            temp[i] += temp[i-1];
        }

        for(int i = input.length - 1; i >= 0; i--) {
            ret[temp[input[i]]-1] = input[i];
            temp[input[i]]--;
        }

        return ret;
    }
}