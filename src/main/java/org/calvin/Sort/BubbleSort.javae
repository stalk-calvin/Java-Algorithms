/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

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
}
