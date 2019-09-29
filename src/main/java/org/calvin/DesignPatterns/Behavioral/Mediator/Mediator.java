/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Mediator;

public class Mediator implements IMediator {
    private AEventHandler aEventHandler = new AEventHandler();
    private BEventHandler bEventHandler = new BEventHandler();
    private CEventHandler cEventHandler = new CEventHandler();

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
}
