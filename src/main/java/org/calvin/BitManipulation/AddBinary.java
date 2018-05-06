/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.BitManipulation;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddBinary {
    public String addBinary(String a, String b) {
        long aToDigit = toDigit(a);
        long bToDigit = toDigit(b);
        return Long.toBinaryString(aToDigit + bToDigit);
    }

    private long toDigit(String binary) {
        if (binary.length() < 1) {
            return 0;
        }
        char[] binaryInChar = binary.toCharArray();
        long binaryDigit = 0;
        log.info(Arrays.toString(binaryInChar));
        for (int i = binaryInChar.length - 1; i >= 0; i--) {
            if (binaryInChar[i] == '1') {
                if (i == binaryInChar.length - 1) {
                    binaryDigit += 1;
                } else {
                    binaryDigit += Math.pow(2, (binaryInChar.length - 1 - i));
                }
            }
        }
        return binaryDigit;
    }

    public String addBinaryNatural(String a, String b) {
        if (a == null) return b;
        if (b == null) return a;
        StringBuilder sb = new StringBuilder();
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;
        while (aLength >= 0 || bLength >= 0) {
            int sum = carry;
            if (aLength >= 0) sum += a.charAt(aLength) - '0';
            if (bLength >= 0) sum += b.charAt(bLength) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
            aLength--;
            bLength--;
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
