/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StrStrTest {
    StrStr fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StrStr();
    }

    @Test
    public void shouldLocate() {
        assertEquals(25, fixture.strStr("this is supposed to be a long string", "long"));
    }

}
