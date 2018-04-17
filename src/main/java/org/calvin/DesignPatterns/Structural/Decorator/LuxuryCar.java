/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

public class LuxuryCar implements Car {
    private Car decorated;

    public LuxuryCar(Car decorated) {
        this.decorated = decorated;
    }

    @Override
    public String assemble(){
        decorated.assemble();
        System.out.println(" Adding features of Luxury Car.");
        return "Luxury Car";
    }
}
