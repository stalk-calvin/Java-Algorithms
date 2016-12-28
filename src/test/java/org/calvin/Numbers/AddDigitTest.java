/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddDigitTest {
    AddDigit fixture;

    @Before
    public void setUp() {
        fixture = new AddDigit();
    }

    @Test
    public void shouldAddDigits() {
        assertEquals(2, fixture.addDigits(38));
    }

    @Test
    public void shouldNotAddNegative() {
        assertEquals(-1, fixture.addDigits(-1));
    }
}