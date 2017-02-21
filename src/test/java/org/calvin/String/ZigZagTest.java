/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ZigZagTest {
    ZigZag fixture;

    @Before
    public void setUp() {
        fixture = new ZigZag();
    }

    @Test
    public void shouldConvert() {
        assertEquals("PAHNAPLSIIGYIR", fixture.convert("PAYPALISHIRING", 3));
    }

}
