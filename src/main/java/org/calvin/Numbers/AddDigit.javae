/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class AddDigit {
    public int addDigits(int num) {
        int r = 0;
        while(num > 0) {
            r += num % 10;
            num /= 10;
            if (num == 0) {
                if (r > 9) {
                    num = r;
                    r = 0;
                } else {
                    return r;
                }
            }
        }
        return num;
    }
}
