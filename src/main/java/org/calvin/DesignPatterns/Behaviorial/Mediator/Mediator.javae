/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Mediator;

public class Mediator implements IMediator {
    AEventHandler aEventHandler = new AEventHandler();
    BEventHandler bEventHandler = new BEventHandler();
    CEventHandler cEventHandler = new CEventHandler();

    public Mediator(AEventHandler aEventHandler, BEventHandler bEventHandler, CEventHandler cEventHandler) {
        aEventHandler.setMediator(this);
        bEventHandler.setMediator(this);
        cEventHandler.setMediator(this);
    }

    @Override
    public void sendEvent(String name, String ev) {
        switch(name) {
            case "A":
                bEventHandler.receiveEvent(name, ev);
                cEventHandler.receiveEvent(name, ev);
                break;
            case "B":
                aEventHandler.receiveEvent(name, ev);
                cEventHandler.receiveEvent(name, ev);
                break;
            case "C":
                bEventHandler.receiveEvent(name, ev);
                aEventHandler.receiveEvent(name, ev);
                break;
            default:
                break;
        }
    }
};