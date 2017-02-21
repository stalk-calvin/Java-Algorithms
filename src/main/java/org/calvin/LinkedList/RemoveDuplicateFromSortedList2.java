/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class RemoveDuplicateFromSortedList2 {
    public ListNode removeDuplicates(ListNode head) {
        //use two pointers, slow - track the node before the dup nodes,
        // fast - to find the last node of dups.
        ListNode dummy = new ListNode(0);
        ListNode fast = head;
        dummy.setNext(fast);
        ListNode slow = dummy;
        while(fast != null) {
            while (fast.getNext() != null && fast.getVal() == fast.getNext().getVal()) {
                fast = fast.getNext();    //while loop to find the last node of the dups.
            }
            if (slow.getNext() != fast) { //duplicates detected.
                slow.setNext(fast.getNext()); //remove the dups.
                fast = slow.getNext();     //reposition the fast pointer.
            } else { //no dup, move down both pointer.
                slow = slow.getNext();
                fast = fast.getNext();
            }

        }
        return dummy.getNext();
    }
}
