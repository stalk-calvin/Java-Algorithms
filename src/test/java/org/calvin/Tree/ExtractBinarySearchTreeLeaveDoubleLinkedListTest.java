package org.calvin.Tree;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtractBinarySearchTreeLeaveDoubleLinkedListTest {
    private ExtractBinaryTreeLeaveDoubleLinkedList fixture;
    @Before
    public void setUp() {
        fixture = new ExtractBinaryTreeLeaveDoubleLinkedList();
    }
    @Test
    public void traverseTree() throws Exception {
        int[] input = {1,2,3};
        TreeNode root1 = AssortedMethods.createTreeFromArray(input);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.left.left.left = new TreeNode(7);
        root1.left.left.right = new TreeNode(8);
        root1.right.right = new TreeNode(6);
        root1.right.right.left = new TreeNode(9);
        root1.right.right.right = new TreeNode(10);
        root1.print();
        TreeNode result = fixture.traverseTree(root1);
        printDLL(fixture.head);
        System.out.println("");
        result.print();

    }

    private void printDLL(TreeNode head)
    {
        TreeNode last = null;
        while (head != null)
        {
            System.out.print(head.val + " ");
            last = head;
            head = head.right;
        }
    }
}

