package org.calvin.DynamicProgramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonSubsequenceTest {
    private LongestCommonSubsequence fixture;

    @BeforeEach
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