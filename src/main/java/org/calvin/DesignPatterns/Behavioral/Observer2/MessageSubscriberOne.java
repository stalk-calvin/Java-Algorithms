package org.calvin.DesignPatterns.Behavioral.Observer2;

import lombok.ToString;

@ToString
public class MessageSubscriberOne implements Observer
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}
