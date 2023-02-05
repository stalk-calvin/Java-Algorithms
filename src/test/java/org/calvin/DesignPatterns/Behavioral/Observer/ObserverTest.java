/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {
    private Auctioneer auctioneer;
    private Bidder b1;
    private Bidder b2;
    private Bidder b3;

    @BeforeEach
    public void setUp() {
        auctioneer = new Auctioneer(new Subject());
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
