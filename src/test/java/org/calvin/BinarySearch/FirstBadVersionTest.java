/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FirstBadVersionTest {
    private FirstBadVersion fixture;
    private static final int SIZE = 100;

    @Before
    public void setUp() {
        fixture = new FirstBadVersion(SIZE);
    }

    @Test
    public void shouldFindBadVersion() {
        assertEquals(true, fixture.findBadVersion());
    }
}
