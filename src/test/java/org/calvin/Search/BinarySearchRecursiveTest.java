/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Search;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class BinarySearchRecursiveTest {
    private static List<Integer> data = Arrays.asList(8, 2, 9, 1, 5, 3, 7);

    private SearchInterface<Integer> fixture;

    @Before
    public void setUp() {
        fixture = new BinarySearchRecursive<>();
    }

    @Test
    public void shouldSearchSortedArrayList() {
        Collections.sort(data);
        int result = fixture.indexOf(data, 5);
        assertTrue(result != -1);
    }

    @Test
    public void shouldNotSearchUnsortedArrayList() {
        data = Arrays.asList(8,2,9,1,5,3,7);
        int result = fixture.indexOf(data, 5);
        assertTrue(result == -1);
    }

    @Test
    public void shouldNotSearchUnmatchedItem() {
        int result = fixture.indexOf(data, 10);
        assertTrue(result == -1);
    }
}
