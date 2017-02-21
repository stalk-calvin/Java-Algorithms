/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums == null || nums.length==0) return result;
        if (nums.length==1) {
            result.add(nums[0]+"");
            return result;
        }
        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                end = nums[i];
            } else {
                String r = start+"->"+end;
                if (start == end) {
                    r = start+"";
                }
                result.add(r);
                start = nums[i];
                end=nums[i];
            }
        }
        String r = start+"->"+end;
        if (start == end) {
            r = start+"";
        }
        result.add(r);
        return result;
    }
}
