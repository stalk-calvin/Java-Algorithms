public class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        List<TreeNode> current = new ArrayList<>();
        List<Integer> currentData = new ArrayList<>();
        currentData.add(root.val);
        current.add(root);
        while(!current.isEmpty()) {
            result.add(currentData);
            List<TreeNode> loop = current;
            current = new ArrayList<>();
            currentData = new ArrayList<>();
            for (TreeNode a : loop) {
                if (a.left != null) {
                    current.add(a.left);
                    currentData.add(a.left.val);
                }
                if (a.right != null) {
                    current.add(a.right);
                    currentData.add(a.right.val);
                }
            }
        }
        return result;
    }
}
