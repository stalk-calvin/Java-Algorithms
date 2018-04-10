/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseTest {
    Reverse fixture;

    @Before
    public void setUp() {
        fixture = new Reverse();
    }

    @Test
    public void shouldReverseString1() {
        assertEquals("kcalS", fixture.reverseString1("Slack"));
    }

    @Test
    public void shouldReverseString2() {
        assertEquals("kcalS", fixture.reverseString2("Slack"));
    }

    @Test
    public void shouldReverseString3() {
        assertEquals("kcalS", fixture.reverseString3("Slack"));
    }

    @Test
    public void shouldReverseStringXOR() {
        assertEquals("kcalS", fixture.reverseStringXOR("Slack"));
    }
}
