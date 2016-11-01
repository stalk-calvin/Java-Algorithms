/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return sorted(s).equals(sorted(t));
    }

    private String sorted(String in) {
        char[] inChars = in.toLowerCase().toCharArray();
        Arrays.sort(inChars);
        return new String(inChars);
    }
}
