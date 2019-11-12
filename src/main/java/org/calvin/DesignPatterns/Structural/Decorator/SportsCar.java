/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

public class SportsCar extends CarFactory {
    public SportsCar(Car c) {
        decoratedFrom = c;
        description = "Sports";
    }

    @Override
    public String assemble(){
        super.assemble();
        System.out.print(" -> Adding features of Sports Car");
        return description + " Car";
    }

    @Override
    public double cost() {
        return 99999.99;
    }
}
