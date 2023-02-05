/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountAndSayTest {
    CountAndSay fixture;

    @BeforeEach
    public void setUp() {
        fixture = new CountAndSay();
    }

    @Test
    public void shouldCountAndSay() {
        assertEquals("1211", fixture.countAndSay(4));
    }
}
