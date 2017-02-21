/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PowerOf3Test {
    PowerOf3 fixture;

    @Before
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