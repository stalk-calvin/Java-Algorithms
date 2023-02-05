/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.BitManipulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberComplimentTest {
    private NumberCompliment fixture;

    @BeforeEach public void setUp() throws Exception {
        fixture = new NumberCompliment();
    }

    @Test public void shouldFindComplementWithMultipleBinaries() throws Exception {
        assertEquals(8, fixture.findComplement(23));
    }

    @Test public void shouldFindComplementWithOneDigit() throws Exception {
        assertEquals(0, fixture.findComplement(1));
    }

}
