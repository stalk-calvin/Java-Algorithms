/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfNTest {
    private PowerOfN fixture;
    @BeforeEach
    public void setUp() throws Exception {
        fixture = new PowerOfN();
    }

    @Test
    public void shouldCalculateNegativePower() throws Exception {
        double actual = fixture.myPow(2,-2);
        assertEquals(0.25, actual, 0);
    }

    @Test
    public void shouldCalculatePowerOdd() throws Exception {
        double actual = fixture.myPow(2,3);
        assertEquals(8, actual, 0);
    }

    @Test
    public void shouldCalculatePowerEven() throws Exception {
        double actual = fixture.myPow(2,4);
        assertEquals(16, actual, 0);
    }

    @Test
    public void shouldCalculateNegativePow() throws Exception {
        double actual = fixture.pow(2,-2);
        assertEquals(0.25, actual, 0);
    }

    @Test
    public void shouldCalculatePowOdd() throws Exception {
        double actual = fixture.pow(2,3);
        assertEquals(8, actual, 0);
    }

    @Test
    public void shouldCalculatePowEven() throws Exception {
        double actual = fixture.pow(2,4);
        assertEquals(16, actual, 0);
    }
}
