package org.calvin.Numbers;

public class SquareRoot {
    public int mySqrt(int x) {
        return mySqrt(x, 1, Integer.MAX_VALUE);
    }

    public int mySqrt(int x, int left, int right) {
        if (x == 0)
            return 0;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
        return 0;
    }
}
