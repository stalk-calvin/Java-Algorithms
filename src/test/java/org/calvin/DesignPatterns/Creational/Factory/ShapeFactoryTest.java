/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Creational.Factory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShapeFactoryTest {
    ShapeFactory fixture;

    @Before
    public void setUp() {
        fixture = new ShapeFactory();
    }

    @Test
    public void shouldCreateCircleShape() {
        Shape circleShape = new Circle();
        Shape shape = fixture.getShape("circle");
        assertEquals(circleShape.toString().trim(), shape.toString().trim());
    }

    @Test
    public void shouldCreateRectangleShape() {
        Shape rectangleShape = new Rectangle();
        Shape shape = fixture.getShape("rectangle");
        assertEquals(rectangleShape.toString().trim(), shape.toString().trim());
    }

    @Test
    public void shouldCreateSquareShape() {
        Shape squareShape = new Square();
        Shape shape = fixture.getShape("square");
        assertEquals(squareShape.toString().trim(), shape.toString().trim());
    }
}