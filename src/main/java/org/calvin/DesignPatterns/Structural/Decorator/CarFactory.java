/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

abstract class CarFactory implements Car {
    protected Car decoratedFrom;
    protected String description = "Unknown";

    @Override
    public String assemble() {
        return this.decoratedFrom.assemble();
    }
    public String getDescription() { return description + " Car"; }
    public abstract double cost();
}
