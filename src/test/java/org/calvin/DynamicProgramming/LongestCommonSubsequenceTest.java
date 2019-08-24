package org.calvin.DynamicProgramming;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {
    private LongestCommonSubsequence fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new LongestCommonSubsequence();
    }

    @Test
    public void shouldFindLCSDP() throws Exception {
        String str1 = "XMJYAUZ";
        String str2 = "MZJAWXU";
        int result = fixture.lcsDP(str1.toCharArray(), str2.toCharArray());
        // MJAU
        assertEquals(4, result);
    }

}