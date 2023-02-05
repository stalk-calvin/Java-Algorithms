/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PerfectSquareTest {
    private PerfectSquare fixture;

    @BeforeEach
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
