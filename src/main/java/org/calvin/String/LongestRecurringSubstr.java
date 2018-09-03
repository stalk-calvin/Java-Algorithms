package org.calvin.String;

import java.util.*;

public class LongestRecurringSubstr {
    public String findLongestRecurringSubstr(String in) {
        String input = in.toLowerCase();
        List<Character> match = new ArrayList<>();
        List<Character> longest_match = new ArrayList<>();
        char[] l = input.toCharArray();
        Queue<Character> s = new LinkedList<>();
        for (int i = 1; i < l.length; i++) {
            s.add(l[i]);
        }
        while (!s.isEmpty()) {
            int c=0;
            for (char x : s) {
                if (l[c]==x) {
                    match.add(x);
                }
                else {
                    if (longest_match.size() < match.size()) {
                        longest_match = match;
                    }
                    match = new ArrayList<>();
                }
                c++;
            }
            s.poll();
        }
        StringBuilder sb = new StringBuilder();
        for (Character c: longest_match) {
            sb.append(c);
        }
        return sb.toString();
    }
}
