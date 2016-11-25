/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Facade;

public class Circle implements Shape {

    @Override
    public String draw() {
        return "Circle::draw()";
    }
}
