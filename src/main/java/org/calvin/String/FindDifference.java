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
}
