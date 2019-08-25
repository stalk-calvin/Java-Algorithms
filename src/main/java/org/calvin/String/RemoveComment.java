/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

public class RemoveComment {
    private static final char ASTERISK = '*';
    private static final char SLASH = '/';
    private static final char ANY_CHAR = 'c';

    // O(N) where N is number of characters
    // O(N*c) where N is number of strings in the array.
    public String remove(String... input) {
        StringBuilder result = new StringBuilder();
        boolean openComment = false;
        for (String anInput : input) {
            char previous = ANY_CHAR;
            int openIndex = -1;

            for (int i = 0; i < anInput.length(); i++) {
                char c = anInput.charAt(i);
                if (c == SLASH && previous == SLASH) {
                    return result.deleteCharAt(result.length() - 1).toString();
                } else if (openComment) {
                    if (c == SLASH && previous == ASTERISK && openIndex < (i - 2)) {
                        openComment = false;
                    }
                } else {
                    if (c == ASTERISK && previous == SLASH) {
                        openIndex = i - 1;
                        openComment = true;
                        result.deleteCharAt(result.length() - 1);
                    } else {
                        result.append(c);
                    }
                }
                previous = c;
            }
        }
        return result.toString();
    }
}
