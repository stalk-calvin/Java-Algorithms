/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

public class FindNumberInRotatedArray {
    public int find(int[] A, int key) {
        int L = 0;
        int R = A.length - 1;
        while (L <= R) {
            int M = L + ((R-L) / 2);
            if (A[M] == key) {
                return key;
            } else if (A[M] >= A[L]) {
                if (A[L] <= key && key < A[M])
                    R = M - 1;
                else
                    L = M + 1;
            } else {
                if (A[M] < key && key <= A[R])
                    L = M + 1;
                else
                    R = M - 1;
            }
        }
        return -1;
    }
}
