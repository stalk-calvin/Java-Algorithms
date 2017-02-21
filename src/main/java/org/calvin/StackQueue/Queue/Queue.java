/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Queue;

public interface Queue {
    int size();
    void enqueue(Object newElement);
    Object dequeue() throws EmptyQueueException;
    Object peek() throws EmptyQueueException;
}
