/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcelSheetColumnTitleTest {
    ExcelSheetColumnTitle fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ExcelSheetColumnTitle();
    }

    @Test
    public void shouldConvertToTitle() {
        assertEquals("AB", fixture.convertToTitle(28));
    }

}
