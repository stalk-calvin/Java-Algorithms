/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.calvin.HashMap.TwoSum;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void shouldCalculateFirstTwoSum() {
        int[] input = {1,3,5,7,9,1};
        int[] expected = {3,1};
        assertArrayEquals(expected, TwoSum.twoSum(input, 10));
    }

    @Test
    public void shouldNotCalculateFirstTwoSum() {
        int[] input = {1,3,5,7,9,1};
        int[] expected = {0,0};
        assertArrayEquals(expected, TwoSum.twoSum(input, 9));
    }

}
