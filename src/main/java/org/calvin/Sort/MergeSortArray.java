/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

public class MergeSortArray {
    private int[] numbers;
    private int[] helper;

    public void sort(int[] values) {
        if (values == null || values.length < 2) return;
        this.numbers = values;
        this.helper = new int[values.length];
        mergeSort(0, values.length - 1);
    }

    private void mergeSort(int start, int end) {
        // check if low is smaller then end, if not then the array is sorted
        if (start < end) {
            // Get the index of the element which is in the middle, typical binary search mid
            int middle = start + (end - start) / 2;
            // Sort the left side of the array recursively
            mergeSort(start, middle);
            // Sort the right side of the array recursively
            mergeSort(middle + 1, end);
            // Merge them both like quicksort, difference is no pivot and we are merging instead of partition
            merge(start, middle, end);
            for (int i = start; i <= end; i++) {
                System.out.print(numbers[i]);
            }
            System.out.println();
        }
    }

    private void merge(int start, int mid, int end) {
        // Copy both parts into the helper array
        System.arraycopy(numbers, start, helper, start, end + 1 - start);

        int i = start;
        int j = mid + 1;
        int k = start;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= mid && j <= end) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= mid) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
    }
}
