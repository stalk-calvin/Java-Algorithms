/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {
    private MergeSort fixture;

    @Before
    public void setUp() {
        fixture = new MergeSort();
    }

    @Test
    public void shouldMergeSortStack() {
        Stack<Integer> input = new Stack<>();
        input.push(5);
        input.push(1);
        input.push(3);
        input.push(9);
        input.push(6);
        input.push(7);

        Stack<Integer> expected = new Stack<>();
        expected.push(7);
        expected.push(6);
        expected.push(9);
        expected.push(3);
        expected.push(1);
        expected.push(5);

        for (Integer anInput : input) {
            assertEquals(expected.pop(), anInput);
        }

        input = fixture.mergeSort(input);

        expected.push(9);
        expected.push(7);
        expected.push(6);
        expected.push(5);
        expected.push(3);
        expected.push(1);

        for (Integer anInput : input) {
            assertEquals(expected.pop(), anInput);
        }
    }

}