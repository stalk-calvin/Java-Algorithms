/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Enum;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Slf4j
public class OperationTest {
    private static final double x = Double.parseDouble("10.1");
    private static final double y = Double.parseDouble("22.2");

    @Test
    public void shouldApplyPlusOperations() {
        double expected = 32.3;
        double actual = Operation.PLUS.apply(x, y);

        log.info("{} {} {} = {}", x, Operation.PLUS, y, Operation.PLUS.apply(x, y));

        assertEquals(expected,actual,0);
    }

    @Test
    public void shouldApplyMinusOperations() {
        double expected = -12.1;
        double actual = Operation.MINUS.apply(x, y);

        log.info("{} {} {} = {}", x, Operation.MINUS, y, Operation.MINUS.apply(x, y));

        assertEquals(expected,actual,0);
    }

    @Test
    public void shouldApplyDivideOperations() {
        double expected = 0.45495495495495497;
        double actual = Operation.DIVIDE.apply(x, y);

        log.info("{} {} {} = {}", x, Operation.DIVIDE, y, Operation.DIVIDE.apply(x, y));

        assertEquals(expected,actual,0);
    }

    @Test
    public void shouldApplyMultiplyOperations() {
        double expected = 224.22;
        double actual = Operation.TIMES.apply(x, y);

        log.info("{} {} {} = {}", x, Operation.TIMES, y, Operation.TIMES.apply(x, y));

        assertEquals(expected,actual,0);
    }

}