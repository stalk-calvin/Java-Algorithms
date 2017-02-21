/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class RemoveDuplicateFromSortedList {
    public ListNode removeDuplicates(ListNode head) {
        if (head == null || head.getNext() == null) return head;
        ListNode newHead = new ListNode(head.getVal());
        ListNode ret = newHead;
        while (head != null) {
            if (head.getVal() == newHead.getVal()) {
                head = head.getNext();
            } else {
                ListNode n = new ListNode(head.getVal());
                newHead.setNext(n);
                newHead = n;
                head = head.getNext();
            }
        }
        return ret;
    }
}
