/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShortestPalindromeTest {
    ShortestPalindrome fixture;

    @Before
    public void setUp() {
        fixture = new ShortestPalindrome();
    }


    @Test public void shouldFindShortestPalindromeForPalindromicString() throws Exception {
        String input = "abba";
        String expected = "abba";
        assertEquals(expected, fixture.shortestPalindrome(input));
    }

    @Test public void shouldFindShortestPalindromeForPartiallyPalindromicString() throws Exception {
        String input = "aacecaaa";
        String expected = "aaacecaaa";
        assertEquals(expected, fixture.shortestPalindrome(input));
    }

    @Test public void shouldFindShortestPalindromeForAString() throws Exception {
        String input = "abca";
        String expected = "acbabca";
        assertEquals(expected, fixture.shortestPalindrome(input));
    }
}
