/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZigZagTest {
    ZigZag fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ZigZag();
    }

    @Test
    public void shouldConvert() {
        assertEquals("PAHNAPLSIIGYIR", fixture.convert("PAYPALISHIRING", 3));
    }

}
