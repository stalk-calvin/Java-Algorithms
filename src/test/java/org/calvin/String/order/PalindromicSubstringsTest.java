package org.calvin.String.order;

import org.calvin.String.PalindromicSubstrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromicSubstringsTest {
    @Test
    public void shouldCountSubStrings() {
        assertEquals(6, PalindromicSubstrings.countSubstrings("aaa"));
    }
}