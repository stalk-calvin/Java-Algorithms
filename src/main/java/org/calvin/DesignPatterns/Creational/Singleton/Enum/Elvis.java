/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Singleton.Enum;

public enum Elvis {
    INSTANCE;
    String fname;

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    @Override
    public String toString() {
        return "Elvis{" +
                "fname='" + fname + '\'' +
                '}';
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
