/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomizedSetTest {
    private RandomizedSet fixture;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new RandomizedSet();
        fixture.insert(1);
        fixture.insert(2);
        fixture.insert(3);
        fixture.insert(4);
        fixture.insert(5);
        fixture.insert(6);
        fixture.insert(7);
        fixture.insert(8);
    }

    @Test
    public void shouldItemsBeInserted() throws Exception {
        assertTrue(fixture.getRset().contains(1));
    }

    @Test
    public void remove() throws Exception {
        assertTrue(fixture.remove(1));
        assertFalse(fixture.remove(1));
        assertFalse(fixture.getRset().contains(1));
    }

    @Test
    public void getRandom() throws Exception {
        int actual = fixture.getRandom();
        assertTrue(actual > 0 && actual < 9);
    }

}
