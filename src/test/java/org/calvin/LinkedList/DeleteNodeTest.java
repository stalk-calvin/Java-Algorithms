/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteNodeTest {
    private static final int[] vals = {1,2,3};

    DeleteNode fixture;
    ListNode listBase;

    @Before
    public void setUp() {
        fixture = new DeleteNode();
        listBase = AssortedMethods.createLinkedListFromArray(vals);
    }

    @Test
    public void shouldDeleteNode() {
        assertEquals(listBase.getNext().getVal(), 2);
        assertEquals("1->2->3", listBase.printForward());
        fixture.deleteNode(listBase.getNext());
        assertEquals("1->3", listBase.printForward());
        assertEquals(listBase.getNext().getVal(), 3);
    }

    @Test
    public void shouldNotDeleteSingleElement() {
        listBase = new ListNode(5);
        fixture.deleteNode(listBase);
        assertEquals("5", listBase.printForward());
    }
}