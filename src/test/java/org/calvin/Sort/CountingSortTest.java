/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountingSortTest {
    @Test
    public void shouldCountSort() {
        int[] input = {8, 3, 7, 5, 6, 1, 2, 4};
        int[] actual = CountingSort.countingSort(input);
        int[] expected = {1,2,3,4,5,6,7,8};
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void shouldCountSortDuplicated() {
        int[] input = {8, 3, 3, 4, 6, 3, 3, 7, 5, 6, 1, 2, 4};
        int[] actual = CountingSort.countingSort(input);
        int[] expected = {1,2,3,3,3,3,4,4,5,6,6,7,8};
        assertTrue(Arrays.equals(expected, actual));
    }
}
