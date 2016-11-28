/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.ParkingLot.Vehicle;

import org.calvin.ObjectOriented.ParkingLot.ParkingSpot;

public class Car extends Vehicle {
    public Car() {
        size = VehicleSize.Compact;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return VehicleSize.Large.equals(spot.getSize()) || VehicleSize.Compact.equals(spot.getSize());
    }

    public void print() {
        System.out.print("C");
    }
}
