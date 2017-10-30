/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BinarySearch;

import java.util.concurrent.ThreadLocalRandom;

class VersionControl {
    public final int random;
    public VersionControl(int n) {
        this.random = ThreadLocalRandom.current().nextInt(1, n+1);
    }
    public int isBadVersion(int mid) {
        return Integer.compare(random, mid);
    }
}

public class FirstBadVersion extends VersionControl {
    private int n;
    public FirstBadVersion(int n) {
        super(n);
        this.n = n;
    }

    public boolean findBadVersion() {
        int first = 1;
        int last = n;
        int mid = first + (last - first) / 2;
        while (first <= last) {
            int i = isBadVersion(mid);
            if (i == 0) return true;

            if (i < 0){
                last = mid -1;
            } else {
                first = mid + 1;
            }
            mid = first + (last - first) / 2;
        }
        return false;
    }
}
