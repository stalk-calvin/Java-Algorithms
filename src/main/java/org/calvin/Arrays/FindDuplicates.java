package org.calvin.Arrays;

import java.util.Arrays;

public class FindDuplicates {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int low = 1, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid)
                    count++;
            }
            if (count > mid)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}
