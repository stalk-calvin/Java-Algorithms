/*
 * Copyright Calvin Lee Since 2018.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MissingNumberTest {
    private MissingNumber fixture;

    @Before
    public void setUp() {
        fixture = new MissingNumber();
    }

    @Test public void hasOnemissingNumber() throws Exception {
        int[] in = new int[]{0,1,2,3,5};
        assertEquals(4, fixture.missingNumber(in));
    }

    @Test public void hasNomissingNumber() throws Exception {
        int[] in = new int[]{0,1,2,3,4,5};
        assertEquals(in.length, fixture.missingNumber(in));
    }

}
