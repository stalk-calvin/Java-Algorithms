/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {
    private LongestPalindromicSubstring fixture;

    @BeforeEach
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
