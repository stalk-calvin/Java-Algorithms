package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaximumProductSubarrayTest {
    private MaximumProductSubarray fixture;

    @Before
    public void setUp() {
        fixture = new MaximumProductSubarray();
    }

    @Test
    public void shouldCalculateMaxProduct() {
        int[] input = {2,3,-2,4};
        int actual = fixture.maxProduct(input);
        // 2 * 3 = 6
        // Remember, contiguous
        assertEquals(6, actual);
    }

    @Test
    public void shouldCalculateMaxProductWhenAllNegative() {
        int[] input = {-2, -3, -4, -5};
        int actual = fixture.maxProduct(input);
        // -2 * -3 * -4 * -5 = 120
        assertEquals(120, actual);
    }
}