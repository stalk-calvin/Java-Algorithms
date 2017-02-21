/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Singleton.Enum;

public enum Elvis {
    INSTANCE;
    String fname;

    public void setFname(String fname) {
        this.fname = fname;
    }
}
