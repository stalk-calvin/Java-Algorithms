package org.calvin.BinarySearch;

public class FindMinInRotatedSorted {
    public int findMin(int[] nums) {
        if (nums == null) {
            return Integer.MAX_VALUE;
        }
        // real algorithm
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            int mid = first + ((last - first) / 2);
            if (nums[last] <= nums[mid]) first = mid + 1;
            else last = mid;
        }
        return nums[last];
    }

    public int findMinWithDuplicated(int[] nums) {
        int start=0,mid=0,end=nums.length-1;
        while(start<end){
            mid=start+(end-start)/2;
            if(nums[mid]>nums[end]) start=mid+1;
            else if(nums[mid]==nums[end]) end--;
            else end=mid;
        }
        return nums[start];
    }
}
