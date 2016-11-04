/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTrailingZerosTest {
    FactorialTrailingZeros fixture;

    @Before
    public void setUp() {
        fixture = new FactorialTrailingZeros();
    }

    @Test
    public void shouldHaveCorrectTrailingZeroes() {
        assertEquals(4, fixture.trailingZeroes(20));
    }

}