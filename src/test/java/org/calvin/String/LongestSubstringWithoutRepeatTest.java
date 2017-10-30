/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithoutRepeatTest {
    private LongestSubstringWithoutRepeat fixture;

    @Before
    public void setUp() {
        fixture = new LongestSubstringWithoutRepeat();
    }

    @Test
    public void shouldFindLengthOfLongestSubstringFirstMethod() {
        String input = "bbbbb";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(1,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringFirstMethod0() {
        String input = "abcabcbb";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(3,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringFirstMethod1() {
        String input = "bbbbbaacc";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(2,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringFirstMethod2() {
        String input = "au";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(2,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringFirstMethod3() {
        String input = "c";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(1,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringSecondMethod() {
        String input = "bbbbb";
        int actual = fixture.lengthOfLongestSubstring2(input);
        assertEquals(1,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringSecondMethod0() {
        String input = "abcabcbb";
        int actual = fixture.lengthOfLongestSubstring2(input);
        assertEquals(3,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringSecondMethod1() {
        String input = "bbbbbaacc";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(2,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringSecondMethod2() {
        String input = "au";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(2,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstringSecondMethod3() {
        String input = "c";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(1,actual);
    }

}
