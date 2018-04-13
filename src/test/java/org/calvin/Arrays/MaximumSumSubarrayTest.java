/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaximumSumSubarrayTest {
    private MaximumSumSubarray fixture;

    @Before
    public void setUp() {
        fixture = new MaximumSumSubarray();
    }

    @Test
    public void shouldFindMaxSubArraySum() {
        int[] input = {-2 , 1, -3, 4, -1, 2, 1, -5, 7};
        int actual = fixture.maxSubArray(input);
        assertEquals(8, actual);
    }

    @Test
    public void shouldFindMaxSubArrayDRPSum() {
        int[] input = {-2 , 1, -3, 4, -1, 2, 1, -5, 7};
        int actual = fixture.maxSubArrayDP(input);
        assertEquals(8, actual);
    }

}
