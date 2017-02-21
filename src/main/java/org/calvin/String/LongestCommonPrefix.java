/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String compare = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(compare) != 0) {
                compare = compare.substring(0, compare.length() - 1);
            }
        }
        return compare;
    }
}
