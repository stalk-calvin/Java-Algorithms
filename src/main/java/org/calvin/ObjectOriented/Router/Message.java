/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.Router;

public class Message {
    RoutingTable table;
    String sender;

    Message(String sender, RoutingTable table) {
        this.table = table;
        this.sender = sender;
    }
}
