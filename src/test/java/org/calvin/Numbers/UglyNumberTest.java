/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UglyNumberTest {
    UglyNumber fixture;

    @Before
    public void setUp() {
        fixture = new UglyNumber();
    }

    @Test
    public void shouldBeUgly() {
        assertTrue(fixture.isUgly(10));
    }

    @Test
    public void shouldOneBeUgly() {
        assertTrue(fixture.isUgly(1));
    }

    @Test
    public void shouldNotBeUgly() {
        assertFalse(fixture.isUgly(21));
    }

    @Test
    public void shouldNegativeNotBeUgly() {
        assertFalse(fixture.isUgly(-1));
    }
}