/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.*;

public class RansomNote {
    private boolean solution;

    public RansomNote(String magazine, String note) {
        Map<String, Integer> magazineMap = new HashMap<String, Integer>();
        this.solution = true;

        //First set up the magazine map
        String[] words = magazine.split(" ");
        for(String w : words) {
            magazineMap.merge(w, 1, (a, b) -> a + b);
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
