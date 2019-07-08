/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import lombok.Data;

@Data
public class ListNode<T> {
    private T val;
    private ListNode<T> next;

    public ListNode(T x) {
      val = x;
      next = null;
    }

    public String printForward() {
        if (next != null) {
            return val + "->" + next.printForward();
        } else {
            return ((Integer) val).toString();
        }
    }
}
