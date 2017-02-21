/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PowerOf4Test {
    PowerOf4 fixture;

    @Before
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