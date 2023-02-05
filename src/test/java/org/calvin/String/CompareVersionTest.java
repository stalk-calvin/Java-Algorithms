/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompareVersionTest {
    CompareVersion fixture;

    @BeforeEach
    public void setUp() {
        fixture = new CompareVersion();
    }

    @Test
    public void shouldLatterGreater() {
        assertEquals(-1, fixture.compareVersion("1.1.2.3.4.1","1.1.2.4.1.1"));
    }

    @Test
    public void shouldBeSame() {
        assertEquals(0, fixture.compareVersion("1.1.2.3.4.1","1.1.2.3.4.1"));
    }

    @Test
    public void shouldFirstGreater() {
        assertEquals(1, fixture.compareVersion("1.1.2.4.4.1","1.1.2.3.4.1"));
    }
}
