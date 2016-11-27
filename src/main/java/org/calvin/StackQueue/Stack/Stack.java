/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Stack;

public interface Stack {
    int size();
    void push(Object newElement);
    Object pop() throws EmptyStackException;
    Object peek() throws EmptyStackException;
}
