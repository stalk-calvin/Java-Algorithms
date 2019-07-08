/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

public class Add2Numbers {
    public ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
        return addLists(l1, l2, 0);
    }
    public ListNode<Integer> addListsIterative(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> c1 = l1;
        ListNode<Integer> c2 = l2;
        ListNode<Integer> pre = new ListNode<>(0);
        ListNode<Integer> d = pre;
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
            d.setNext(new ListNode<>(sum % 10));
            sum /= 10;
            d = d.getNext();
        }
        if (sum == 1) d.setNext(new ListNode<>(1));
        return pre.getNext();
    }
    private static ListNode<Integer> addLists(ListNode<Integer> l1, ListNode<Integer> l2, int carry) {
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
        ListNode<Integer> result = new ListNode<>(value % 10);
        if (l1 != null || l2 != null) {
            ListNode<Integer> more = addLists(l1 == null ? null : l1.getNext(),
                    l2 == null ? null : l2.getNext(),
                    value >= 10 ? 1 : 0);
            result.setNext(more);
        }
        return result;
    }

    // my way
    public ListNode<Integer> add(ListNode<Integer> l1, ListNode<Integer> l2) {
        int sum = 0;
        int val = 0;
        int count = 0;
        while (l1 != null) {
            val = l1.getVal();
            l1 = l1.getNext();
            if (val > 0) {
                val *= Math.pow((double)10,(double)count);
            }
            sum += val;
            count++;
        }
        count = 0;
        while (l2 != null) {
            val = l2.getVal();
            l2 = l2.getNext();
            if (val > 0) {
                val *= Math.pow((double)10,(double)count);
            }
            sum += val;
            count++;
        }

        ListNode<Integer> first;
        ListNode<Integer> head = null;
        ListNode<Integer> newNode = null;

        while (sum > 0) {
            int last = sum % 10;
            if (newNode == null) {
                newNode = new ListNode<>(last);
                head = newNode;
            } else {
                first= new ListNode<>(last);
                newNode.setNext(first);
                newNode = first;
            }
            sum /= 10;
        }
        return head;
    }
}
