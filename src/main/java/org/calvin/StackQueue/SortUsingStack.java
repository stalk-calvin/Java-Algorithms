/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import java.util.Stack;

public class SortUsingStack {
    public Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<Integer>();
        while (!s.isEmpty()) {
            /* Insert each element in s in sorted order into r. */
            int tmp = s.pop();
            while (!r.isEmpty() && r.peek() > tmp) {
                s.push(r.pop());
            }
            r.push(tmp);
        }

        return r;
    }

    public void sortUsingStackRecursively(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int val = s.pop();
            sortUsingStackRecursively(s);
            insert(s, val);
        }
    }

    private void insert(Stack<Integer> s, int val) {
        if (s.isEmpty() || val > s.peek()) {
            s.push(val);
        } else {
            int tmp = s.pop();
            insert(s, val);
            s.push(tmp);
        }
    }
}
