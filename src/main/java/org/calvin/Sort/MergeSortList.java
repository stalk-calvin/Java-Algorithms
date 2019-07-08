/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

import org.calvin.LinkedList.ListNode;

public class MergeSortList {
    public static ListNode<Integer> sortList(ListNode<Integer> head) {
        if (head == null || head.getNext() == null) return head;

        //Get the middle of list
        ListNode<Integer> prev = null, slow = head, fast = head;
        while (fast != null && fast.getNext() != null) {
            prev = slow;
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        //sever list recursively
        if (prev != null) {
            prev.setNext(null);
        }

        ListNode<Integer> x = sortList(head);
        ListNode<Integer> y = sortList(slow);

        // merge rest recursively
        return merge(x, y);
    }
    private static ListNode<Integer> merge(ListNode<Integer> a, ListNode<Integer> b) {
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
