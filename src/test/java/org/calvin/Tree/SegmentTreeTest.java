/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SegmentTreeTest {
    private SegmentTree fixture;
    private int[] segTree;

    @Before
    public void setUp() throws Exception {
        int[] input = {-1,2,4,0};
        int max = Integer.MAX_VALUE;
        fixture = new SegmentTree(input);

        // input length = power of 2 = 4*2-1 = 7
        int[] segTree = new int[input.length*2-1];
        segTree = new int[]{max,max,max,max,max,max,max};
        fixture.constructTree(input, segTree, 0, input.length-1, 0);
        this.segTree = segTree;
    }

    @Test
    public void shouldCalculateMinRange() {
        assertEquals(0, fixture.rangeMinQuery(this.segTree, 1, 3, 0, 3, 0));
        assertEquals(-1, fixture.rangeMinQuery(this.segTree, 0, 2, 0, 3, 0));
        assertEquals(4, fixture.rangeMinQuery(this.segTree, 2, 2, 0, 3, 0));
    }
}