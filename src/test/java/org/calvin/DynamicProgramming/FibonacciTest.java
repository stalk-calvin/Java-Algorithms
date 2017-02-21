/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DynamicProgramming;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FibonacciTest {
    @Test
    public void shouldFindBasicFibonacci() {
        int actual = Fibonacci.fibDP(5);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldFindLargeFibonacci() {
        int actual = Fibonacci.fibDP(40);
        int expected = 102334155;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldNotFindFibonacciOnNegativeNumber() {
        int actual = Fibonacci.fibDP(-10);
        int expected = 0;
        assertEquals(expected,actual);
    }
}
