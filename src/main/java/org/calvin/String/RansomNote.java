/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.*;

public class RansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    boolean solution;

    public RansomNote(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        this.solution = true;

        //First set up the magazine map
        String[] words = magazine.split(" ");
        for(String w : words) {
            if (magazineMap.get(w) != null) {
                magazineMap.put(w, magazineMap.get(w) + 1);
            } else {
                magazineMap.put(w, 1);
            }
        }

        // use the constructed map
        words = note.split(" ");
        for(String s : words) {
            if (magazineMap.get(s) != null && magazineMap.get(s) < 1) {
                this.solution = false;
            } else if (magazineMap.get(s) != null) {
                magazineMap.put(s, magazineMap.get(s) - 1);
            } else {
                this.solution = false;
            }
        }
    }

    public boolean solve() {
        return this.solution;
    }
}
