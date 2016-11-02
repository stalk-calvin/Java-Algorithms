package org.calvin.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        Set<Integer> tracker = new HashSet<>();
        tracker.add(head.getVal());
        ListNode tmpHead = head.getNext();
        ListNode newHead = new ListNode(head.getVal());
        ListNode result = newHead;
        while (tmpHead != null) {
            if (!tracker.contains(tmpHead.getVal())) {
                newHead.setNext(new ListNode(tmpHead.getVal()));
                newHead = newHead.getNext();
                tracker.add(tmpHead.getVal());
            }
            tmpHead = tmpHead.getNext();
        }
        return result;
    }
}
