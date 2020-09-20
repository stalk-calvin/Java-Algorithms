/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class AnagramValidity {
    public boolean isAnagram(String s, String t) {
        return sorted(s).equals(sorted(t));
    }
    private String sorted(String in) {
        char[] inChars = in.toLowerCase().toCharArray();
        Arrays.sort(inChars);
        log.info("Sorted Chars: "+Arrays.toString(inChars));
        return new String(inChars);
    }

    public boolean isAnagramOnlyEnglish(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        int[] tracker = new int[26];
        for (char c : s.toCharArray()) {
            tracker[c - 'a']++;
        }
        for (char c: t.toCharArray()) {
            tracker[c - 'a']--;
        }
        for (int i : tracker) {
            if (i != 0) return false;
        }
        return true;
    }
}
