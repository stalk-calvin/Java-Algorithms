/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class CountingSortTest {
    @Test
    public void shouldCountSort() {
        int[] input = {8, 3, 7, 5, 6, 1, 2, 4};
        int[] actual = CountingSort.countingSort(input);
        int[] expected = {1,2,3,4,5,6,7,8};
        assertTrue(Arrays.equals(expected, actual));
    }
}