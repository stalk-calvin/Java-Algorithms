/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorialTrailingZerosTest {
    FactorialTrailingZeros fixture;

    @Before
    public void setUp() {
        fixture = new FactorialTrailingZeros();
    }


    //20! is 2432902008176640000
    @Test
    public void shouldHaveCorrectTrailingZeroes() {
        assertEquals(4, fixture.trailingZeroes(20));
    }

}
