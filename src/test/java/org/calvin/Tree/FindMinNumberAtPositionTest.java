/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMinNumberAtPositionTest {
    private FindMinNumberAtPosition fixture;

    @BeforeEach
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
        Exception exception =
                assertThrows(IllegalArgumentException.class, () ->
                    fixture.findNthMin(null, 3));
        assertEquals("cannot process null binary trees", exception.getMessage());
    }

    @Test
    public void shouldNotFindNthMinOnNegativePosition() {
        int position = -3;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        Exception exception =
                assertThrows(IllegalArgumentException.class, () ->
                    fixture.findNthMin(root, position));
        assertEquals("cannot process negative positions, " + position, exception.getMessage());
    }

    @Test
    public void shouldNotFindNthMinWhenPosGreaterThanInput() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        Exception exception =
                assertThrows(IllegalArgumentException.class, () ->
                    fixture.findNthMin(root, array.length+1));
        assertEquals("Min position is larger than tree size!", exception.getMessage());
    }
}
