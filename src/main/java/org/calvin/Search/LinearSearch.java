/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Search;

import java.util.List;

public class LinearSearch<T> implements SearchInterface<T> {
    @Override
    public int indexOf(List<T> elements, T target) {
        if (elements != null && target != null) {
            for (int i = 0; i < elements.size(); i++) {
                if (target.equals(elements.get(i)))
                    return i;
            }
        }
        return -1;
    }
}