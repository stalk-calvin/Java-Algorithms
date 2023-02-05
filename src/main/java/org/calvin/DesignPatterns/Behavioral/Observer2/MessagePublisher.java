package org.calvin.DesignPatterns.Behavioral.Observer2;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        System.out.println("Unsubscribe: "+o.toString());
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}
