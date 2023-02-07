/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CycleTest {
    private static final int[] vals = {-1, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8};

    Cycle fixture;
    ListNode listBase;

    @BeforeEach
    public void setUp() {
        fixture = new Cycle();
        listBase = AssortedMethods.createLinkedListFromArray(vals);
    }

    @Test
    public void shouldListHaveCycle() {
        // create a cycle
        listBase.getNext().getNext().getNext().getNext().setNext(listBase.getNext());
        boolean actual = fixture.hasCycle(listBase);
        assertTrue(actual);
    }

    @Test
    public void shouldListHaveNoCycleBaseCase() {
        listBase = new ListNode(5);
        boolean actual = fixture.hasCycle(listBase);
        assertFalse(actual);
    }

    @Test
    public void shouldListHaveNoCycle() {
        boolean actual = fixture.hasCycle(listBase);
        assertFalse(actual);
    }
}
