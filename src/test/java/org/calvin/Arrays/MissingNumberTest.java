/*
 * Copyright Calvin Lee Since 2018.
 * All Rights Reserved.
 */

package org.calvin.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {
    private MissingNumber fixture;

    @BeforeEach
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
