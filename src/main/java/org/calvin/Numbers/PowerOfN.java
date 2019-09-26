/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

public class PowerOfN {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n < 0) {
            n = -(n + 1);
            return 1 / (x * myPow(x, n));
        }
        double t = myPow(x,n/2);
        if(n%2 == 1) return x*t*t;
        else return t*t;
    }

    public double pow(double x, int n) {
        boolean negative = false;
        if (n < 0) {
            negative = true;
        }
        n = Math.abs(n);

        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }

        double result = 0;
        if (n % 2 == 0) {
            result = pow(x, n / 2) * pow(x, n / 2);
        } else {
            result = x * pow(x, n-1);
        }

        if (negative) {
            result = 1.0/result;
        }

        return result;
    }
}
