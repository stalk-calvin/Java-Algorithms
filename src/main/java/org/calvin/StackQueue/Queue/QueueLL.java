/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Queue;

import org.calvin.LinkedList.ListNode;

public class QueueLL<T> {
    private static int MAX_SIZE = 40;
    private ListNode<T> head;
    private ListNode<T> tail;

    public int getSize() {
        return size;
    }

    private int size;

    public void enqueue(T data) {
        if (size == MAX_SIZE) {
            throw new FullQueueException("Queue is full!");
        }
        ListNode<T> newNode = new ListNode<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = tail.getNext();
        }
        size++;
    }

    public T dequeue() {
        if (size == 0) {
            throw new EmptyQueueException("Queue is empty!");
        }
        T ret = head.getVal();

        head = head.getNext();
        size--;
        return ret;
    }

    public T peek() {
        if (size == 0) {
            throw new EmptyQueueException("Queue is empty!");
        }

        return head.getVal();
    }
}
