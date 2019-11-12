package org.calvin.String.order;

import org.calvin.String.PalindromicSubstrings;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromicSubstringsTest {
    @Test
    public void shouldCountSubStrings() {
        assertEquals(6, PalindromicSubstrings.countSubstrings("aaa"));
    }
}