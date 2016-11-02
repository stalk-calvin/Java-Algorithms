/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidAnagramTest {
    ValidAnagram fixture;

    @Before
    public void setUp() {
        fixture = new ValidAnagram();
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