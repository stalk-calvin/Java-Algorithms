/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Search;

import java.util.List;

public interface SearchInterface<T> {
    int indexOf(List<T> elements, T target);
}
