package org.calvin.LinkedList;

public class SwapNode {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode tmpHead = head;
        while (tmpHead != null && tmpHead.next != null) {
            int val = tmpHead.next.val;
            tmpHead.next.val = tmpHead.val;
            tmpHead.val = val;
            tmpHead = tmpHead.next.next;
        }
        return head;
    }
}
