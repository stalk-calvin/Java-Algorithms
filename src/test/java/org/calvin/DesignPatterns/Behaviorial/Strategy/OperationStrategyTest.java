/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperationStrategyTest {
    @Test
    public void shouldExecuteAddOperation() {
        OperationFactory ct = new OperationFactory(new OperationAdd());
        assertEquals(3, ct.executeStrategy(1,2));
    }
    @Test
    public void shouldExecuteSubtractOperation() {
        OperationFactory ct = new OperationFactory(new OperationSubstract());
        assertEquals(1, ct.executeStrategy(2,1));
    }
    @Test
    public void shouldExecuteMultiplyOperation() {
        OperationFactory ct = new OperationFactory(new OperationMultiply());
        assertEquals(2, ct.executeStrategy(1,2));
    }
    @Test
    public void shouldExecuteDivideOperation() {
        OperationFactory ct = new OperationFactory(new OperationDivide());
        assertEquals(2, ct.executeStrategy(4,2));
    }

}
