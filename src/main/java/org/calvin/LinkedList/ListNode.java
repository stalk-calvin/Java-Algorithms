/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import lombok.Data;

@Data
public class ListNode {
    private int val;
    private ListNode next;

    public ListNode(int x) {
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
