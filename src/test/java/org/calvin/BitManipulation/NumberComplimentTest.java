/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.BitManipulation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberComplimentTest {
    private NumberCompliment fixture;

    @Before public void setUp() throws Exception {
        fixture = new NumberCompliment();
    }

    @Test public void shouldFindComplementWithMultipleBinaries() throws Exception {
        assertEquals(8, fixture.findComplement(23));
    }

    @Test public void shouldFindComplementWithOneDigit() throws Exception {
        assertEquals(0, fixture.findComplement(1));
    }

}
