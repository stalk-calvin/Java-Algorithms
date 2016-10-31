package org.calvin.LinkedList;

public class Merge2List {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        // find out who has minimum head
        ListNode newHead = new ListNode(Math.min(l1.val, l2.val));
        if (l1.val > l2.val) {
            l2 = l2.next;
        } else {
            l1 = l1.next;
        }
        ListNode returnHead = newHead;
        while (l1 != null && l2 != null) {
            ListNode n = new ListNode(Math.min(l1.val, l2.val));
            newHead.next = n;
            newHead = newHead.next;
            if (l1.val > l2.val) {
                l2 = l2.next;
            } else {
                l1 = l1.next;
            }
        }

        while (l1 != null) {
            ListNode n = new ListNode(l1.val);
            newHead.next = n;
            newHead = newHead.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            ListNode n = new ListNode(l2.val);
            newHead.next = n;
            newHead = newHead.next;
            l2 = l2.next;
        }

        return returnHead;
    }
}
