/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class kDiffPairsTest {
    private kDiffPairs fixture;

    @Before public void setUp() throws Exception {
        fixture = new kDiffPairs();
    }

    @Test public void shouldNotFindPairsWithNegativeK() throws Exception {
        int[] input = {3,1,4,1,5};
        assertEquals(0, fixture.findPairs(input, -1));
    }

    @Test public void shouldFindPairsUptoTwo() throws Exception {
        int[] input = {3,1,4,1,5};
        assertEquals(2, fixture.findPairs(input, 2));
    }

    @Test public void shouldFindPairsUptoOne() throws Exception {
        int[] input = {1,2,3,4,5};
        assertEquals(4, fixture.findPairs(input, 1));
    }

    @Test public void shouldFindPairsUptoZero() throws Exception {
        int[] input = {1,3,1,5,4};
        assertEquals(1, fixture.findPairs(input, 0));
    }

}
