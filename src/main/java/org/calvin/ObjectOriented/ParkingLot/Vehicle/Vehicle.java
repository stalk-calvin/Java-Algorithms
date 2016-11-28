/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.ParkingLot.Vehicle;

import org.calvin.ObjectOriented.ParkingLot.ParkingSpot;

import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected VehicleSize size;

    public VehicleSize getVehicleSize() {
        return size;
    }

    /* Park vehicle in this spot (among others, potentially) */
    public void parkInSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    /* Remove car from spot, and notify spot that it's gone */
    public void clearSpots() {
        for (int i = 0; i < parkingSpots.size(); i++) {
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);
    public abstract void print();
}
