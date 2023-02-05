/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTrailingZerosTest {
    FactorialTrailingZeros fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FactorialTrailingZeros();
    }


    //20! is 2432902008176640000
    @Test
    public void shouldHaveCorrectTrailingZeroes() {
        assertEquals(4, fixture.trailingZeroes(20));
    }

}
