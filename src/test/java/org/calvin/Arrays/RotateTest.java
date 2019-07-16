/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RotateTest {
    Rotate fixture;

    @Before
    public void setUp() {
        fixture = new Rotate();
    }

    @Test
    public void shouldRotateRight() {
        int[] input = {1,2,3,4,5};
        fixture.arrayRightRotation(input, 2);
        int[] expected = {4,5,1,2,3};
        assertArrayEquals(expected, input);
    }

    @Test
    public void shouldRotateLeft() {
        int[] input = {1,2,3,4,5};
        fixture.arrayLeftRotation(input, input.length, 4);
        int[] expected = {5,1,2,3,4};
        assertArrayEquals(expected, input);
    }

    @Test
    public void shouldSearchRotatedSortedArray() {
        int[] input = {4,5,6,7,0,1,2};
        int actual = fixture.rotated_sorted_search(input, 0);
        assertEquals(4, actual);
    }
}
