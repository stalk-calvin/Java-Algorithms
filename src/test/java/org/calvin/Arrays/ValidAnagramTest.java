/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidAnagramTest {
    ValidAnagram fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new ValidAnagram();
    }

    @Test
    public void testAnagram() throws Exception {
        assertTrue(fixture.isAnagram("Ray Adverb","Dave Barry"));
    }

}