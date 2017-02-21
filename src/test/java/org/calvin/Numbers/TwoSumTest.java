/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TwoSumTest {
    TwoSum fixture;

    @Before
    public void setUp() {
        fixture = new TwoSum();
    }

    @Test
    public void shouldCalculateFirstTwoSum() {
        int[] input = {1,3,5,7,9,1};
        int[] expected = {3,1};
        assertTrue(Arrays.equals(expected, fixture.twoSum(input, 10)));
    }

    @Test
    public void shouldNotCalculateFirstTwoSum() {
        int[] input = {1,3,5,7,9,1};
        int[] expected = {0,0};
        assertTrue(Arrays.equals(expected, fixture.twoSum(input, 9)));
    }

}
