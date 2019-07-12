/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.Tree.Heap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class HeapTest {

    private Heap<Integer> fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new Heap<>(Integer.class);
        for (int i = 0; i < Heap.MAX_SIZE; i++) {
            fixture.getInput()[i] = Integer.MIN_VALUE;
        }
    }

    @Test
    public void shouldInsertAndDelete() throws Exception {
        fixture.insert(9);
        fixture.insert(30);
        fixture.insert(5);
        fixture.insert(11);
        fixture.insert(7);
        fixture.insert(10);

        int[] expected = new int[]{30, 11, 10, 9, 7, 5};
        for (int i = 0; i < fixture.getCount(); i++) {
            assertEquals(expected[i], (int) fixture.getInput()[i]);
        }

        assertTrue(fixture.getCount() == 6);
        assertTrue(fixture.extractMax() == 30);
        fixture.getInput()[fixture.getCount()] = Integer.MIN_VALUE;
        assertTrue(fixture.extractMax() == 11);
        fixture.getInput()[fixture.getCount()] = Integer.MIN_VALUE;

        expected = new int[]{10, 9, 7, 5};
        for (int i = 0; i < fixture.getCount(); i++) {
            assertEquals(expected[i], (int) fixture.getInput()[i]);
        }

        fixture.insert(30);
        fixture.insert(11);

        log.info("HeapSort: Input (Unsorted): " + Arrays.toString(fixture.getInput()));
        fixture.sort();
        expected = new int[]{5, 7, 9, 10, 11, 30};
        log.info("HeapSort: Input (Sorted): " + Arrays.toString(fixture.getInput()));
        for (int i = 0; i < fixture.getCount(); i++) {
            assertEquals(expected[i], (int) fixture.getInput()[i]);
        }

    }
}