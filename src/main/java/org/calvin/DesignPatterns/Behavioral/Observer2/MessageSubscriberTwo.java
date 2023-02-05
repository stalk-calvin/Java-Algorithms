package org.calvin.DesignPatterns.Behavioral.Observer2;

public class MessageSubscriberTwo implements Observer
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}