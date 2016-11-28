/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.ParkingLot.Vehicle;

import org.calvin.ObjectOriented.ParkingLot.ParkingSpot;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        size = VehicleSize.Motorcycle;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return true;
    }

    public void print() {
        System.out.print("M");
    }
}

