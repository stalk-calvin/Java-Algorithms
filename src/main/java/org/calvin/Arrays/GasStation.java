/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[]cost) {
        int min_ind = 0;
        int min_val = 0;
        int val = 0;
        for (int i = 0; i < gas.length; i++) {
            val += gas[i] - cost[i];
            if (val < min_val) {
                min_ind = i + 1;
                min_val = val;
            }
        }
        if (val < 0) {
            return -1;
        }
        return min_ind % gas.length;
    }
}
