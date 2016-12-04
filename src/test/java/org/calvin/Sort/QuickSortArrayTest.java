/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
*/

package org.calvin.Sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

@Slf4j
public class QuickSortArrayTest {
    @Test
    public void shouldQuickSort() {
        int[] input = {9,30,5,11,7,10};
        log.info("Input (Unsorted): " + Arrays.toString(input));
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);

        int start = 0;
        int last = input.length - 1;
        QuickSortArray.quickSort(input, start, last);

        log.info("Verify ordering for Quicksort ");
        InOrder inorder = inOrder(ps);
        inorder.verify(ps).print(5);
        inorder.verify(ps).print(7);
        inorder.verify(ps).println();
        inorder.verify(ps).print(10);
        inorder.verify(ps).print(11);
        inorder.verify(ps).println();
        inorder.verify(ps).print(10);
        inorder.verify(ps).print(11);
        inorder.verify(ps).print(30);
        inorder.verify(ps).println();
        inorder.verify(ps).print(5);
        inorder.verify(ps).print(7);
        inorder.verify(ps).print(9);
        inorder.verify(ps).print(10);
        inorder.verify(ps).print(11);
        inorder.verify(ps).print(30);
        inorder.verify(ps).println();
        log.info("Verify ordering for Quicksort, done. ");

        // Assert Sorted After
        log.info("Input (Sorted): " + Arrays.toString(input));
        int previous = start;
        for(int i : input) {
            assertTrue(previous <= i);
            previous = i;
        }
    }

    @Test
    public void shouldNotSortWhenInputIsNotDefined() {
        int[] input = null;
        QuickSortArray.quickSort(input, 0, 0);
        assertTrue(input == null);

        int[] input2 = {2};
        QuickSortArray.quickSort(input2, 0, 0);
        assertTrue(Arrays.equals(new int[]{2}, input2));
    }


    @Test
    public void shouldQuickSortOnlySpecifiedBoundary() {
        int[] input = {9,30,5,11,7,10};

        int start = 0;
        int last = 2;
        log.info("Input (All Unsorted): " + Arrays.toString(input));
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);

        QuickSortArray.quickSort(input, start, last);

        log.info("Verify ordering for Quicksort ");
        InOrder inorder = inOrder(ps);
        inorder.verify(ps).print(5);
        inorder.verify(ps).print(9);
        inorder.verify(ps).print(30);
        inorder.verify(ps).println();
        log.info("Verify ordering for Quicksort, done. ");

        // Assert Sorted After
        log.info("Input (Partially Sorted, index from " + start + " to " + last + "): " + Arrays.toString(input));
        int previous = start;
        for(int i = start; i <= last; i++) {
            assertTrue(previous <= i);
            previous = i;
        }
    }
}