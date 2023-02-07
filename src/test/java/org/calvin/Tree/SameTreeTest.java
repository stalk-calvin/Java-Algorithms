/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.Tree.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeTest {
    SameTree fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SameTree();
    }

    @Test
    public void shouldBeSameTree() {
        int[] input1 = {1,2,3,4,5,6,7};
        TreeNode t1 = AssortedMethods.createTreeFromArray(input1);

        int[] input2 = {1,2,3,4,5,6,7};
        TreeNode t2 = AssortedMethods.createTreeFromArray(input2);

        assertTrue(fixture.isSameTree(t1,t2));
    }

    @Test
    public void shouldBeNotSameTree() {
        int[] input1 = {1,2,3,4,5,6,7};
        TreeNode t1 = AssortedMethods.createTreeFromArray(input1);

        int[] input2 = {1,2,3,9,5,4,7};
        TreeNode t2 = AssortedMethods.createTreeFromArray(input2);

        assertFalse(fixture.isSameTree(t1,t2));
    }


    @Test
    public void shouldNullTreeNotSameTree() {
        int[] input1 = {1,2,3,4,5,6,7};
        TreeNode t1 = AssortedMethods.createTreeFromArray(input1);

        assertFalse(fixture.isSameTree(t1,null));
    }

}
