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
public class InsertionSortTest {
    @Test
    public void shouldInsertionSortAnother() {
        int[] input = {9,30,5,11,7,10};
        log.info("InsertionSort: Input (Unsorted): " + Arrays.toString(input));
        InsertionSort.sortAnother(input);
        int[] expected = {5,7,9,10,11,30};
        log.info("InsertionSort: Input (Sorted): " + Arrays.toString(input));
        assertTrue(Arrays.equals(expected, input));
    }
    @Test
    public void shouldInsertionSort() {
        int[] input = {9,30,5,11,7,10};
        log.info("InsertionSort: Input (Unsorted): " + Arrays.toString(input));
        InsertionSort.sort(input);
        int[] expected = {5,7,9,10,11,30};
        log.info("InsertionSort: Input (Sorted): " + Arrays.toString(input));
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
