package org.calvin.String;

import java.util.ArrayList;
import java.util.List;

import static org.calvin.String.pojo.PhoneNumber.numberWithLetters;

public class PhoneCombination {
    private List<String> output = new ArrayList<String>();

    private void backtrack(String combination, String next_digits) {
        if (next_digits.length() == 0) {
            output.add(combination);
        } else {
            String digit = next_digits.substring(0, 1);
            String letters = numberWithLetters.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = numberWithLetters.get(digit).substring(i, i + 1);
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0) {
            backtrack("", digits);
        }
        return output;
    }
}
