/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Strategy;

public class OperationDivide implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 / num2;
    }
}
