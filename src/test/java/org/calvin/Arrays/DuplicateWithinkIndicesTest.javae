/*
 * Copyright Calvin Lee - 2016
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DuplicateWithinkIndicesTest {
    DuplicateWithinkIndices fixture;

    @Before
    public void setUp() {
        fixture = new DuplicateWithinkIndices();
    }

    @Test
    public void testDuplicateWithinProvided() {
        int arr[] = {1, 2, 3, 11, 2, 5, 6};
        assertTrue(fixture.duplicate(arr, 3));
    }

    @Test
    public void testNoDuplicateWithinProvided() {
        int arr[] = {1, 2, 3, 11, 4, 5, 2};
        assertFalse(fixture.duplicate(arr, 3));
    }
}