package org.calvin.LinkedList;

import org.apache.commons.math3.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveFromZeroSum {
    public static ListNode<Integer> removeZeroSumSublists(ListNode<Integer> head) {
        Map<Integer,ListNode<Integer>> tracker= new HashMap<>();
        Stack<Pair<ListNode<Integer>, Integer>> stack= new Stack<>();
        int sum=0;
        ListNode<Integer> dummy = new ListNode<>(-1);
        dummy.setNext(head);
        tracker.put(0,dummy);
        stack.push(new Pair<>(dummy,0));

        ListNode<Integer> buf = head;
        while (buf != null) {
            sum += buf.getVal();
            if (tracker.containsKey(sum)) {
                while (stack.peek().getFirst() != tracker.get(sum)) {
                    tracker.remove(stack.pop().getSecond());
                }
                tracker.get(sum).setNext(buf.getNext());
            } else {
                tracker.put(sum, buf);
                stack.push(new Pair<>(buf, sum));
            }
            buf = buf.getNext();
        }

        return dummy.getNext();
    }
}
