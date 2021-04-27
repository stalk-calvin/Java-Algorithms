package org.calvin.String;

import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.List;

public class FindStartingPoint {
    public static List<Integer> findStartingPosition(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (Strings.isNullOrEmpty(p)) {
            return result;
        }
        int lengthOfPattern = p.length();
        for (int i = 0; i <= s.length()-lengthOfPattern; i++) {
            if (p.equals(s.substring(i, i+lengthOfPattern))) {
                result.add(i);
            }
        }
        return result;
    }
}
