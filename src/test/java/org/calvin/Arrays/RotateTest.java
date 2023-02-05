/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateTest {
    Rotate fixture;

    @BeforeEach
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

    @Test
    public void shouldSearchRotatedSortedArrayWithPivot() {
        int[] input = {4,5,6,7,0,1,2};
        int actual = fixture.searchRotated(input, 0);
        assertEquals(4, actual);
    }
}
