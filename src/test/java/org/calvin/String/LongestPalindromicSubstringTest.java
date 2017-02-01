package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestPalindromicSubstringTest {
    private LongestPalindromicSubstring fixture;

    @Before
    public void setUp() {
        fixture = new LongestPalindromicSubstring();
    }

    @Test
    public void shouldFindPanlindromeRightAway() {
        String input = "a";
        String actual = fixture.longestPalindrome(input);
        String expected = "a";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLongestPanlindrome() {
        String input = "aaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaa";
        String actual = fixture.longestPalindrome(input);
        String expected = "aaaaaaaaaaaaaaaaaa";
        assertEquals(expected, actual);
    }

}