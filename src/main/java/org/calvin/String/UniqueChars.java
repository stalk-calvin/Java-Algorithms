/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.calvin.Utils.AssortedMethods.validateInput;

import java.util.HashSet;
import java.util.Set;

public class UniqueChars {

    /**
     * O(N) solution using the set. N is the number of characters. This approach is same as findDuplicate pretty much.
     */
    public boolean hasUniqueChars(String input) {
        validateInput(input);

        Set<Integer> tracker = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (tracker.contains((int) c)) {
                return false;
            } else {
                tracker.add((int) c);
            }
        }
        return true;
    }

    /**
     * Assumption: ASCII characters in input
     * O(1) space as we have above assumption
     **/
    public boolean hasASCIIUniqueChars(String input) {
        validateInput(input);

        int[] chars = new int[256];
        for (char c : input.toCharArray()) {
            if (c > 256) return false;
            if (chars[c] >= 1) {
                return false;
            } else {
                chars[c]++;
            }
        }
        return true;
    }
}
