/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PerfectSquareTest {
    private PerfectSquare fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new PerfectSquare();
    }

    @Test
    public void shouldOneBePerfectSquare() throws Exception {
        assertTrue(fixture.isPerfectSquare(1));
    }

    @Test
    public void shouldBePerfectSquare() throws Exception {
        assertTrue(fixture.isPerfectSquare(16));
    }

    @Test
    public void shouldNotBePerfectSquare() throws Exception {
        assertFalse(fixture.isPerfectSquare(14));
    }

}