/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExcelSheetColumnTitleTest {
    ExcelSheetColumnTitle fixture;

    @Before
    public void setUp() {
        fixture = new ExcelSheetColumnTitle();
    }

    @Test
    public void shouldConvertToTitle() {
        assertEquals("AB", fixture.convertToTitle(28));
    }

}