/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

public class PerfectSquare {
    public boolean isPerfectSquare(int num) {

        if (num == 1)
            return true;

        long low = 1, high = num / 2, mid = 0;

        long nums = (long) num;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if ((mid * mid) == nums)
                return true;
            else if ((mid * mid) < nums)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }
}
