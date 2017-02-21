/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.Utils.BTreePrinter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude={"size", "left", "right"})
@Data
public class TreeNode {
    public int val;
    private int size;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }
    public Integer last_printed = null;

    private void setLeftChild(TreeNode left) {
        this.left = left;
    }

    private void setRightChild(TreeNode right) {
        this.right = right;
    }

    public void insertInOrder(int d) {
        if (d <= val) {
            if (left == null) {
                setLeftChild(new TreeNode(d));
            } else {
                left.insertInOrder(d);
            }
        } else {
            if (right == null) {
                setRightChild(new TreeNode(d));
            } else {
                right.insertInOrder(d);
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public boolean checkBST(TreeNode n) {
        if (n == null) {
            return true;
        }

        // Check / recurse left
        if (!checkBST(n.left)) {
            return false;
        }

        // Check current
        if (last_printed != null && n.val <= last_printed) {
            return false;
        }
        last_printed = n.val;

        // Check / recurse right
        if (!checkBST(n.right)) {
            return false;
        }
        return true;
    }

    public int height() {
        int leftHeight = left != null ? left.height() : 0;
        int rightHeight = right != null ? right.height() : 0;
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public TreeNode find(int d) {
        if (d < val) {
            return left != null ? left.find(d) : null;
        } else if (d > val) {
            return right != null ? right.find(d) : null;
        } else {
            return this;
        }
    }

    public static TreeNode createMinimalBST(int arr[], int start, int end){
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.setLeftChild(createMinimalBST(arr, start, mid - 1));
        n.setRightChild(createMinimalBST(arr, mid + 1, end));
        return n;
    }

    public static TreeNode createMinimalBST(int array[]) {
        return createMinimalBST(array, 0, array.length - 1);
    }

    public void print() {
        BTreePrinter.printNode(this);
    }
}
