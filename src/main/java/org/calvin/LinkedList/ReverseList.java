package org.calvin.LinkedList;

public class ReverseList {
    public ListNode reverseList(ListNode n) {
        if (n == null || n.next == null) {
            return n;
        }
        ListNode newHead = new ListNode(n.val);
        n = n.next;
        while (n != null) {
            ListNode newN = new ListNode(n.val);
            newN.next = newHead;
            newHead = newN;
            n = n.next;
        }
        return newHead;
    }
}
