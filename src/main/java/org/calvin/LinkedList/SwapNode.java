package org.calvin.LinkedList;

public class SwapNode {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.getNext() == null) return head;
        ListNode tmpHead = head;
        while (tmpHead != null && tmpHead.getNext() != null) {
            int val = tmpHead.getNext().getVal();
            tmpHead.getNext().setVal(tmpHead.getVal());
            tmpHead.setVal(val);
            tmpHead = tmpHead.getNext().getNext();
        }
        return head;
    }
}
