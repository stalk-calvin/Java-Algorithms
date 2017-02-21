/*
 * Copyright Calvin Lee Since 2016
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> nums1Set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (nums1Set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int[] r = new int[result.size()];
        int index = 0;
        for (Integer i : result) {
            r[index++] = i; // auto unbox
        }
        return r;
    }
}
