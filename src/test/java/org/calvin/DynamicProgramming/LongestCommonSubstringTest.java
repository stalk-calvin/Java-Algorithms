package org.calvin.DynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubstringTest {
    @Test
    public void LCSubStr() {
        String X = "calvinrocks";
        String Y = "kelvinrocks";

        int m = X.length();
        int n = Y.length();

        // lvinrocks
        assertEquals(9, LongestCommonSubstring.LCSubStr(X.toCharArray(), Y.toCharArray(), m, n));
    }
}