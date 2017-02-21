/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        if (node == null || node.getNext() == null) {
            return;
        }
        node.setVal(node.getNext().getVal());
        node.setNext(node.getNext().getNext());
        return;
    }
}
