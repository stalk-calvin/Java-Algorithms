/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnNumberTest {
    ExcelSheetColumnNumber fixture;

    @BeforeEach
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
