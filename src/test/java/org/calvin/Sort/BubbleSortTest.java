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
public class BubbleSortTest {
    @Test
    public void shouldBubbleSortAdaptive() {
        int[] input = {9,30,5,11,7,10};
        log.info("BubbleSort: Input (Unsorted): " + Arrays.toString(input));
        BubbleSort.sortAdaptive(input);
        int[] expected = {5,7,9,10,11,30};
        log.info("BubbleSort: Input (Sorted): " + Arrays.toString(input));
        assertTrue(Arrays.equals(expected, input));
    }

    @Test
    public void shouldBubbleSort() {
        int[] input = {9,30,5,11,7,10};
        log.info("BubbleSort: Input (Unsorted): " + Arrays.toString(input));
        BubbleSort.sort(input);
        int[] expected = {5,7,9,10,11,30};
        log.info("BubbleSort: Input (Sorted): " + Arrays.toString(input));
        assertTrue(Arrays.equals(expected, input));
    }

    @Test
    public void shouldNotSortWhenInputIsNotDefined() {
        int[] input = null;
        BubbleSort.sort(input);
        assertTrue(input == null);

        int[] input2 = {2};
        BubbleSort.sort(input2);
        assertTrue(Arrays.equals(new int[]{2}, input2));
    }
}
