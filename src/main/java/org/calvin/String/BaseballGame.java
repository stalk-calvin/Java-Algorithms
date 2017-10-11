/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

public class BaseballGame {
    public int calPoints(String[] ops) {
        int sum = 0;
        int valid[] = new int[ops.length];
        int v = -1;
        for (String op : ops) {
            if (op.charAt(0) == '+') {
                int p = 0;
                if (v > 0) {
                    p = (valid[v] + valid[v - 1]);
                }
                v++;
                valid[v] = p;
                sum += p;
            } else if (op.charAt(0) == 'C') {
                if (v > -1) {
                    sum -= valid[v];
                    v--;
                }
            } else if (op.charAt(0) == 'D') {
                if (v > -1) {
                    int d = 2 * valid[v];
                    v++;
                    valid[v] = d;
                    sum += d;
                }
            } else {
                int num = Integer.parseInt(op);
                v++;
                valid[v] = num;
                sum += num;
            }
        }
        return sum;
    }
}
