/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheTest {
    LRUCache fixture;
    private static final int CAPACITY = 5;

    @Before
    public void setUp() {
        fixture = new LRUCache(CAPACITY);
    }

    @Test
    public void shouldSetLatestThenGet() {
        fixture.set(2, 2);
        fixture.set(2, 3);
        fixture.set(2, 4);
        fixture.set(2, 5);
        assertEquals(5, fixture.get(2));
    }

    @Test
    public void shouldRemoveOldestWhenFull() {
        fixture.set(2, 2);
        fixture.set(3, 3);
        fixture.set(4, 4);
        fixture.set(5, 8);
        fixture.set(6, 4);
        fixture.set(7, 4);
        fixture.set(6, 9);
        assertEquals(-1, fixture.get(2));
        assertEquals(9, fixture.get(6));
    }
}