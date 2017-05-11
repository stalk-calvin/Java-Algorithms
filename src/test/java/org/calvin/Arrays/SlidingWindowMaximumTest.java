/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */
package org.calvin.Arrays;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SlidingWindowMaximumTest {
    SlidingWindowMaximum fixture;

    @Before
    public void setUp() {
        fixture = new SlidingWindowMaximum();
    }

    @Test
    public void shouldFindMaxSlidingWindow() {
        int[] input = {1,3,-1,-3,5,3,6,7};
        int[] actual = fixture.maxSlidingWindow(input, 3);
        int[] expected = {3,3,5,5,6,7};
        assertTrue(Arrays.equals(expected, actual));
    }

}
