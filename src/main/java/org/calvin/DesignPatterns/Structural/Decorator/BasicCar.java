/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

public class BasicCar implements Car {
    @Override
    public String assemble() {
        System.out.print("Basic Car.");
        return "Basic Car";
    }
}
