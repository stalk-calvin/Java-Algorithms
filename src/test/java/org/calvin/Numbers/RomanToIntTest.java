/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntTest {
    RomanToInt fixture;

    @Before
    public void setUp() {
        fixture = new RomanToInt();
    }

    @Test
    public void shouldGiveSimpleRomanToInt() {
        assertEquals(14, fixture.romanToInt("XIV"));
    }

    @Test
    public void shouldGiveComplexRomanToInt() {
        assertEquals(2484, fixture.romanToInt("MDCMLXXXIV"));
    }
}
