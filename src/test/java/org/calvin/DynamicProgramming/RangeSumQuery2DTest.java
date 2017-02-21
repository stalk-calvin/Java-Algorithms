/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RangeSumQuery2DTest {
    private static final int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
    };
    private RangeSumQuery2D fixture;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        fixture = new RangeSumQuery2D(matrix);
    }

    @Test
    public void shouldCalculateSumRegion() throws Exception {
        assertEquals(11, fixture.sumRegion(1, 1, 2, 2));
    }

    @Test
    public void shouldNotCalculateSumRegion() throws Exception {
        exception.expect(NullPointerException.class);
        fixture = new RangeSumQuery2D(null);
        assertEquals(11, fixture.sumRegion(1, 1, 2, 2));
    }
}
