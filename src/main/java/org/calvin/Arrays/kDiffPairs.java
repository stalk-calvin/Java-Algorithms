/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

public class kDiffPairs {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i : nums) {
            tracker.put(i, tracker.getOrDefault(i, 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : tracker.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (tracker.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
