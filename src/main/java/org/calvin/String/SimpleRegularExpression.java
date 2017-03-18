/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

public class SimpleRegularExpression {
    /**
     * O(n^2) time complexity
     * O(1) space
     **/
    public boolean evaluate(String inputString, String matchString) {
        if (inputString == null || matchString == null) {
            throw new IllegalArgumentException("You can't pass a null strings as input");
        }
        int inputLen = inputString.length();
        int matchLen = matchString.length();

        // Match empty
        if (matchLen == 0) return inputLen == 0;

        // Otherwise
        if (matchLen == 1 || matchString.charAt(1) != '*') {
            return !(inputLen < 1 || (matchString.charAt(0) != '.' && inputString.charAt(0) != matchString.charAt(0))) &&
                    evaluate(inputString.substring(1), matchString.substring(1));
        } else {
            int i = -1;
            while (i < inputLen && (i < 0 || matchString.charAt(0) == '.' || matchString.charAt(0) == inputString.charAt(i))) {
                if (evaluate(inputString.substring(i + 1), matchString.substring(2))) return true;
                i++;
            }
            return false;
        }
    }
}