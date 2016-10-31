package org.calvin.BinarySearch;

import java.util.concurrent.ThreadLocalRandom;

class VersionControl {
    public final int random;
    public VersionControl(int n) {
        this.random = ThreadLocalRandom.current().nextInt(0, n + 1);
    }
    public boolean isBadVersion(int mid) {
        return random == mid;
    }
}

public class FirstBadVersion extends VersionControl {
    private int n;
    public FirstBadVersion(int n) {
        super(n);
        this.n = n;
    }

    public int firstBadVersion() {
        if (n < 2) return n;
        int first = 1;
        int last = n;
        while (first < last) {
            int mid = first + (last - first) / 2;
            boolean bad = isBadVersion(mid);
            if (bad) {
                last = mid;
            } else {
                first = mid + 1;
            }

        }
        return first;
    }

    public static void main(String[] args) {
        FirstBadVersion firstBadVersion = new FirstBadVersion(10);
        System.out.println(firstBadVersion.firstBadVersion());
    }
}
