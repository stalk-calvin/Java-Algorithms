/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerOf2Test {
    PowerOf2 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new PowerOf2();
    }

    @Test
    public void shouldPowerOfTwo() {
        assertTrue(fixture.isPowerOfTwo(8));
    }

    @Test
    public void shouldNotPowerOfTwo() {
        assertFalse(fixture.isPowerOfTwo(7));
    }

}
