package org.calvin.DesignPatterns.Structural.__CohesionCoupling.lowtight;

public class LowTight {
    String email;
    boolean checkEmail() {
        //...
        return true;
    }

    boolean sendEmail() {
        //... sending email
        return true;
    }

    void printEmail() {
        System.out.println(email);
    }
}
