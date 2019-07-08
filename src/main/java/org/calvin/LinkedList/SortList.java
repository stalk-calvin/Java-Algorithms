/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class SortList {
    // adapting merge sort algorithm
    public ListNode<Integer> sortList(ListNode<Integer> head) {
        if (head == null || head.getNext() == null) return head;
        ListNode<Integer> prev = null, slow = head, fast = head;
        while (fast != null && fast.getNext() != null) {
            prev = slow;
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        assert prev != null;
        prev.setNext(null);
        ListNode<Integer> x = sortList(head);
        ListNode<Integer> y = sortList(slow);
        return merge(x, y);
    }
    private ListNode<Integer> merge(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> t = new ListNode<Integer>(0);
        ListNode<Integer> p = t;
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
