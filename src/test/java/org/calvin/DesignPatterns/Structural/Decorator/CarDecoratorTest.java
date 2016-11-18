/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarDecoratorTest {
    Car fixture;

    @Test
    public void shouldAssembleSportsCar() {
        fixture = new SportsCar(new BasicCar());
        String actual = fixture.assemble();
        assertEquals("Sports Car", actual);
    }

    @Test
    public void shouldAssembleLuxuryCar() {
        fixture = new LuxuryCar(new BasicCar());
        String actual = fixture.assemble();
        assertEquals("Luxury Car", actual);
    }

}