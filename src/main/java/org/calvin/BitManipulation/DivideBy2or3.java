package org.calvin.BitManipulation;

public class DivideBy2or3 {
    public int add(int x, int y)
    {
        while (x > 0) {
            int t = (x & y) << 1;
            y ^= x;
            x = t;
        }
        return y;
    }

//    public static long addRecursive(long a, long b) {
//        long carry = (a & b) << 1;
//        long sum = (a ^ b);
//        return carry == 0 ? sum : addRecursive(carry, sum);
//    }

    public int divideby2or3(int num, int x)
    {
        if (x == 2) {
            return num >> 1;
        }

        int sum = 0;
        while (num > x) {
            sum = add(num >> 2, sum);
            num = add(num >> 2, num & x);
        }

        if (num == x)
            sum = add(sum, 1);

        return sum;
    }
}
