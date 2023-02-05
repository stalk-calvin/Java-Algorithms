package org.calvin.Tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.calvin.Tree.CalculateExpression.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateExpressionTest {
    private CalculateExpression fixture;
    private TreeNode root = createTree();

    @BeforeEach
    public void setUp() throws Exception {
        fixture = new CalculateExpression();
    }

    @Test
    public void shouldCalculate() throws Exception {
        int actual = fixture.calculate(root);
        assertEquals(-4, actual);
    }

    private TreeNode createTree() {
        TreeNode root = new TreeNode('*');
        root.left = new TreeNode('-');
        root.right = new TreeNode( '+');
        root.left.left = new TreeNode('1');
        root.left.right = new TreeNode('2');
        root.right.left = new TreeNode('3');
        root.right.right = new TreeNode('/');
        root.right.right.left = new TreeNode('4');
        root.right.right.right = new TreeNode('4');

        return root;
    }
}