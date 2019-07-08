/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class RemoveDuplicateFromSortedList {
    public ListNode<Integer> removeDuplicates(ListNode<Integer> head) {
        if (head == null || head.getNext() == null) return head;
        ListNode<Integer> newHead = new ListNode<Integer>(head.getVal());
        ListNode<Integer> ret = newHead;
        while (head != null) {
            if (head.getVal() == newHead.getVal()) {
                head = head.getNext();
            } else {
                ListNode<Integer> n = new ListNode<Integer>(head.getVal());
                newHead.setNext(n);
                newHead = n;
                head = head.getNext();
            }
        }
        return ret;
    }
}
