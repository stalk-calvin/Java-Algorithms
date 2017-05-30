/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.PropertyTesting;


public class Calculator {

    int valueDisplayed;

    public Calculator() {
        this.valueDisplayed = 0;
    }

    public void add(int x) {
        this.valueDisplayed += x;
    }

    public void subtract(int x) {
        this.valueDisplayed -= x;
    }

    public int getResult() {
        return this.valueDisplayed;
    }
}
