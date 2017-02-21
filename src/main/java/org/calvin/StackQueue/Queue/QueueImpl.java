/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Queue;

public class QueueImpl implements Queue {
    private static final int DEFAULT_ARRAY_SIZE = 5;
    private final int arrayResizeMode;
    private Object[] entry;
    private int first, last, counter;

    public QueueImpl(int arrayResizeMode) {
        this.arrayResizeMode = arrayResizeMode;
        entry = new Object[DEFAULT_ARRAY_SIZE];
        first = 0;
        counter = 0;
        last = counter;
    }

    public int size() {
        return counter;
    }

    public int entryLength() {
        return entry.length;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        return counter == entry.length;
    }

    @Override
    public void enqueue(Object newElement) {
        if (isFull()) {
            int newsize = (arrayResizeMode == 0) ? entry.length + 1 : entry.length * 2;
            Object[] new_entry = new Object[newsize];

            for (int k = 0; k < newsize; k++) {
                if (k >= entry.length) {
                    new_entry[last] = newElement;
                } else {
                    new_entry[k] = entry[k];
                }
            }
            // replace into a new one
            entry = new_entry;
        } else {
            entry[last] = newElement;
        }
        last++;
        counter++;
    }

    @Override
    public Object dequeue() throws EmptyQueueException {
        if (!isEmpty()) {
            Object queueFront = entry[first];
            first++;
            counter--;
            return queueFront;
        } else {
            throw new EmptyQueueException("Queue Exception on dequeue: Queue empty");
        }
    }

    @Override
    public Object peek() throws EmptyQueueException {
        if (!isEmpty()) {
            return entry[first];
        } else {
            throw new EmptyQueueException("Queue Exception on peek: Queue empty");
        }
    }
}
