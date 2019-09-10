package org.calvin.String;

public class StringCalculator {
    public static int Add(String numbers) {
        if ("".equals(numbers)) return 0;
        String[] nums = numbers.split("[\n,]");
        int sum = 0;
        for (String num : nums) {
            if ("".equals(num)) return 0;
            int tmp = Integer.parseInt(num);
            sum += tmp;
        }
        return sum;
    }
}
