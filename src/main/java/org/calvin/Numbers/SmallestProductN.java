/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.Stack;

public class SmallestProductN {
    public Stack<Integer> findSmallestProductOfN(int n) {
        Stack<Integer> tracker = new Stack<>();
        for (int i = 9; i > 1; i--)
            while (n % i == 0) {
                n /= i;
                tracker.add(i);
            }
        if (n != 1) {
            throw new RuntimeException("No such number");
        }
        else {
            return tracker;
        }
    }
}
