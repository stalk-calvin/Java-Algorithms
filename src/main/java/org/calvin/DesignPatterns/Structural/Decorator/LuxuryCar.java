/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

public class LuxuryCar extends CarFactory {
    public LuxuryCar(Car c) {
        decoratedFrom = c;
        description = "Luxury";
    }

    @Override
    public String assemble(){
        super.assemble();
        System.out.print(" -> Adding features of Luxury Car");
        return description + " Car";
    }

    @Override
    public double cost() {
        return 199999.99;
    }
}
