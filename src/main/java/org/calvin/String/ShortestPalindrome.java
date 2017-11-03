/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
        }
        if (j == s.length()) {
            // we have a palindromic string
            return s;
        }

        String suffix = s.substring(j); // get the rest from j that is palindromic
        return new StringBuilder(suffix).reverse().toString()
                + shortestPalindrome(s.substring(0, j)) + suffix;
    }
}
