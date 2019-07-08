/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class SwapNode {
    public ListNode<Integer> swapPairs(ListNode<Integer> head) {
        if (head == null || head.getNext() == null) return head;
        ListNode<Integer> tmpHead = head;
        while (tmpHead != null && tmpHead.getNext() != null) {
            int val = tmpHead.getNext().getVal();
            tmpHead.getNext().setVal(tmpHead.getVal());
            tmpHead.setVal(val);
            tmpHead = tmpHead.getNext().getNext();
        }
        return head;
    }
}
