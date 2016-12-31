package org.calvin.Numbers;

public class SumOfFibonacci {
    public static int sumOfFib(int n) {
        int n1 = 0;
        int n2 = 1;
        int f = 1;
        int sum = 0;
        while (f <= n) {
            sum += f;
            f = n1 + n2;
            n1 = n2;
            n2 = f;
        }
        return sum;
    }

    public static int sumOfOddFib(int n) {
        int n1 = 0;
        int n2 = 1;
        int f = 1;
        int sum = 0;
        while (f <= n) {
            if (f % 2 != 0) {
                sum += f;
            }
            f = n1 + n2;
            n1 = n2;
            n2 = f;
        }
        return sum;
    }
}
