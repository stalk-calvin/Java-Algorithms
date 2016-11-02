/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {
    FirstBadVersion fixture;
    public static final int SIZE = 100;

    @Before
    public void setUp() {
        fixture = new FirstBadVersion(SIZE);
    }

    @Test
    public void shouldFindBadVersion() {
        assertEquals(true, fixture.findBadVersion());
    }
}