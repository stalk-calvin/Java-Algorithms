package org.calvin.Arrays;

public class AddOne {
    public static int[] addOne(int[] nums) {
        int num = convertToDigit(nums);
        num++;
        return convertToIntArray(num);
    }
    private static int[] convertToIntArray(int num) {
        int len = String.valueOf(num).length();
        int[] r =  new int[len];
        int i = 1;
        while (num > 0) {
            int n = num % 10;
            r[len-i] = n;
            i++;
            num /= 10;
        }
        return r;
    }

    private static int convertToDigit(int[] nums) {
        int result = 0;
        int l = nums.length;
        for (int i : nums) {
            result += i * Math.pow(10, l-1);
            l--;
        }
        return result;
    }
}
