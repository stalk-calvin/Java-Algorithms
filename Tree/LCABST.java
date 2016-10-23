public class LCABST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val < p.val && root.val < q.val) { //search right
                root = root.right;
            }else if (root.val > p.val && root.val > q.val) { //search left
                root = root.left;
            }else { //found
                return root;
            }
        }
        return root;
    }
}
