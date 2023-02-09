package org.calvin.DesignPatterns.Structural.CohesionCoupling.highloose;

public class Printer {
    private Communication comm;

    public Printer(Communication comm) {
        this.comm = comm;
    }

    public String print() {
        return comm.toString();
    }
}

