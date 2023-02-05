/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramValidityTest {
    AnagramValidity fixture;

    @BeforeEach
    public void setUp() {
        fixture = new AnagramValidity();
    }

    @Test
    public void shouldHaveAnagram() {
        assertTrue(fixture.isAnagram("Ray Adverb","Dave Barry"));
    }

    @Test
    public void shouldHaveAnagramOnlyEnglish() {
        assertTrue(fixture.isAnagramOnlyEnglish("RayAdverb","DaveBarry"));
    }

    @Test
    public void shouldHaveNoAnagram() {
        assertFalse(fixture.isAnagram("Ray Adverb","Dave Barri"));
    }

    @Test
    public void shouldNotHaveAnagramOnlyEnglish() {
        assertFalse(fixture.isAnagramOnlyEnglish("RayAdverb","DaveBarri"));
    }
}
