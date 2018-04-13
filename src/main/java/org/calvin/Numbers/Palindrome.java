/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int a = 0;
        int tmp = x;
        while (tmp > 0) {
            a = a * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        return (x == a);
    }
}
