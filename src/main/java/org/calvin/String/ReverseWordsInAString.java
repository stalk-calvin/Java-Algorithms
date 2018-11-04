/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder out = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i > 0; i--) {
            out.append(words[i]).append(" ");
        }
        return out + words[0];
    }
}
