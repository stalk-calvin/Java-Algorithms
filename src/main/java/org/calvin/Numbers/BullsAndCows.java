/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class BullsAndCows {
    public String solve(String a, String b) {
        if (a.length() != b.length()) {
            return "0A0B";
        }
        int[] tracker = new int[10];
        int bulls = 0, cows = 0;
        for (int i=0; i<a.length(); i++) {
            char x = a.charAt(i); int j = Character.getNumericValue(x);
            char y = b.charAt(i); int k = Character.getNumericValue(y);
            if (x==y) {
                bulls++;
            } else {
                if (tracker[j] < 0) cows++;
                if (tracker[k] > 0) cows++;
                tracker[j]++;
                tracker[k]--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}
