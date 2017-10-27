/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberOfSegmentsTest {
    NumberOfSegments fixture;

    @Before
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
