/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Singleton.Serializable;

public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    public void setFname(String fname) {
        this.fname = fname;
    }

    String fname;
    private Elvis() {
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    private Object readResolve() {
        // Return the one true Elvis and let the garbage collector
        // take care of the Elvis impersonator.
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Elvis{" +
                "fname='" + fname + '\'' +
                '}';
    }
}
