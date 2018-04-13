package org.calvin.Tree;

import com.google.common.collect.Lists;
import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LeftViewOfBTTest {
    private LeftViewOfBT fixture;
    private static int[] input1 = {1,2,3,4,5,6,7};

    @Before
    public void setUp() throws Exception {
        fixture = new LeftViewOfBT();
    }

    @Test
    public void nullTreeShouldHaveNothing() throws Exception {
        List<Integer> result = fixture.getLeftView(null);
        assertEquals(Lists.newArrayList(), result);
    }

    @Test
    public void shouldFindLeftSideOfBinaryTree() throws Exception {
        List<Integer> expected = Lists.newArrayList(1,2,4);
        TreeNode t1 = AssortedMethods.createTreeFromArray(input1);
        List<Integer> result = fixture.getLeftView(t1);
        assertEquals(expected, result);
    }

}