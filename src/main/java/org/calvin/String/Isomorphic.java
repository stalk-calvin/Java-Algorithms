/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.HashMap;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        int size = s.length();
        if (size != t.length()) {
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<Character, Character>();
        HashMap<Character, Character> tMap = new HashMap<Character, Character>();
        int i;
        char tChar, sChar;
        for (i = 0; i < size; i++) {
            tChar = t.charAt(i);
            sChar = s.charAt(i);
            if (sMap.containsKey(sChar) && sMap.get(sChar) != tChar) {
                return false;
            }
            if (tMap.containsKey(tChar) && tMap.get(tChar) != sChar) {
                return false;
            }
            sMap.put(sChar, tChar);
            tMap.put(tChar, sChar);
        }

        return true;
    }
}
