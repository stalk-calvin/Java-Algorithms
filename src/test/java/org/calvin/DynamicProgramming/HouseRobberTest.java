/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DynamicProgramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HouseRobberTest {
    HouseRobber fixture;

    @BeforeEach
    public void setUp() {
        fixture = new HouseRobber();
    }

    @Test
    public void shouldRobHousesBaseCase() {
        int[] input = new int[0];
        int actual = fixture.rob(input);
        assertTrue(actual == 0);

        input = new int[]{1};
        actual = fixture.rob(input);
        assertTrue(actual == 1);

        input = new int[]{1, 2};
        actual = fixture.rob(input);
        assertTrue(actual == 2);

        input = new int[]{1, 2, 3};
        actual = fixture.rob(input);
        assertTrue(actual == 4);
    }

    @Test
    public void shouldRobHousesDP() {
        int[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int actual = fixture.rob(input);
        assertTrue(actual == 64);
    }
}
