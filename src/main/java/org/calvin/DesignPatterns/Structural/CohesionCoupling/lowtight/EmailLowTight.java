package org.calvin.DesignPatterns.Structural.CohesionCoupling.lowtight;

public class EmailLowTight {
    String email;
    boolean check() {
        //...
        return true;
    }

    boolean send() {
        //... sending email
        return true;
    }

    boolean print() {
        //... printing email
        return true;
    }
}
