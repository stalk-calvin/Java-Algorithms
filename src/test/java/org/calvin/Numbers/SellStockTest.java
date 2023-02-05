/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SellStockTest {
    SellStock fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SellStock();
    }

    @Test
    public void shouldCalculateMaxProfit() {
        int[] prices = {1, 2, 9, 2, 5};
        assertEquals(8, fixture.maxProfit(prices));
    }

    @Test
    public void shouldCoverBaseCase() {
        assertEquals(0, fixture.maxProfit(null));
        assertEquals(0, fixture.maxProfit(new int[]{}));
        assertEquals(0, fixture.maxProfit(new int[]{1}));
    }

}
