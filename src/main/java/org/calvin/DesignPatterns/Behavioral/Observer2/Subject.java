package org.calvin.DesignPatterns.Behavioral.Observer2;

public interface Subject
{
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message m);
}
