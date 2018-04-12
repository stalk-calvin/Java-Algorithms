package org.calvin.String;

import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

public class StringIntegerConversion {
    public int StringToInt(String s) {
        boolean isNegative = s.charAt(0) == '-';
        int result = 0;
        int start = isNegative ? 1 : 0;
        for (int i = start; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
        }
        return isNegative ? -result : result;
    }

    public String IntegerToString(int x) {
        boolean isNegative = x < 0;
        if (isNegative) x = -x; // make positive

        StringBuilder s = new StringBuilder();
        while (x > 0) {
            s.insert(0, x%10);
            x /= 10;
        }
        if (s.toString().isEmpty()) {
            return "0";
        }

        if (isNegative) {
            s.insert(0,'-');
        }
        return s.toString();
    }
}
