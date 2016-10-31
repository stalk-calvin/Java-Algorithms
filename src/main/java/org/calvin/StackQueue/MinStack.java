package org.calvin.StackQueue;

import java.util.EmptyStackException;
import java.util.Stack;
import java.lang.*;

class MinStackNode {

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
        return Integer.MAX_VALUE;
    }

    public int getMin() throws EmptyStackException {
        if (!s.isEmpty()) {
            return s.peek().min;
        }
        return Integer.MAX_VALUE;
    }
}

class NodeWithMin {
    public int min;
    public int data;

    public NodeWithMin(int data) {
        this.data = data;
        this.min = 0;
    }

    public NodeWithMin(int data, int min) {
        this.data = data;
        this.min = min;
    }
}

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
        }
        stack.push(x);
        return;
    }

    public int pop() throws EmptyStackException {
        if (stack.isEmpty()) throw new EmptyStackException();
        int r = stack.pop();
        if (!minStack.isEmpty() && minStack.peek() == r) {
            minStack.pop();
        }
        return r;
    }

    public int top() throws EmptyStackException {
        if (stack.isEmpty()) throw new EmptyStackException();
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) return 0;
        return minStack.peek();
    }
}
