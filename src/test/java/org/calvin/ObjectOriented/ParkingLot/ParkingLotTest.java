/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.ParkingLot;

import org.calvin.ObjectOriented.ParkingLot.Vehicle.Bus;
import org.calvin.ObjectOriented.ParkingLot.Vehicle.Car;
import org.calvin.ObjectOriented.ParkingLot.Vehicle.Motorcycle;
import org.calvin.ObjectOriented.ParkingLot.Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {
    ParkingLot fixture;


    @Before
    public void setUp() {
        fixture = new ParkingLot();
    }

    @Test
    public void parkVehicle() {
        Vehicle motorcycle = new Motorcycle();
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        fixture.parkVehicle(bus);
        fixture.parkVehicle(car);
        fixture.parkVehicle(motorcycle);

        Vehicle bus2 = new Bus();
        fixture.parkVehicle(bus2);

        Vehicle bus3 = new Bus();
        fixture.parkVehicle(bus3);

        Vehicle bus4 = new Bus();
        fixture.parkVehicle(bus4);

        fixture.print();
    }
}