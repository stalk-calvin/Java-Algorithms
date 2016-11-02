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

        fixture.deleteNode(listBase.getNext());

        assertEquals(listBase.getNext().getVal(), 3);
    }

}