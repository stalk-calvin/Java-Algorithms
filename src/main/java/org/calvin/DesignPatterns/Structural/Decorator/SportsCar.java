/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

public class SportsCar implements Car {
    private Car decorated;

    public SportsCar(Car decorated) {
        this.decorated = decorated;
    }

    @Override
    public String assemble(){
        decorated.assemble();
        System.out.println(" Adding features of Sports Car.");
        return "Sports Car";
    }
}
