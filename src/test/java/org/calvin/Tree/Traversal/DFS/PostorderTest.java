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

public class PostorderTest {
    private Postorder fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Postorder();
    }

    @Test
    public void shouldFindPostorder() {
        int[] array = {2, 3, 4, 5, 6, 7, 8};
        TreeNode root = TreeNode.createMinimalBST(array);
        List<Integer> actual = fixture.findPostorder(root);
        List<Integer> expected = Lists.newArrayList(2,4,3,6,8,7,5);
        assertEquals(expected,actual);
    }

}
