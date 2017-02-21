/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class SortUsingStackTest {
    private SortUsingStack fixture;

    @Before
    public void setUp() {
        fixture = new SortUsingStack();
    }

    @Test
    public void shouldSortUsingStacks() {
        Stack<Integer> input = new Stack<>();
        input.push(6);
        input.push(8);
        input.push(2);
        input.push(3);
        input.push(9);

        input = fixture.sort(input);

        Stack<Integer> expected = new Stack<>();
        expected.push(2);
        expected.push(3);
        expected.push(6);
        expected.push(8);
        expected.push(9);

        for (int i = 0; i < input.size(); i++) {
            assertEquals(expected.pop(), input.pop());
        }
    }

}