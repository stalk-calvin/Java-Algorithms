package org.calvin.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestPalindromicSubsequenceTest {

    @Test
    public void longestPalindromeSubseq() {
        assertEquals(5, LongestPalindromicSubsequence.longestPalindromeSubseq("agbdba"));
        assertEquals(5, LongestPalindromicSubsequence.longestPalindromeSubseq("aebcbda"));
        assertEquals(5, LongestPalindromicSubsequence.longestPalindromeSubseq("ababa"));
        assertEquals(5, LongestPalindromicSubsequence.longestPalindromeSubseq("xecexzb"));
    }
}