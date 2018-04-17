package org.calvin.terview.epi;

import org.calvin.LinkedList.ListNode;
import org.calvin.Tree.TreeNode;

import java.util.*;

public class Ch5StacksAndQueues {
    public void printLinkedListInReverse(ListNode head) {
        Stack<Integer> nodes = new Stack<>();
        while (head != null) {
            nodes.push(head.getVal());
            head = head.getNext();
        }
        while (!nodes.empty()) {
            System.out.println(nodes.pop());
        }
    }

    private class ElementWithCachedMax {
        public Integer element;
        public Integer max;

        public ElementWithCachedMax(Integer element, Integer max) {
            this.element = element;
            this.max = max;
        }
    }

    public class StackWithCachedMax {
        // Stores (element, cached maximum) pair.
        private Deque<ElementWithCachedMax> elementWithCachedMax
                = new LinkedList<>();

        public boolean empty() {
            return elementWithCachedMax.isEmpty();
        }

        public Integer max() {
            if (empty()) {
                throw new IllegalStateException("max(): empty stack");
            }
            return elementWithCachedMax.peek().max;
        }

        public Integer pop() {
            if (empty()) {
                throw new IllegalStateException("pop(): empty stack");
            }
            return elementWithCachedMax.removeFirst().element;
        }

        public void push(Integer x) {
            elementWithCachedMax.addFirst(
                    new ElementWithCachedMax(x, Math.max(x, empty() ? x : max())));
        }
    }

    private class MaxWithCount {
        public Integer max;
        public Integer count;

        public MaxWithCount(Integer max, Integer count) {
            this.max = max;
            this.count = count;
        }
    }

    public class StackMaxWithCount {
        private Deque<Integer> element = new LinkedList<>();
        private Deque<MaxWithCount> cachedMaxWithCount = new LinkedList<>();

        public boolean empty() {
            return element.isEmpty();
        }

        public Integer max() {
            if (empty()) {
                throw new IllegalStateException("max(): empty stack");
            }
            return cachedMaxWithCount.peekFirst().max;
        }

        public Integer pop() {
            if (empty()) {
                throw new IllegalStateException("pop(): empty stack");
            }
            Integer popElement = element.removeFirst();
            if (popElement.equals(cachedMaxWithCount.peekFirst().max)) {
                cachedMaxWithCount.peekFirst().count
                        = cachedMaxWithCount.peekFirst().count - 1;
                if (cachedMaxWithCount.peekFirst().count.equals(0)) {
                    cachedMaxWithCount.removeFirst();
                }
            }
            return popElement;
        }

        public void push(Integer x) {
            element.addFirst(x);
            if (!cachedMaxWithCount.isEmpty()) {
                if (Integer.compare(x, cachedMaxWithCount.peekFirst().max) == 0) {
                    cachedMaxWithCount.peekFirst().count
                            = cachedMaxWithCount.peekFirst().count + 1;
                } else if (Integer.compare(x, cachedMaxWithCount.peekFirst().max) > 0) {
                    cachedMaxWithCount.addFirst(new MaxWithCount(x, 1));
                }
            } else {
                cachedMaxWithCount.addFirst(new MaxWithCount(x, 1));
            }
        }
    }

    public class QueueWithMaxIntro {
        private Deque<Integer> data = new LinkedList<>();

        public void enqueue(Integer x) {
            data.add(x);
        }

        public Integer dequeue() {
            return data.removeFirst();
        }

        public Integer max() {
            if (!data.isEmpty()) {
                return Collections.max(data);
            }
            throw new IllegalStateException("cannot perform max() on empty queue");
        }
    }

    public static List<List<Integer>> binaryTreeDepthOrder(
            TreeNode tree) {
        Queue<TreeNode> currDepthNodes = new LinkedList<>();
        currDepthNodes.add(tree);
        List<List<Integer>> result = new ArrayList<>();
        while (!currDepthNodes.isEmpty()) {
            Queue<TreeNode> nextDepthNodes = new LinkedList<>();
            List<Integer> thisLevel = new ArrayList<>();
            while (!currDepthNodes.isEmpty()) {
                TreeNode curr = currDepthNodes.poll();
                if (curr != null) {
                    thisLevel.add(curr.getVal());
                    nextDepthNodes.add(curr.left);
                    nextDepthNodes.add(curr.right);
                }
            }
            if (!thisLevel.isEmpty()) {
                result.add(thisLevel);
            }
            currDepthNodes = nextDepthNodes;
        }
        return result;
    }
}
