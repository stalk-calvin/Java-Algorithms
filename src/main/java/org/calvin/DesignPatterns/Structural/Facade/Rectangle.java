/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Facade;

public class Rectangle implements Shape {

    @Override
    public String draw() {
        return "Rectangle::draw()";
    }
}
