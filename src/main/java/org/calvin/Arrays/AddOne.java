package org.calvin.Arrays;

public class AddOne {
    public static int addOneNoArithmetic(int[] nums) {
        int len = nums.length - 1;

        int endResult = 0;
        int carry = 0;
        int i = 0;
        while (len >= 0) {
            int result = 0;
            int lastDigit = nums[nums.length - 1 - i];
            if (i == 0) {
                lastDigit += 1;
            }

            result += lastDigit % 10;

            if (carry > 0) {
                result += carry;
            }

            result *= Math.pow(10, i);

            endResult += result;
            carry = lastDigit / 10;
            len--;
            i++;
        }

        return endResult;
    }


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
