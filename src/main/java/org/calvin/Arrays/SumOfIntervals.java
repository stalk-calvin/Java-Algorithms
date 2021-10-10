package org.calvin.Arrays;

import java.util.HashSet;
import java.util.Set;

public class SumOfIntervals {
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null) {
            return 0;
        }
        Set<Integer> result = new HashSet<>();
        for (int[] interval : intervals) {
            for (int i = interval[0]; i < interval[1]; i++) {
                if (!result.contains(i)) {
                    result.add(i);
                }
            }
        }
        return result.size();
    }
}
