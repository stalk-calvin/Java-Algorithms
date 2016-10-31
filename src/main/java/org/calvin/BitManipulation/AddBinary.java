package org.calvin.BitManipulation;

import java.util.Arrays;

public class AddBinary {
    public String addBinary(String a, String b) {
        long aToDigit = toDigit(a);
        System.out.println(aToDigit);
        long bToDigit = toDigit(b);
        System.out.println(bToDigit);
        return Long.toBinaryString(aToDigit + bToDigit);
    }

    public long toDigit(String binary) {
        char[] binaryInChar = binary.toCharArray();
        if (binary.length() < 1) {
            return 0;
        }
        long binaryDigit = 0;
        System.out.println(Arrays.toString(binaryInChar));
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
