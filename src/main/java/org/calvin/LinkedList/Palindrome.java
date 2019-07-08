/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class Palindrome {
    public boolean isPalindrome(ListNode<Integer> head) {
        if (head == null) {
            return true;
        }
        if (head.getNext() == null) {
            return true;
        }
        //algorithm
        //get middle
        ListNode<Integer> slow = head;
        ListNode<Integer> fast = slow;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        slow = reverseNode(slow);
        fast = head;
        while (slow != null) {
            if (fast.getVal() != slow.getVal()) {
                return false;
            }
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return true;
    }

    private ListNode<Integer> reverseNode(ListNode<Integer> head) {
        ListNode<Integer> tmpHead = head.getNext();
        ListNode<Integer> cur = new ListNode<Integer>(head.getVal());
        while (tmpHead != null) {
            ListNode<Integer> n = new ListNode<Integer>(tmpHead.getVal());
            n.setNext(cur);
            cur = n;
            tmpHead = tmpHead.getNext();
        }

        return cur;
    }
}
