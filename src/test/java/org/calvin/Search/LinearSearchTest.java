/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Search;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class LinearSearchTest {
    private static List<Integer> data = Arrays.asList(8, 2, 9, 1, 5, 3, 7);

    private SearchInterface<Integer> fixture;

    @Before
    public void setup() {
        fixture = new LinearSearch<>();
    }

    @Test
    public void shouldSearchUnsortedArrayList() {
        int result = fixture.indexOf(data, 5);
        assertTrue(result != -1);
    }

    @Test
    public void shouldNotSearchUnmatchedItem() {
        int result = fixture.indexOf(data, 10);
        assertTrue(result == -1);
    }
}