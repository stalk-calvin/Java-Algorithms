package org.calvin.Arrays;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return sorted(s).equals(sorted(t));
    }

    public String sorted(String in) {
        char[] inChars = in.toCharArray();
        Arrays.sort(inChars);
        return new String(inChars);
    }
}
