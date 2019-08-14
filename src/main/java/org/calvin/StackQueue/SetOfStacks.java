package org.calvin.StackQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SetOfStacks {
    private int capacity;
    List<Stack<Integer>> stacks;
    Stack<Integer> lastStack;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
        this.stacks = new ArrayList<>();
        this.lastStack = new Stack<>();
    }

    public void push(int item) {
        if (isFull()) {
            stacks.add(lastStack);
            lastStack = new Stack<>();
        }
        lastStack.push(item);
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            if (stacks.size() == 0) {
                throw new Exception("Empty Stack!");
            }
            lastStack = stacks.remove(stacks.size() - 1);
        }
        return lastStack.pop();
    }

    public boolean isEmpty() {
        return lastStack.size() == 0;
    }

    public boolean isFull() {
        return lastStack.size() == capacity;
    }
}
