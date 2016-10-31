package org.calvin.Arrays;

public class MergeSortedArray {
    public void merge(int[] A, int m, int[] B, int n) {
        int j = m - 1;
        int k = n - 1;
        for (int i = n + m - 1; i > -1; i--) {
            if (k < 0) break;
            if (j < 0) {
                A[i] = B[k];
                k--;
            } else if (A[j] > B[k]) {
                A[i] = A[j];
                j--;
            } else {
                A[i] = B[k];
                k--;
            }

        }
    }
}
