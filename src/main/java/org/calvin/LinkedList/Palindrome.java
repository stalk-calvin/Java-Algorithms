/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class Palindrome {
    public boolean isPalindromeMyWay(ListNode<Integer> head) {
        if (head == null) {
            return true;
        }
        ListNode<Integer> curr = head;
        int l = 0;
        while (curr != null) {
            l++;
            curr = curr.getNext();
        }
        if (l < 2) {
            return true;
        }
        curr = head;
        ListNode<Integer> newHead = new ListNode<>(curr.getVal());
        curr = curr.getNext();
        for (int i =0; i<l/2-1; i++) {
            ListNode<Integer> tmp = new ListNode<>(curr.getVal());
            tmp.setNext(newHead);
            newHead = tmp;
            curr = curr.getNext();
        }
        if (l%2==1) {
            curr = curr.getNext();
        }
        while (curr != null && newHead != null) {
            if (!curr.getVal().equals(newHead.getVal())) {
                return false;
            }
            curr = curr.getNext();
            newHead = newHead.getNext();
        }
        return newHead == null;
    }

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
