package org.calvin.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static List<String> findMissingRanges(int[] sortedNums, int low, int high) {
        List<String> result = new ArrayList<>();
        if (low > high) {
            return result;
        }

        if (sortedNums[0] > low) {
            result.add(getRanges(low, sortedNums[0]));
        }

        for (int i = 1; i < sortedNums.length; i++) {
            int a = sortedNums[i-1];
            int b = sortedNums[i];
            if (a < low || b > high) continue;
            if (b-a > 1) {
                result.add(getRanges(a+1,b-1));
            }
        }

        if (sortedNums[sortedNums.length-1] < high) {
            result.add(getRanges(sortedNums[sortedNums.length-1]+1, high));
        }

        return result;
    }

    private static String getRanges(int a, int b) {
        return a == b ? String.valueOf(a) : a + "->" + b;
    }
}
