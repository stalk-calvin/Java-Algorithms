public class BFS2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> level = new ArrayList<>();
        List<TreeNode> current = new ArrayList<>();
        level.add(root.val);
        current.add(root);
        while(!level.isEmpty()) {
            result.add(0, level);
            List<TreeNode> loop = current;
            level = new ArrayList<>();
            current = new ArrayList<>();
            for (TreeNode n : loop) {
                if (n.left != null) {
                    current.add(n.left);
                    level.add(n.left.val);
                }
                if (n.right != null) {
                    current.add(n.right);
                    level.add(n.right.val);
                }
            }
        }
        return result;
    }
}
