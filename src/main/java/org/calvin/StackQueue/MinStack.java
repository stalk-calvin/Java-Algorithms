/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import org.calvin.StackQueue.Stack.EmptyStackException;

import java.util.Stack;

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
        if (stack.isEmpty()) throw new EmptyStackException("Empty Stack");
        int r = stack.pop();
        if (!minStack.isEmpty() && minStack.peek() == r) {
            minStack.pop();
        }
        return r;
    }

    public int top() throws EmptyStackException {
        if (stack.isEmpty()) throw new EmptyStackException("Empty Stack");
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) return 0;
        return minStack.peek();
    }
}
