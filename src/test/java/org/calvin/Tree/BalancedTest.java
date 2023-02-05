/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class BalancedTest {
    Balanced fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Balanced();
    }

    @Test
    public void shouldTreeBeBalanced() {
        int[] input = {1,5,6};
        TreeNode root = new TreeNode(4);
        for (int i : input) {
            root.insertInOrder(i);
        }
        root.left.left = new TreeNode(1);
        root.left.left.left = new TreeNode(1);
        root.right.right.right = new TreeNode(1);
        assertFalse(fixture.isBalanced(root));
    }

    @Test
    public void shouldTreeNotBeBalanced() {
        int[] input = {2,3,5,7,8,0,9};
        TreeNode root = new TreeNode(4);
        for (int i : input) {
            root.insertInOrder(i);
        }
        assertFalse(fixture.isBalanced(root));
    }


}
