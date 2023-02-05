/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DynamicProgramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RangeSumQuery2DTest {
    private static final int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
    };
    private RangeSumQuery2D fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new RangeSumQuery2D(matrix);
    }

    @Test
    public void shouldCalculateSumRegion() throws Exception {
        assertEquals(11, fixture.sumRegion(1, 1, 2, 2));
    }

    @Test
    public void shouldNotCalculateSumRegion() throws Exception {
        fixture = new RangeSumQuery2D(null);
        assertThrows(NullPointerException.class, () -> fixture.sumRegion(1, 1, 2, 2));
    }
}
