/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

public class PrintPossibleCorrectParentheses {
    public void printAllCombinations(int n) {
        char[] curr = new char[n * 2];
        print(n, n, curr, 0);
    }

    private static void print(int opening, int closing, char[] curr, int index) {
        if (opening < 0 || opening > closing) {
            return;
        }
        if (opening == 0 && closing == 0) {
            System.out.println(new String(curr));
            return;
        }
        if (opening > 0) {
            curr[index] = '(';
            print(opening - 1, closing, curr, index + 1);
        }
        if (opening < closing) {
            curr[index] = ')';
            print(opening, closing - 1, curr, index + 1);
        }
    }
}
