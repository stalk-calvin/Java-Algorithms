/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FindMinNumberAtPositionTest {
    private FindMinNumberAtPosition fixture;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        fixture = new FindMinNumberAtPosition();
    }

    @Test
    public void shouldFindNthMin() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        TreeNode actual = fixture.findNthMin(root, 3);
        assertEquals(3, actual.getVal());
    }

    @Test
    public void shouldNotFindNthMinOnNullTree() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("cannot process null binary trees");
        TreeNode actual = fixture.findNthMin(null, 3);
        assertEquals(3, actual.getVal());
    }

    @Test
    public void shouldNotFindNthMinOnNegativePosition() {
        int position = -3;
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("cannot process negative positions, " + position);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        TreeNode actual = fixture.findNthMin(root, position);
        assertEquals(3, actual.getVal());
    }

    @Test
    public void shouldNotFindNthMinWhenPosGreaterThanInput() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Min position is larger than tree size!");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        TreeNode actual = fixture.findNthMin(root, array.length+1);
        assertEquals(3, actual.getVal());
    }
}
