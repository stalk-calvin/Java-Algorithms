/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.ArrayList;
import java.util.List;

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

    public List<String> gatherAllParenthesis(int n) {
        List<String> result = new ArrayList<>();
        gatherAllParenthesis(n, n, "", result);
        return result;
    }

    public void gatherAllParenthesis(int opening, int closing, String curr, List<String> result) {
        if (closing == 0) {
            result.add(curr);
        }
        if (opening > 0) {
            gatherAllParenthesis(opening - 1, closing, curr + "(", result);
        }
        if (closing > opening) {
            gatherAllParenthesis(opening, closing - 1, curr + ")", result);
        }
    }

}
