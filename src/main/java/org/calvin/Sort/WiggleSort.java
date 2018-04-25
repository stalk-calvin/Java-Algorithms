package org.calvin.Sort;

public class WiggleSort {
    public void wiggleSort(int[] nums) {
        for(int i=0;i<nums.length;i++)
            if(i%2==1){
                if(nums[i-1]>nums[i]) swap(nums, i);
            }else if(i!=0 && nums[i-1]<nums[i]) swap(nums, i);
    }
    public void wiggleSortAnother(int[] nums) {
        boolean less = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (less) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            } else {
                if (nums[i] < nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            }
            less = !less;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void swap(int[] nums, int i){
        int tmp=nums[i];
        nums[i]=nums[i-1];
        nums[i-1]=tmp;
    }
}
