package org.calvin.Tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedEfficientTest {
    BalancedEfficient fixture;

    @BeforeEach
    public void setUp() {
        fixture = new BalancedEfficient();
    }

    @Test
    public void shouldTreeBeBalanced() {
        int[] input = {1,2,5,6};
        TreeNode root = new TreeNode(4);
        for (int i : input) {
            root.insertInOrder(i);
        }
        root.left.left = new TreeNode(1);
        root.left.left.left = new TreeNode(0);
        assertTrue(fixture.checkBalanced(root).balanced);
    }

    @Test
    public void shouldTreeNotBeBalanced() {
        int[] input = {2,3,4};
        TreeNode root = new TreeNode(1);
        for (int i : input) {
            root.insertInOrder(i);
        }
        assertFalse(fixture.checkBalanced(root).balanced);
    }

}