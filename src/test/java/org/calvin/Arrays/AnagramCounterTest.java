/*
 * Copyright Calvin Lee - 2016.
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
    public void numberNeeded() {
        int expected = 4;
        int actual = fixture.numberNeeded("cde", "abc");
        assertEquals(expected, actual);
    }

}