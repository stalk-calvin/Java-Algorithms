package org.calvin.DesignPatterns.Behavioral.Observer2;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ObserverTest2 {
    MessageSubscriberOne subscriber1 = new MessageSubscriberOne();
    MessageSubscriberTwo subscriber2 = new MessageSubscriberTwo();
    MessageSubscriberThree subscriber3 = new MessageSubscriberThree();
    MessagePublisher fixture = new MessagePublisher();

    @Test
    public void shouldNotifySubscribers() {
        PrintStream ps = mock(PrintStream.class);
        System.setOut(ps);
        fixture.attach(subscriber1);
        fixture.attach(subscriber2);

        fixture.notifyUpdate(new Message("First Message"));
        verify(ps).println("MessageSubscriberOne :: First Message");
        verify(ps).println("MessageSubscriberTwo :: First Message");

        fixture.detach(subscriber1);
        verify(ps).println("Unsubscribe: MessageSubscriberOne()");
        fixture.attach(subscriber3);

        fixture.notifyUpdate(new Message("Second Message"));
        verify(ps).println("MessageSubscriberTwo :: Second Message");
        verify(ps).println("MessageSubscriberThree :: Second Message");
    }
}
