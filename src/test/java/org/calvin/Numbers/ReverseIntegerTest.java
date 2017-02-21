/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {
    ReverseInteger fixture;

    @Before
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
