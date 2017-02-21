/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfFibonacciTest {
    @Test
    public void sumOfFib() throws Exception {
        assertEquals(7, SumOfFibonacci.sumOfFib(4));
    }

    @Test
    public void sumOfOddFib() throws Exception {
        assertEquals(5, SumOfFibonacci.sumOfOddFib(4));
    }

}
