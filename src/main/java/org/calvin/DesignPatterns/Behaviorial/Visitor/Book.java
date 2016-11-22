/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Visitor;

public class Book implements Visitable {
    private double price;
    private double weight;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
}