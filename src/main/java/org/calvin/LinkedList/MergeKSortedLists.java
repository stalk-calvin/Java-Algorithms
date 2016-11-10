/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKSortedLists(ListNode[] lists) {
        if(lists == null || lists.length ==0) return null;
        ListNode dummy = new ListNode(-1);
        ListNode runner = dummy;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode n1, ListNode n2) {
                return n1.getVal() - n2.getVal();
            }});
        for(ListNode node:lists) if(node!=null) minHeap.add(node);
        while(!minHeap.isEmpty()){
            ListNode node = minHeap.poll();
            runner.setNext(node);
            runner = runner.getNext();
            if(node.getNext() !=null) minHeap.add(node.getNext());
        }
        return dummy.getNext();
    }
}