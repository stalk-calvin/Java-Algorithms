/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode<Integer> mergeKSortedLists(ListNode<Integer>[] lists) {
        if(lists == null || lists.length ==0) return null;
        ListNode<Integer> dummy = new ListNode<Integer>(-1);
        ListNode<Integer> runner = dummy;
        PriorityQueue<ListNode<Integer>> minHeap = new PriorityQueue<ListNode<Integer>>(lists.length, new Comparator<ListNode<Integer>>() {
            public int compare(ListNode<Integer> n1, ListNode<Integer> n2) {
                return n1.getVal() - n2.getVal();
            }});
        for(ListNode<Integer> node:lists) if(node!=null) minHeap.add(node);
        while(!minHeap.isEmpty()){
            ListNode<Integer> node = minHeap.poll();
            runner.setNext(node);
            runner = runner.getNext();
            if(node.getNext() !=null) minHeap.add(node.getNext());
        }
        return dummy.getNext();
    }
}
