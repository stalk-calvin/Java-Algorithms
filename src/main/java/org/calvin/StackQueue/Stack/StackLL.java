/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Stack;

import org.calvin.LinkedList.ListNode;

public class StackLL<T> {
    private static int MAX_SIZE = 40;

    private ListNode<T> top;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void push(T data) {
        if (size == MAX_SIZE) {
            throw new FullStackException("Stack is full!");
        }

        ListNode<T> newNode = new ListNode<>(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        size++;
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException("Stack is empty!");
        }

        T ret = top.getVal();

        top = top.getNext();

        size--;

        return ret;
    }

    public T peek() {
        if (size == 0) {
            throw new EmptyStackException("Stack is empty!");
        }

        return top.getVal();
    }

}
