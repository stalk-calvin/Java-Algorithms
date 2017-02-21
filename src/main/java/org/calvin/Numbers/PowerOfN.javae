/*
 * Copyright Calvin Lee - 2016.
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
}
