/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

public class FindDifference {
    public char findTheDifference(String s, String t) {
        s = s.trim();
        t = t.trim();
        char[] result = t.toCharArray();
        for (char c : s.toCharArray()) {
            result[t.indexOf(c)] = ' ';
            t = new String(result);
        }
        for (char x: result) {
            if (x == ' ') continue;
            return x;
        }
        return ' ';
    }

    public char findTheDifferenceXOR(String a, String b) {
        char x=0;
        for (char c : (a + b).toCharArray()) {
            x^=c;
        }
        return x;
    }
}
