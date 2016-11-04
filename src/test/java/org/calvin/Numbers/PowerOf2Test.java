/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOf2Test {
    PowerOf2 fixture;

    @Before
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