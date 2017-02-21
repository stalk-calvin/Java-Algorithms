/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class UglyNumber {
    public boolean isUgly(int num) {
        if (num < 1) {
            return false; //ugly
        }
        if (num == 1) {
            return true;
        }
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                break;
            }
        }
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
}
