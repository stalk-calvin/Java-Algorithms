/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class ReverseList {
    public ListNode<Integer> reverseList(ListNode<Integer> n) {
        if (n == null || n.getNext() == null) {
            return n;
        }
        ListNode<Integer> newHead = new ListNode<Integer>(n.getVal());
        n = n.getNext();
        while (n != null) {
            ListNode<Integer> newN = new ListNode<Integer>(n.getVal());
            newN.setNext(newHead);
            newHead = newN;
            n = n.getNext();
        }
        return newHead;
    }
}
