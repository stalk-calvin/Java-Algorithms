/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinearSearchTest {
    private static List<Integer> data = Arrays.asList(8, 2, 9, 1, 5, 3, 7);

    private SearchInterface<Integer> fixture;

    @BeforeEach
    public void setUp() {
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
