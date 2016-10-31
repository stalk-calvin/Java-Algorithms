package org.calvin.Numbers;

public class FactorialTrailingZeros {
    public int trailingZeroes(int n) {
        int num;
        for (num = 0; n != 0; n /= 5, num += n) ;
        return num;
    }
}
