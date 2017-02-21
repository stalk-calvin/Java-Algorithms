/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.Router;

import java.util.ArrayList;

public class Router {
    private RoutingTable routingTable;
    private ArrayList<Message> receivedTables;
    private Router[] neighbors;
    private String[] iNetAddresses;

    public Router(RoutingTable initialRoutingTable) {
        routingTable = initialRoutingTable;
        receivedTables = new ArrayList<Message>();
    }

    public void setNeighbors(Router[] neighbors, String[] iNetAddresses) {
        this.neighbors = neighbors;
        this.iNetAddresses = iNetAddresses;
    }

    private void advertiseTable(String sender, RoutingTable table) {
        receivedTables.add(new Message(sender, table));
    }

    public boolean broadcast() {
        boolean changed = false;
        while (receivedTables.size() > 0) {
            Message msg = receivedTables.get(0);
            for (int i = 0; i < msg.table.getSize(); i++) {
                RoutingEntry neighborEntry = msg.table.getRoutingEntry(i);
                RoutingEntry myEntry = routingTable.find(neighborEntry.getDestination());
                if (myEntry != null) {
                    if (myEntry.getDistance() > neighborEntry.getDistance() + 1) {
                        myEntry.setNextHop(msg.sender);
                        myEntry.setDistance(neighborEntry.getDistance() + 1);
                        changed = true;
                    }
                } else {
                    myEntry = new RoutingEntry(neighborEntry.getDestination(), msg.sender, neighborEntry.getNetMask()
                            , neighborEntry.getDistance() + 1);
                    routingTable.addRoutingEntry(myEntry);
                    changed = true;
                }
            }
            receivedTables.remove(0);
        }

        for (int i = 0; i < neighbors.length; i++)
            neighbors[i].advertiseTable(iNetAddresses[i], routingTable);

        return changed;
    }

    public String toString() {
        return routingTable.toString();
    }

}