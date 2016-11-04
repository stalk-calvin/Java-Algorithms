/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class Merge2List {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        // find out who has minimum head
        ListNode newHead = new ListNode(Math.min(l1.getVal(), l2.getVal()));
        if (l1.getVal() > l2.getVal()) {
            l2 = l2.getNext();
        } else {
            l1 = l1.getNext();
        }
        ListNode returnHead = newHead;
        while (l1 != null && l2 != null) {
            ListNode n = new ListNode(Math.min(l1.getVal(), l2.getVal()));
            newHead.setNext(n);
            newHead = newHead.getNext();
            if (l1.getVal() > l2.getVal()) {
                l2 = l2.getNext();
            } else {
                l1 = l1.getNext();
            }
        }

        while (l1 != null) {
            ListNode n = new ListNode(l1.getVal());
            newHead.setNext(n);
            newHead = newHead.getNext();
            l1 = l1.getNext();
        }

        while (l2 != null) {
            ListNode n = new ListNode(l2.getVal());
            newHead.setNext(n);
            newHead = newHead.getNext();
            l2 = l2.getNext();
        }

        return returnHead;
    }
}
