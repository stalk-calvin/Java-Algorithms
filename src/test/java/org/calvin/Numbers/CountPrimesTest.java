/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountPrimesTest {
    CountPrimes fixture;

    @Before
    public void setUp() {
        fixture = new CountPrimes();
    }

    @Test
    public void countPrimes() {
        assertEquals(4, fixture.countPrimes(10));
    }

}