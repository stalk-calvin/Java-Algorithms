/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public String assemble(){
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
        return "Luxury Car";
    }
}
