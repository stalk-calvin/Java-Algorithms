/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Search;

import java.util.List;

public class BinarySearch<T extends Comparable<T>> implements SearchInterface<T> {
    @Override
    public int indexOf(List<T> elements, T target) {
        int first = 0;
        int last = elements.size() - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (target.equals(elements.get(mid))) {
                return mid;
            }

            if (isLessThan(target, elements.get(mid))) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    private boolean isLessThan(T first, T second) {
        return (first.compareTo(second) < 0);
    }
}
