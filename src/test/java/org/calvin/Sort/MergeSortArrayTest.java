/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

@Slf4j
public class MergeSortArrayTest {
    private MergeSortArray fixture;
    @Before
    public void setup() {
        fixture = new MergeSortArray();
    }
    @Test
    public void shouldMergeSort() {
        int[] input = {9,30,5,11,7,10};
        log.info("MergeSortArray: Input (Unsorted): " + Arrays.toString(input));
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);

        fixture.sort(input);

        log.info("Verify ordering for Mergesort ");
        InOrder inorder = inOrder(ps);
        inorder.verify(ps).print(9);
        inorder.verify(ps).print(30);
        inorder.verify(ps).println();
        inorder.verify(ps).print(5);
        inorder.verify(ps).print(9);
        inorder.verify(ps).print(30);
        inorder.verify(ps).println();
        inorder.verify(ps).print(7);
        inorder.verify(ps).print(11);
        inorder.verify(ps).println();
        inorder.verify(ps).print(7);
        inorder.verify(ps).print(10);
        inorder.verify(ps).print(11);
        inorder.verify(ps).println();
        inorder.verify(ps).print(5);
        inorder.verify(ps).print(7);
        inorder.verify(ps).print(9);
        inorder.verify(ps).print(10);
        inorder.verify(ps).print(11);
        inorder.verify(ps).print(30);
        log.info("Verify ordering for Mergesort, done. ");

        // Assert Sorted After
        log.info("MergeSortArray: Input (Sorted): " + Arrays.toString(input));
        int previous = 0;
        for(int i : input) {
            assertTrue(previous <= i);
            previous = i;
        }
    }

    @Test
    public void shouldNotSortWhenInputIsNotDefined() {
        int[] input = null;
        fixture.sort(null);
        assertTrue(input == null);

        int[] input2 = {2};
        fixture.sort(input2);
        assertTrue(Arrays.equals(new int[]{2}, input2));
    }
}
