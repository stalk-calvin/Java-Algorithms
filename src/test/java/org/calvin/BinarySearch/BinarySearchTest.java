/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class BinarySearchTest {
    private static final int[] input =  { 5, 1, 100, 50, 75, 12, 89, 51, 11, 28, 99, 42, 68 };
    BinarySearch fixture;

    @BeforeEach
    public void setUp() {
        fixture = new BinarySearch(input);
    }

    @Test
    public void shouldSearchUsingBinarySearch() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);

        Arrays.sort(input);

        InOrder inorder = inOrder(ps);

        assertTrue(fixture.binarySearch(89));
        inorder.verify(ps, times(2)).println(eq("search higher"));
        inorder.verify(ps).println(eq("search lower"));
    }

    @Test
    public void shouldNotSearchUsingBinarySearch() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);

        Arrays.sort(input);

        InOrder inorder = inOrder(ps);

        assertFalse(fixture.binarySearch(90));
        inorder.verify(ps, times(2)).println(eq("search higher"));
        inorder.verify(ps).println(eq("search lower"));
    }

    @Test
    public void shouldSearchUsingBinarySearchRecursive() {
        Arrays.sort(input);
        assertTrue(fixture.binarySearchRecursive(input,89));
    }

    @Test
    public void shouldNotSearchUsingBinarySearchRecursive() {
        Arrays.sort(input);
        assertFalse(fixture.binarySearchRecursive(input,88));
    }
}
