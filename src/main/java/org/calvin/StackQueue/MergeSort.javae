/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.StackQueue;

import java.util.Stack;

public class MergeSort {
    public Stack<Integer> mergeSort(Stack<Integer> inStack) {
        if (inStack.size() <= 1) {
            //Base Condition
            return inStack;
        }

        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();
        int count = 0;
        while (inStack.size() != 0) {
            count++;
            if (count % 2 == 0) {
                left.push(inStack.pop());
            } else {
                right.push(inStack.pop());
            }
        }

        left = mergeSort(left);
        right = mergeSort(right);

        while (left.size() > 0 || right.size() > 0) {
            if (left.size() == 0) {
                inStack.push(right.pop());
            } else if (right.size() == 0) {
                inStack.push(left.pop());
            } else if (right.peek().compareTo(left.peek()) <= 0) {
                inStack.push(left.pop());
            } else {
                inStack.push(right.pop());
            }
        }

        Stack<Integer> reverseStack = new Stack<>();
        while (inStack.size() > 0) {
            reverseStack.push(inStack.pop());
        }

        return reverseStack;
    }
}
