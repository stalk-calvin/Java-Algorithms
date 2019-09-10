package org.calvin.Arrays;

public class FallingDominos {
    public static String pushDominoes(String s) {
        char[] t = s.toCharArray();
        for (int i = 1; i < t.length; i++) {
            if (s.charAt(i-1) == 'R' && s.charAt(i) == '.' && (i+1 >= t.length || s.charAt(i+1)!= 'L')) {
                t[i] = 'R';
            }
            if (s.charAt(i-1) == '.' && s.charAt(i) == 'L' && (i-2 < 0 || s.charAt(i-2) != 'R')) {
                t[i-1] = 'L';
            }
        }
        return new String(t);
    }
}
