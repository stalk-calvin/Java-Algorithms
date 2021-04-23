package org.calvin.Arrays;

public class BoundSmallestWindowForSorted {

    public static int[] rangeOfUnsorted(int[] input) {
        int maxSoFar = input[0], minSoFar = input[input.length-1];
        int x = -1, y = -1;
        for (int i = 0; i < input.length; i++) {
            maxSoFar = Math.max(maxSoFar, input[i]);
            if (maxSoFar > input[i]) {
                y = i;
            }
        }
        for (int i = input.length-1; i >= 0; i--) {
            minSoFar = Math.min(minSoFar, input[i]);
            if (minSoFar < input[i]) {
                x = i;
            }
        }
        return new int[]{x, y};
    }
}
