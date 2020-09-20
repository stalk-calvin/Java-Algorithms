package org.calvin.HashMap;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {
    public static int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i : nums) {
            tracker.put(i, tracker.getOrDefault(i, 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : tracker.entrySet()) {
            if (k == 0 && entry.getValue() >= 2) {
                count++;
            } else if (tracker.containsKey(entry.getKey() + k)) {
                count++;
            }
        }

        return count;
    }
}
