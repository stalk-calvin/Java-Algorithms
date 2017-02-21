/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import java.util.EmptyStackException;
import java.util.Stack;
import java.lang.*;

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
