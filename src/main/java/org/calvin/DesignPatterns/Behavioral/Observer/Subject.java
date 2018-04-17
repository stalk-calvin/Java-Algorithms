/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Observer;

public class Subject {
    private Observer[] observers = new Observer[9];
    private int totalObs = 0;
    private int num;
    public void attach( Observer o ) {
        observers[totalObs++] = o;
    }

    public int getBid() {
        return num;
    }

    public void makeBid( int in ) {
        num = in;
        alertAndUpdate(in);
    }

    private void alertAndUpdate(int in) {
        for (int i=0; i < totalObs; i++) {
            observers[i].update(in);
        }
    }
}
