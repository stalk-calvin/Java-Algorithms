/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Cycle2Test {
    private static final int[] vals = {-1, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8};

    private Cycle2 fixture;
    private ListNode listBase;

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new Cycle2();
        listBase = AssortedMethods.createLinkedListFromArray(vals);
    }


    @Test
    public void shouldDetectListWithCycle() {
        // create a cycle, should be -2
        listBase.getNext().getNext().getNext().getNext().setNext(listBase.getNext());
        ListNode actual = fixture.detectCycle(listBase);
        assertEquals(-2, actual.getVal());
    }

    @Test
    public void shouldNotDetectListWithCycle() {
        // create a fake cycle
        listBase.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(null);
        ListNode actual = fixture.detectCycle(listBase);
        assertEquals(null, actual);
    }
}
