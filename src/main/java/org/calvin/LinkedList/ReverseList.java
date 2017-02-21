/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class ReverseList {
    public ListNode reverseList(ListNode n) {
        if (n == null || n.getNext() == null) {
            return n;
        }
        ListNode newHead = new ListNode(n.getVal());
        n = n.getNext();
        while (n != null) {
            ListNode newN = new ListNode(n.getVal());
            newN.setNext(newHead);
            newHead = newN;
            n = n.getNext();
        }
        return newHead;
    }
}
