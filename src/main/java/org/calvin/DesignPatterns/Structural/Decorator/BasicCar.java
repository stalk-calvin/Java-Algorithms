/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

public class BasicCar implements Car {
    @Override
    public String assemble() {
        System.out.print("Basic Car");
        return "Basic Car";
    }

    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public double cost() {
        return 5000;
    }
}
