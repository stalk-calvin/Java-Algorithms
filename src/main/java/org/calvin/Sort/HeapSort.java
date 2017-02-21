/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

public class HeapSort {
    private static int size;
    public static void sort(int input[])
    {
        if (input == null || input.length < 2) return;
        heapify(input);
        for (int i = size; i > 0; i--)
        {
            swap(input,0, i);
            size = size -1;
            maxheap(input, 0);
        }
    }

    /* Build heap */
    private static void heapify(int input[])
    {
        if (input == null || input.length < 2) return;
        size = input.length-1;
        for (int i = size /2; i >= 0; i--)
            maxheap(input, i);
    }

    /* Swap largest element in heap */
    private static void maxheap(int input[], int i)
    {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= size && input[left] > input[i])
            max = left;
        if (right <= size && input[right] > input[max])
            max = right;

        if (max != i)
        {
            swap(input, i, max);
            maxheap(input, max);
        }
    }

    private static void swap(int input[], int i, int j)
    {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }
}
