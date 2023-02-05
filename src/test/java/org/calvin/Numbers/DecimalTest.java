/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class DecimalTest {
    @Test
    public void shouldBeBrokenWhenNaturalDoubleUsed() {
        double funds = 1.00;
        assertTrue(0 < Decimal.brokenCalculation(funds));
    }

    @Test
    public void shouldBeCorrectWhenBigDecimalUsed() {
        BigDecimal funds = new BigDecimal("1.00");
        assertTrue(0 == Decimal.bigDecimalCalculation(funds).intValue());
    }

    @Test
    public void shouldBeCorrectWhenIntUsed() {
        int funds = 100;
        assertTrue(0 == Decimal.integerCalculation(funds));
    }
}
