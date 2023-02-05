/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BSTDistanceTest {
    @BeforeEach
    public void setUp() {
        BSTDistance.found = false;
    }

    @Test
    public void shouldFindBSTDistance() {
        int[] input = {5, 6, 3, 1, 2, 4};
        int actual = BSTDistance.bstDistance(input, 6, 2, 4);
        assertEquals(3, actual);
    }

    @Test
    public void shouldFindBSTDistanceLeft() {
        int[] input = {9, 7, 5, 3, 1};
        int actual = BSTDistance.bstDistance(input, 5, 7, 20);
        assertEquals(-1, actual);
    }

    @Test
    public void shouldFindBSTDistanceRight() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int actual = BSTDistance.bstDistance(input, 6, 6, 1);
        assertEquals(5, actual);
    }
}
