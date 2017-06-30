/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.BitManipulation;

public class NumberCompliment {
    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        // Taking 2's compliment and apply mask found above
        // EX: num = 5 which is 101
        //   - mask = 4 is the highest one bit, move one left = 8, minus 1 = 7
        //   - 2's complement = 010 (with sign bit, but we will ignore that)
        //   - 010 & 111 = 010 (sign bits ignored)
        num = ~num;
        return num & mask;
    }
}
