/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.ParkingLot.Vehicle;

import org.calvin.ObjectOriented.ParkingLot.ParkingSpot;

public class Bus extends Vehicle {
    public Bus() {
        size = VehicleSize.Large;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return VehicleSize.Large.equals(spot.getSize());
    }

    public void print() {
        System.out.print("B");
    }
}
