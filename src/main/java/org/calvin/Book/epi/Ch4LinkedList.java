package org.calvin.terview.epi;

import org.calvin.LinkedList.ListNode;

public class Ch4LinkedList {
    public ListNode search(ListNode L, int key) {
        while (L != null && L.getVal() != key) {
            L = L.getNext();
        }
        // If key was not present in the list, L will have become null.
        return L;
    }


    public void insertAfter(ListNode node, ListNode newNode) {
        newNode.setNext(node.getNext());
        node.setNext(newNode);
    }

    public void deleteList(ListNode aNode) {
        aNode.setNext(aNode.getNext() != null ? aNode.getNext().getNext() : null);
    }

    public ListNode hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                // There is a cycle, so now let’s calculate the cycle length.
                int cycleLen = 0;
                do {
                    ++cycleLen;
                    fast = fast.getNext();
                } while (slow != fast);
                // Finds the start of the cycle.
                ListNode cycleLenAdvancedIter = head;
                // cycleLenAdvancedIter pointer advances cycleLen first.
                while (cycleLen-- > 0) {
                    cycleLenAdvancedIter = cycleLenAdvancedIter.getNext();
                }
                ListNode iter = head;
                // Both iterators advance in tandem.
                while (iter != cycleLenAdvancedIter) {
                    iter = iter.getNext();
                    cycleLenAdvancedIter = cycleLenAdvancedIter.getNext();
                }
                return iter; // iter is the start of cycle.
            }
        }
        return null; // no cycle.
    }
}
