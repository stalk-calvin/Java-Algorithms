/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.Tree.Heap;

import java.lang.reflect.Array;

public class Heap<T extends Comparable<T>>{

    static int MAX_SIZE = 40;

    public T[] getInput() {
        return input;
    }

    private T input[];
    private int count = 0;

    Heap(Class<T> clazz) {
        this(clazz, MAX_SIZE);
    }

    private Heap(Class<T> clazz, int size) {
        input = (T[]) Array.newInstance(clazz, size);
    }

    private int getLeftChildIndex(int index) {
        int leftChildIndex = 2*index+1;
        if (leftChildIndex >= count) {
            return -1;
        }
        return leftChildIndex;
    }

    private int getRightChildIndex(int index) {
        int rightChildIndex = 2*index+2;
        if (rightChildIndex >= count) {
            return -1;
        }
        return rightChildIndex;
    }

    private int getParentIndex(int index) {
        if (index < 0 || index > count) {
            return -1;
        }
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        T tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    public int getCount() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == input.length;
    }

    private T getElementAtIndex(int index) {
        return input[index];
    }

    public void sort()
    {
        if (input == null || input.length < 2) return;
        for (int i = count - 1; i >= 0; i--)
        {
            swap(0, i);
            count = count - 1;
            siftdown(0);
        }
    }

    private void siftdown(int index) {
        int left = getLeftChildIndex(index);
        int right = getRightChildIndex(index);
        int max = -1;
        if (left != -1 && right != -1) {
            if (input[left].compareTo(input[right]) > 0) {
                max = left;
            } else {
                max = right;
            }
        } else if (left!=-1) {
            max = left;
        } else if (right != -1) {
            max = right;
        }

        if (max != -1 && getElementAtIndex(max).compareTo(getElementAtIndex(index)) > 0) {
            swap(index, max);
            siftdown(max);
        }
    }

    private void siftup(int index) {
        int parentIndex = getParentIndex(index);
        if (parentIndex < input.length) {
            if (input[parentIndex].compareTo(input[index]) < 0) {
                swap(index, parentIndex);
                siftup(parentIndex);
            }
        }
    }

    public void insert(T key) {
        input[count++] = key;
        siftup(count - 1);
    }

    T extractMax() {
        T ret = input[0];
        input[0] = input[count-- - 1];
        siftdown(0);
        return ret;
    }
}