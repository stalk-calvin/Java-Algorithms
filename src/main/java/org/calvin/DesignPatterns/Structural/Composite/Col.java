/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Composite;

public class Col extends Composite {
    public Col(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}
