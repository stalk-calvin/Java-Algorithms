/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Mediator;

public class CEventHandler {
    IMediator pMediator;

    public void setMediator(IMediator pMediator) {
        this.pMediator = pMediator;
    }

    public void receiveEvent(String name, String ev) {
        System.out.println("C: Receive " + ev + " Event from " + name);
    }
}
