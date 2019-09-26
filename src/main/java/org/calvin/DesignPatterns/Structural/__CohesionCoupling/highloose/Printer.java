package org.calvin.DesignPatterns.Structural.__CohesionCoupling.highloose;

public class Printer {
    private Communication comm;

    public Printer(Communication comm) {
        this.comm = comm;
    }

    public void printIdentity() {
        System.out.println(comm.toString());
    }
}

