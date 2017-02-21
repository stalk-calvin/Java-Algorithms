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
    public void shouldFindLengthOfLongestSubstringForRepeating() {
        String input = "bbbbb";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(1,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstring1() {
        String input = "bbbbbaacc";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(2,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstring2() {
        String input = "au";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(2,actual);
    }

    @Test
    public void shouldFindLengthOfLongestSubstring3() {
        String input = "c";
        int actual = fixture.lengthOfLongestSubstring(input);
        assertEquals(1,actual);
    }

}
