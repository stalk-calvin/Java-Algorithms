/*
 * Copyright Calvin Lee Since 2016. 
 * All Rights Reserved.
 */

package org.calvin.Tree.Traversal.DFS;

import com.google.common.collect.Lists;
import org.calvin.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InorderTest {
    private Inorder fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Inorder();
    }

    @Test
    public void shouldFindInorder() {
        int[] array = {2, 3, 4, 5, 6, 7, 8};
        TreeNode root = TreeNode.createMinimalBST(array);
        List<Integer> actual = fixture.findInorder(root);
        List<Integer> expected = Lists.newArrayList(2,3,4,5,6,7,8);
        assertEquals(expected,actual);
    }

}
