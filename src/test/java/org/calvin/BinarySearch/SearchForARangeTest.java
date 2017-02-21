/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SearchForARangeTest {
    private SearchForARange fixture;

    @Before
    public void setUp() {
        fixture = new SearchForARange();
    }

    @Test
    public void shouldSearchRangeLeft() {
        int[] input = {5, 5, 5, 7, 7, 8, 8, 8, 9, 9, 10, 10, 18};
        int[] actual = fixture.searchRange(input, 5);
        int[] expected = {0,2};
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void shouldSearchRangeMiddle() {
        int[] input = {5, 5, 5, 7, 7, 8, 8, 8, 9, 9, 10, 10, 18};
        int[] actual = fixture.searchRange(input, 8);
        int[] expected = {5,7};
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void shouldSearchRangeRight() {
        int[] input = {5, 5, 5, 7, 7, 8, 8, 8, 9, 9, 10, 10, 18};
        int[] actual = fixture.searchRange(input, 10);
        int[] expected = {10,11};
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void shouldNotFindAValue() {
        int[] input = {5, 5, 5, 7, 7, 8, 8, 8, 9, 9, 10, 10, 18};
        int[] actual = fixture.searchRange(input, 6);
        int[] expected = {-1,-1};
        assertTrue(Arrays.equals(expected, actual));
    }
}
