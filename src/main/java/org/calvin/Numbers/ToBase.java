/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class ToBase {
    public static String convertRecursive(int n, int b) {
        int quotient = n / b;
        int remainder = n % b;
        if (quotient == 0) {
            return Integer.toString(remainder);
        } else {
            return convertRecursive(quotient, b) + Integer.toString(remainder);
        }
    }

    public static String convertIterative(int n, int b) {
        return Integer.toString(n/b) + Integer.toString(n%b);
    }
}
