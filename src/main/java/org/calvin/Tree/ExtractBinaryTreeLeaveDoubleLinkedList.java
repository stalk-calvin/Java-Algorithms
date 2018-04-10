package org.calvin.Tree;

public class ExtractBinaryTreeLeaveDoubleLinkedList {
    TreeNode head;
    TreeNode prevToTail;
    public TreeNode traverseTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            //we need to add to the DLL
            if (head == null) {
                head = root;
                prevToTail = root;
            }
            else {
                TreeNode newTail = new TreeNode(root.val);
                prevToTail.right = newTail;
                newTail.left = prevToTail;
                prevToTail = newTail;
            }
            return null;
        }
        root.left = traverseTree(root.left);
        root.right = traverseTree(root.right);
        return root;
    }
}
