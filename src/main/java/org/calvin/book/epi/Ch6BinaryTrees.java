package org.calvin.terview.epi;

import org.calvin.Tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ch6BinaryTrees {
    public static void treeTraversal(TreeNode root) {
        if (root != null) {
            // Preorder: Processes the root before the traversals of left and right // children.
            System.out.println("Preorder: " + root.val);
            treeTraversal(root.left);
            // Inorder: Processes the root after the traversal of left child and // before the traversal of right child.
            System.out.println("Inorder: " + root.val);
            treeTraversal(root.right);
            // Postorder: Processes the root after the traversals of left and right // children.
            System.out.println("Postorder: " + root.val);
        }
    }

    private static class BalanceStatusWithHeight {
        public boolean balanced;
        public int height;

        public BalanceStatusWithHeight(boolean balanced, int height) {
            this.balanced = balanced;
            this.height = height;
        }
    }

    public static boolean isBalanced(TreeNode tree) {
        return checkBalanced(tree).balanced;
    }

    private static BalanceStatusWithHeight checkBalanced(TreeNode tree) {
        if (tree == null) {
            return new BalanceStatusWithHeight(true, -1); // Base case.
        }
        BalanceStatusWithHeight leftResult = checkBalanced(tree.left);
        if (!leftResult.balanced) {
            return leftResult; // Left subtree is not balanced.
        }
        BalanceStatusWithHeight rightResult = checkBalanced(tree.right);
        if (!rightResult.balanced) {
            return rightResult; // Right subtree is not balanced.
        }
        boolean isBalanced = Math.abs(leftResult.height - rightResult.height) <= 1;
        int height = Math.max(leftResult.height, rightResult.height) + 1;
        return new BalanceStatusWithHeight(isBalanced, height);
    }

    public static List<Integer> intersectTwoSortedArrays(List<Integer> A, List<Integer> B) {
        List<Integer> intersectionAB = new ArrayList<>();
        for (int i = 0; i < A.size(); ++i) {
            if ((i == 0 || !A.get(i).equals(A.get(i - 1))) && B.contains(A.get(i))) {
                intersectionAB.add(A.get(i));
            }
        }
        return intersectionAB;
    }

    public static List<Integer> intersectTwoSortedArraysBS(List<Integer> A, List<Integer> B) {
        List<Integer> intersectionAB = new ArrayList<>();
        for (int i = 0; i < A.size(); ++i) {
            if ((i == 0 || !A.get(i).equals(A.get(i - 1)))
                    && Collections.binarySearch(B, A.get(i)) >= 0) {
                intersectionAB.add(A.get(i));
            }
        }
        return intersectionAB;
    }

    public static List<Integer> intersectTwoSortedArraysEfficient(List<Integer> A, List<Integer> B) {
        List<Integer> intersectionAB = new ArrayList<>();
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j)) && (i == 0 || !A.get(i).equals(A.get(i - 1)))) {
                intersectionAB.add(A.get(i));
                ++i;
                ++j;
            } else if (A.get(i) < B.get(j)) {
                ++i;
            } else { // A.get(i) > B.get(j).
                ++j;
            }
        }
        return intersectionAB;
    }

    public static class Event {
        public int start, finish;

        public Event(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    private static class Endpoint implements Comparable<Endpoint> {
        public int time;
        public boolean isStart;

        public int compareTo(Endpoint e) {
            if (time != e.time) {
                return Integer.compare(time, e.time);
            }
            // If times are equal, an endpoint that starts an interval comes first.
            return isStart && !e.isStart ? -1 : !isStart && e.isStart ? 1 : 0;
        }

        Endpoint(int t, boolean is) {
            time = t;
            isStart = is;
        }
    }

    public static int findMaxSimultaneousEvents(List<Event> A) { // Builds an array of all endpoints.
        List<Endpoint> E = new ArrayList<>();
        for (Event event : A) {
            E.add(new Endpoint(event.start, true));
            E.add(new Endpoint(event.finish, false));
        }
        // Sorts the endpoint array according to the time, breaking ties // by putting start times before end times.
        Collections.sort(E);
        // Track the number of simultaneous events, and record the maximum // number of simultaneous events.
        int maxNumSimultaneousEvents = 0, numSimultaneousEvents = 0;
        for (Endpoint endpoint : E) {
            if (endpoint.isStart) {
                ++numSimultaneousEvents;
                maxNumSimultaneousEvents
                        = Math.max(numSimultaneousEvents,maxNumSimultaneousEvents);
            } else {
                --numSimultaneousEvents;
            }
        }
        return maxNumSimultaneousEvents;
    }
}
