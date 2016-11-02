/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateSortedArrayTest {
    RemoveDuplicateSortedArray fixture;

    @Before
    public void setUp() {
        fixture = new RemoveDuplicateSortedArray();
    }

    @Test
    public void shouldRemoveDuplicates() {
        int[] input = {1,1,2,2,2,3,4,5};
        int actual = fixture.removeDuplicates(input);
        assertEquals(5,actual);
    }

    @Test
    public void shouldNotRemoveDuplicates() {
        int[] input = new int[0];
        int actual = fixture.removeDuplicates(input);
        assertEquals(0,actual);
    }

}