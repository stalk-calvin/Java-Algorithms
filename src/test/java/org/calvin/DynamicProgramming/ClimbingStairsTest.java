/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DynamicProgramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {
    ClimbingStairs fixture;

    @BeforeEach
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
