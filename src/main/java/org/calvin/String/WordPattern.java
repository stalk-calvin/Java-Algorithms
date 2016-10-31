package org.calvin.String;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");

        int patSize = pattern.length();
        int strSize = strings.length;

        if (patSize != strSize) {
            return false;
        }

        Map<Character, String> strMap = new HashMap<>();
        char[] patternArray = pattern.toCharArray();

        //create map
        for (int i = 0; i < patternArray.length; i++) {
            if (strMap.get(patternArray[i]) == null && !strMap.containsValue(strings[i])) {
                strMap.put(patternArray[i], strings[i]);
            }
        }
        for (int i = 0; i < patternArray.length; i++) {
            if (strMap.get(patternArray[i]) == null) {
                return false;
            } else if (!strMap.get(patternArray[i]).equals(strings[i])) {
                return false;
            }
        }
        return true;
    }
}
