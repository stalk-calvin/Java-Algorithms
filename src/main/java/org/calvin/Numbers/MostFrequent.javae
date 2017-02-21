/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public int findFrequentInteger(int[] input) {
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i : input) {
            if (tracker.containsKey(i)) {
                tracker.put(i, tracker.get(i) + 1);
            } else {
                tracker.put(i, 1);
            }
        }
        //options: sort list by values and get max
        int result = 0;
        int maxOccurence = 0;
        for (Map.Entry<Integer,Integer> me : tracker.entrySet()) {
            if (me.getValue() > maxOccurence) {
                result = me.getKey();
                maxOccurence = me.getValue();
            }
        }
        return result;
    }
}
