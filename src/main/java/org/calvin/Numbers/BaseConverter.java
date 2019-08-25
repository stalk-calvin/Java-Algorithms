package org.calvin.Numbers;

import java.util.ArrayList;
import java.util.List;

public class BaseConverter {
    public static String baseFromDecimalToString(int number, int base) throws Exception {
        char[] digits = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        if (base > digits.length) {
            throw new Exception("Bases greater than 36 not handled");
        } else if (base < 2) {
            throw new Exception("Bases less than 2 not handled");
        }

        int num = Math.abs(number);
        List<String> res = new ArrayList<>();
        while (num > 0) {
            res.add(0, String.valueOf(digits[num % base]));
            num /= base;
        }

        if (number < 0) {
            res.add(0, "-");
        }

        return String.join("", res);
    }

    private static int val(char c) {
        if (c >= '0' && c <= '9')
            return (int)c - '0';
        else
            return (int)c - 'A' + 10;
    }
    public static int toDecimal(String str, int base) {
        int len = str.length();
        int power = 1; // Initialize base
        int num = 0; // Initialize result
        int i;

        // Decimal equivalent is
        // str[len-1]*1 + str[len-1] *
        // base + str[len-1]*(base^2) + ...
        for (i = len - 1; i >= 0; i--)
        {
            // A digit in input number
            // must be less than
            // number's base
            if (val(str.charAt(i)) >= base)
            {
                System.out.println("Invalid Number");
                return -1;
            }

            num += val(str.charAt(i)) * power;
            power = power * base;
        }

        return num;
    }
}
