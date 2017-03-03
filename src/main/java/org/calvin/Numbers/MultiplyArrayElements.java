/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class MultiplyArrayElements {
    // brute force
    public int[] multiplyBruteForce(int[] items) {
        if (items == null) return new int[0];
        if (items.length == 0) {
            return items;
        }

        int length = items.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    if (sum == 0) {
                        sum = items[j];
                    } else {
                        sum *= items[j];
                    }
                }
            }
            result[i] = sum;
        }
        return result;
    }

    public int[] multiplyMoreEfficient(int[] items) {
        if (items == null) return new int[0];
        if (items.length == 0) {
            return items;
        }

        int[] fromBeginning = new int[items.length];
        int[] fromEnd = new int[items.length];
        int[] combinedResult = new int[items.length];

        fromBeginning[0] = 1;
        fromEnd[items.length - 1] = 1;
        for (int i = 1; i < items.length; i++) {
            fromBeginning[i] = fromBeginning[i - 1] * items[i - 1];
        }
        for (int i = items.length - 2; i >= 0; i--) {
            fromEnd[i] = fromEnd[i + 1] * items[i + 1];
        }
        for (int i = 0; i < items.length; i++) {
            combinedResult[i] = fromBeginning[i] * fromEnd[i];
        }
        return combinedResult;
    }
}
