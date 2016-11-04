/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class AddDigit {
    public int addDigits(int num) {
        if (num < 0) return -1;
        if (num == 0) return 0;
        int sum = 0;
        int limit = 20;
        while (num > 0) {
            int x = num % 10;
            sum += x;
            num /= 10;
            if (num < 1) {
                num = sum;
                if (sum < 10) {
                    return sum;
                }
                sum = 0;
            }
            if (limit < 0) {
                return -1;
            }
            limit--;
        }
        return -1;
    }
}
