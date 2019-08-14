/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class BullsAndCows {
    public String solve(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            if (s == g) bulls++;
            else {
                if (numbers[s] < 0) cows++;
                if (numbers[g] > 0) cows++;
                numbers[s]++;
                numbers[g]--;
            }
        }
        return bulls + "A" + cows + "B";
    }

    public String solveMyWay(String a, String b) {
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
