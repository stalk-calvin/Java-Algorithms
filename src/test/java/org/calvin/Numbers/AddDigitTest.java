/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddDigitTest {
    AddDigit fixture;

    @BeforeEach
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
