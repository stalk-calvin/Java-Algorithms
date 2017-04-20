/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrangingCoinsTest {
    private static int input;
    private ArrangingCoins fixture;

    @Before
    public void setUp() {
        fixture = new ArrangingCoins();
    }

    @Test
    public void shouldReturnOne() throws Exception {
        input = 1;
        assertTrue(fixture.arrangeCoins(input) == 1);
    }

    @Test
    public void shouldReturnTwo() throws Exception {
        input = 5;
        assertTrue(fixture.arrangeCoins(input) == 2);
    }

    @Test
    public void shouldReturnThree() throws Exception {
        input = 8;
        assertTrue(fixture.arrangeCoins(input) == 3);
    }

    @Test
    public void shouldReturnFour() throws Exception {
        input = 14;
        assertTrue(fixture.arrangeCoins(input) == 4);
    }

    @Test
    public void shouldReturnFive() throws Exception {
        input = 15;
        assertTrue(fixture.arrangeCoins(input) == 5);
    }
}
