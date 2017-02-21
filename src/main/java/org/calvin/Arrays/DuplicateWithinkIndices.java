/*
 * Copyright Calvin Lee Since 2016
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWithinkIndices {

    public boolean duplicate(int arr[], int k) {
        Set<Integer> visited = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (visited.contains(arr[i])) {
                return true;
            }
            if (i >= k) {
                visited.remove(arr[i - k]);
            }
            visited.add(arr[i]);
        }
        return false;
    }
}
