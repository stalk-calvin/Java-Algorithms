/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int a = 0;
        int y = x;
        while (y > 0) {
            a = a * 10 + y % 10;
            y = y / 10;
        }
        return (x == a);
    }
}
