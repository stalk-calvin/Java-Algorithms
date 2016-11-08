/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import com.google.common.collect.Lists;
import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BFSTest {
    BFS fixture;

    @Before
    public void setUp() {
        fixture = new BFS();
    }

    @Test
    public void shouldGetBFSLevelOrder() {
        int[] input = {1,2,3,4,5,6,7,8};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        List<List<Integer>> expected = new ArrayList<List<Integer>>(){{
            add(Lists.newArrayList(1));
            add(Lists.newArrayList(2,3));
            add(Lists.newArrayList(4,5,6,7));
            add(Lists.newArrayList(8));
        }};
        assertEquals(expected, fixture.levelOrder(root));
    }

}