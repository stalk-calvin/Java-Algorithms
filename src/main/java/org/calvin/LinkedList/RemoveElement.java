/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class RemoveElement {
    public ListNode<Integer> removeElements(ListNode<Integer> head, int val) {
        if (head == null) return null;
        if (head.getVal() == val) {
            while (head != null && head.getVal() == val) {
                head = head.getNext();
            }
        }
        ListNode<Integer> tmpHead = head;
        ListNode<Integer> prev = head;
        while (tmpHead != null) {
            if (tmpHead.getVal() == val) {
                if (tmpHead.getNext() != null) {
                    tmpHead.setVal(tmpHead.getNext().getVal());
                    tmpHead.setNext(tmpHead.getNext().getNext());
                    continue;
                } else {
                    prev.setNext(null);
                }
            }
            prev = tmpHead;
            tmpHead = tmpHead.getNext();
        }
        return head;
    }
}
