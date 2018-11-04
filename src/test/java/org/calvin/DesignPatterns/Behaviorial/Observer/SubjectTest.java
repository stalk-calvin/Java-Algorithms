/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Observer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SubjectTest {
    Subject fixture;
    Auctioneer auctioneer;
    Bidder b1;
    Bidder b2;
    Bidder b3;

    @Before
    public void setUp() {
        fixture = new Subject();
        auctioneer = new Auctioneer(fixture);
        b1 = new Bidder(auctioneer);
        b2 = new Bidder(auctioneer);
        b3 = new Bidder(auctioneer);
    }

    @Test
    public void shouldKeepHighestBid() {
        b1.makeBid(10);
        b2.makeBid(20);
        b3.makeBid(30);
        b1.makeBid(40);
        b3.makeBid(50);
        assertEquals(50, auctioneer.getHighest());
    }

    @Test
    public void shouldResetHighestBid() {
        b1.makeBid(10);
        b2.makeBid(20);
        b3.makeBid(30);
        b1.makeBid(40);
        b3.makeBid(50);
        auctioneer.reset();
        assertEquals(0, auctioneer.getHighest());
    }
}
