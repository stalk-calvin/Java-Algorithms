/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        List<Integer> descList = new ArrayList<Integer>();
        int[] res = new int[nums.length + 1 - k];
        for (int i = 0; i < k - 1; i++) addDescList(descList, nums[i]);
        for (int i = 0; i < res.length; i++) {
            addDescList(descList, nums[i + k - 1]);
            res[i] = descList.get(0); // record the first item, which is the largest so far
            if (nums[i] == descList.get(0)) descList.remove(0); //to delete the left most.
        }
        return res;
    }

    private void addDescList(List<Integer> descList, int num) {
        // Delete all items less than num
        while (!descList.isEmpty() && num > descList.get(descList.size() - 1)) descList.remove(descList.size() - 1);

        // add num to the last
        descList.add(num);
    }
}
