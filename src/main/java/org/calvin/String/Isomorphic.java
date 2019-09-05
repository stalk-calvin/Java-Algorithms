/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        int size = s.length();
        if (size != t.length()) {
            return false;
        }
        Map<Character, Character> sMap = new HashMap<Character, Character>();
        Map<Character, Character> tMap = new HashMap<Character, Character>();
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

    public List<List<String>> groupIsomorphicStrings(List<String> strings) {
        List<List<String>> result = new ArrayList<>();
        if (strings == null || strings.isEmpty())
            return result;

        Map<String, List<String>> hashToList = new HashMap<>();

        for (String s : strings) {
            String hash = getUniqCounter(s);

            if(!hashToList.containsKey(hash))
                hashToList.put(hash, new ArrayList<>());

            hashToList.get(hash).add(s);
        }
        return new ArrayList<>(hashToList.values());
    }


    private String getUniqCounter(String s) {
        if (s.isEmpty())
            return "";

        int uniqCounter = 1;
        StringBuilder hash = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c))
                hash.append(map.get(c));
            else {
                map.put(c, uniqCounter++);
                hash.append(map.get(c));
            }
        }
        return hash.toString();
    }
}
