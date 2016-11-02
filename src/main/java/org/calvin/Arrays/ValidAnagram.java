/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return sorted(s).equals(sorted(t));
    }

    private String sorted(String in) {
        char[] inChars = in.toLowerCase().toCharArray();
        Arrays.sort(inChars);
        log.info("Sorted Chars: "+Arrays.toString(inChars));
        return new String(inChars);
    }
}
