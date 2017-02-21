/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.HashMap;
import java.util.Map;

public class ClosestToZero {
    public int closestToZero(int[] input) {
        Map<Integer, Integer> tracker = new HashMap<>();
        int min = Integer.MAX_VALUE;
        if (input == null || input.length < 1) {
            return min;
        }
        for (int anInput : input) {
            int inputAbsValue = Math.abs(anInput);
            if (inputAbsValue <= min) {
                min = inputAbsValue; // min is always positive
                if (tracker.containsKey(min) && inputAbsValue > tracker.get(min)) {
                    tracker.put(min, anInput);
                } else if (!tracker.containsKey(min)) {
                    tracker.put(min, anInput);
                }
            }
        }
        return tracker.get(min);
    }
}
