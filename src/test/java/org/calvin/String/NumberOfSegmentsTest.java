/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberOfSegmentsTest {
    NumberOfSegments fixture;

    @BeforeEach
    public void setUp() {
        fixture = new NumberOfSegments();
        }

    @Test public void shouldFindNumberOfSegments() throws Exception {
        String s = "Hello, my name is John";
        assertEquals(5, fixture.findNumberOfSegments(s));
    }

    @Test public void shouldFindSegmentsWithSpacesAtTheEnd() throws Exception {
        String s = "     my name is John   ";
        assertEquals(4, fixture.findNumberOfSegments(s));
    }
}
