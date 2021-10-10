package org.calvin.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfIntervalsTest {
    @Test
    public void shouldHandleNullOrEmptyIntervals() {
        assertEquals(0, SumOfIntervals.sumIntervals(null));
        assertEquals(0, SumOfIntervals.sumIntervals(new int[][]{}));
        assertEquals(0, SumOfIntervals.sumIntervals(new int[][]{{4, 4}, {6, 6}, {8, 8}}));
    }

    @Test
    public void shouldAddDisjoinedIntervals() {
        assertEquals(9, SumOfIntervals.sumIntervals(new int[][]{{1, 2}, {6, 10}, {11, 15}}));
        assertEquals(11, SumOfIntervals.sumIntervals(new int[][]{{4, 8}, {9, 10}, {15, 21}}));
        assertEquals(7, SumOfIntervals.sumIntervals(new int[][]{{-1, 4}, {-5, -3}}));
        assertEquals(78, SumOfIntervals.sumIntervals(new int[][]{{-245, -218}, {-194, -179}, {-155, -119}}));
    }

    @Test
    public void shouldAddAdjacentIntervals() {
        assertEquals(54, SumOfIntervals.sumIntervals(new int[][]{{1, 2}, {2, 6}, {6, 55}}));
        assertEquals(23, SumOfIntervals.sumIntervals(new int[][]{{-2, -1}, {-1, 0}, {0, 21}}));
    }

    @Test
    public void shouldAddOverlappingIntervals() {
        assertEquals(7, SumOfIntervals.sumIntervals(new int[][]{{1, 4}, {7, 10}, {3, 5}}));
        assertEquals(6, SumOfIntervals.sumIntervals(new int[][]{{5, 8}, {3, 6}, {1, 2}}));
        assertEquals(19, SumOfIntervals.sumIntervals(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}}));
    }

    @Test
    public void shouldHandleMixedIntervals() {
        assertEquals(13, SumOfIntervals.sumIntervals(new int[][]{{2, 5}, {-1, 2}, {-40, -35}, {6, 8}}));
        assertEquals(1234, SumOfIntervals.sumIntervals(new int[][]{{-7, 8}, {-2, 10}, {5, 15}, {2000, 3150}, {-5400, -5338}}));
        assertEquals(158, SumOfIntervals.sumIntervals(new int[][]{{-101, 24}, {-35, 27}, {27, 53}, {-105, 20}, {-36, 26}}));
    }
}