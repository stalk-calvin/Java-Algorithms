/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class RomanToInt {
    public int romanToInt(String s) {

        // pre means previous Roman character, cur means current character
        int pre = 0, cur = 0, result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    cur = 1000;
                    break;
                case 'D':
                    cur = 500;
                    break;
                case 'C':
                    cur = 100;
                    break;
                case 'L':
                    cur = 50;
                    break;
                case 'X':
                    cur = 10;
                    break;
                case 'V':
                    cur = 5;
                    break;
                case 'I':
                    cur = 1;
                    break;
            }

            if (cur > pre) {
                result = result - pre - pre + cur;
            } else
                result += cur;
            pre = cur;
        }
        return result;
    }
}
