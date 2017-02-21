/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.Router;

public class RoutingEntry {
    private String destination;
    private String nextHop;
    private String netmask;
    private int distance;

    public RoutingEntry(String destination, String nextHop, String netmask, int distance) {
        this.destination = destination;
        this.nextHop = nextHop;
        this.netmask = netmask;
        this.distance = distance;
    }

    public String getDestination() {
        return destination;
    }

    public String getNetMask() {
        return netmask;
    }

    public int getDistance() {
        return distance;
    }

    public void setNextHop(String nextHop) {
        this.nextHop = nextHop;
    }

    public void setDistance(int d) {
        distance = d;
    }

    public String toString() {
        return String.format("| %15s | %15s | %15s | %15s |",destination,nextHop,netmask,distance);
    }
}

