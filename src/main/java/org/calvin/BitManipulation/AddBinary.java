package org.calvin.BitManipulation;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

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
}
