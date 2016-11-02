package org.calvin.LinkedList;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        if (head.getNext() == null) {
            return true;
        }
        //algorithm
        //get middle
        ListNode slow = head;
        ListNode fast = slow;
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

    private ListNode reverseNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode tmpHead = head.getNext();
        ListNode cur = new ListNode(head.getVal());
        while (tmpHead != null) {
            ListNode n = new ListNode(tmpHead.getVal());
            n.setNext(cur);
            cur = n;
            tmpHead = tmpHead.getNext();
        }

        return cur;
    }
}
