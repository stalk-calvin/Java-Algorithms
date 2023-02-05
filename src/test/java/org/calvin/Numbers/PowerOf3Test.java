/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PowerOf3Test {
    PowerOf3 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new PowerOf3();
    }

    @Test
    public void shouldPowerOfTwo() {
        assertTrue(fixture.isPowerOfThree(9));
    }

    @Test
    public void shouldNotPowerOfTwo() {
        assertFalse(fixture.isPowerOfThree(7));
    }
}
