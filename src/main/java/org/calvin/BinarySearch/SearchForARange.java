package org.calvin.BinarySearch;

public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = {-1, -1};
        int n = nums.length-1;
        if (n == 0) return ret;
        int i = 0, j = n;
        while (i < j) {
            int mid = i + (j - i)/2;
            if (nums[mid] == target)
                j = mid;
            else if (nums[mid] < target)
                i = mid+1;
            else
                j = mid;
        }
        if (nums[i] == target)
            ret[0] = i;
        else
            return ret;
        j = n; // reset j to end
        while (i < j) {
            int mid = i + (j - i)/2 + 1;  // make mid biased to right
            if (nums[mid] == target)
                i = mid;
            else if (nums[mid] > target)
                j = mid - 1;
        }
        ret[1] = j;
        return ret;
    }
}
