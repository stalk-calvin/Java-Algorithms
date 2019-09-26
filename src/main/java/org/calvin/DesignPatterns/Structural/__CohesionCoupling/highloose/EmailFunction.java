package org.calvin.DesignPatterns.Structural.__CohesionCoupling.highloose;

public class EmailFunction implements Communication {
    private String email;

    EmailFunction(String email) {
        this.email = email;
    }

    @Override
    public boolean check() {
        //... validate email..
        return true;
    }

    @Override
    public boolean send() {
        //... sending email
        return true;
    }

    @Override
    public String toString() {
        return "EmailFunction{" +
                "email='" + email + '\'' +
                '}';
    }
}
