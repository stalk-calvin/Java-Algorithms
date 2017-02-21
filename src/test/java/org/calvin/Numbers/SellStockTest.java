/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellStockTest {
    SellStock fixture;

    @Before
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
