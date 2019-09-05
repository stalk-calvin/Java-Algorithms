/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import java.util.EmptyStackException;
import java.util.Stack;

class MinStackNode {

    static class NodeWithMin {
        public int min;
        public int data;

        public NodeWithMin(int data, int min) {
            this.data = data;
            this.min = min;
        }
    }

    Stack<NodeWithMin> s;

    /**
     * initialize your data structure here.
     */
    public MinStackNode() {
        this.s = new Stack<>();
    }

    public void push(int x) {
        int min = Math.min(x, getMin());
        s.push(new NodeWithMin(x, min));
        return;
    }

    public void pop() {
        s.pop();
        return;
    }

    public int top() throws EmptyStackException {
        if (!s.isEmpty()) {
            return s.peek().data;
        }
        throw new EmptyStackException();
    }

    public int getMin() {
        if (!s.isEmpty()) {
            return s.peek().min;
        }
        return Integer.MAX_VALUE;
    }
}
