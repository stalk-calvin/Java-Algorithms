/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarDecoratorTest {
    Car fixture;

    @Test
    public void shouldAssembleSportsCar() {
        fixture = new SportsCar(new BasicCar());
        String actual = fixture.assemble();
        assertEquals("Sports Car", actual);
        assertEquals("Sports Car", fixture.getDescription());
        assertEquals(99999.99, fixture.cost(), 0.1);
    }

    @Test
    public void shouldAssembleLuxuryCar() {
        fixture = new LuxuryCar(new BasicCar());
        String actual = fixture.assemble();
        assertEquals("Luxury Car", actual);
        assertEquals("Luxury Car", fixture.getDescription());
        assertEquals(199999.99, fixture.cost(), 0.1);
    }

    @Test
    public void shouldAssembleElectricCar() {
        fixture = new ElectricCar(new BasicCar());
        String actual = fixture.assemble();
        assertEquals("Electric Car", actual);
        assertEquals("Basic Car, Electric", fixture.getDescription());
        assertEquals(55000.0, fixture.cost(), 0.1);
    }

    @Test
    public void shouldAssembleElectricSportsCar() {
        Car sportsCar = new SportsCar(new BasicCar());
        fixture = new ElectricCar(sportsCar);
        String actual = fixture.assemble();
        assertEquals("Electric Car", actual);
        assertEquals("Sports Car, Electric", fixture.getDescription());
        assertEquals(150000.00, fixture.cost(), 0.1);
    }
}
