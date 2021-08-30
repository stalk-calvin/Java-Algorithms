package org.calvin.DesignPatterns.Behavioral.NullObject;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void getSedanOrNull() {
        Car sedan = new CarFactory().getCar("sedan");
        assertEquals("Sedan", sedan.getType());

        Car sports = new CarFactory().getCar("Sports");
        assertEquals("N/A", sports.getType());
    }
}