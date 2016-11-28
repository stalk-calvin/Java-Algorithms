/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.Router;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class RouterTest {
    private static final Router[] routers = new Router[6];
    RoutingTable routingTable1 = new RoutingTable();
    RoutingTable routingTable2 = new RoutingTable();
    RoutingTable routingTable3 = new RoutingTable();
    RoutingTable routingTable4 = new RoutingTable();
    RoutingTable routingTable5 = new RoutingTable();
    RoutingTable routingTable6 = new RoutingTable();

    @Before
    public void setup() {
        routingTable1.addRoutingEntry(new RoutingEntry("140.1.1.0", "direct", "255.255.255.0", 1));
        routingTable1.addRoutingEntry(new RoutingEntry("140.1.2.0", "direct", "255.255.255.0", 1));
        routingTable1.addRoutingEntry(new RoutingEntry("140.1.3.0", "direct", "255.255.255.0", 1));

        routingTable2.addRoutingEntry(new RoutingEntry("140.1.2.0", "direct", "255.255.255.0", 1));
        routingTable2.addRoutingEntry(new RoutingEntry("140.1.4.0", "direct", "255.255.255.0", 1));
        routingTable2.addRoutingEntry(new RoutingEntry("140.1.5.0", "direct", "255.255.255.0", 1));

        routingTable3.addRoutingEntry(new RoutingEntry("140.1.3.0", "direct", "255.255.255.0", 1));
        routingTable3.addRoutingEntry(new RoutingEntry("140.1.4.0", "direct", "255.255.255.0", 1));
        routingTable3.addRoutingEntry(new RoutingEntry("140.1.14.0", "direct", "255.255.254.0", 1));

        routingTable4.addRoutingEntry(new RoutingEntry("140.1.4.0", "direct", "255.255.255.0", 1));
        routingTable4.addRoutingEntry(new RoutingEntry("140.1.5.0", "direct", "255.255.255.0", 1));
        routingTable4.addRoutingEntry(new RoutingEntry("140.1.12.0", "direct", "255.255.254.0", 1));

        routingTable5.addRoutingEntry(new RoutingEntry("140.1.10.0", "direct", "255.255.254.0", 1));
        routingTable5.addRoutingEntry(new RoutingEntry("140.1.14.0", "direct", "255.255.254.0", 1));

        routingTable6.addRoutingEntry(new RoutingEntry("140.1.8.0", "direct", "255.255.254.0", 1));
        routingTable6.addRoutingEntry(new RoutingEntry("140.1.10.0", "direct", "255.255.254.0", 1));
        routingTable6.addRoutingEntry(new RoutingEntry("140.1.12.0", "direct", "255.255.254.0", 1));

        routers[0] = new Router(routingTable1);
        routers[1] = new Router(routingTable2);
        routers[2] = new Router(routingTable3);
        routers[3] = new Router(routingTable4);
        routers[4] = new Router(routingTable5);
        routers[5] = new Router(routingTable6);

        routers[0].setNeighbors(new Router[] {routers[1], routers[2]}, new String[]{"140.1.2.1", "140.1.3.1"});
        routers[1].setNeighbors(new Router[] {routers[0], routers[2], routers[3]}, new String[]{"140.1.2.2", "140.1.4.2", "140.1.5.2"});
        routers[2].setNeighbors(new Router[] {routers[0], routers[1], routers[3], routers[4]}, new String[]{"140.1.3.3", "140.1.4.3", "140.1.4.3", "140.1.14.3"});
        routers[3].setNeighbors(new Router[] {routers[1], routers[2], routers[5]}, new String[]{"140.1.5.4", "140.1.4.4", "140.1.12.4"});
        routers[4].setNeighbors(new Router[] {routers[2], routers[5]}, new String[]{"140.1.14.5", "140.1.10.5"});
        routers[5].setNeighbors(new Router[] {routers[3], routers[4]}, new String[]{"140.1.12.6", "140.1.10.6"});
    }

    @Test
    public void shouldRouteWithHoppings() {
        int i = 0;
        boolean changed = true;
        while (changed) {
            changed = false;
            System.out.println("\n>> Round: " + ++i);
            System.out.println("Router 1 : \n" + routers[0]);
            System.out.println("Router 2 : \n" + routers[1]);
            System.out.println("Router 3 : \n" + routers[2]);
            System.out.println("Router 4 : \n" + routers[3]);
            System.out.println("Router 5 : \n" + routers[4]);
            System.out.println("Router 6 : \n" + routers[5]);


            changed |= routers[0].broadcast();
            changed |= routers[3].broadcast();
            changed |= routers[2].broadcast();
            changed |= routers[5].broadcast();
            changed |= routers[1].broadcast();
            changed |= routers[4].broadcast();

            if (i >= 100) {
                fail("Too many iterations..");
            }
            if (!changed) i--;
        }

        //3 Rounds
        assertTrue(i == 3);
    }
}