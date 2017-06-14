/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

public class EqualTreeTest {
    private EqualTree fixture;

    @Before
    public void setUp() {
        fixture = new EqualTree();
    }

    @Test
    public void shouldFindEqualTreesUsingRecursive() {
        int[] input = {1,2,3,4,5,6,7,8};
        TreeNode root1 = AssortedMethods.createTreeFromArray(input);
        TreeNode root2 = AssortedMethods.createTreeFromArray(input);

        // Trees have different memory location
        assertFalse(System.identityHashCode(root1) == System.identityHashCode(root2));

        // Trees are equal
        assertTrue(fixture.isEqualRecursive(root1,root2));
    }

    @Test
    public void shouldNullTreesBeEqualRecursive() {
        assertTrue(fixture.isEqualRecursive(null,null));
    }

    @Test
    public void shouldFindDifferentTreesUsingRecursive() {
        int[] input = {1,2,3,4,5,6};
        TreeNode root1 = AssortedMethods.createTreeFromArray(input);
        int[] input2 = {1,2,3,4,5,6,7,8};
        TreeNode root2 = AssortedMethods.createTreeFromArray(input2);

        // Trees different
        assertFalse(fixture.isEqualRecursive(root1,root2));
    }

    @Test
    public void shouldFindEqualTreesUsingIterative() {
        int[] input = {1,2,3,4,5,6,7,8};
        TreeNode root1 = AssortedMethods.createTreeFromArray(input);
        TreeNode root2 = AssortedMethods.createTreeFromArray(input);

        // Trees have different memory location
        assertFalse(System.identityHashCode(root1) == System.identityHashCode(root2));

        // Trees are equal
        assertTrue(fixture.isEqualIterative(root1,root2));
    }

    @Test
    public void shouldNullTreesBeEqualIterative() {
        assertTrue(fixture.isEqualIterative(null,null));
    }

    @Test
    public void shouldFindDifferentTreesUsingIterative() {
        int[] input = {1,2,3,4,5,6};
        TreeNode root1 = AssortedMethods.createTreeFromArray(input);
        int[] input2 = {1,2,3,4,5,6,7,8};
        TreeNode root2 = AssortedMethods.createTreeFromArray(input2);

        // Trees different
        assertFalse(fixture.isEqualIterative(root1,root2));
    }
}
