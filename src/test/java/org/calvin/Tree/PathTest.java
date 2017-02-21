/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PathTest {
    Path fixture;

    @Before
    public void setUp() {
        fixture = new Path();
    }

    @Test
    public void shouldShowBinaryTreePaths() {
        int[] input = {1,2,3,4,5,6,7,8};
        TreeNode root = AssortedMethods.createTreeFromArray(input);
        List<String> expected = new ArrayList<String>(){{
            add("1->2->4->8");
            add("1->2->5");
            add("1->3->6");
            add("1->3->7");
        }};
        assertEquals(expected, fixture.binaryTreePaths(root));
    }

}
