/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Facade;

public class Rectangle implements Shape {

    @Override
    public String draw() {
        return "Rectangle::draw()";
    }
}