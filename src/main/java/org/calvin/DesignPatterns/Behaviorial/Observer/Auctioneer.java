/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Observer;

import lombok.Getter;

@Getter
public class Auctioneer extends Observer {

    private int highest;
    public Auctioneer( Subject s ) {
        subj = s;
        subj.attach( this );
    }

    public void update(int in) {
        highest = Math.max(highest, in);
    }

    public void reset() {
        highest = 0;
    }
}
