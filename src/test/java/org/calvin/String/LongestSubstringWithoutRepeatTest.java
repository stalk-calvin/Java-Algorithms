/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatTest {
    private LongestSubstringWithoutRepeat fixture;

    @Before
    public void setUp() {
        fixture = new LongestSubstringWithoutRepeat();
    }

    @Test
    public void shouldFindLengthOfLongestSubstringMethod() {
        String input = "bbbbb";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(1,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringMethod0() {
        String input = "abcabcbb";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(3,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringMethod1() {
        String input = "bbbbbaacc";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(2,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringMethod2() {
        String input = "au";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(2,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringMethod3() {
        String input = "c";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(1,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringSimplerMethod() {
        String input = "bbbbb";
        int actual = fixture.lengthOfLongestSubstringSimpler(input);
        assertEquals(1,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringSimplerMethod0() {
        String input = "abcabcbb";
        int actual = fixture.lengthOfLongestSubstringSimpler(input);
        assertEquals(3,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringSimplerMethod1() {
        String input = "bbbbbaacc";
        int actual = fixture.lengthOfLongestSubstringSimpler(input);
        assertEquals(2,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringSimplerMethod2() {
        String input = "au";
        int actual = fixture.lengthOfLongestSubstringSimpler(input);
        assertEquals(2,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringSimplerMethod3() {
        String input = "c";
        int actual = fixture.lengthOfLongestSubstringSimpler(input);
        assertEquals(1,actual);
    }
}
