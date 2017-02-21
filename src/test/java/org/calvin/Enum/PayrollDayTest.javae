/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Enum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayrollDayTest {
    private static final int HOURS_PER_SHIFT = 8;
    private static final int OVERTIME = HOURS_PER_SHIFT + 5;
    private static final int PAY_RATE = 20;

    @Test
    public void shouldPayWeekdayRegular() {
        double time = HOURS_PER_SHIFT;
        double actual = PayrollDay.MONDAY.pay(time, PAY_RATE);
        double expected = time * PAY_RATE;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void shouldPayWeekendRegular() {
        double time = HOURS_PER_SHIFT;
        double actual = PayrollDay.SUNDAY.pay(time, PAY_RATE);
        double base = time * PAY_RATE;
        double expected = base + base/2;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void shouldPayWeekdayOvertime() {
        double time = OVERTIME;
        double actual = PayrollDay.MONDAY.pay(time, PAY_RATE);
        double base = time * PAY_RATE;
        double delta = (OVERTIME - HOURS_PER_SHIFT) * PAY_RATE / 2;
        double expected = base + delta;
        assertEquals(expected, actual, 0);
    }
}