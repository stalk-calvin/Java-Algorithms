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
    public void shouldHaveNoAnagram() {
        assertFalse(fixture.isAnagram("Ray Adverb","Dave Barri"));
    }

}
