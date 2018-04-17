/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.NullObject;

import java.io.PrintStream;

public class Application {
    private PrintStream debugout;
    public Application(PrintStream debugout) {
        this.debugout = debugout;
    }

    public void go() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            debugout.println("i = " + i);
        }
        System.out.println("sum = " + sum);
    }
}

