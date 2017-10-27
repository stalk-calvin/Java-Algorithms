/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

public class NumberOfSegments {
    public int findNumberOfSegments(String in) {
        in = in.trim();
        int result = 1;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == ' ') result++;
        }
        return result;
    }
}
