/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircularPrimeTest {
    @Test public void shouldGetNumberOfCircular() throws Exception {
        assertEquals(55, CircularPrime.getNumberOfCircular(1000000));
    }

    @Test public void shouldCalculateIsCircularPrime() throws Exception {
        assertTrue(CircularPrime.isCircularPrime(197));
    }
}
