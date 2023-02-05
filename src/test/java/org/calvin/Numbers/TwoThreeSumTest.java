/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import com.google.common.collect.Lists;
import org.calvin.HashMap.TwoThreeSum;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoThreeSumTest {
    @Test
    public void shouldCalculateFirstTwoSum() {
        List<Integer> input = Lists.newArrayList(1,3,5,7,9,1);
        List<Integer> expected = Lists.newArrayList(3,1);
        assertEquals(expected, TwoThreeSum.twoSum(input, 10));
    }

    @Test
    public void shouldNotCalculateFirstTwoSum() {
        List<Integer> input = Lists.newArrayList(1,3,5,7,9,1);
        assertTrue(TwoThreeSum.twoSum(input, 9).isEmpty());
    }

    @Test
    public void shouldCalculateFirstThreeSum() {
        List<Integer> input = Lists.newArrayList(1,3,5,7,9,1);
        List<Integer> expected = Lists.newArrayList(5, 9, 7);
        assertEquals(expected, TwoThreeSum.threeSum(input, 21));
    }

    @Test
    public void shouldNotCalculateFirstThreeSum() {
        List<Integer> input = Lists.newArrayList(1,3,5,7,9,1);
        assertTrue(TwoThreeSum.threeSum(input, 10).isEmpty());
    }
}
