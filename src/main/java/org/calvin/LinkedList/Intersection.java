/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Intersection {
    public ListNode<Integer> getIntersectionNode(ListNode<Integer> headA, ListNode<Integer> headB) {
        int lenA = length(headA), lenB = length(headB);
        // move headA and headB to the same start point
        while (lenA > lenB) {
            headA = headA.getNext();
            lenA--;
        }
        while (lenA < lenB) {
            headB = headB.getNext();
            lenB--;
        }
        // find the intersection until end
        while (headA != headB) {
            headA = headA.getNext();
            headB = headB.getNext();
        }
        log.info("Returning: "+(headA == null ? null : headA.getVal()));
        return headA;
    }

    private int length(ListNode<Integer> node) {
        int length = 0;
        while (node != null) {
            node = node.getNext();
            length++;
        }
        return length;
    }

    public ListNode<Integer> getIntersectionNodeMyWay(ListNode<Integer> a, ListNode<Integer> b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }

        int len1=0;
        ListNode<Integer> curr = a;
        while (curr != null) {
            len1++;
            curr = curr.getNext();
        }
        curr = b;
        int len2=0;
        while (curr != null) {
            len2++;
            curr = curr.getNext();
        }
        if (len2 > len1) {
            int tmp = len1;
            len1 = len2;
            len2 = tmp;
            ListNode<Integer> t = a;
            a = b;
            b = t;
        }

        int len3 = len1 - len2;
        for (int i = 0; i < len3; i++) {
            a = a.getNext();
        }

        while (a!=b) {
            a = a.getNext();
            b = b.getNext();
        }

        return a;
    }
}
