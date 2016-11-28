/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.Router;


import java.util.ArrayList;

public class RoutingTable {
    private ArrayList routingEntries;

    public RoutingTable(ArrayList routingEntries) {
        this.routingEntries = routingEntries;
    }

    public RoutingTable() {
        routingEntries = new ArrayList();
    }

    public void addRoutingEntry(RoutingEntry element) {
        routingEntries.add(element);
    }

    public int getSize() {
        return routingEntries.size();
    }

    public RoutingEntry find(String destination) {
        for (int i = 0; i < routingEntries.size(); i++)
            if (getRoutingEntry(i).getDestination().equals(destination))
                return getRoutingEntry(i);
        return null;
    }

    public RoutingEntry getRoutingEntry(int i) {
        return (RoutingEntry) routingEntries.get(i);
    }

    public String toString() {
        String s = String.format("| %15s | %15s | %15s | %15s |\n", "Destination","Next Hop","NetMask","Hops");
        for (int i = 0; i < routingEntries.size(); i++)
            s += routingEntries.get(i).toString() + "\n";
        return s;
    }
}
