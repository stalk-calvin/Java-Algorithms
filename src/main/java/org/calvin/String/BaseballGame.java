/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import java.util.List;
import java.util.Stack;

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

    public int getSumBaseball(List<String> input) {
        Stack<Integer> tracker = new Stack<>();
        int sum = 0;
        for (String n : input) {
            if (n.equals("+")) {
                if (tracker.size() > 1) {
                    int first = tracker.pop();
                    int second = tracker.peek();
                    sum += first + second;
                    tracker.push(first);
                    tracker.push(first + second);
                }
            } else if (n.equals("D")) {
                if (tracker.size() > 0) {
                    int tmp = tracker.peek() * 2;
                    tracker.push(tmp);
                    sum += tmp;
                }
            } else if (n.equals("C")) {
                if (tracker.size() > 0) {
                    int tmp = tracker.pop();
                    sum -= tmp;
                }
            } else {
                int num = Integer.parseInt(n);
                tracker.push(num);
                sum += num;
            }
        }
        return sum;
    }
}
