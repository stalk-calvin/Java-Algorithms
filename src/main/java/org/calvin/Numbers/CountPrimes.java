/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import java.util.ArrayList;
import java.util.List;

public class CountPrimes {
    public List<Integer> countPrimes(int n) {
        List<Integer> result = new ArrayList<>();
        boolean[] m = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (m[i])
                continue;

            result.add(i);
            for (int j = i; j < n; j = j + i)
                m[j] = true;
        }

        return result;
    }
}
