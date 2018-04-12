/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramValidityTest {
    AnagramValidity fixture;

    @Before
    public void setUp() {
        fixture = new AnagramValidity();
    }

    @Test
    public void shouldHaveAnagram() {
        assertTrue(fixture.isAnagram("Ray Adverb","Dave Barry"));
    }

    @Test
    public void shouldHaveAnagramNoSort() {
        assertTrue(fixture.isAnagramWithoutSort("Ray Adverb","Dave Barry"));
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
    public void shouldNotHaveAnagramNoSort() {
        assertFalse(fixture.isAnagramWithoutSort("Ray Adverb","Dave Barri"));
    }

    @Test
    public void shouldNotHaveAnagramOnlyEnglish() {
        assertFalse(fixture.isAnagramOnlyEnglish("RayAdverb","DaveBarri"));
    }
}
