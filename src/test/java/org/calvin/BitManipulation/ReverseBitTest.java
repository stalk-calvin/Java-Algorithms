/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BitManipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBitTest {
    ReverseBit fixture;

    @BeforeEach
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
