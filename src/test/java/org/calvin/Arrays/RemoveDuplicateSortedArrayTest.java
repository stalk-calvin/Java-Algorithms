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
    public void setUp() throws Exception {
        fixture = new RemoveDuplicateSortedArray();
    }

    @Test
    public void removeDuplicates() throws Exception {
        int[] input = {1,1,2,2,2,3,4,5};
        int actual = fixture.removeDuplicates(input);
        assertEquals(5,actual);
    }

}