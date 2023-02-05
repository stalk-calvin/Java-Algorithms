package org.calvin.HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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