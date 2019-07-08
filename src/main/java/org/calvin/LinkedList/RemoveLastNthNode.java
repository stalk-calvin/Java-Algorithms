/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class RemoveLastNthNode {
    public ListNode<Integer> removeNthFromEnd(ListNode<Integer> head, int n) {
        ListNode<Integer> start = new ListNode<Integer>(0);
        ListNode<Integer> slow = start, fast = start;
        slow.setNext(head);

        //Move fast in front so that the gap between slow and fast becomes n
        for (int i = 0; i <= n; i++) {
            fast = fast.getNext();
        }
        //Move fast to the end, maintaining the gap
        while (fast != null) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        //Skip the desired node
        slow.setNext(slow.getNext().getNext());
        return start.getNext();
    }
}
