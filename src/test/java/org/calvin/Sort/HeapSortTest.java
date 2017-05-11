/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

@Slf4j
public class HeapSortTest {
    @Test
    public void shouldHeapSort() {
        int[] input = {9,30,5,11,7,10};
        log.info("HeapSort: Input (Unsorted): " + Arrays.toString(input));
        HeapSort.sort(input);
        int[] expected = {5,7,9,10,11,30};
        log.info("HeapSort: Input (Sorted): " + Arrays.toString(input));
        assertTrue(Arrays.equals(expected, input));
    }
    @Test
    public void shouldNotSortWhenInputIsNotDefined() {
        int[] input = null;
        HeapSort.sort(null);
        assertTrue(input == null);

        int[] input2 = {2};
        HeapSort.sort(input2);
        assertTrue(Arrays.equals(new int[]{2}, input2));
    }

}
