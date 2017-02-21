/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class Add2Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addLists(l1, l2, 0);
    }

    private static ListNode addLists(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int value = carry;
        if (l1 != null) {
            value += l1.getVal();
        }
        if (l2 != null) {
            value += l2.getVal();
        }
        ListNode result = new ListNode(value % 10);
        if (l1 != null || l2 != null) {
            ListNode more = addLists(l1 == null ? null : l1.getNext(),
                    l2 == null ? null : l2.getNext(),
                    value >= 10 ? 1 : 0);
            result.setNext(more);
        }
        return result;
    }
}
