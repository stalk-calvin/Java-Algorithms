/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class Add2Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addLists(l1, l2, 0);
    }
    public ListNode addListsIterative(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode pre = new ListNode(0);
        ListNode d = pre;
        int sum = 0;
        while (c1 != null || c2 != null) {
            if (c1 != null) {
                sum += c1.getVal();
                c1 = c1.getNext();
            }
            if (c2 != null) {
                sum += c2.getVal();
                c2 = c2.getNext();
            }
            d.setNext(new ListNode(sum % 10));
            sum /= 10;
            d = d.getNext();
        }
        if (sum == 1) d.setNext(new ListNode(1));
        return pre.getNext();
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
