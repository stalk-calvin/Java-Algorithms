/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class Cycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.getNext() == null || head.getNext().getNext() == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.getNext();
        while (!slow.equals(fast)) {
            if (fast == null || fast.getNext() == null || fast.getNext().getNext() == null) {
                return false;
            }
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return true;
    }
}
