/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import org.calvin.Tree.AssortedMethods;

class BubbleSort {
    public static void sort(int[] input) {
        if (input == null || input.length < 2) return;
        int n = input.length;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(input[j-1] > input[j]){
                    //swap the elements!
                    int temp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = temp;
                }
            }
        }
    }

    public static void sortAdaptive(int[] input) {
        if (input == null || input.length < 2) return;
        int n = input.length;
        for (int i=0; i< n; i++) {
            boolean swapped = false;
            for (int j = n -1; j > i; j--) {
                if (input[j] < input[j-1]) {
                    AssortedMethods.swap(input, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
