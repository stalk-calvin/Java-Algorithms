/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Observer;

public class Bidder extends Subject {
    public Bidder ( Observer s ) {
        attach(s);
    }
}
