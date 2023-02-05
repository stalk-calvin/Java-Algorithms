/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPalindromeTest {
    ShortestPalindrome fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ShortestPalindrome();
    }

    @Test public void shouldFindShortestPalindromeForPalindromicString() {
        String input = "abba";
        String expected = "abba";
        assertEquals(expected, fixture.shortestPalindrome(input));
    }

    @Test public void shouldFindShortestPalindromeForPartiallyPalindromicString() {
        String input = "aacecaaa";
        String expected = "aaacecaaa";
        assertEquals(expected, fixture.shortestPalindrome(input));
    }

    @Test public void shouldFindShortestPalindromeForAString() {
        String input = "abca";
        String expected = "acbabca";
        assertEquals(expected, fixture.shortestPalindrome(input));
    }
}
