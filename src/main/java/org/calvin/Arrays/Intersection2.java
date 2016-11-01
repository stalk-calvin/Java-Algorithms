/*
 * Copyright Calvin Lee - 2016
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (count.containsKey(nums1[i])) {
                count.put(nums1[i], count.get(nums1[i]) + 1);
            } else {
                count.put(nums1[i], 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (count.containsKey(nums2[i]) && count.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                count.put(nums2[i], count.get(nums2[i]) - 1);
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

}
