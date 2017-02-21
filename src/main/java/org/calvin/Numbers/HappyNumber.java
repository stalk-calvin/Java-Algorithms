/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n < 0) return false;
        if (n < 2) return true;
        int limit = 0;
        while (n != 1) {
            int happy = 0;
            while (n != 0) {
                int d = n % 10;
                happy += Math.pow(d, 2);
                n /= 10;
            }
            n = happy;
            limit++;
            if (limit > 10) {
                return false;
            }
        }
        return true;
    }
}
