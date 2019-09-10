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
        return x == 0 ? ' ' : x;
    }

    public char findTheDifferenceBucket(String a, String b) {
        int[] tracker = new int[26];
        for (char x : a.toCharArray()) {
            int pos = x - 'a';
            tracker[pos]++;
        }
        for (char x : b.toCharArray()) {
            int pos = x - 'a';
            tracker[pos]--;
        }
        char ret = ' ';
        for (int i = 0; i < tracker.length; i++) {
            if (tracker[i] != 0) {
                ret = (char) (i + 'a');
            }
        }
        return ret;
    }
}
