/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class AnagramCounter {
    public int numberNeeded(String first, String second) {
        int count = 0;
        int[] freq = new int[26];
        for (char c : first.toCharArray()) freq[c - 'a']++;
        for (char c : second.toCharArray()) freq[c - 'a']--;
        for (int i : freq) count += Math.abs(i);
        return count;
    }
}

