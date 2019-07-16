/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

@Slf4j
public class SelectionSortTest {
    @Test
    public void shouldSelectionSortAnother() {
        int[] input = {9,30,5,11,7,10};
        log.info("SelectionSort: Input (Unsorted): " + Arrays.toString(input));
        SelectionSort.selectSort(input);
        int[] expected = {5,7,9,10,11,30};
        log.info("SelectionSort: Input (Sorted): " + Arrays.toString(input));
        assertTrue(Arrays.equals(expected, input));
    }
    @Test
    public void shouldSelectionSort() {
        int[] input = {9,30,5,11,7,10};
        log.info("SelectionSort: Input (Unsorted): " + Arrays.toString(input));
        SelectionSort.sort(input);
        int[] expected = {5,7,9,10,11,30};
        log.info("SelectionSort: Input (Sorted): " + Arrays.toString(input));
        assertTrue(Arrays.equals(expected, input));
    }
    @Test
    public void shouldNotSortWhenInputIsNotDefined() {
        int[] input = null;
        SelectionSort.sort(input);
        assertTrue(input == null);

        int[] input2 = {2};
        SelectionSort.sort(input2);
        assertTrue(Arrays.equals(new int[]{2}, input2));
    }
}
