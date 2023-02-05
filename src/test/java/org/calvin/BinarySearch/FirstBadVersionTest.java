/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstBadVersionTest {
    private FirstBadVersion fixture;
    private static final int SIZE = 100;

    @BeforeEach
    public void setUp() {
        fixture = new FirstBadVersion(SIZE);
    }

    @Test
    public void shouldFindBadVersion() {
        assertEquals(true, fixture.findBadVersion());
    }
}
