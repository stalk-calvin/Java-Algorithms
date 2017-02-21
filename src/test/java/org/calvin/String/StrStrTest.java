/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StrStrTest {
    StrStr fixture;

    @Before
    public void setUp() {
        fixture = new StrStr();
    }

    @Test
    public void shouldLocate() {
        assertEquals(25, fixture.strStr("this is supposed to be a long string", "long"));
    }

}
