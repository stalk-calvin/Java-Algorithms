/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeDiameterTest {
    TreeDiameter fixture;

    @BeforeEach
    public void setUp() {
        fixture = new TreeDiameter();
    }

    @Test public void shouldCalculateDiameter() throws Exception {
        int[] input1 = {1,2,2,4,5,5,4};
        TreeNode t1 = AssortedMethods.createTreeFromArray(input1);
        fixture.diameter(t1);
    }

}
