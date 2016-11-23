/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperationStrategyTest {
    @Test
    public void shouldExecuteAddOperation() {
        OperationStrategy ct = new OperationStrategy(new OperationAdd());
        assertEquals(3, ct.executeStrategy(1,2));
    }
    @Test
    public void shouldExecuteSubtractOperation() {
        OperationStrategy ct = new OperationStrategy(new OperationSubstract());
        assertEquals(1, ct.executeStrategy(2,1));
    }
    @Test
    public void shouldExecuteMultiplyOperation() {
        OperationStrategy ct = new OperationStrategy(new OperationMultiply());
        assertEquals(2, ct.executeStrategy(1,2));
    }
    @Test
    public void shouldExecuteDivideOperation() {
        OperationStrategy ct = new OperationStrategy(new OperationDivide());
        assertEquals(2, ct.executeStrategy(4,2));
    }

}