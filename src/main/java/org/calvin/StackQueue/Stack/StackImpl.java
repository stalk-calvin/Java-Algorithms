/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue.Stack;

public class StackImpl implements Stack {
    private static final int DEFAULT_ARRAY_SIZE = 5;
    private final int arrayResizeMode;
    private Object[] entry;
    private int last, counter;

    public StackImpl(int arrayResizeMode) {
        this.arrayResizeMode = arrayResizeMode;
        entry = new Object[DEFAULT_ARRAY_SIZE];
        counter = 0;
        last = 0;
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
    public void push(Object newElement) {
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
    public Object pop() throws EmptyStackException {
        if (!isEmpty()) {
            Object lastElement = entry[last - 1];
            last--;
            counter--;
            return lastElement;
        } else {
            throw new EmptyStackException("Stack Exception on pop: Stack empty");
        }
    }

    @Override
    public Object peek() throws EmptyStackException {
        if (!isEmpty()) {
            return entry[last - 1];
        } else {
            throw new EmptyStackException("Stack Exception on peek: Stack empty");
        }
    }
}
