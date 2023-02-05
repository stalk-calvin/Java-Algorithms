/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {
    ReverseInteger fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ReverseInteger();
    }

    @Test
    public void shouldReverse() {
        assertEquals(321, fixture.reverse(123));
    }

    @Test
    public void shouldReverseNegative() {
        assertEquals(-321, fixture.reverse(-123));
    }

    @Test
    public void shouldNotReverseOverflow() {
        assertEquals(0, fixture.reverse(1234567899));
    }
}
