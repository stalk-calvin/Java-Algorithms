package org.calvin.Tree;

public class CalculateExpression {
    public static class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;

        TreeNode(char val) {
            this.val = val;
        }
    }

    public int calculate(TreeNode root) throws Exception {
        if (root == null) {
            return 0;
        } else {
            char curr = root.val;
            if (Character.isDigit(curr)) {
                return Integer.parseInt(String.valueOf(curr));
            } else {
                int left = calculate(root.left);
                int right = calculate(root.right);
                return op(curr, left, right);
            }
        }
    }

    private int op(char op, int l, int r) throws Exception {
        if (op == '+') return l+r;
        else if (op == '-') return l-r;
        else if (op == '/') return l/r;
        else if (op == '*') return l*r;
        else {
            throw new Exception("Unsupported Type!");
        }
    }
}
