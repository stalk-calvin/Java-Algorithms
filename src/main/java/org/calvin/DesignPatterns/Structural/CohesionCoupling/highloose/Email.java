package org.calvin.DesignPatterns.Structural.CohesionCoupling.highloose;

public class Email implements Communication {
    private String email;

    Email(String email) {
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
        return "Email{" +
                "email='" + email + '\'' +
                '}';
    }
}
