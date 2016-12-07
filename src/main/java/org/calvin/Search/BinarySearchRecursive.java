/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Search;

import java.util.List;

public class BinarySearchRecursive<T extends Comparable<T>> implements SearchInterface<T> {
    @Override
    public int indexOf(List<T> elements, T target) {
        if (elements == null || target == null)
            return -1;
        return indexOf(elements, target, 0, elements.size() - 1);
    }

    private int indexOf(List<T> elements, T target, int min, int max) {
        if (min <= max) {
            int mid = (max + min) >> 1;
            if (elements.get(mid).equals(target))
                return mid;
            if (isLessThan(elements.get(mid), target))
                return indexOf(elements, target, mid + 1, max);
            return indexOf(elements, target, min, mid - 1);
        }
        return -1;
    }

    private boolean isLessThan(T first, T second) {
        return (first.compareTo(second) < 0);
    }
}