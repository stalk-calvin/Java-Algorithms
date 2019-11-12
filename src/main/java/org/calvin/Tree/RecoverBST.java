package org.calvin.Tree;

public class RecoverBST {
    TreeNode[] range = {new TreeNode(Integer.MIN_VALUE), new TreeNode(Integer.MAX_VALUE)};
    public void recoverBST(TreeNode root) {
        if (root == null) {
            return;
        }
        swapToRecover(null, root, new TreeNode[]{new TreeNode(Integer.MIN_VALUE), new TreeNode(Integer.MAX_VALUE)});
    }

    private boolean swapToRecover(TreeNode p, TreeNode q, TreeNode[] range) {
        if (q == null) {
            return false;
        }
        if (p != null) {
            if (p == q.getLeft() && q.getVal() > p.getVal()) {
                swap(p, q);
                return true;
            }
            if (p == q.getRight() && q.getVal() < p.getVal()) {
                swap(p, q);
                return true;
            }
        }

        if (q.getVal() < range[0].val) {
            swap(q, range[0]);
            return true;
        }

        if (q.getVal() > range[1].val) {
            swap(q, range[1]);
            return true;
        }

        TreeNode[] old = {range[0], range[1]};
        range[1] = q;
        if (swapToRecover(p, q, range)) return true;
        range[0] = q;
        range[1] = old[1];
        boolean right = swapToRecover(p, q, range);
        range[0] = old[0];
        return right;
    }

    private void swap(TreeNode a, TreeNode b) {
        int tmp = a.getVal();
        a.setVal(b.getVal());
        b.setVal(tmp);
    }
}
