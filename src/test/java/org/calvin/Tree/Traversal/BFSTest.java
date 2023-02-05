/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree.Traversal;

import com.google.common.collect.Lists;
import org.calvin.Tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BFSTest {
    private BFS fixture;

    @BeforeEach
    public void setUp() {
        fixture = new BFS();
    }

    @Test
    public void shouldFindBFS() {
        int[] array = {2, 3, 4, 5, 6, 7, 8};
        TreeNode root = TreeNode.createMinimalBST(array);
        List<Integer> actual = fixture.findBFS(root);
        List<Integer> expected = Lists.newArrayList(5, 3, 7, 2, 4, 6, 8);
        assertEquals(expected,actual);
    }

}
