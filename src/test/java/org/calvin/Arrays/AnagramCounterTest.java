/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramCounterTest {
    AnagramCounter fixture;

    @Before
    public void setUp() {
        fixture = new AnagramCounter();
    }

    @Test
    public void shouldReturnNumberOfChangesNeeded() {
        int expected = 1;
        int actual = fixture.numberNeeded("string", "rings");
        assertEquals(expected, actual);
    }
}
