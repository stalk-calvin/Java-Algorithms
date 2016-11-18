/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

public class SportsCar extends CarDecorator {
    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public String assemble(){
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
        return "Sports Car";
    }
}