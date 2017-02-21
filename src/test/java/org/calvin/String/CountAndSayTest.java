/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CountAndSayTest {
    CountAndSay fixture;

    @Before
    public void setUp() {
        fixture = new CountAndSay();
    }

    @Test
    public void shouldCountAndSay() {
        assertEquals("1211", fixture.countAndSay(4));
    }

}
