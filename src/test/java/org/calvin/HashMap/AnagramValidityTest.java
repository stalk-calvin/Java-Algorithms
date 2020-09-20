package org.calvin.HashMap;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramValidityTest {
    @Test
    public void shouldHaveAnagramNoSort() {
        assertTrue(AnagramValidity.isAnagramWithoutSort("Ray Adverb","Dave Barry"));
    }

    @Test
    public void shouldNotHaveAnagramNoSort() {
        assertFalse(AnagramValidity.isAnagramWithoutSort("Ray Adverb","Dave Barri"));
    }
}