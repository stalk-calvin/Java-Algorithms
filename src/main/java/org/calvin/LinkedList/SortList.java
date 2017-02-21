/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.getNext() == null) return head;
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.getNext() != null) {
            prev = slow;
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        prev.setNext(null);
        ListNode x = sortList(head);
        ListNode y = sortList(slow);
        return merge(x, y);
    }
    private ListNode merge(ListNode a, ListNode b) {
        ListNode t = new ListNode(0);
        ListNode p = t;
        while (a != null && b != null) {
            if (a.getVal() < b.getVal()) {
                p.setNext(a);
                a = a.getNext();
            } else {
                p.setNext(b);
                b = b.getNext();
            }
            p = p.getNext();
        }

        while (a != null) {
            p.setNext(a);
            a = a.getNext();
            p = p.getNext();
        }

        while (b != null) {
            p.setNext(b);
            b = b.getNext();
            p = p.getNext();
        }

        return t.getNext();
    }
}
