/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class ReverseInteger {
    public int reverse(int x) {
        boolean neg = false;
        if (x < 0) {
            neg = true;
            x = x * -1;
        }
        int result = 0;
        while (x > 0) {
            int y = x % 10;
            int newResult = result * 10 + y;
            if ((newResult - y) / 10 != result) {
                return 0;
            }
            result = newResult;
            x /= 10;
        }
        if (neg) {
            result *= -1;
        }
        return result;
    }
}
