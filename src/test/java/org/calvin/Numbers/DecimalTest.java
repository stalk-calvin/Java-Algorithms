/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

public class DecimalTest {
    @Test
    public void shouldBeBroken() {
        double funds = 1.00;
        assertTrue(0 < Decimal.brokenCalculation(funds));
    }

    @Test
    public void shouldUseBigDecimal() {
        BigDecimal funds = new BigDecimal("1.00");
        assertTrue(0 == Decimal.bigDecimalCalculation(funds).intValue());
    }

    @Test
    public void shouldUseInt() {
        int funds = 100;
        assertTrue(0 == Decimal.integerCalculation(funds));
    }


}