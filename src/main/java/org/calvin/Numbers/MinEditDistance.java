package org.calvin.Numbers;

public class MinEditDistance {
    public static int minDistance(String s1, String s2, int i, int j) {
        if (j == s2.length()) {
            return s1.length() - i;
        }
        if (i == s1.length()) {
            return s2.length() - j;
        }
        if (s1.charAt(i) == s2.charAt(j))
            return minDistance(s1, s2, i + 1, j + 1);
        int rep = minDistance(s1, s2, i + 1, j + 1) + 1;
        int del = minDistance(s1, s2, i, j + 1) + 1;
        int ins = minDistance(s1, s2, i + 1, j) + 1;
        return Math.min(del, Math.min(ins, rep));
    }
}
