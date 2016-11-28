/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.ParkingLot.Vehicle;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum VehicleSize {
    Motorcycle(1),
    Compact(2),
    Large(5);

    private int spotsNeeded;

    public int getSpotsNeeded() {
        return spotsNeeded;
    }
}
