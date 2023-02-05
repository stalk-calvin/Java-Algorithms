/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumProductSubarrayTest {
    private MaximumProductSubarray fixture;

    @BeforeEach
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
