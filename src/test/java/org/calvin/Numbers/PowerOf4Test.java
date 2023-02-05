/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PowerOf4Test {
    PowerOf4 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new PowerOf4();
    }

    @Test
    public void shouldPowerOfTwo() {
        assertTrue(fixture.isPowerOfFour(64));
    }

    @Test
    public void shouldNotPowerOfTwo() {
        assertFalse(fixture.isPowerOfFour(17));
    }
}
