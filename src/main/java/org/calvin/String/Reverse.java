/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

public class Reverse {
    public String reverseString1(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start <= end) {
            char tmp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = tmp;
            start++;
            end--;
        }
        return new String(charArray);
    }

    public String reverseString2(String in) {
        if (in == null || in.length() < 2) return in;
        StringBuilder result = new StringBuilder(in);
        return result.reverse().toString();
    }

    public String reverseString3(String in) {
        if (in == null || in.length() < 2) return in;
        StringBuilder result = new StringBuilder();
        for (int i = in.length() - 1; i >= 0; i--) {
            result.append(in.charAt(i));
        }
        return result.toString();
    }

    public String reverseStringXOR(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            charArray[start] ^= charArray[end];
            charArray[end] ^= charArray[start];
            charArray[start] ^= charArray[end];
            ++start;
            --end;
        }
        return new String(charArray);
    }
}
