/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.HashMap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KDiffPairsTest {
    @Test public void shouldNotFindPairsWithNegativeK() throws Exception {
        int[] input = {3,1,4,1,5};
        assertEquals(0, KDiffPairs.findPairs(input, -1));
    }

    @Test public void shouldFindPairsUptoTwo() throws Exception {
        int[] input = {3,1,4,1,5};
        assertEquals(2, KDiffPairs.findPairs(input, 2));
    }

    @Test public void shouldFindPairsUptoOne() throws Exception {
        int[] input = {1,2,3,4,5};
        assertEquals(4, KDiffPairs.findPairs(input, 1));
    }

    @Test public void shouldFindPairsUptoZero() throws Exception {
        int[] input = {1,2,3,4,5};
        assertEquals(5, KDiffPairs.findPairs(input, 0));
    }

}
