/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.google.common.collect.Lists;

public class ThreeSumTest {
    private ThreeSum fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new ThreeSum();
    }

    @Test
    public void shouldFindThreeSumToZero() throws Exception {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> actual = fixture.threeSum(input);
        List<List<Integer>> expected = Arrays.asList(
                Lists.newArrayList(-1, -1, 2),
                Lists.newArrayList(-1, 0, 1)
        );

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindThreeSumToZeroWithDuplicateRight() throws Exception {
        int[] input = {0, 0, 0, -2, 3, -1, 0, 3, 3};
        List<List<Integer>> actual = fixture.threeSum(input);
        List<List<Integer>> expected = Arrays.asList(
                Lists.newArrayList(-2, -1, 3),
                Lists.newArrayList(0, 0, 0)
        );

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindThreeSumToZeroWithDuplicateLeft() throws Exception {
        int[] input = {0, 0, 0, 1, -1, -4, 2, 2};
        List<List<Integer>> actual = fixture.threeSum(input);
        List<List<Integer>> expected = Arrays.asList(
                Lists.newArrayList(-4, 2, 2),
                Lists.newArrayList(-1, 0, 1),
                Lists.newArrayList(0, 0, 0)
        );

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindThreeSumToZero() throws Exception {
        List<List<Integer>> actual = fixture.threeSum(null);
        assertEquals(new ArrayList<>(new ArrayList<>()), actual);
    }

}
