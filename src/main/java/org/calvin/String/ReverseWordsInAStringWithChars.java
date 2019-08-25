/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.calvin.Utils.AssortedMethods;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAStringWithChars {
    public String reverseWords(String s) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != ' ') {   // when i is a non-space
                int j = i;
                while (j + 1 < ca.length && ca[j + 1] != ' ') { j++; } // move j to the end of the word
                AssortedMethods.reverse(ca, i, j);
                i = j;
            }
        }
        return new String(ca);
    }

    public String reverseWords2(String s) {
        String[] strs = s.split(" ");
        List<String> tmp = new ArrayList<>();
        for (String str : strs) {
            StringBuilder reversed = new StringBuilder(str).reverse();
            tmp.add(reversed.toString());
        }
        return String.join(" ", tmp.toArray(new CharSequence[0]));
    }
}
