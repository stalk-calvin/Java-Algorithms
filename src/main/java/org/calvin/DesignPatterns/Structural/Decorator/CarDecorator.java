/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public String assemble() {
        return this.car.assemble();
    }
}
