/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicateFirst(int[] nums) {
        Set<Integer> checker = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!checker.add(nums[i])) return true;
        }
        return false;
    }

    public boolean containsDuplicateSecond(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> mark = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!mark.add(nums[i])) {
                return true;
            }
            if (i >= k) {
                //remove first element;
                mark.remove(nums[i - k]);
            }
        }
        return false;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums.length < 2 || k == 0) {
            return false;
        }
        TreeSet<Long> set = new TreeSet<>();

        int i = 0;
        while (i < nums.length) {
            Long floor = set.floor((long) nums[i]);
            Long ceiling = set.ceiling((long) nums[i]);
            if ((floor != null && nums[i] - floor <= t ) ||
                    (ceiling != null && ceiling - nums[i] <= t)) {
                return true;
            }
            set.add((long) nums[i++]);
            if (i > k) {
                set.remove((long) nums[i - k - 1]);
            }
        }
        return false;
    }

    public String removeAdjacentDuplicates(String S) {
        Stack<Character> tracker = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (!tracker.isEmpty() && tracker.peek() == S.charAt(i)) {
                tracker.pop();
            } else {
                tracker.push(S.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character a : tracker) {
            sb.append(a);
        }
        return sb.toString();
    }
}
