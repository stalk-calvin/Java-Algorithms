/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnNumberTest {
    ExcelSheetColumnNumber fixture;

    @Before
    public void setUp() {
        fixture = new ExcelSheetColumnNumber();
    }

    @Test
    public void shouldGiveCorrectTitleToNumber() {
        assertEquals(27, fixture.titleToNumber("AA"));
    }

    @Test
    public void shouldGiveCorrectTitleToNumberEmptyString() {
        assertEquals(-1, fixture.titleToNumber(""));
    }

}