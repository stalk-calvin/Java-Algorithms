/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

public class FindMinimumNumberInRotatedArray {
    public int findMin(int[] nums) {
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
