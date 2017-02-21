/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        if (s == null || s.length() < 1) {
            return -1;
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(s.length() - 1 - i);
            int value = ((int) current) - 64; // convert to position of alphabet
            int offset = value * (int) Math.pow(26, i);
            result += offset;
        }
        return result;
    }
}
