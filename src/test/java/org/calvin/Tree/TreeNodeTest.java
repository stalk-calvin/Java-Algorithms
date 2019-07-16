/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Slf4j
public class TreeNodeTest {
    TreeNode fixture;

    @Before
    public void setUp() {

        fixture = new TreeNode(10);
        createTree(fixture);
    }

    @Test
    public void shouldGetSize() {
        assertEquals(7, fixture.size() + 1);
    }

    @Test
    public void shouldCheckAsBST() {
        assertTrue(fixture.checkBST(fixture));
    }

    @Test
    public void shouldNotBeBSTOfLeft() {
        fixture.getLeft().getLeft().setLeft(new TreeNode(60));
        fixture.setRight(null);
        assertFalse(fixture.checkBST(fixture));
    }

    @Test
    public void shouldNotBeBSTOfRight() {
        fixture = new TreeNode(0);
        fixture.setRight(new TreeNode(-1));
        fixture.setLeft(null);
        assertFalse(fixture.checkBST(fixture));
    }

    @Test
    public void shouldGetHeight() {
        assertEquals(3, fixture.height());
    }

    @Test
    public void shouldFindNode() {
        assertEquals(new TreeNode(12), fixture.find(12));
    }

    @Test
    public void shouldNotFindNode() {
        assertEquals(null, fixture.find(119));
    }

    @Test
    public void shouldCreateMinimalBST() {
        int[] input = {3,5,7,10,12,15,20};
        assertEquals(fixture, TreeNode.createMinimalBST(input));
    }

    @Test
    public void shouldPrintTree() {
        //for coverage sake
        fixture.print();
    }

    private void createTree(TreeNode root) {
        root.insertInOrder(5);
        root.insertInOrder(15);
        root.insertInOrder(3);
        root.insertInOrder(7);
        root.insertInOrder(12);
        root.insertInOrder(20);
    }

}
