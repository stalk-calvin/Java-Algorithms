/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        if (!empty()) q.poll();
    }

    // Get the top element.
    public int top() {
        if (!empty()) return q.peek();
        return Integer.MIN_VALUE;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.size() == 0;
    }
}
