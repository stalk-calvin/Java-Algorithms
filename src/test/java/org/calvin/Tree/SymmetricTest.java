/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.Utils.AssortedMethods;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SymmetricTest {
    Symmetric fixture;

    @Before
    public void setUp() {
        fixture = new Symmetric();
    }

    @Test
    public void shouldBeSymmetric() {
        int[] input1 = {1,2,2,4,5,5,4};
        TreeNode t1 = AssortedMethods.createTreeFromArray(input1);
        assertTrue(fixture.isSymmetric(t1));
    }

}
