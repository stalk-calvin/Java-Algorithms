package org.calvin.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubsequenceTest {

    @Test
    public void longestPalindromeSubseq() {
        assertEquals(5, LongestPalindromicSubsequence.longestPalindromeSubseq("agbdba"));
        assertEquals(5, LongestPalindromicSubsequence.longestPalindromeSubseq("aebcbda"));
        assertEquals(5, LongestPalindromicSubsequence.longestPalindromeSubseq("ababa"));
        assertEquals(5, LongestPalindromicSubsequence.longestPalindromeSubseq("xecexzb"));
    }
}