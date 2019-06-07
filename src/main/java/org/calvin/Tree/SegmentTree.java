/*
 * Copyright Calvin Lee Since 2019.
 * All Rights Reserved.
 */

package org.calvin.Tree;

import static java.lang.Math.min;

public class SegmentTree {
    public int[] segTree;
    public SegmentTree(int[] segTree) {
        this.segTree = segTree;
    }
    public void constructTree(int[] input, int[] segTree, int low, int high, int pos) {
        if (low==high) {
            segTree[pos] = input[low];
            return;
        }
        int mid = (low + high) >>> 1;
        constructTree(input, segTree, low, mid, 2*pos+1);
        constructTree(input, segTree, mid+1, high, 2*pos+2);
        segTree[pos] = min(segTree[2*pos+1], segTree[2*pos+2]);
    }
    public int rangeMinQuery(int[] segTree, int qlow, int qhigh, int low, int high, int pos) {
        if (qlow <= low && qhigh >= high) {
            //total overlap
            return segTree[pos];
        }
        if (qlow > high || qhigh < low) {
            //no overlap
            return Integer.MAX_VALUE;
        }
        int mid = (high + low) >>> 1;
        return min(rangeMinQuery(segTree, qlow, qhigh, low, mid, 2*pos+1),
            rangeMinQuery(segTree, qlow, qhigh, mid+1, high, 2*pos+2));
    }
}
