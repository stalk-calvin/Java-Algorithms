/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Sort;

public class QuickSortArray {
    public static void quickSort(int[] input, int start, int end) {
        if (input == null || input.length < 2) return;
        if (start < end) {
            int p = partition(input, start, end);
            quickSort(input, start, p - 1);
            quickSort(input, p + 1, end);
            for (int i = start; i <= end; i++) {
                System.out.print(input[i]);
            }
            System.out.println();
        }
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = start, temp;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] < nums[pivot]) {
                start++;
                temp = nums[i];
                int j;
                for (j = i; j > start; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[j] = temp;
            }
        }

        temp = nums[pivot];
        while (pivot < start) {
            nums[pivot] = nums[pivot + 1];
            pivot++;
        }
        nums[pivot] = temp;
        return pivot;
    }
}
