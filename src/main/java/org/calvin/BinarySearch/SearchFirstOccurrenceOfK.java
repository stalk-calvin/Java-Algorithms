/*
 * Copyright Calvin Lee Since 2018.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

public class SearchFirstOccurrenceOfK {
    public int firstIndexOf(int[] sorted, int k) {
        if (sorted == null) {
            return -1;
        }
        int result = -1;
        int start = 0;
        int end = sorted.length - 1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (sorted[mid] == k) {
                result = mid;
                end = mid - 1;
            } else if (sorted[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
