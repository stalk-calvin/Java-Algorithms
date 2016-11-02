/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.BitManipulation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseBitTest {
    ReverseBit fixture;

    @Before
    public void setUp() {
        fixture = new ReverseBit();
    }

    @Test
    public void shouldReverseBits() {
        int actual = fixture.reverseBits(43261596);
        int expected = 964176192;
        assertEquals(expected,actual);
    }
}