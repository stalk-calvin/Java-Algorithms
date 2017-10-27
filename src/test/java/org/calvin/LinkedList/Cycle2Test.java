/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import static org.junit.Assert.assertEquals;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class Cycle2Test {
    private static final int[] vals = {-1, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8};

    private Cycle2 fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new Cycle2();
    }

    @Test
    public void shouldDetectListWithCycle() {
        // create a cycle, should be 2
        ListNode listBase = AssortedMethods.createLinkedListFromArray(vals);
        listBase.getNext().getNext().getNext().getNext().setNext(listBase.getNext());
        ListNode actual = fixture.detectCycle(listBase);
        assertEquals(2, actual.getVal());
    }

    @Test
    public void shouldNotDetectListWithCycle() {
        // create a fake cycle
        ListNode listBase = AssortedMethods.createLinkedListFromArray(vals);
        listBase.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(null);
        ListNode actual = fixture.detectCycle(listBase);
        assertEquals(null, actual);
    }
}
