package org.calvin.String;

import java.util.HashSet;
import java.util.Set;

public class BuddyString {
    static boolean isBuddyString(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] pair = null;
        boolean swapped = false;
        Set<Character> tracker = new HashSet<>();
        for (int i = 0; i < b.length(); i++) {
            char ac = a.charAt(i);
            char bc = b.charAt(i);
            if (ac == bc) {
                tracker.add(ac);
            } else if (pair == null) {
                pair = new char[2];
                pair[0] = ac;
                pair[1] = bc;
            } else if (swapped) {
                return false;
            } else {
                char ca = pair[0];
                char cb = pair[1];
                if (ca == bc && ac == cb) {
                    swapped = true;
                } else {
                    return false;
                }
            }
        }
        return swapped || tracker.size() < a.length();
    }

}
