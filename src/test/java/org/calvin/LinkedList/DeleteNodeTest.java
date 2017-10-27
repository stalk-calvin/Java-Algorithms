/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import static org.junit.Assert.assertEquals;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class DeleteNodeTest {
    private DeleteNode fixture;

    @Before
    public void setUp() {
        fixture = new DeleteNode();
    }

    @Test
    public void shouldDeleteNode() {
        ListNode listBase = AssortedMethods.createLinkedListFromArray(new int[]{1,2,3,4});
        assertEquals(listBase.getNext().getVal(), 2);
        assertEquals("1->2->3->4", listBase.printForward());
        ListNode inputNode = listBase.getNext().getNext();
        assertEquals(3, inputNode.getVal());
        fixture.deleteNode(inputNode);
        assertEquals("1->2->4", listBase.printForward());
    }

    @Test
    public void shouldNotDeleteSingleElement() {
        ListNode newRoot =  AssortedMethods.createLinkedListFromArray(new int[]{1});
        fixture.deleteNode(newRoot);
        assertEquals("1", newRoot.printForward());
    }
}
