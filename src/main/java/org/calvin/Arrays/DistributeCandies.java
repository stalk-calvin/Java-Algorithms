/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        if (candies.length % 2 != 0) return -1;
        return Math.min(candies.length / 2, Arrays.stream(candies).boxed().collect(Collectors.toSet()).size());
    }
}
