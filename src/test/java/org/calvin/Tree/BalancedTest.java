/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedTest {
    Balanced fixture;

    @Before
    public void setUp() {
        fixture = new Balanced();
    }

    @Test
    public void shouldTreeBeBalanced() {
        int[] input = {1,2,5,6};
        TreeNode root = new TreeNode(4);
        for (int i : input) {
            root.insertInOrder(i);
        }
        assertTrue(fixture.isBalanced(root));
    }

    @Test
    public void shouldTreeNotBeBalanced() {
        int[] input = {2,3,4};
        TreeNode root = new TreeNode(1);
        for (int i : input) {
            root.insertInOrder(i);
        }
        assertFalse(fixture.isBalanced(root));
    }


}
