/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCABSTTest {
    LCABST fixture;

    @Before
    public void setUp() {
        fixture = new LCABST();
    }

    @Test
    public void shouldFindLowestCommonAncestorLeft() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        assertEquals(root.left, fixture.lowestCommonAncestor(root, root.left.left, root.left.right.right));
    }

    @Test
    public void shouldFindLowestCommonAncestorRight() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        assertEquals(root.right, fixture.lowestCommonAncestor(root, root.right.right, root.right.left));
    }

    @Test
    public void shouldReturnNullTree() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        assertEquals(null, fixture.lowestCommonAncestor(null, root.right.right, root.right.left));
    }

    @Test
    public void shouldFindLowestCommonAncestorMyWayLeft() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        assertEquals(root.left, fixture.lowestCommonAncestorMyWay(root, root.left.left, root.left.right.right));
    }

    @Test
    public void shouldFindLowestCommonAncestorMyWayRight() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        assertEquals(root.right, fixture.lowestCommonAncestorMyWay(root, root.right.right, root.right.left));
    }

    @Test
    public void shouldReturnNullTreeMyWay() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        assertEquals(null, fixture.lowestCommonAncestorMyWay(null, root.right.right, root.right.left));
    }
}
