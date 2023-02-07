/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.Tree.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricTest {
    Symmetric fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Symmetric();
    }

    @Test
    public void shouldBeSymmetric() {
        int[] input1 = {1,2,2,4,5,5,4};
        TreeNode t1 = AssortedMethods.createTreeFromArray(input1);
        assertTrue(fixture.isSymmetric(t1));
    }

    @Test
    public void shouldBeMirror() {
        int[] input1 = {1,2,3,4,5,6,7,8};
        TreeNode t1 = AssortedMethods.sortedArrayToBalancedBST(input1, 0, input1.length-1);
        fixture.mirror(t1);
        int[] inputExpected = {4,6,2,7,5,3,1,8};
        TreeNode t2 = AssortedMethods.createTreeFromArray(inputExpected);
        assertEquals(t2, t1);
    }
}
