/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DynamicProgramming;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {
    ClimbingStairs fixture;

    @Before
    public void setUp() {
        fixture = new ClimbingStairs();
    }

    @Test
    public void shouldSimpleClimbStairs() {
        int actual = fixture.climbStairs(2);
        assertEquals(2, actual);
    }

    @Test
    public void shouldClimbManyStairs() {
        int actual = fixture.climbStairs(20);
        assertEquals(10946, actual);
    }

}