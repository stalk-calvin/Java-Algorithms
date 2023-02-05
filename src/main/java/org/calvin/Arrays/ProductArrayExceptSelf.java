package org.calvin.Arrays;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] t1 = new int[nums.length];
        int[] t2 = new int[nums.length];

        t1[0]=1;
        t2[nums.length-1]=1;

        //scan from left to right
        for(int i=0; i<nums.length-1; i++){
            t1[i+1] = nums[i] * t1[i];
        }

        //scan from right to left
        for(int i=nums.length-1; i>0; i--){
            t2[i-1] = t2[i] * nums[i];
        }

        //multiply
        for(int i=0; i<nums.length; i++){
            result[i] = t1[i] * t2[i];
        }

        return result;
    }

    public int[] productExceptSelfOneArr(int[] nums) {

        int length = nums.length;
        int[] ans = new int[length];

        ans[0] = 1;
        //Product to the left
        for(int i = 1; i< length; i++)
        {
            ans[i] = ans[i-1] * nums[i-1];
        }

        int right = 1;
        //Multiply it by Product to the right
        for(int j=length-1; j >=0; j-- )
        {
            ans[j] *= right;
            right *= nums[j];

        }

        return ans;
    }
}