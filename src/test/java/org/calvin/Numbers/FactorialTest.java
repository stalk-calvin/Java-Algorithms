/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
    private Factorial fixture;

    @Before
    public void setUp() {
        fixture = new Factorial();
    }

    @Test
    public void shouldCalculateFactorialUsingRecursive() {
        long actual = fixture.factorialRecursive(20);
        assertEquals(2432902008176640000L, actual);
    }

    @Test
    public void shouldCalculateFactorialUsingIterative() {
        long actual = fixture.factorialIterative(20);
        assertEquals(2432902008176640000L, actual);
    }

    @Test
    public void shouldCalculateFactorialUsingDynamicProgramming() {
        long actual = fixture.factorialDynamicProgramming(20);
        assertEquals(2432902008176640000L, actual);
    }

}
